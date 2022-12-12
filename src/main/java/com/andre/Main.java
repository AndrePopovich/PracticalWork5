package com.andre;

import com.andre.model.ArrayListClass;
import com.andre.model.LinkedListClass;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    ArrayListClass listClass = new ArrayListClass();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введіть кількість елементів масиву: ");
    long count = scanner.nextInt();
    listClass.filterList(count);
    LinkedListClass linkedListClass = new LinkedListClass();
    linkedListClass.filterList(count);
  }

}
