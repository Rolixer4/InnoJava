package ru.inno.ru.inno.IntermediateCertification.Task2;

public class TemperatureSensorImpl implements TemperatureSensor{
    @Override
    public int temperature() {
        double humidity = Math.random()*100;
        return (int) humidity;
    }
}
