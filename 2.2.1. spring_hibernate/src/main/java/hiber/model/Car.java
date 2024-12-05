package hiber.model;

import javax.persistence.*;

@Entity
@Table (name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "car_id")
    private long id;

    @Column (name = "series")
    private int series;

    @Column (name="model")
    private String model;

    public Car() {
    }

    public Car(int series, String model) {
        this.series = series;
        this.model = model;
    }

    public long getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Car{" +
               "id=" + id +
               ", series=" + series +
               ", model='" + model + '\'' +
               '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
