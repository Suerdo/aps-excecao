package sistema;

import exceptions.LeitorException;
import exceptions.QRCodeException;
import sistema.Leitor;

public class LeitorQRCode implements Leitor {

    public String lerCodigo(String codigo) throws QRCodeException{
        if(codigo.equals(""))
            throw new QRCodeException("Código vazio!");
         else if (codigo == null)
            throw new QRCodeException("Código nulo!");
         return codigo;
    }
    @Override
    public String ler(String codigo) throws LeitorException {
        try {
            return lerCodigo(codigo);
        } catch (QRCodeException e){
            throw new LeitorException("Houve erro");
        }
    }
}
