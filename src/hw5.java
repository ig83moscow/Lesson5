public class hw5 {
    // hw5 = Сотрудник employee
    // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    String surname;
    String position;
    String email;
    float salary;
    String phone;
    int age;

    hw5(String surname, String position, String email, float salary, String phone, int age)
// 2. Конструктор класса должен заполнять эти поля при создании объекта.
    {
        this.surname = surname;
        this.position = position;
        this.age = age;
        this.email = email;
        this.salary = salary;
        this.phone = phone;
    } // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

    void printInfo() {
        System.out.println("Фамилия:" + surname);
        System.out.println("Должность: " + position);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("Почта:" + email);
        System.out.println("Телефон:" + phone);
    }

    public static void main(String[] args) {
        // 4. Создать массив из 5 сотрудников.
        // hw5 = Employee !!
        hw5[] employess = {
                new hw5(
                        "surname: Krasnoperova Ekaterina",
                        "position: IQM manager",
                        "e.b.krasnoperova@mail.ru",
                        150000,
                        "905-345-55-66",
                        34),
                new hw5(
                        "surname: Golubev Igor",
                        "position: Design manager",
                        "i.v.golubev@mail.ru",
                        170000,
                        "905-345-45-66",
                        38),
                new hw5(
                        "surname: Krasonva Eugenia",
                        "position: HR manager",
                        "e.i.krasnova@mail.ru",
                        130000,
                        "905-345-65-66",
                        33),
                new hw5(
                        "surname: Perova Sveta",
                        "position: PR manager",
                        "s.e.perova@mail.ru",
                        160000,
                        "905-345-65-94",
                        45),
                new hw5(
                        "surname: Smirnov Alexey",
                        "position: General manager",
                        "a.f.smirnov@mail.ru",
                        300000,
                        "905-245-65-94",
                        55),
        };
        int minAge = 40;
        for (hw5 hw5 : employess) {
            {
                if (hw5.age > minAge)
                    hw5.printInfo();
                System.out.println();
            }
        }
    }
}