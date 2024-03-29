package Auxiliar;

import java.io.Serializable;

public class Posicao  implements Serializable{
    private int	linha;
    private int coluna;
    
    private int linhaAnterior;
    private int colunaAnterior;

    public Posicao(int linha, int coluna){
        this.setPosicao(linha,coluna);
    }

    public boolean setPosicao(int linha, int coluna){       
        if(linha < 0 || linha >= Auxiliar.Consts.RES)
            return false;
        linhaAnterior = this.linha;
        this.linha = linha;
        
        if(coluna < 0 || coluna >= Auxiliar.Consts.RES)
            return false;
        colunaAnterior = this.coluna;
        this.coluna = coluna;
        return true;
    }
    
    public int getLinha(){
        return linha;
    }
   
    public boolean volta(){
        return this.setPosicao(linhaAnterior,colunaAnterior);
    }

    public int getColuna(){
        return coluna;
    }

    public boolean igual(Posicao posicao){
        return (linha == posicao.getLinha() && coluna == posicao.getColuna());
    }

    public boolean copia(Posicao posicao){
        return this.setPosicao(posicao.getLinha(),posicao.getColuna());
    }



    public int getLinhaAnterior() {
        return linhaAnterior;
    }

    public void setLinhaAnterior(int linhaAnterior) {
        this.linhaAnterior = linhaAnterior;
    }

    public int getColunaAnterior() {
        return colunaAnterior;
    }

    public void setColunaAnterior(int colunaAnterior) {
        this.colunaAnterior = colunaAnterior;
    }

    public boolean moveUp(){
        return this.setPosicao(this.getLinha()-1, this.getColuna());
    }
    public boolean moveDown(){
        return this.setPosicao(this.getLinha()+1, this.getColuna());
    }
    public boolean moveRight(){
        return this.setPosicao(this.getLinha(), this.getColuna()+1);
    }
    public boolean moveLeft(){
        return this.setPosicao(this.getLinha(), this.getColuna()-1);        
    }


    @Override
    public String toString() {
        return "Posicao{" +
                "linha=" + linha +
                ", coluna=" + coluna +
                ", linhaAnterior=" + linhaAnterior +
                ", colunaAnterior=" + colunaAnterior +
                '}';
    }
}
