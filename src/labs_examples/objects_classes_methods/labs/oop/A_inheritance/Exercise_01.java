package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Exercise_01 {
    public static void main(String[] args) {
        Animal animal = new Animal(2,"Brown");
        animal.makeNoise();

        Mammal mammal=new Mammal(6,"White", false);
        mammal.makeNoise();
        mammal.mammalDescription();

        Monkey monkey= new Monkey(3,"Brown",true,true);
        monkey.makeNoise();
        monkey.banana();
        System.out.println("The animal is a monkey that is "+monkey.getLength()+" feet tall, "+monkey.getColor()+" in color, it is "+monkey.isLivesOnLand()+" that is lives on land and "+monkey.isHasBanana()+" that the monkey has a banana");

        Tree oak= new Tree(20,"Brown","Smooth");
        oak.setBarkType("Rough");
        oak.plantDescription();
    }

    public static class Animal{
        protected int length;
        protected String color;

        public Animal(int length, String color){
            this.length=length;
            this.color=color;

        }
        public void makeNoise(){
            System.out.println("The animal is making noises!");
        }
        public void yawn(){
            System.out.println("The animal yawned");
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    static class Mammal extends Animal {
        protected boolean livesOnLand;

        public Mammal(int length, String color, boolean livesOnLand) {
            super(length, color);
            this.livesOnLand = livesOnLand;
        }

        public void mammalDescription() {
            if (livesOnLand) {
                System.out.println("This mammal lives on land");
            } else {
                System.out.println("This mammal lives in the water");
            }
        }
        @Override
        public void makeNoise(){
            System.out.println("The mammal is making some noise");
        }

        public boolean isLivesOnLand() {
            return livesOnLand;
        }

        public void setLivesOnLand(boolean livesOnLand) {
            this.livesOnLand = livesOnLand;
        }
    }

    static class Monkey extends Mammal{
        protected boolean hasBanana;

        public Monkey(int length, String color, boolean livesOnLand,boolean hasBanana){
            super(length,color,livesOnLand);
            this.hasBanana=hasBanana;
        }
        public void banana(){
            if (hasBanana){
                System.out.println("The monkey has a banana");
            }
            else{
                System.out.println("The monkey does not have a banana :(");
            }
        }
        @Override
        public void makeNoise(){
            System.out.println("The monkey is howling");
        }

        public boolean isHasBanana() {
            return hasBanana;
        }

        public void setHasBanana(boolean hasBanana) {
            this.hasBanana = hasBanana;
        }
    }
    static class Plant{
        protected int age;
        protected String color;

        public Plant(int age,String color){
            this.age=age;
            this.color=color;
        }
        public void plantDescription(){
            System.out.println("This is a plant");
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
    static class Tree extends Plant{
        String barkType;

        public Tree(int age, String color,String barkType){
            super(age,color);
            this.barkType=barkType;
        }
        @Override
        public void plantDescription(){
            System.out.println("This is a tree with "+barkType+" bark");
        }

        public String getBarkType() {
            return barkType;
        }

        public void setBarkType(String barkType) {
            this.barkType = barkType;
        }
    }
    }
