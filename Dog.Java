class dog {
    int size;
    String breed;
    String name;

    void bark(){
        System.out.println("Ruff! Ruff");
    }
}
class DogTestDrive{
    public static void main (String[] atgs){
        //проверочный код для класса Dog.
        Dog d = new Dog();//создаем обьект класса.
        d.size = 40;//используем оператор доступа.Устанавливаем значение поля size.
        d.bark();//вызываем метод bark().(точка (.) оператор доступа.
    }
}