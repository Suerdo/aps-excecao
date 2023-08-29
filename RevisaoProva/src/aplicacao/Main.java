package aplicacao;

import java.util.Scanner;
import sistema.LeitorCodigoBarras;
import sistema.LeitorQRCode;
import sistema.SisVendas;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SisVendas sistema = new SisVendas();

        sistema.setLeitor(new LeitorCodigoBarras());
        System.out.println(sistema.lerCodigo(""));

        sistema.setLeitor(new LeitorQRCode());
        System.out.println(sistema.lerCodigo(null));
    }
}