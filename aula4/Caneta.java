public class Caneta {
    private String  modelo;
    private double ponta;
    private boolean tampada;
    private String cor;
    public Caneta(String modelo, double ponta, boolean tampada, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = tampada;
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPonta() {
        return ponta;
    }
    public void setPonta(double ponta) {
        this.ponta = ponta;
    }
    public boolean isTampada() {
        return tampada;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void status(){
        
        System.out.println(this.getModelo());
        System.out.println(this.getPonta());
        System.out.println(this.isTampada());
        System.out.println(this.getCor());

    }
    
}