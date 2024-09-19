public class conta {
    /*variavel da classe conta*/
    double saldo = 10.0;
    
    public void sacar(Double valor){
        /*variavel local de método*/
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        /*disponível em toda classe*/
        System.out.println(saldo);
        /*somente o método sacar conhece esta variavel*/
        System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial(){
        /*variável local de método*/
        double valorParcela = 50.0;
        double valorMontante = 0.0;/*Começando a variável*/

        for (int x=1; x<=5; x++){
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;

        }

        return valorMontante
    }
}
