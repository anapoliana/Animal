class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}


class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, int idade, String caracteristica) {
        super(nome, idade);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Característica: " + caracteristica;
    }
}
public class Main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Dourado", 1, "Escamas Douradas");
        System.out.println(peixe.toString());
    }
}
