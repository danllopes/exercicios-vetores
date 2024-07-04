import entities.Person;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        short option;

        System.out.println("""
                Para acessar os enunciados dos exercícios, \

                vá até a pasta 'documentação' e abra o arquivo PDF
                """);

        System.out.println("""
                OPÇÃO        EXERCÍCIO
                ----------------------
                  1              01
                  2              02
                ----------------------
                """);

        do {
            System.out.print("Exercício Nº: ");
            option = sc.nextShort();
        } while(option != 1 && option !=2);


        for(int i = 0; i < 10; i++) {
            System.out.println();
        }

        switch(option) {
            case 1:
                System.out.println("Exercicio 01\n" +
                                   "------------");

                System.out.print("\nQuantas pessoas serão digitadas? ");
                Person[] people = new Person[sc.nextInt()];

                for (int i = 0; i < people.length; i++) {
                    System.out.printf("\nDados da %dª pessoa:\n", i+1);

                    System.out.print("Nome: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.print("Idade: ");
                    int age = sc.nextInt();

                    System.out.print("Altura: ");
                    double height = sc.nextDouble();

                    people[i] = new Person(name, age, height);
                }

                System.out.printf("\nAltura média: %.2f", averageHeight(people));

                int counter = 0;
                for(Person person: people) {
                    if(person.getAge() < 16) {
                        counter++;
                    }
                }

                double percentageUnder16 = (double) 100 /people.length * counter;

                System.out.printf("\nPessoas com menos de 16 anos: %.2f%%\n", percentageUnder16);

                for(Person person: people) {
                    if(person.getAge() < 16) {
                        System.out.println(person.getName());
                    }
                }

                break;

            case 2:
                System.out.println("Exercicio 02\n" +
                                   "------------");
                break;

        }

        sc.close();
    }

    public static double averageHeight(Person[] people) {
        double sum = 0;
        for(Person person: people) {
            sum += person.getHeight();
        }
        return sum/ people.length;
    }
}