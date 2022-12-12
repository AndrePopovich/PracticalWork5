package com.andre.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayListClass {

  long startTime, stopTime, time;

  public void filterList(long count) {
    startTime = System.currentTimeMillis();
    List<Integer> arrayList = new ArrayList<>();

    Random rnd = new Random(System.currentTimeMillis());
    for (long i = 0; i < count; i++) {
      int number = 0 + rnd.nextInt(100 - 0 + 1);
      arrayList.add(number);
    }
    arrayList = arrayList.stream().filter(element -> element.intValue() == 5)
        .collect(Collectors.toList());
    stopTime = System.currentTimeMillis();
    time = stopTime - startTime;
    System.out.println("Знайдено чисел 5: " + arrayList.size());
    System.out.println("Час виконання: " + time + " мілісекунд");
  }


}
