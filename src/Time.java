public class Time {
    private int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        convert();
    }

    public void tick() {
        seconds++;
        convert();
    }

    public void add(Time addedTime) {
        this.hours += addedTime.hours;
        this.minutes += addedTime.minutes;
        this.seconds += addedTime.seconds;
        this.convert();
    }

    public void convert() {
        if (this.seconds >= 60) {
            this.minutes += seconds/60;
            this.seconds = seconds%60;
        }
        if (this.minutes >= 60) {
            this.hours += minutes/60;
            this.minutes = minutes%60;
        }
        if (this.hours > 23) {
            this.hours -= hours * (hours/24);
        }
    }

    public String toString() {
       return(String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds));
    }
}
