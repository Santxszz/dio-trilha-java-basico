public class MyClassTwo {

    public static String fullName(String firstName, String lastName) {
        //return "Primeiro Nome:" + firstName + " Segundo Nome: " + lastName;
        return firstName.concat(" ").concat(lastName);
    }

    public static void main(String[] args) {
        String myName = "Erek"; // camelCase on variable
        int yearFabrication = 2025;
        boolean yesOrNot = true;

        // Changing values
        yearFabrication = 2018;

        System.out.println(fullName("Erek", "Couto"));

    }


}
