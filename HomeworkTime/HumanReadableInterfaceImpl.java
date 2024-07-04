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
                    return "������������ " + minutes + " ������ �����";
                } else if ((minutes >= 2 && minutes <= 4) || minutes == 22 || minutes == 54) {
                    return "������������ " + minutes + " ������ �����";
                } else {
                    return "������������ " + minutes + " ����� �����";
                }
            } else if (hours < 24) {
                if (hours == 1 || hours == 21) {
                    return "������������ " + hours + " ��� �����";
                } else if (hours <= 4 || hours >= 22) {
                    return "������������ " + hours + " ���� �����";
                } else {
                    return "������������ " + hours + " ����� �����";
                }
            } else if (days == 1) {
                return "������������ �����";
            } else {
                if ((remainingDays % 10 == 1) && (remainingDays != 11)) {
                return "������������ " + days + " ���� �����";
            } else if (((remainingDays > 1) &&(remainingDays < 5) || ((remainingDays > 20) && ((remainingDays % 10 == 2) || (remainingDays % 10 == 3) || (remainingDays % 10 == 4))))) {
                return "������������ " + days + " ��� �����";
            } else {
                return "������������ " + days + " ���� �����";
            }
        }
    }
}
