import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 5
        int value = 33;
        changeValue(value);
        System.out.println(value);
        //Ответ: Примитивное значение равно 33, то есть оно не меняется. Произошло это потому, что при создании метода changeValue,
        // мы задаем новое значание(= 22) для копии value. Эта копия никак не сможет повлиять на значение value из метода
        // main, т. к. все действия и изменения происходят в другом методе(changeValue). Изменение значения возможно при
        // присвоении значения value из метода main действиям(методу), которые произошли с копией value.
        System.out.println();

        //Task 6
        Integer val = 33;
        changeValue(val);
        System.out.println(val);
        //Ответ: Объектное значение равно 33, то есть оно не меняется. Произошло это потому, что при создании метода changeValue,
        // мы задаем новое значание(= 22) для копии на ссылку объекта value. Эта копия никак не сможет повлиять на значение value
        // из метода main, т. к. все действия и изменения происходят в другом методе(changeValue). Изменение объектного значения возможно
        // с помощью метода equals.
        System.out.println();
        //Task 7
        Integer[] Integers = new Integer[]{3, 4};
        changeValue(Integers);
        System.out.println(Arrays.toString(Integers));
        //Ответ: Происходит тоже самое, что и в 6-стом задании, просто появляется массив с другими заданными значениями.
        System.out.println();
        //Task 8
        Integer[] numbers = new Integer[]{3, 4};
        changeVal(numbers);
        System.out.println(Arrays.toString(numbers));
        //Ответ: Значение меняется, так как по копии объета переданного в созданный метод, мы переходим уже в существущий
        //массив по его нулевому индексу(1ой ячейки массива). То есть ничего новое не создается и перезаписывается реальный
        //объект(массив)
        System.out.println();
        //Task 9
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
        //Ответ: Значение строки равно Lyapis Trubetskoy, то есть оно не меняется. Происходит ровно тоже самое,
        // что на 6-м задании. Только вместо уже существующего объекта мы создаем свой новый объект Person.
        System.out.println();
        //Task 10
        person = new Person("Lyapis", "Trubetskoy");
        changePersonAnoth(person);
        System.out.println(person);
        //Ответ: Значение строки равно Ilya Lagutenko, то есть он меняется. Происходит из-за того, что, пользуясь
        //сеттарами, мы по копии ссылки, задаваемой в метод changePersonAnoth, находим объект person в памяти и
        // перезаписываем его поля(name, surname). То есть мы работаем с самим объектом, к которому мы переходили
        // и находили в памяти с помощью копии ссылки.
    }

    static int changeValue(int value) {
        value = 22;
        return value;
    }
    static void changeValue(Integer value) {
        value = 22;
    }
    static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
    }
    static void changeVal(Integer[] value) {
        value[0] = 99;
    }
    static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");

    }
    static void changePersonAnoth(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}