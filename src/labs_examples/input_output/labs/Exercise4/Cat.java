package labs_examples.input_output.labs.Exercise4;

public class Cat {

    private int age;
    private String name;
    boolean isShorthair;

    public Cat(){
    }

    public Cat(int age, String name, boolean isShorthair){
        this.age=age;
        this.name=name;
        this.isShorthair=isShorthair;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isShorthair() {
        return isShorthair;
    }

    public void setShorthair(boolean shorthair) {
        isShorthair = shorthair;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isShorthair=" + isShorthair +
                '}';
    }
}
