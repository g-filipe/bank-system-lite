package sistemabancario;
public class SistemaBancario {
    public static void main(String[] args) {
        ContaBanco client1 = new ContaBanco();
        client1.setNumConta(1111);
        client1.setCliente("Marcelo");
        client1.abrirConta("CC");

        
        ContaBanco client2 = new ContaBanco();
        client2.setNumConta(2222);
        client2.setCliente("Ana");
        client2.abrirConta("CP");
        
        client1.depositar(300);
        client2.depositar(500);
        
        client2.sacar(100);
        client1.pagarMensal();
        client1.pagarMensal();
        client1.pagarMensal();
        client1.pagarMensal();
        client1.sacar(300);
        client1.pagarMensal();
        client2.pagarMensal();
        client1.encerrarConta();
        client1.depositar(1000);
        client1.sacar(990);
        client1.encerrarConta();
        client1.abrirConta("CC");
        
    client1.estadoAtual();
    client2.estadoAtual();
    
    }
    
}
