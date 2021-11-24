package Model;

import java.time.LocalDate;

public class Usuario extends Pessoa {
    private Float altura;
    private Float peso;
    private Enum sexo;
    private Enum situacao;
    private Enum fatorAtividade;
    private Refeicao refeicao;
    private Float metabolismo;


    public Usuario(Long id, String nome, String login, LocalDate dataNascimento) {
        super(id, nome, login, dataNascimento);
    }

    public Usuario(Long id, String nome, String login, LocalDate dataNascimento, Float altura, Float peso, Enum sexo, Enum situacao, Enum fatorAtividade, Refeicao refeicao, Float metabolismo) {
        super(id, nome, login, dataNascimento);

        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.situacao = situacao;
        this.fatorAtividade = fatorAtividade;
        this.refeicao = refeicao;
        this.metabolismo = metabolismo;
    }
}
