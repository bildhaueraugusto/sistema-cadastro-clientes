import javax.swing.*;

public class CadastroClientes {

    static Cliente[] clientes = new Cliente[100]; //a classe é clientes, pois nao seria int nem string, por isso utilizamos o cliente
    static int total = 0;

    public static void cadastrarCliente() {

        String nome = Entrada.leiaString("Digite o nome do ciente: ");
        String nomemae = Entrada.leiaString("Digite o nome da mãe: ");
        String datanasci = Entrada.leiaString("Digite a data de nascimento: ");
        int idade = Entrada.leiaInt("Digite a idade: ");
        String cpf = Entrada.leiaString("Digite o CPF: ");

        if (!CPF.validar(cpf)) {
            JOptionPane.showMessageDialog(null, "CPF inválido.");
            return;
        }

        clientes[total] = new Cliente(nome, nomemae, datanasci, idade, cpf);
        total++;
    }

}

