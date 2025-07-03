import java.util.Scanner;

public class jonathan{
    public static void main(String[]args){
        /* F.A.Q realize o cadastro de um usuario com as seguintes informações :

         Nome:Deve possur mais de 2 caracteres.

         Idade:Deve estar entre 0 e 150.

         Email:deve possuir o caracter arroba.

         Senha:Deve conter número,letra minuscula,letra maiuscula e caracter especial("#","*","_","!","@").

         Utilize as funções da classe character:
         -isUpperCase
         -isLowerCase
         -isDigit
         */

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        char senha,email;


        /*System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite o email (ex: usuario@gmail.com): ");
        String email = sc.nextLine();
        System.out.print("Digite a senha(Deve conter número,letra minuscula,letra maiuscula e caracter especial(#,*,_,!,@");*/

        do {
            if (sc.hasNextLine()){
            nome = sc.nextLine();
            System.out.println("Olá "+nome+" Bem vindo!");
            }
            else{
                System.out.println("Digite caracteres válidos!");
            }
            idade = sc.nextInt();
            if (idade < 0 || idade > 150){
                System.out.println("Idade inválida!");
            }
            else {
                email = ;

            }
        }
        while ();
    }

}
