package br.com.ada.Revisao;

import java.util.Objects;

public class Cachorro {

    private String nome;
    private String raca;
    private int idade;

    private static int id;
    private Dono dono;


    public Cachorro(String nome, String raca, int idade, Dono dono) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.dono = dono;
        this.id++;
        if (Objects.isNull(this.dono)){
            System.out.println("Não é permitido criar cachorro sem dono.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Cachorro.id = id;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
        if (Objects.isNull(this.dono)){
            System.out.println("Não é permitido criar cachorro sem dono.");
        }
    }


    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", dono=" + dono +
                ", id = " + id +
                '}';
    }
}
