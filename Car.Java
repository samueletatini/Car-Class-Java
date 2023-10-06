import java.util.Scanner;

public class Car {
    private String proprietario;
    private double carburante;
    private double resa;

    public Car() {
        this.carburante = 0;
        this.resa = 0;
    }

    public Car(Car c) {
        this.carburante = c.carburante;
        this.resa = c.resa;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getCarburante() {
        return carburante;
    }

    public void setCarburante(double carburante) {
        this.carburante += carburante;
    }

    public double getResa() {
        return resa;
    }

    public void setResa(double resa) {
        this.resa = resa;
    }

    public void guida(double distanza) {
        double carburanteConsumato = distanza / resa;
        carburante -= carburanteConsumato;
    }

    public void rifornisci(double carburante) {
        this.carburante += carburante;
    }

    public String toString() {
        return "Proprietario: " + proprietario + "\nCarburante: " + carburante + "\nResa: " + resa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car automobile = new Car();

        System.out.println("Inserisci il proprietario: ");
        automobile.setProprietario(scanner.nextLine());

        System.out.println("Inserisci la quantità di carburante: ");
        automobile.setCarburante(scanner.nextDouble());

        System.out.println("Inserisci la resa dell'automobile (Km per litro): ");
        automobile.setResa(scanner.nextDouble());

        System.out.println("Inserisci la distanza da percorrere: ");
        double distanza = scanner.nextDouble();
        automobile.guida(distanza);

        System.out.println("Inserisci la quantità di carburante da aggiungere: ");
        double carburanteDaAggiungere = scanner.nextDouble();
        automobile.rifornisci(carburanteDaAggiungere);

        System.out.println(automobile.toString());

        scanner.close();
    }
}
