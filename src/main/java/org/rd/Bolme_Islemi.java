package org.rd;

public class Bolme_Islemi {
    public Bolme_Islemi() {
    }

    public void Bolme(int x, int y) throws DivisionByZeroException {
        if (y == 0) {
            throw new DivisionByZeroException("" + x + "/" + y + ": 0'a Bölme Hatası");
        } else {
            System.out.println("" + x + "/" + y + ": " + x / y);
        }
    }
}