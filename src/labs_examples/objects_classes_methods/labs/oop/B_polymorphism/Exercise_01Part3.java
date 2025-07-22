package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Exercise_01Part3 {
    public static void main(String[] args) {
        Iphone iphone = new Iphone(true, 256);
        iphone.hello();
        Customer connor = new Customer("Connor", iphone);
        connor.callFriend();
        Samsung samsung = new Samsung(false, 256);
        connor.setPhone(samsung);
        connor.callFriend();

    }

    public interface Phone {
        void callFriend();

        void textFriend();

        default void playGames() {
            System.out.println("Games on the phone are not supported");
        }
    }

    public static class Customer {
        private Phone phone;
        String name;

        public Customer(String name, Phone phone) {
            this.name = name;
            this.phone = phone;
        }

        public void setPhone(Phone phone) {
            this.phone = phone;
        }

        public void callFriend() {
            this.phone.callFriend();
        }
    }

    public static class Iphone implements Phone {
        boolean isNew;
        int capacity;

        public Iphone(boolean isNew, int capacity) {
            this.isNew = isNew;
            this.capacity = capacity;
        }

        @Override
        public void callFriend() {
            if (isNew == true) {
                System.out.println("You call your friend with your new iPhone");
            } else {
                System.out.println("You call your friend with your used iPhone");
            }
        }

        public void textFriend() {
            if (isNew == true) {
                System.out.println("You text your friend with your new iPhone");
            } else {
                System.out.println("You text your friend with your used iPhone");
            }
        }

        public void hello() {
            System.out.println("Hello from iPhone");
        }

        public boolean isNew() {
            return isNew;
        }

        public void setNew(boolean aNew) {
            isNew = aNew;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }

    public static class Samsung implements Phone {
        boolean isNew;
        int capacity;

        public Samsung(boolean isNew, int capacity) {
            this.isNew = isNew;
            this.capacity = capacity;
        }

        public void callFriend() {
            if (isNew == true) {
                System.out.println("You call your friend with your new Samsung Phone");
            } else {
                System.out.println("You call your friend with your used Samsung Phone");
            }
        }

        public void textFriend() {
            if (isNew == true) {
                System.out.println("You text your friend with your new Samsung Phone");
            } else {
                System.out.println("You text your friend with your new Samsung Phone");
            }
        }

        public boolean isNew() {
            return isNew;
        }

        public void setNew(boolean aNew) {
            isNew = aNew;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }

}
