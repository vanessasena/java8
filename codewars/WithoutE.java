/*
Is it possible to write a book without the letter 'e' ?

Task

Given String str, return:

How much "e" does it contains (case-insensitive) - return number as String.
If given String doesn't contain any "e", return: "There is no "e"."
If given String is empty, return empty String.
If given String is null/None/nil, return null/None/nil

*/
public class WithoutE{
  public static String find_E(String str){
        if (str == null)
          return null;
        else if (str.length() == 0)
          return str;          
        int e = str.length() - str.replaceAll("[eE]", "").length();
        if (e == 0)
          return "There is no \"e\".";
        else 
          return String.valueOf(e);
    }
}
