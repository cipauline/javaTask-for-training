package by.student.javaswreader;

public class Program extends Software {

    private String size;
    private String cost;

    public Program(String name, String size, String cost) {

        super(name);
        this.size = size;
        this.cost = cost;
    }

    public String getSize() {

        return size;
    }

    public String getCost() {

        return cost;
    }

}
