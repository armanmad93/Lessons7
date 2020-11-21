package com.company.Lesson7_19;

public class Rules {

    //rule1 have tree numbers
    private boolean haveTreeNumbers(String string) {
        int count = 0;
        String str = "0123456789";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (str.charAt(i) == string.charAt(j)) {
                    count++;
                }
            }
        }
        return count > 2;
    }

    //rule2 have Sympol
    private boolean haveSympol(String string) {
        String str = "#!%";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (str.charAt(i) == string.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count > 0;
    }

    //rule3 have one uppercase character
    private boolean haveUppercaseCharacter(String string) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (str.charAt(i) == string.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count > 0;
    }

    //all rules
    public boolean isVald(String  string){
        if(haveSympol(string) && haveTreeNumbers(string) && haveUppercaseCharacter(string)){
            return true;
        }
        return false;
    }

}
