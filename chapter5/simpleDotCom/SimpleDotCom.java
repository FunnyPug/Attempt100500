package com.attempt100500.chapter5.simpleDotCom;

public class SimpleDotCom {
  private int[] location;
  private int[] compareMass;
  private int numOfHits;

  public void setLocation(int[] location) {
    this.location = location;
  }

  public int[] getLocation() {
    return location;
  }

  public void prepareCompareMass() {
    compareMass = new int[location.length];
  }

  public int getNumOfHits() {
    return numOfHits;
  }

  public String checkYourself(String guessHit) {
    int hit = Integer.parseInt(guessHit);
    String result = "Мимо!";
    for (int cell : location) {
      if (cell == hit) {
        boolean canDo = restructMass(hit);
        if (!canDo) {
          result = "Повторное попадание!";
          break;
        }
        numOfHits++;
        if (numOfHits == 3) {
          result = "Потопил!";
        } else {
          result = "Попал!";
        }
        break;
      }
    }
    return result;
  }

  public boolean restructMass(int shot) {
    for (int x = 0; x < location.length; x++) {
      if (location[x] == shot && compareMass[x] == 0) {
        compareMass[x] = -1;
        return true;
      }
    }
    return false;
  }

  public int[] findLocation() {
    int[] loc = new int[3];
    int randPosition = (int) (Math.random() * 7);
    for (int x = 0; x < loc.length; x++) {
      if (x == 0) {
        loc[x] = randPosition;
      } else {
        loc[x] = ++randPosition;
      }
    }
    return loc;
  }

  public void showPositions() {
    if (location != null) {
      for (int pos : location) {
        System.out.println(pos);
      }
    } else {
      System.out.println("Позиции сайтов не определены!");
    }
  }
}
