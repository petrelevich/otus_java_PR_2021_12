package ru.otus.l11.polymorphism;

import ru.otus.l11.polymorphism.operations.Create;
import ru.otus.l11.polymorphism.operations.Update;

/**
 * @author sergey
 * created on 09.09.19.
 */
public class PolyGood {
  public static void main(String[] args) {
    new PolyGood().go("OK1", new Create());
    new PolyGood().go("OK2", new Update());
    // Как добавить select?
  }

  private void go(String data, Operation operation) {
    // ... какая-то логика
    operation.action(data);
    // ... какая-то логика
  }
}
