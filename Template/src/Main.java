public class Main {
    public static void main(String[] args) {
        DonacionBase donacionMonetaria = new DonacionMonetaria();
        donacionMonetaria.procesarDonacion();

        DonacionBase donacionMaterial = new DonacionMaterial();
        donacionMaterial.procesarDonacion();
    }
}