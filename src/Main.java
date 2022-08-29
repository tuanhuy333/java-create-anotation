public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person();
        person.setName("a");

        String json =JsonNameProcessor.toJson(person);
        System.out.println(json);

        System.out.println("Hello world!");
    }
}