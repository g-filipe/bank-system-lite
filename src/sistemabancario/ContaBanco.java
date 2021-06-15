package sistemabancario;
public class ContaBanco {
 
//atributos
    
    public int numConta;
    protected String tipo;
    private String cliente;
    private float saldo;
    private boolean status;
    
    // metodos específicos
    
    public void estadoAtual(){
        System.out.println("--------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Cliente: " + this.getCliente());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
         if (t == "CC"){
            this.setSaldo(50);
        }else if(t == "CP"){
             this.setSaldo(150);    
        }
        System.out.println("Olá " + this.getCliente() + ", seja bem-vindo(a)!"
        + " sua " + this.getTipo() + " foi aberta com suceso!");
    }
     
    public void encerrarConta(){
        if(this.getSaldo() > 0){
            System.out.println("Olá " + this.getCliente() + ", seja bem-vindo.");
            System.out.println("sua Conta não pode ser encerrada pois ainda"
            + " há valores não sacados.");
        }
            else if (this.getSaldo() < 0){
                  System.out.println("Prezado " + getCliente());
                  System.out.println ("Operação não realizada!"
                  + "\nA sua Conta não pode ser encerrada pois existem débitos"
                  + " em aberto.\nPor favor, dirija-se a uma de nossas agências"
                  + " ou entre em contato com a nossa Central de Atendimento.");
            }else{
                    this.setStatus(false);
                    System.out.println("Conta encerrada com sucesso.");
                }
    }
    
    public void depositar(float v){
        if(isStatus()){
           this.setSaldo(v + this.getSaldo());
            System.out.println("Depósito realizado com sucesso!"
            + "\n > Conta creditada: " + getNumConta() + "\n > Cliente: "
            + this.getCliente() + "\n > Valor depositado: " + v );
        }else{
            System.out.println("Conta inexistente/inativa. Verifique os dados "
            + "tente novamente" );
        }
    }
    
    public void sacar(float v){
        if (this.isStatus()){
        }else{   
             System.out.println("Operação não realizada. Conta"
             + " inexistente/inativa.");
            }  
        if (this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado com sucesso!" 
            + "\n > Conta debitada: " + this.getNumConta() + "\n > Cliente: " 
            + this.getCliente() + "\n > Valor retirado: " + v);
            }else{
             System.out.println("Saldo insuficiente!");  
            }
    }
    
    public void pagarMensal(){
        int mensalidade = 0;
        if(this.getTipo() == "CC"){
            mensalidade = 12;
        }else if(this.getTipo() == "CP"){
           mensalidade = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() - mensalidade);
            System.out.println("Mensalidade debitada com sucesso.");
        }else{
             System.out.println("Mensalidade não debitada. Conta inexistente/"
             + "inativa.");
        }    
     }
    
    //metodo construtor
      
   public ContaBanco(){
       this.setSaldo(0);
       this.setStatus(false);
    }
         
    //metodos getter & setter
    
        public int getNumConta(){
            return this.numConta;
        }
        public void setNumConta(int n){
            this.numConta = n;
        }
        
        protected String getTipo(){
            return this.tipo;
        }
        protected void setTipo(String t){
            this.tipo = t;
        }
    
        private String getCliente(){
            return this.cliente;
        }      
        void setCliente(String c){
            this.cliente = c;
        }
        
        private float getSaldo(){
            return this.saldo;
        }        
        private void setSaldo(float s){
            this.saldo = s;
        }
        
        private boolean isStatus(){
            return this.status;
        }
        private void setStatus(boolean e){
            this.status = e;
        }
        
}   

