package org.rd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Bolme_Islemi bolme = new Bolme_Islemi();

        try {
            bolme.Bolme(10, 5);
            bolme.Bolme(10, 0);
        } catch (DivisionByZeroException var3) {
            DivisionByZeroException e = var3;
            System.out.println(e.getMessage());
        }

    }
}