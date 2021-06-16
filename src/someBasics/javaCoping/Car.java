package someBasics.javaCoping;

public class Car {
    private String name;
    private String model;
    private int year;

    public Car(String name, String model, int year) {
        this.setName(name);
        this.setModel(model);
        this.setYear(year);
    }

    Car(Car x){
        this.copy(x);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }


    public int setYear(int year) {
        this.year = year;
        return year;
    }

    public void copy(Car x){
        this.setName(x.getName());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }



}
