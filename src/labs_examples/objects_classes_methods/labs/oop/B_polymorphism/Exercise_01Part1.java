package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Exercise_01Part1 {
    public static void main(String[] args) {
        Instrument guitar = new Instrument("Guitar", 5);
        guitar.singAlong();
        guitar.playMusic();

        Headphones appleAirpods = new Headphones("Apple", true);
        appleAirpods.singAlong();
        appleAirpods.playMusic();
    }

    public interface Music {
        public void playMusic();

        default void singAlong() {
            System.out.println("You sing along to the music");
        }
    }

    static class Instrument implements Music {
        private String instrumentName;
        private int age;

        public Instrument(String instrumentName, int age) {
            this.instrumentName = instrumentName;
            this.age = age;
        }

        public void playMusic() {
            System.out.println("You play the " + instrumentName + " of age " + age);

        }

        @Override
        public void singAlong() {
            System.out.println("You sing along to the music while playing the " + instrumentName);
        }

        public String getInstrumentName() {
            return instrumentName;
        }

        public void setInstrumentName(String instrumentName) {
            this.instrumentName = instrumentName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    static class Headphones implements Music {
        private String brand;
        private boolean wireless;

        public Headphones(String brand, boolean wireless) {
            this.brand = brand;
            this.wireless = wireless;
        }

        public void playMusic() {
            System.out.println("The " + brand + " headphones play the music ");
        }

        @Override
        public void singAlong() {
            System.out.println("You sing along to the music playing from your headphones");
        }
    }
}
