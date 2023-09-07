public class Schedule {
    private DayOfWeek [] days;

    public Schedule(DayOfWeek [] days){
        this.days=days;
    }
    public void weeklySchedule(DayOfWeek [] days){
        for( DayOfWeek day: days){
            System.out.println(day.getAbbreviation());
        }
    }

}
