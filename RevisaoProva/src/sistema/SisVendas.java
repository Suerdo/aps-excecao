package sistema;

import exceptions.LeitorException;
import sistema.Leitor;

public class SisVendas {

    private Leitor leitor;

    public String lerCodigo(String codigo){
        try {
            return leitor.ler(codigo);
        } catch (LeitorException e) {
            return e.getMessage();
        }
    }

    public void setLeitor(Leitor leitor){
        this.leitor = leitor;
    }

}
