public class Metodos {
    /*EXEMPLOS SUGERIDOS PARA NOMENCLATURA DE MÉTODOS:
     * somar(int n1, int n2){}
     * 
     * abrirConexao(){}
     * 
     * concluirProcessamento(){}
     * 
     * findById(int id){}
     * 
     * calcularImprimir(){}
     * 
     * Abaixo temos um exemplo de uma classe com dois métoos e suas respectivas considerações:*/

     public double somar(int num1, int num2){
        /*LOGICA - FINALIDADE DO MÉTODO */
        return
     }

     public void imprimir(String texto){
        /*LOGICA - FINALIDADE DO MÉTODO
         * AQUI NÃO PRECISA DO RETURN, POIS NÃO SERÁ RETORNADO NENHUM RESULTADO.*/

        /*throws Exception: indica que o método ao ser utilizado, poderá gerar uma exceção*/
        public double dividir(int dividendo, int divisor) throws Exception{}

        /*Este método não pode ser visto por outras classes no programa*/
        private void metodoPrivado(){}

        /*Alguns equívocos estruturais*/
        public void validar(){
            /*Este método deveria retornar algum valor, no caso boolean (true ou false)*/
        }

        public void calcularEnviar(){
            /*Um método deve representar uma única resposta*/
        }

        public void gravarClientes(String nome, String cpf){
            /*Este método tem a finalidade de gravar informações de um cliente, por que não criar
             * um objeto clinete e passar como parâmentro? Veja abaixo:*/
        }

        public void gravarCliente(cliente cliente){}
        /*OU*/
        public void gravar(cliente cliente){}
     }
}
