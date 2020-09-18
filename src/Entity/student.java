package Entity;

public class student {

    private String name;
    private int age;
    private Boolean  frozen;

    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Boolean getFrozen() {
        return frozen;
    }

    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
