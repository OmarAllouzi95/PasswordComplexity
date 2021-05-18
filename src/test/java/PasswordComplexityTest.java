import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordComplexityTest {

   @Test
   public void isPasswordComplex_true() {
       assertTrue(PasswordComplexity.isPasswordComplexWithLoop("Happy12"));
       assertTrue(PasswordComplexity.isPasswordComplexWithLoop("1SarahL ength"));
       assertTrue(PasswordComplexity.isPasswordComplexWithLoop("Password12"));
       assertTrue(PasswordComplexity.isPasswordComplexWithLoop("2PassW@ord1"));
       assertTrue(PasswordComplexity.isPasswordComplexWithLoop("01Sall#y9"));
   }

   @Test
   public void isPasswordComplex_false() {
       assertFalse(PasswordComplexity.isPasswordComplexWithLoop("12aB "));
       assertFalse(PasswordComplexity.isPasswordComplexWithLoop("Ab112"));
       assertFalse(PasswordComplexity.isPasswordComplexWithLoop("happy"));
       assertFalse(PasswordComplexity.isPasswordComplexWithLoop("happy_1"));
       assertFalse(PasswordComplexity.isPasswordComplexWithLoop("p assword12"));
       assertFalse(PasswordComplexity.isPasswordComplexWithLoop("Sur18"));
       assertFalse(PasswordComplexity.isPasswordComplexWithLoop(""));
   }
}
