import javax.xml.namespace.QName;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Бобик", " Хаски");
        Dog dog2=  new Dog("Шарик","овчарка");
        Dog dog3=  new Dog("Пират","Дворняжка");
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog3.toString());
//
//
//        Cat cat1 = new Cat("Vox");
//        System.out.println(cat1.toString());
//
//        System.out.println(cat1.hashCode());
//        System.out.println(cat1.hashCode());
//
//        System.out.println(cat1.getClass()); // посмотреть к какому классу принадлежит объект
//
//        Cat cat2 = new Cat("Vox"); // ссылка ссылки кэт2 и кэт 1 одинаковые
//        Cat cat3 = cat2;
//
//        System.out.println(cat2.toString());
//        System.out.println(cat3.equals(cat2));
//        System.out.println(cat2.hashCode());


    }
}

class Dog {
    String name;
    String poroda;

    public Dog(String name, String poroda) {
        this.name = name;
        this.poroda = poroda;
    }


//    public Cat(String name) {//констрктор класса Cat
//        this.name = name;
@Override // переопределение метода ту стринг
public String toString() {
    return this.getClass() +" Порода собаки "+ name +":" + poroda;

}


}

