package listasequencial;

import java.util.Arrays;

public class Vetor {
    private Aluno alunos[] = new Aluno[100];
    private int total = 0;

    public void adiciona(Aluno aluno){
        this.garantirEspaco();
        alunos[total] = aluno;
        total+=1;
    }

    public void adiciona(int posicao, Aluno aluno){
        this.garantirEspaco();
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao invalida");
        }

        for(int i = total-1; i>=posicao; i--){
            alunos[i+1] = alunos[i];
        }
        this.alunos[posicao] = aluno;
        total++;
    }

    public Aluno pega(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        return this.alunos[posicao];
    }

    public void remover(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        for(int i = posicao; i<this.total; i++){
            alunos[i] = alunos[i+1];
        }
        total --;
    }

    public boolean contem(Aluno aluno){
        for (int i=1 ; i<total;i++){
            if(aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return this.total;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.alunos);
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >=0 && posicao<total;
    }

    private void garantirEspaco(){
        if (total == alunos.length){
            Aluno novoArray[] = new Aluno[alunos.length*2];
            for (int i=0 ; i < alunos.length;i++){
                novoArray[i] =alunos[i];
            }
            this.alunos = novoArray;
        }
    }
}
