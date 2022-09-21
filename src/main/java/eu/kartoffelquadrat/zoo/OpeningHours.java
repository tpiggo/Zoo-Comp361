package eu.kartoffelquadrat.zoo;

/**
 * Open Hours is a bean storing the Zoo's opening hours on Weekdays and Weekends..
 *
 * @author Maximilian Schiedermeier
 */
public class OpeningHours {

  // immutable fields for hard coded opening hours.
  private static final String MON_FRI = "9AM - 7PM";
  private static final String SAT_SUN = "10AM - 8PM";

  /**
   * Default constructor.
   */
  public OpeningHours() {
  }

  /**
   * Getter for opening hours on weekdays.
   *
   * @return String encoding opening hours Mondays to Fridays.
   */
  public String getMonFri() {
    return MON_FRI;
  }

  /**
   * Getter for opening hours on weekends.
   *
   * @return String encoding opening hours Saturdays and Sundays.
   */
  public String getWeekEnd() {
    return SAT_SUN;
  }

  /**
   * Custom toString method for convenient string representation of open hours object.
   *
   * @return all field information of this open hours object formatted as human readable string.
   */
  @Override
  public String toString() {
    StringBuilder openingHoursBuilder = new StringBuilder("");
    openingHoursBuilder.append("\tMon-Fri: ")
        .append(getMonFri())
        .append("\n\tSat/Sun: ")
        .append(getWeekEnd());
    return openingHoursBuilder.toString();
  }
}