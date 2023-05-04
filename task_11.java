public class task_11 {
    public static void main(String[] args) {
        String n = "Barsic";
        Cat Grey = new Cat();
        Cat Barsic = new Cat(n);
        Grey.printInfo();
        Barsic.printInfo();
    }
}

class Cat {
    String name;
    Integer age;
    String color;
    Boolean isAgressive;
    Integer weight;

    void printInfo (){
        System.out.println("Cat name is: " + name + " color: " + color + " age: " + age + " weight: " + weight + " is agressive: " + isAgressive);
    }

    Cat() {
        name = "Grey";
        age = 2;
        weight = 3;
        color = "white & black";
        isAgressive = false;
    }

    Cat(String n) {
        name = n;
        age = 2;
        weight = 3;
        color = "white & black";
        isAgressive = false;
    }
}
