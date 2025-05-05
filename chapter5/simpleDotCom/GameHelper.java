package com.attempt100500.chapter5.simpleDotCom;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GameHelper {
  public String getUserInput(String prompt) {
    String inputLine = null;
    System.out.print(prompt + " ");
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      inputLine = reader.readLine();
      if (inputLine.length() == 0) {
        return null;
      }
    } catch (Exception ex) {
      System.out.println("Exception " + ex);
    }
    return inputLine;
  }
}
