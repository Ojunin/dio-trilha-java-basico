public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 4;
        

        /*Condição Composta */

        /*if(nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Prova de Recuperação");        

        else
            System.out.println("Reprovado");*/



            /*Expressão Ternária - Cenário1

            String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

            System.out.println(resultado);



            Expressão Ternária - Canário2*/

        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
