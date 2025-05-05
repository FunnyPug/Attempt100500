package com.attempt100500.chapter5.simpleDotCom;

public class SimpleDotComGame {
  static int numOfHits = 0;

  public static void main(String[] args) {
    SimpleDotCom s = new SimpleDotCom();
    s.setLocation(s.findLocation());
    s.prepareCompareMass();
    GameHelper helper = new GameHelper();


    boolean isAlive = true;

    while (isAlive) {
      String userInput = helper.getUserInput("Введите число от 0 до 9");
      String result = s.checkYourself(userInput);
      numOfHits++;
      switch (result) {
        case "Мимо!":
          System.out.println("Промах! пробуйте еще!");
          break;
        case "Попал!":
          System.out.println("Есть поподание!!! продолжайте!");
          break;
        case "Потопил!":
          System.out.println("Вы потопили сайт!!!!");
          printResult();
          isAlive = false;
          break;
        case "Повторное попадание!":
          System.out.println("Ячейка уже поражена, пробуйте другие!");
      }
    }
  }

  public static void printResult() {
    System.out.print("Колличество попыток: " + numOfHits);
    if (numOfHits == 3) {
      System.out.println(" Вы отлично прошли игру!!!");
    } else if (numOfHits > 3 && numOfHits < 10) {
      System.out.println(" Игра пройдена достойно!");
    } else if (numOfHits > 10) {
      System.out.println(" Игра пройдена так себе( в другой раз повезет!");
    }
  }
}
