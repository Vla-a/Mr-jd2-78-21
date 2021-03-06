package core.dto;


import java.time.LocalDate;

public class Flights {
    private String flight_no;
    private String status;
    private LocalDate scheduled_departure1;
    private LocalDate scheduled_arrival1;
    private String scheduled_departure;
    private String scheduled_arrival;
    private String departure_airport;
    private String arrival_airport;

    public Flights() {
    }

    public String getFlight_no() {
        return flight_no;
    }

    public void setFlight_no(String flight_no) {
        this.flight_no = flight_no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getScheduled_departure1() {
        return scheduled_departure1;
    }

    public void setScheduled_departure1(LocalDate scheduled_departure1) {
        this.scheduled_departure1 = scheduled_departure1;
    }

    public LocalDate getScheduled_arrival1() {
        return scheduled_arrival1;
    }

    public void setScheduled_arrival1(LocalDate scheduled_arrival1) {
        this.scheduled_arrival1 = scheduled_arrival1;
    }

    public String getScheduled_departure() {
        return scheduled_departure;
    }

    public void setScheduled_departure(String scheduled_departure) {
        this.scheduled_departure = scheduled_departure;
    }

    public String getScheduled_arrival() {
        return scheduled_arrival;
    }

    public void setScheduled_arrival(String scheduled_arrival) {
        this.scheduled_arrival = scheduled_arrival;
    }

    public String getDeparture_airport() {
        return departure_airport;
    }

    public void setDeparture_airport(String departure_airport) {
        this.departure_airport = departure_airport;
    }

    public String getArrival_airport() {
        return arrival_airport;
    }

    public void setArrival_airport(String arrival_airport) {
        this.arrival_airport = arrival_airport;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "flight_no='" + flight_no + '\'' +
                ", status='" + status + '\'' +
                ", scheduled_departure1=" + scheduled_departure1 +
                ", scheduled_arrival1=" + scheduled_arrival1 +
                ", scheduled_departure='" + scheduled_departure + '\'' +
                ", scheduled_arrival='" + scheduled_arrival + '\'' +
                ", departure_airport='" + departure_airport + '\'' +
                ", arrival_airport='" + arrival_airport + '\'' +
                '}';
    }
}
