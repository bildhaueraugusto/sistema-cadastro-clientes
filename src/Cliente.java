public class Cliente {

    private String nome;
    private String nomemae;
    private String datanasci;
    private int idade;
    private String cpf;

    public Cliente(String nome, String nomemae, String datanasci, int idade, String cpf) {
        this.nome = nome;
        this.nomemae = nomemae;
        this.datanasci = datanasci;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getNomemae() {
        return nomemae;
    }

    public String getDatanasci() {
        return datanasci;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }
}



