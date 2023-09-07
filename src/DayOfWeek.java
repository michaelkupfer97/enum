public enum DayOfWeek {
    /**
     * An enumeration representing the days of the week.
     */
    MONDAY("Mon"), TUESDAY("Thu"), WEDNESDAY("Wed"), THURSDAY("Thur"), FRIDAY("Fri"), SATURDAY("Sat"), SUNDAY("Sun");

    private final String shortDay;

    DayOfWeek(String day) {
        this.shortDay = day;
    }

    public String getShortDay() {
        return shortDay;
    }

    public String getAbbreviation() {
        switch (this) {

            case MONDAY -> {
                return "Monday";
            }
            case TUESDAY -> {
                return "Tuesday";
            }
            case WEDNESDAY -> {
                return "Wednesday";
            }
            case THURSDAY -> {
                return "Thursday";
            }
            case FRIDAY -> {
                return "Friday";
            }
            case SATURDAY -> {
                return "Saturday";
            }
            case SUNDAY -> {
                return "Sunday";
            }
            default -> {
                return "day";
            }
        }
    }

}


