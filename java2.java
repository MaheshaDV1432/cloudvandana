//B. Enter a Roman Number as input and convert it to an integer. (ex IX = 9) 
import java.util.HashMap;

public class RomanToInteger 
{
    public int romanToInt(String s) 
    {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) 
        {
            int curValue = romanMap.get(s.charAt(i));

            if (curValue < prevValue) 
            {
                result -= curValue;
            } 
            else 
            {
                result += curValue;
            }

            prevValue = curValue;
        }

        return result;
    }

    public static void main(String[] args) 
    {
        RomanToInteger romanConverter = new RomanToInteger();
        String romanNumeral = "IX"; // Replace with the Roman numeral you want to convert
        int integerEquivalent = romanConverter.romanToInt(romanNumeral);
        System.out.println("Integer equivalent of " + romanNumeral + " is " + integerEquivalent);
    }
}