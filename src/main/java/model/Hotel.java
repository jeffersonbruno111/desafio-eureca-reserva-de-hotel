package model;

public class Hotel {

    private String nome;
    private int classificacao;
    private Double diariaDaSemanaNormal;
    private Double diariaDaSemanaFidelidade;
    private Double diariaDoFimDeSemanaNormal;
    private Double diariaDoFimDeSemanaFidelidade;

    public Hotel(String nome, int classificacao, Double diariaDaSemanaNormal, Double diariaDaSemanaFidelidade, Double diariaDoFimDeSemanaNormal, Double diariaDoFimDeSemanaFidelidade) {
        this.nome = nome;
        this.classificacao = classificacao;
        this.diariaDaSemanaNormal = diariaDaSemanaNormal;
        this.diariaDaSemanaFidelidade = diariaDaSemanaFidelidade;
        this.diariaDoFimDeSemanaNormal = diariaDoFimDeSemanaNormal;
        this.diariaDoFimDeSemanaFidelidade = diariaDoFimDeSemanaFidelidade;
    }

    public String getNome() {
        return nome;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public Double getDiariaDaSemanaNormal() {
        return diariaDaSemanaNormal;
    }

    public Double getDiariaDaSemanaFidelidade() {
        return diariaDaSemanaFidelidade;
    }

    public Double getDiariaDoFimDeSemanaNormal() {
        return diariaDoFimDeSemanaNormal;
    }

    public Double getDiariaDoFimDeSemanaFidelidade() {
        return diariaDoFimDeSemanaFidelidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void setDiariaDaSemanaNormal(Double diariaDaSemanaNormal) {
        this.diariaDaSemanaNormal = diariaDaSemanaNormal;
    }

    public void setDiariaDaSemanaFidelidade(Double diariaDaSemanaFidelidade) {
        this.diariaDaSemanaFidelidade = diariaDaSemanaFidelidade;
    }

    public void setDiariaDoFimDeSemanaNormal(Double diariaDoFimDeSemanaNormal) {
        this.diariaDoFimDeSemanaNormal = diariaDoFimDeSemanaNormal;
    }

    public void setDiariaDoFimDeSemanaFidelidade(Double diariaDoFimDeSemanaFidelidade) {
        this.diariaDoFimDeSemanaFidelidade = diariaDoFimDeSemanaFidelidade;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nome='" + nome + '\'' +
                ", classificacao='" + classificacao + '\'' +
                ", diariaDaSemanaNormal=" + diariaDaSemanaNormal +
                ", diariaDaSemanaFidelidade=" + diariaDaSemanaFidelidade +
                ", diariaDoFimDeSemanaNormal=" + diariaDoFimDeSemanaNormal +
                ", diariaDoFimDeSemanaFidelidade=" + diariaDoFimDeSemanaFidelidade +
                '}';
    }
}
