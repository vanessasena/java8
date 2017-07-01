/*
Mount the Bowling Pins!

Task:

Did you ever play Bowling? Short: You have to throw a bowl into 10 Pins arranged like this:


I I I I  # each Pin has a Number:    7 8 9 10
 I I I                                4 5 6
  I I                                  2 3
   I                                    1

You will get an Array with Numbers, e.g.: [3,5,9] and remove them from the field like this:


I I   I
 I   I
  I
   I

Return a string with the current field.
Note that:

String.prototype.replace() is not allowed!

You begin a new line with \n
Each Line must be 7 chars long
Fill the missing pins with a whitespace
Have fun!
*/

public class Bowling
{
  public String bowlingPins(int[] arr){
    String pins = "7 8 9 0\n 4 5 6 \n  2 3  \n   1   ";
    for (int i = 0; i < arr.length; i++){
      if (arr[i] == 10)
        pins = pins.replace("0", " ");
      else
        pins = pins.replace(String.valueOf(arr[i]), " ");
    }
    pins = pins.replaceAll("[0-9]", "I");
    return pins;
  }
}
