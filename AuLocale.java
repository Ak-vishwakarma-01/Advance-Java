import java.util.Locale;

public class AuLocale {
    public static void main(String[] ak){
        Locale ind [] = Locale.getAvailableLocales();
        for(Locale l: ind)System.out.println(l.getDisplayCountry()+"                            "+l.getLanguage()); 
    }
}
