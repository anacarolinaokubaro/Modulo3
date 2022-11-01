package br.com.ada.Revisao;

public class Dono {

    private String nome;

    private String cpf;

    private String email;

    private Endereço endereço;

    private static int id;

    public Dono(String nome, Endereço endereço) {
        this.nome = nome;
        this.endereço = endereço;
        this.id++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Dono.id = id;
    }

    @Override
    public String toString() {
        return "Dono{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", endereço=" + endereço +
                ", id= "+ id +
                '}';
    }
}
