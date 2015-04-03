public class AlarmClock {

  private int currentHour;
  private int currentMinute;
  private int alarmHour;
  private int alarmMinute;
  private boolean isAlarmOn;


  // constructor 
  public AlarmClock() {
    currentHour = 12;
    currentMinute = 00;
    alarmHour = 0;
    alarmMinute = 0;
    isAlarmOn = false;
  }

  public int setAlarm(int hour, int minute) {
    currentHour = hour;
    currentMinute = minute;

  } 

  public int snooze() {

  }

  public int dismiss() {

  }
}