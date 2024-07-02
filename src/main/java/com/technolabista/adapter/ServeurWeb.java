package com.technolabista.adapter;

public class ServeurWeb {
    public static void main(String[] args) {
        Document document1, document2,document3;
        document1 = new DocumentHtml();
        document1.setContenu("Hello");
        document1.dessine();
        document1.imprime();
        System.out.println();
        document2 = new DocumentPdf();
        document2.setContenu("Bonjour");
        document2.dessine();
        document2.imprime();
        System.out.println();
        document3 = new DocumentExcel();
        document3.setContenu("Bonjour");
        document3.dessine();
        document3.imprime();
    }
}
