package ru.inno.HomeworkTime;

import java.time.LocalDateTime;

public interface HumanReadableTimestamp {

    String getTimestamp(LocalDateTime eventTimeStamp);
}
