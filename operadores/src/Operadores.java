public class Operadores {
    public static void main(String[] args){
        System.out.println("Hello, World!");

// String nome = "Evandro";
// int idade = 34;
// double peso = 68.5;
// char sexo = 'M';
// boolean doadorOrgao = false;
// Date dataNascimento = new Date()

        String nomeCompleto = "Liguagem " + "Java";
        System.out.println(nomeCompleto);
        String concatenacao = "?";
        System.out.println(concatenacao);
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1" +(1+1+1);
        System.out.println(concatenacao);

        // Operadores 3

        int numero = 5;
        System.out.println(-numero);
        System.out.println(numero);
        numero= -numero;
        System.out.println(numero);
        numero = numero * -1;
        numero++;
        System.out.println(numero);

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        int a, b;

        a = 5;
        b = 6;
        // String resultado = "";
        // if(a==b)
        //     resultado = "verdadeiro";
        // else
        //     resultado = "falso";


        String resultado = a==b ? "verdadeiro" : "falsos";
        System.out.println(resultado);

        





        

    }
}
