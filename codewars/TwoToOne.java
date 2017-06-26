/*
Description:

Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, 
the longest possible, containing distinct letters,

each taken only once - coming from s1 or s2. 
#Examples:
a = "xyaabbbccccdefww" b = "xxxxyyyyabklmopq" longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz" longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" 

*/
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        String result = "";
        for (char c = 'a'; c <= 'z'; c++){
          if (s1.indexOf(c) > -1 || s2.indexOf(c) > -1)            
            result += c;
        }
        return result;
    }
}
