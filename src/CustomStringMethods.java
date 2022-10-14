public class CustomStringMethods {
    /* this class has no instance variables */

    /* Constructor with no parameters, and since there are no instance variables to initialize,
              the constructor body is "empty" */
    public CustomStringMethods() { }


// WRITE AND TEST THE FOUR METHODS BELOW!

    /* Client provides searchFor and searchIn and method returns true if searchFor
              is located somewhere in searchIn , and returns false otherwise.

              For example, if searchFor is ple and searchIn is apples, this method returns true.
              If searchFor is hello and searchIn is apples, this method returns false.
     */
    public boolean foundIn(String searchFor, String searchIn) {
        boolean found;
        int indexOfSF = searchIn.indexOf(searchFor);
        if (indexOfSF != -1) {
            found = true;
        } else {
            found = false;
        }
        return found;
    }


    /* Client provides myString and maxLength and method returns true if the length of myString
              exceeds maxLength, and returns false otherwise.

              For example, if myString is apples and maxLength is 5, this method returns true.
              if myString is apples and maxLength is 6, this method returns false.
        */
    public boolean longerThan(String myString, int maxLength) {
        int strLen = myString.length();
        boolean exceed;
        if (strLen > maxLength) {
            exceed = true;
        } else {
            exceed = false;
        }
        return exceed;
    }


    /* Client provides str and idx and method returns a new String created by appending
              the character located at index idx of str to the beginning of str and the end of str

               For example, if str is apples and idx is 4, this method returns the string eapplese
               If str is apples and idx is 0, this method returns the string aapplesa
     */
    public String funnyString(String str, int idx) {
        String cha = str.substring(idx, (idx + 1));
        String f = cha + str + cha;
        return f;
    }

    /* Client provides a single word as orig and the method returns a String that represents orig
              written in “Pig Latin”, which means that the first letter of the word is removed from the front and
              added to the end, and then “ay” is appended.

              For example, if orig is bananas, then the method returns the “Pig Latin” version, ananasbay
    */
    public String pigLatin(String orig) {
        String fCha = orig.substring(0, 1);
        String other = orig.substring(1);
        String pig = other + fCha + "ay";
        return pig;
    }

    public String starBetween(String str) {
        int strLen = str.length();
        for (int i = 1; i < strLen * 2 - 1; i += 2) {
            str = str.substring(0, i) + "*" + str.substring(i);
        }
        return str;
    }
    
    public void alphabetical(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println(str1 + " and " + str2 + " are the SAME string!");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println(str2 + " is first alphabetically");
        } else {
            System.out.println(str1 + " is first alphabetically");
        }
    }

    public String halvesReversed(String myString) {
        int len = myString.length();
        int cut = len/2;
        String half1 = myString.substring(0, cut);
        String half2 = myString.substring(cut);
        return half2 + half1;
    }

    public String yellOrWhisper(String myString) {
        String first = myString.substring(0, 1);
        String compare = first.toUpperCase();
        if (first.equals(compare)) {
            return myString.toUpperCase();
        } else {
           return myString.toLowerCase();
        }
    }

    public String endUp(String myString, int numToCap){
        int len = myString.length();
        String caps = myString.substring((len - numToCap), len);
        String non = myString.substring(0, (len - numToCap));
        return non + caps.toUpperCase();
    }

    public String removeCharacter(String myString, int removeIdx) {
        if (removeIdx > myString.length()) {
            return myString;
        } else {
            String half1 = myString.substring(0, removeIdx);
            String half2 = myString.substring(removeIdx + 1);
            return half1 + half2;
        }
    }

    public String insertAt(String orig, String insertText, String searchStr) {
        int location = orig.indexOf(searchStr);
        if (location == -1) {
            return orig + insertText;
        } else {
            String half1 = orig.substring(0, location);
            String half2 = orig.substring(location + 1);
            return half1 + insertText + half2;
        }
    }
}
