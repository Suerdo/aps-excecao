package sistema;

import exceptions.CodigoBarrasException;
import exceptions.LeitorException;

public class LeitorCodigoBarras implements Leitor {

    public String lerCodigo(String codigo) throws CodigoBarrasException {
        if(codigo.equals(""))
            throw new CodigoBarrasException("String vazia");
        else if(codigo == null)
            throw new CodigoBarrasException("Null");
        return "CodigoBarras " + codigo;
    }

    @Override
    public String ler(String codigo) throws LeitorException {
        try {
            return lerCodigo(codigo);
        } catch (CodigoBarrasException e) {
            throw new LeitorException("Houve um erro");
        }
    }
}
