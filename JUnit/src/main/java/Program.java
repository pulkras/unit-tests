public class Program {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        int number = 5;
        int summa = numbers.sum(number);
        System.out.println("sum from 0 to " + number + " = " + summa);

        Dog dog = new Dog("Albert", 14);
        System.out.println("dog " + dog.getName() + " is " + dog.getAge() + " years old");
    }
}
