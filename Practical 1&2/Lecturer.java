public abstract class Lecturer {
    private String name;
    private int id;

    public Lecturer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Lecturer() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return getName() + " " + getId();
    }

    public abstract double salary();
}