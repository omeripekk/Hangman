import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"psikoloji", "mimarlık", "biyoloji", "kimya", "gelişim", "astronomi", "hologram", "teknoloji", "diplomasi",
                "masa", "sandalye", "kitap", "defter", "silgi", "halı", "kapı", "cam", "bardak", "şapka", "etek", "pantolon",
                "elma", "araba", "ev", "göz", "baba", "anne", "su", "yol", "gül", "çay", "kış", "yaz", "kuş", "bal", "süt", "kalem",
                "bilgisayar", "dolap", "çorap", "televizyon", "müzik", "matematik", "sinema", "oyuncak", "gitar", "kalorifer", "battaniye",
                "ayakkabı", "telefon", "okul", "çarşaf", "zeytin", "şehir", "şeftali", "gökyüzü", "saat", "kütüphane",
                "akademisyen", "algoritma", "sosyoloji", "ekonomi", "demokrasi", "jeoloji", "arkeoloji", "nörobilim", "paradigma",
                "fizyoloji", "plazma", "reaksiyon", "elektron", "nötron", "proton", "manyetik", "kuantum", "optik", "spektrum",
                "fenomen", "simülasyon", "prosedür", "platform", "parametre", "matris", "analiz", "değişken", "komut",
                "işlemci", "donanım", "yazılım", "modül", "arayüz", "işletim", "sistem", "işlem", "karakter", "giriş", "çıkış",
                "veritabanı", "internet", "kod", "kompilatör", "editör", "tarayıcı", "program", "uygulama", "mobil", "masaüstü",
                "koltuk", "çalışkan", "mektup", "havlu", "ayna", "fırın", "ütü", "eldiven", "kavanoz", "çamaşır", "felsefe",
                "bellek", "kaynak", "mantık", "ifade", "operatör", "kodlama", "şema", "paket", "günlük", "hatırlatma",
                "sınıf", "kalıtım", "polimorfizm", "soyutlama", "enkapsülasyon", "yığın", "kuyruk", "liste", "dizi", "far",
                "jant", "önlük", "hız", "devir", "vites", "yakıt", "gösterge", "navigasyon", "harita", "hedef", "konum", "sinyal",
                "sunucu", "veri", "şifre", "kapsam", "karar", "koşul", "döngü", "değer", "eşitlik", "fonksiyon", "nesne",
                "bağlantı", "ağaç", "graf", "öncelik", "sıralama", "arama", "ikili", "birleşim", "ayrık", "karmaşıklık", "zaman",
                "denge", "çekiş", "sürüş", "şerit", "yaklaş", "geç", "gözlem", "refleks", "hata", "kaza", "dikkat", "önlem",
                "trafik", "ışık", "kavşak", "yaya", "araç", "dönüş", "park", "dur", "ileri", "geri", "hızlan", "yavaşla",
                "yönlendirme", "işaretçi", "adres", "arabellek", "yapı", "belirteç", "motor", "şanzıman", "diferansiyel",
                "klima", "kadran", "marş", "akü", "triger", "kasa", "kaporta", "kilit", "çamurluk", "tavan", "feyz", "mecaz",
                "kıstas", "süreç", "tahmin", "tezhip", "tinsel", "varsayım", "mefhum", "vurgulamak", "mukadderat", "yüksek", "alçak",
                "açık", "kapalı", "soğuk", "sıcak", "yağmurlu", "güneşli", "karanlık", "aydınlık", "bulutlu", "emniyet", "kask", "kemer",
                "havalı", "hızlı", "yavaş", "yoğun", "boş", "geniş", "dar", "uzun", "kısa", "volan", "debriyaj", "direksiyon", "silecek",
                "stop", "lastik", "egzoz", "filtre", "radyatör", "çınar", "nehir", "yansıma", "duruş", "ıslık", "kıvılcım", "buket",
                "gezgin", "kırlangıç", "dalgın", "çamur", "sesli", "kıta", "gölge", "ince", "çaba", "özgür", "umut", "tezat", "sezgi",
                "tasavvur", "izlenim", "çelişki", "ikilem", "tahkiye", "sükûnet", "istifham", "tevazu", "biyokimya", "monarşi", "antropoloji",
                "metafor", "hipotez", "teleskop", "mikroskop", "endüstri", "mühendislik", "mütefekkir", "intibak","tecessüs", "mukayese",
                "müstakil", "telakki", "istikamet", "temayül", "tasfiye", "münferit", "hars", "mukavemet", "müteessir", "serap", "itidal",
                "ikame","inziva", "tevafuk", "muvaffakiyet"};

        String wordToGuess = words[random.nextInt(words.length)];

        boolean[] guessLetters = new boolean[wordToGuess.length()];

        int remainingGuess = 20;

        System.out.println("ADAM ASMACA OYUNUNA HOŞGELDİNİZ !!!");
        System.out.println("Doğru harfi tekrar girerseniz sorun olmaz, ama yanlış harfi tekrar girerseniz hak kaybedersiniz.");
        System.out.println("Kelimeyi tahmin etmek için harf girişi yapınız.");

        while (remainingGuess > 0) {
            System.out.println();
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (guessLetters[i]) {
                    System.out.print(wordToGuess.charAt(i) + " ");
                } else {
                    System.out.print("_ ");
                }
            }

            System.out.println("");
            System.out.println("Kalan Tahmin Hakkınız: " + remainingGuess);
            System.out.println("Harf Giriniz :");
            char guess = scann.next().toLowerCase().charAt(0);
            if (!Character.isLetter(guess)) {
                System.out.println("LÜTFEN SADECE HARF GİRİNİZ.");
                continue;
            }

            boolean isFound = false;

            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessLetters[i] = true;
                    isFound = true;
                }
            }

            if (isFound) {
                System.out.println("HARF DOĞRU TAHMİN EDİLDİ!");

            } else {
                remainingGuess--;
                System.out.println("HARF BULUNAMADI. YANLIŞ TAHMİN!");
            }

            boolean isComplete = true;
            for (boolean letter : guessLetters) {
                if (!letter) {
                    isComplete = false;
                    break;
                }
            }

            if (isComplete) {
                System.out.println("Tebrikler! Kelimeyi doğru tahmin ettiniz : " + wordToGuess);
                return;
            }

            while (true) {
                System.out.println("Kelimeyi tahmin etmek isterseniz (+) devam etmek için (-) giriniz): ");
                String answer = scann.next().toLowerCase();
                if (remainingGuess <= 0) {
                    break; }
                if (answer.equals("+")) {
                    for (int i = 0; i < wordToGuess.length(); i++) {
                        if (guessLetters[i]) {
                            System.out.print(wordToGuess.charAt(i) + " ");
                        } else {
                            System.out.print("_ ");
                        }
                    }
                    System.out.println();
                    System.out.println("Kalan tahmin hakkınız:" + remainingGuess);
                    System.out.println("Kelimeyi giriniz: ");
                    String fullGuess = scann.next().toLowerCase();

                    if (fullGuess.equals(wordToGuess)) {
                        System.out.println("Tebrikler! Kelimeyi doğru tahmin ettiniz : " + wordToGuess);
                        return;
                    } else {
                        remainingGuess--;
                        System.out.println("Yanlış kelime! Kalan tahmin hakkınız: " + remainingGuess);
                    }
                }
                else if (answer.equals("-")) {
                    break;
                }else {
                    System.out.println("Geçersiz giriş! Sadece '+' veya '-' yazınız.");
                }

            }
            if (remainingGuess <= 0) {
                System.out.println("Tahmin hakkınız bitti. Adam asıldı !! ");
                System.out.println("Kelime : " + wordToGuess);
            }

        }
    }
}