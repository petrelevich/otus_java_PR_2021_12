package ru.otus.l11.encapsulation;

import java.util.*;

class Company {
  String name;
  List<Department> departments = new ArrayList<>(); // Ассоциация 1-*

  public String getName() {
    return this.name;
  }

  public List<Department> getDepartments() {
    return departments;
  }
}

class Department {
  Company company = new Company(); // Композиция

  public Company getCompany() {
    return this.company;
  }
}

class Employee{
  Department department = new Department();

  public Department getDepartment() {
    return this.department;
  }

  public String getCompanyName() {
    return this.department.getCompany().getName();
    // а еще лучше так - return this.department.getCompanyName();
  }
}

// +------------------+                   |--------------+                  +---------+
// |     Employee     | -- department ->  |  Department  | --- company ---> | Company |
// +------------------+                   +--------------+                  +---------+
// | getDepartment()  |                   | getCompany() | <- departments - |         |
// +------------------+                   +--------------+                  +--------+

public class EncapsusationDemo {

  public static void main(String[] args) {
    // У нас есть сотрудник,
    // мы хотим получить название организации,
    // в которой он работает
    Employee employee = new Employee();

    // Совсем криминал - через поля
    // Поля всегда должны быть private
    String companyName1 = employee.department.company.name;

    // Уже лучше
    String companyName2 = employee.getDepartment().getCompany().getName();
    // Кто бы сделал так же?

    // В идеале так
    String companyName3 = employee.getCompanyName();

    // Но разные фреймворки (Spring и др) часто провоцируют писать get-, set-

    // Мы хотим добавить подразделения в организации
    // Что здесь может пойти не так?
    var company = new Company();
    var departments = company.getDepartments();

    departments.add(new Department());
    departments.add(new Department());
    System.out.println("------------");

    // Вроде подразделения добавились, их 2
    System.out.println("company.getDepartments().size() = " + company.getDepartments().size());
    // но Department привязан к разным Company
    System.out.println("departments[0].getCompany() = " + departments.get(0).getCompany());
    System.out.println("departments[1].getCompany() = " + departments.get(1).getCompany());

    // Будут предложения как улучшить код,
    // чтобы избежать подобных ситуаций?
    // см. код ниже ...





















//     company.addDepartment(department1);
//     company.removeDepartment(department1);

    // Какие еще варианты решения
    // (чтобы нельзя было изменять коллекции) ?
  }
}


