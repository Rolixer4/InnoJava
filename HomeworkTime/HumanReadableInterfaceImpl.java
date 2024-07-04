package ru.inno.HomeworkTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class HumanReadableInterfaceImpl implements HumanReadableTimestamp {

    @Override
    public String getTimestamp(LocalDateTime eventTimeStamp) {
        LocalDateTime now = LocalDateTime.now();
        Duration pastTime = Duration.between(eventTimeStamp, now);
        long minutes = pastTime.toMinutes();
        long hours = pastTime.toHours();
        long days = pastTime.toDays();
        long remainingDays = days%100;



            if (hours < 1) {
                if (minutes % 2 == 1) {
                    return "Опубликовано " + minutes + " минуту назад";
                } else if ((minutes >= 2 && minutes <= 4) || minutes == 22 || minutes == 54) {
                    return "Опубликовано " + minutes + " минуты назад";
                } else {
                    return "Опубликовано " + minutes + " минут назад";
                }
            } else if (hours < 24) {
                if (hours == 1 || hours == 21) {
                    return "Опубликовано " + hours + " час назад";
                } else if (hours <= 4 || hours >= 22) {
                    return "Опубликовано " + hours + " часа назад";
                } else {
                    return "Опубликовано " + hours + " часов назад";
                }
            } else if (days == 1) {
                return "Опубликовано вчера";
            } else {
                if ((remainingDays % 10 == 1) && (remainingDays != 11)) {
                return "Опубликовано " + days + " день назад";
            } else if (((remainingDays > 1) &&(remainingDays < 5) || ((remainingDays > 20) && ((remainingDays % 10 == 2) || (remainingDays % 10 == 3) || (remainingDays % 10 == 4))))) {
                return "Опубликовано " + days + " дня назад";
            } else {
                return "Опубликовано " + days + " дней назад";
            }
        }
    }
}
