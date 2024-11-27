public class Tiket {
    private String film;
    private String studio;
    private String jamTayang;
    private double harga;
    private boolean terjual;

    public Tiket(String film, String studio, String jamTayang, double harga) {
        this.film = film;
        this.studio = studio;
        this.jamTayang = jamTayang;
        this.harga = harga;
        this.terjual = false; // Default tiket tersedia
    }

    public void tampilkanInfo() {
        System.out.println("Film: " + film);
        System.out.println("Studio: " + studio);
        System.out.println("Jam Tayang: " + jamTayang);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Status: " + (terjual ? "Terjual" : "Tersedia"));
    }

    public boolean isTerjual() {
        return terjual;
    }

    public void beliTiket() {
        if (!terjual) {
            terjual = true;
            System.out.println("Tiket untuk film " + film + " berhasil dibeli!");
        } else {
            System.out.println("Tiket untuk film " + film + " sudah terjual.");
        }
    }
}
