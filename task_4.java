import java.util.Arrays;
import java.util.HashSet;


public class task_4 {
    /*
     * 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
Поместите в него некоторое количество объектов. +
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
Убедитесь, что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o) +
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
4. Создайте метод public int hashCode()
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
Objects.hash(...))
5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились
     */
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsic");
        Cat cat2 = new Cat("Myrsik");
        Cat cat3 = new Cat("Barsic");
        Cat cat4 = new Cat("Myrka");

        HashSet<Cat> setCat = new HashSet<>(Arrays.asList(cat1, cat2, cat3, cat4));
        System.out.println(setCat);
        System.out.println(cat1.equals(cat3));
        cat1.setAge(-10);
        cat2.setAge(10);
        System.out.println(cat1.getAge());
        System.out.println(cat2.getAge());
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
        this.name = n;
        this.age = 2;
        this.weight = 3;
        this.color = "white & black";
        this.isAgressive = false;
    }
    public void setAge(Integer age) {
        if(age < 0) System.out.println("Введен неправильный возраст");
        else this.age = age;
    }
    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cat cat = (Cat)  obj;
        if (this.name.equals(cat.name)&& this.age == cat.age) return true;
        return false;
    }
    @Override
    public int hashCode () {
        
        return name.hashCode() + age + weight + color.hashCode();
    }
}

