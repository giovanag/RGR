/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh;

/**
 *
 * @author Giovana
 */
public class Fornecedor {

 
    public char getNomeFisico() {
        return nomeFisico;
    }

    public void setNomeFisico(char nomeFisico) {
        this.nomeFisico = nomeFisico;
    }

    public char getNomeJuridico() {
        return nomeJuridico;
    }

    public void setNomeJuridico(char nomeJuridico) {
        this.nomeJuridico = nomeJuridico;
    }
    
    public void setCNPJ(char cnpj) {
        this.cnpj = cnpj;
    }
     public char getCNPJ() {
        return cnpj;
    }
    char nomeFisico, nomeJuridico,cnpj;
}
