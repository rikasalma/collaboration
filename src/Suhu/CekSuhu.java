package Suhu;

public class CekSuhu {
    int Suhu;

    public CekSuhu(int Suhu){
        this.Suhu = Suhu;
    }
    public void setKondisi (int Suhu){
        this.Suhu = Suhu;
    }
    public String Kondisi(){
        if (Suhu == 0) {
            return "Beku";
        } else if (Suhu > 0 && Suhu < 30) {
            return  "Dingin";
        } else if (Suhu >= 30 && Suhu < 40) {
            return  "Hangat";
        } else if (Suhu >= 40 && Suhu < 70) {
            return  "Panas";
        } else if (Suhu >= 70 && Suhu < 100) {
            return "Hampir Mendidih";
        } else if (Suhu >= 100 && Suhu < 120) {
            return "Mendidih";
        } else if (Suhu >= 120){
            return "Gosong";
        } else {
            return null;
        }
    }
}
