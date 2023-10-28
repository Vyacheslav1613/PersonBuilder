public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setName("Олег")
                .setSurname("Лопатов")
                .setAge(48)
                .setAddress("Питер")
                .build();
        System.out.println(person);
        person.happyBirthday();
        System.out.println(person);

        Person child = person.newChildBuilder()
                .setName("Игорь")
                .setAge(10)
                .build();
        System.out.println(child);
        child.happyBirthday();
        System.out.println(child);
    }
}