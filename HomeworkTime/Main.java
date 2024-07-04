package ru.inno.HomeworkTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        LocalDate publishDate = LocalDate.now().minusDays(0);
        LocalTime publishTime = LocalTime.now().minusHours(20);
        LocalDateTime timestamp = LocalDateTime.of(publishDate, publishTime);

        HumanReadableTimestamp humanReadableTimestamp = new HumanReadableInterfaceImpl();

        System.out.println(humanReadableTimestamp.getTimestamp(timestamp));

        System.out.println(LocalTime.now().minusHours(20).getHour());
    }
}
