import java.util.Scanner;

/**
 * Program untuk menghitung jumlah baris yang perlu dihafal per hari
 * berdasarkan target juz yang ingin dihafal dan waktu (dalam tahun).
 */
public class Main {

    /** Jumlah halaman per juz */
    private static final int PAGES_PER_JUZ = 20;

    /** Jumlah baris per halaman */
    private static final int LINES_PER_PAGE = 15;

    /** Jumlah hari dalam satu tahun */
    private static final int DAYS_IN_YEAR = 365;

    /**
     * Metode utama program yang meminta input dari pengguna dan menampilkan
     * hasil perhitungan baris per hari yang perlu dihafal.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetJuz = getInput(scanner, "Masukkan jumlah juz yang ingin dihafal: ");
        int years = getInput(scanner, "Masukkan waktu (dalam tahun): ");

        int totalLines = calculateTotalLines(targetJuz);
        int totalDays = calculateTotalDays(years);

        double linesPerDay = calculateLinesPerDay(totalLines, totalDays);

        displayResult(linesPerDay);

        scanner.close();
    }

    /**
     * Mengambil input integer dari pengguna.
     *
     * @param scanner objek Scanner untuk membaca input
     * @param message pesan yang akan ditampilkan kepada pengguna
     * @return nilai integer yang dimasukkan oleh pengguna
     */
    private static int getInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    /**
     * Menghitung total baris berdasarkan jumlah juz yang ingin dihafal.
     *
     * @param targetJuz jumlah juz yang diinginkan
     * @return total baris yang harus dihafal
     */
    private static int calculateTotalLines(int targetJuz) {
        return targetJuz * PAGES_PER_JUZ * LINES_PER_PAGE;
    }

    /**
     * Menghitung total hari berdasarkan jumlah tahun yang ditentukan.
     *
     * @param years jumlah tahun yang diinginkan
     * @return total hari yang tersedia
     */
    private static int calculateTotalDays(int years) {
        return years * DAYS_IN_YEAR;
    }

    /**
     * Menghitung jumlah baris yang perlu dihafal per hari.
     *
     * @param totalLines total baris yang harus dihafal
     * @param totalDays total hari yang tersedia
     * @return jumlah baris yang perlu dihafal per hari
     */
    private static double calculateLinesPerDay(int totalLines, int totalDays) {
        return (double) totalLines / totalDays;
    }

    /**
     * Menampilkan hasil perhitungan jumlah baris yang perlu dihafal per hari.
     *
     * @param linesPerDay jumlah baris yang perlu dihafal per hari
     */
    private static void displayResult(double linesPerDay) {
        System.out.printf("Anda perlu menghafal %.2f baris per hari.\n", linesPerDay);
    }

}