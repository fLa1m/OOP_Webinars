package Webinar7.Adapter;

import java.time.LocalDateTime;

public class AdapterST500Info implements MeteoSensor {

    private SensorTemperature adapter;

    @Override
    public int getId() {
        return adapter.identifier();
    }

    @Override
    public Float getTemperature() {
        return ((float) adapter.temperature());
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime result = LocalDateTime.of(adapter.year(), 1, 1, 0, 0);
        result.plusDays(adapter.day() - 1);
        result.plusSeconds(adapter.second());
        return result;
    }

    public AdapterST500Info(SensorTemperature data) {
        this.adapter = data;
    }
}
