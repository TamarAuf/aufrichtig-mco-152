package aufrichtig.dictionary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.FileNotFoundException;

class ScrabbleDictionaryTest {
    @Test
    public void isValidTrue() throws FileNotFoundException {
        //given
        ScrabbleDictionary newDict = new ScrabbleDictionary();
        String word = "yes";
        //when
        boolean validity = newDict.isValid(word);
        //then
        assertEquals(true, validity);
    }

    @Test
    public void isValidFalse() throws FileNotFoundException {
        //given
        ScrabbleDictionary newDict = new ScrabbleDictionary();
        String word = "yrso";
        //when
        boolean validity = newDict.isValid(word);
        //then
        assertEquals(false, validity);
    }

    @Test
    public void isValid() throws FileNotFoundException {
        //given
        ScrabbleDictionary newDict = new ScrabbleDictionary();
        String word = "Yes";
        //when
        boolean validity = newDict.isValid(word);
        //then
        assertEquals(true, validity);
    }
}
