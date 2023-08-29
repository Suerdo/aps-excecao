package sistema;

import exceptions.LeitorException;

public interface Leitor {
    public String ler(String codigo) throws LeitorException;

}
