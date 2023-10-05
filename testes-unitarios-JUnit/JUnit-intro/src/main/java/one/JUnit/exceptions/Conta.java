package one.JUnit.exceptions;

public class Conta{
    private int saldo;
    private int num;
    
    public Conta(int saldo, int num) {
        this.saldo = saldo;
        this.num = num;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    
}
