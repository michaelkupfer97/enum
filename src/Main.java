public class Main {


    /**
     * This program demonstrates the use of enums and records.
     * It defines a simple enumeration for the days of the week
     * and a record to represent a person with name and age.
     * It also includes additional classes and functionality.
     */
    /**
     * The main method demonstrates the usage of enums and records.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Using the DayOfWeek enum
        DayOfWeek today = DayOfWeek.TUESDAY;
        System.out.println("Today is " + today);
        System.out.println("Abbreviation: " + today.getAbbreviation());

        // Using the Person record
        Person person = new Person("John", 25,"kjbhjvu@sgvdfb.com");
        System.out.println(person);

        // Creating a weekly schedule
        DayOfWeek[] days = {DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY};
        Schedule schedule = new Schedule(days);
        schedule.weeklySchedule(days);
    }
    public boolean isWeekendUSA(DayOfWeek day){
        boolean isweekend ;
        isweekend=switch (day){

            case MONDAY ,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY-> false;
            case SUNDAY ,SATURDAY-> true;
        };
        return isweekend;
    }
    public void isWeekendISR(DayOfWeek day){
        if (day==DayOfWeek.FRIDAY||day==DayOfWeek.SATURDAY) System.out.println("is weekend");
        else  System.out.println("is week day");
    }

}

