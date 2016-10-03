/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalaComercial;
import Imovel.Predio;
/**
 *
 * @author Arcano
 */
public class SalaComercial extends Predio {
    protected int numeroDeBanheiros;
    protected int numeroDaSala;

    public SalaComercial(int codigo, String logradouro, int numero, String bairro, 
           String cidade, String descricao, int areaTotal, double valor,
           String NomeEdifico, int andar, double valorCondominio, int numeroDeBanheiros, int numeroDaSala) {
       
        super(codigo, logradouro, numero, bairro, cidade, descricao, 
                areaTotal, valor, NomeEdifico, andar, valorCondominio);
        
        this.numeroDeBanheiros = numeroDeBanheiros;
        this.numeroDaSala = numeroDaSala;
        
    }

    /**
     * @return the numeroDeBanheiros
     */
    public int getNumeroDeBanheiros() {
        return numeroDeBanheiros;
    }

    /**
     * @param numeroDeBanheiros the numeroDeBanheiros to set
     */
    public void setNumeroDeBanheiros(int numeroDeBanheiros) {
        this.numeroDeBanheiros = numeroDeBanheiros;
    }

    /**
     * @return the numeroDaSala
     */
    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    /**
     * @param numeroDaSala the numeroDaSala to set
     */
    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }
    
    
    
    @Override
    public String toString(){
    String dados = "";
    dados += "Número De Banheiros: " +numeroDeBanheiros+"\n";
    dados += "Número Da Sala: " + numeroDaSala + "\n";   
    
    return dados;
    }
    
}