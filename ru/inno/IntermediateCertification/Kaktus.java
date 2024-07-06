package ru.inno.ru.inno.IntermediateCertification;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Kaktus {

    private int lastWateringDays;

    public void nextWateringDay() {
        TemperatureSensorImpl sensor = new TemperatureSensorImpl();
        int humidity = sensor.temperature();
        LocalDateTime lastWatering = LocalDateTime.now().minusDays(lastWateringDays);
        long between = Duration.between(lastWatering, LocalDateTime.now()).toDays();
        int month = LocalDate.now().getMonthValue();
        System.out.println(humidity);

        if (month <= 2 || month == 12) {
            if (between >= 30) {
                System.out.println("Время полить кактус!");
            } else {
                System.out.println("Следующая дата полива : " + LocalDate.now().plusDays(Math.subtractExact(30, between)));
            }
        } else if (month >= 6 && month <= 8) {
            if (between < 2) {
                System.out.println("Следующая дата полива : " + LocalDate.now().plusDays(Math.subtractExact(2, between)) + ". Обратите внимание на датчик!");
            }
            else if (humidity < 30) {
                System.out.println("Время полить кактус!");
            }
        } else {
            if (between >= 7) {
                System.out.println("Время полить кактус!");
            } else {
                System.out.println("Следующая дата полива : " + LocalDate.now().plusDays(Math.subtractExact(7, between)));
            }
        }
    }

    public Kaktus(int lastWateringDays) {
        this.lastWateringDays = lastWateringDays;
    }

    public int getLastWateringDays() {
        return lastWateringDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kaktus kaktus = (Kaktus) o;
        return lastWateringDays == kaktus.lastWateringDays;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lastWateringDays);
    }

    @Override
    public String toString() {
        return "Kaktus{" +
                "lastWateringDays=" + lastWateringDays +
                '}';
    }
}
