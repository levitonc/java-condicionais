public class ResultadoEscolar {
    public static void main(String[] args) {
        int  nota = 6;

        String resultado = nota >= 7 ? "APROVADO" : nota >= 5 && nota < 7 ? "RECUPERAÇÃO" : "REPROVADO";
            System.out.println(resultado);


        // String resultado = nota >= 7 ? "APROVADO" : "REPROVADO";
        //     System.out.println(resultado);



        // if(nota >= 7)
        // System.out.println("APROVADO");

        // else if (nota >= 5 && nota < 7 )
        // System.out.println("RECUPERAÇÃO");

        // else 
        // System.out.println("REPROVADO");
    }
    
}
