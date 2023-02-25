import java.util.Collections;
import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        int characterCount = 0;
        int maxCharacter = 0;
        char maxCharacterChar = '.';

        char[] cArray = str.toCharArray();

        for(int i =0; i < cArray.length ; i++)
        {
            int characterASCII = (int)cArray[i];
            characterCount = 0;

            //System.out.print("Chracter ASCII: " + characterASCII + "\n");
            for(int x = 0; x < cArray.length -1; x++)
            {
                if(characterASCII == (int)cArray[x])
                {
                    characterCount ++;
                    //System.out.print("Character Count for " + characterASCII + " " +  characterCount  + "\n");
                    if(characterCount > maxCharacter)
                    {
                        maxCharacter = characterCount;
                        maxCharacterChar = cArray[i];
                    }
                }
            }
        }

        return maxCharacterChar;
    }
}

