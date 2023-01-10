package com.example.wrkspot.wrkspottask;

public class StringReverse {
    static String inputString = "Can I block your calendar from 5:30 to 6pm today " +
            "to review/discuss on test case scenarios for HK dashboard cards ";

    public static void main(String[] args) {

        String[] splittedString = inputString.split("\\s");
        int stringLength = splittedString.length;
        for (int i = 0; i < stringLength; i++) {
            for (int j = 0; j < stringLength; j++) {
                if (splittedString[i].length() > splittedString[j].length()) {
                    String temporary = splittedString[i];
                    splittedString[i] = splittedString[j];
                    splittedString[j] = temporary;
                }
            }
        }
        for (int i = 0; i < stringLength; i++) {
            System.out.print(splittedString[i] + " ");
        }
    }
    
}
