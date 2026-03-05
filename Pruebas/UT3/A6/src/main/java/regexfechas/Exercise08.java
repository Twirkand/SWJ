
package regexfechas;

import java.util.regex.Pattern;

public class Exercise08 {
  // Solo fechas de diciembre dd/12/yyyy
  private static final Pattern P =
      Pattern.compile("^(0[1-9]|[12]\\d|3[01])/12/\\d{4}$");

  public static boolean isValid(String text) {
    return false;
  }
}
