package automóvel;

public class Automovel {
    private String modelo;
    private String marca;
    private int ano;

    Automovel() {
        modelo = "Fusca";
        marca = "Volkswagen";
        ano = 1972;
    }

    Automovel(String m, String ma, int a) {
        modelo = m;
        marca = ma;
        ano = a;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static void main(String[] args) {
        Automovel carro1 = new Automovel();
        System.out.println("O carro é um " + carro1.getModelo() + " da marca " + carro1.getMarca());
        System.out.println("Ano: " + carro1.getAno());
    }
}
