import javax.swing.*;
public class JavaLibs5026211168 {

    public static void main(String[] args) {
        //perkenalan
        JOptionPane.showMessageDialog(null, "Hello, welcome");
        String name = JOptionPane.showInputDialog("Halo Aku Fikim, Boleh tau Siapa namamu?");
        JOptionPane.showMessageDialog(null, "Hallo " + name);

        JOptionPane.showMessageDialog(null, "aku pengen nanya dong?");
        String Umur = JOptionPane.showInputDialog("Umurmu Berapa?");
        if (Umur.equalsIgnoreCase("20")) {
            JOptionPane.showMessageDialog(null, "Kita seumuran");
        } else {
            JOptionPane.showMessageDialog(null, "Yah kita gak seumuran");

        }
// random
        String UTBK = JOptionPane.showInputDialog("Skor UTBK mu brp?");
        int UTBKKConvert = Integer.parseInt(UTBK);
        if (UTBKKConvert > 800) {
            JOptionPane.showMessageDialog(null, "Wah kamu jago ya");
        } else if (UTBKKConvert <= 800) {
            JOptionPane.showMessageDialog(null, "Gpp aku iseng aja hehehe");
        }

//Double
        String UkuranSepatu = JOptionPane.showInputDialog("Berapa ukuran Sepatumu?");
        double UkuranConvert = Double.parseDouble(UkuranSepatu);
        if (UkuranConvert > 46) {
            JOptionPane.showMessageDialog(null, " Kayaknya kamu kalo nyari sepatu susah deh");
        } else if (UkuranConvert <= 46) {
            JOptionPane.showMessageDialog(null, "Ukuran sepatu mu normal ya");
        }

        JOptionPane.showMessageDialog(null, "Maaf ya, aku random");
        JOptionPane.showMessageDialog(null, "Aku boleh nanya lagi ya");

        String Asal = JOptionPane.showInputDialog("Kamu Berasal dari kota apa?");
        if (Asal.equalsIgnoreCase("Tangerang")) {
            JOptionPane.showMessageDialog(null, "Wah kita sekota, ternyata");
        } else {
            JOptionPane.showMessageDialog(null, "Wahh, kamu ternyata dari" + Asal);
        }

        String Makan = JOptionPane.showInputDialog("Kamu Sehari makan brp kali?");
        int KosConvert = Integer.parseInt(Makan);
        if (KosConvert > 3) {
            JOptionPane.showMessageDialog(null, " Wah sepertinya perutmu karet ya");
        } else {
            JOptionPane.showMessageDialog(null, "Alhamdulillah , Kamu makannya normal");
        }

        String Gadang = JOptionPane.showInputDialog(null,"Kamu sering begadang yak,(ya,atau tidak)");
        if (Gadang.equalsIgnoreCase("ya")){
            JOptionPane.showMessageDialog(null, "Jangan sering2 ya, supaya badanmu lebih sehat");

        } else { JOptionPane.showMessageDialog(null,"Bagus jangan begadang ya gk bagus");
        }

        String Sex = JOptionPane.showInputDialog(null,"Kamu cewe atau cowo");
        if (Sex.equalsIgnoreCase("cowo")){
            JOptionPane.showMessageDialog(null,"Oh ternyata kamu cowo");
        }
        else {
            JOptionPane.showMessageDialog(null, "Ohh ternyata kamu cewe");
        }

        JOptionPane.showMessageDialog(null,"Aku mau nanya soal mtk dong");
        String Mtk=JOptionPane.showInputDialog("15.5+24.3= ");
        double MtkkConvert= Double.parseDouble(Mtk);
        if (MtkkConvert==39.8){
            JOptionPane.showMessageDialog(null,"Jawaban mu benar 39.8");
        }
        else {
            JOptionPane.showMessageDialog(null, "Kamu kurang teliti, jawabannya adalah 39.8");
        }

        JOptionPane.showMessageDialog(null,"Janji satu lagi langkah lagi hehehe");
        String Logika=JOptionPane.showInputDialog("2 X 2 : 2 = (jawab dengan angka ya)");
        int LogikaaCOnvert= Integer.parseInt(Logika);
        if(LogikaaCOnvert==2){
            JOptionPane.showMessageDialog(null,"Wah kamu benar");
        }
        else {
            JOptionPane.showMessageDialog(null, "Wah kamu kurang teliti sepertinya, jawabannya 2");
        }
        //penutup
        JOptionPane.showMessageDialog(null,"Terimakasih"+" " +name+ " "+"udh mau jawab pertanyaanku dengan baik.");
        JOptionPane.showMessageDialog(null,"Aku ada satu pantun, Burung kenari, burung cendrawasih. Cukup sekian terimakasih");

    }
}
