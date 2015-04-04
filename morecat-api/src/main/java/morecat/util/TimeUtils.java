package morecat.util;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Yoshimasa Tanabe
 */
public class TimeUtils {

  private TimeUtils() {}

  public static LocalDateTime composite(LocalDate date, LocalDateTime onlyTime) {
    return date.atTime(onlyTime.getHour(), onlyTime.getMinute(), onlyTime.getSecond());
  }

}
