import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String text = "ashahbazi750n@gmail.com\n" +
                "Ardavan.Kav@gmail.com\n" +
                "Farbodyadollahi8081@gmail.com\n" +
                "hoomania50@gmail.com\n" +
                "alikhm4528@hotmail.com\n" +
                "hoomania50@gmail.com\n" +
                "alireza.agm@gmail.com\n" +
                "Alirezasakhaeirad@gmail.com\n" +
                "z.sorkhei@gmail.com\n" +
                "sinazeraatkar@yahoo.com\n" +
                "ataei526@gmail.com\n" +
                "aria80afrooz@gmail.com\n" +
                "denizrezapur@gmail.com\n" +
                "mahdi79saleh@gmail.com\n" +
                "Negmohtaram@gmail.com\n" +
                "mahdi1sharifnejad@gmail.com\n" +
                "arshakrezvani22@gmail.com\n" +
                "mh.shahbazian1423@gmail.com\n" +
                "Smj_fatemi@yahoo.com\n" +
                "Erfan1380sh@gmail.com\n" +
                "harighisana@gmail.com\n" +
                "Mahdi_b7978@yahoo.com\n" +
                "ma.rami@yahoo.com\n" +
                "chavoshishee@yahoo.com\n" +
                "shayan.fakhraee@gmail.com\n" +
                "shahradian.p@gmail.com\n" +
                "ataei526@gmail.com\n" +
                "Alirezajazaeri1379@gmail.com\n" +
                "mhemasian79@gmail.com\n" +
                "Saeedrazavi87@ymail.com\n" +
                "alirezatalebi79920@yahoo.com\n" +
                "ataei526@gmail.com\n" +
                "aria80afrooz@gmail.com\n" +
                "denizrezapur@gmail.com\n" +
                "mahdi79saleh@gmail.com\n" +
                "taha2001mohaghegh@gmail.com\n" +
                "amirsoli80@gmail.com\n" +
                "Amiroo23jf@gmail.com\n" +
                "Smhusseinmb110@gmail.com\n" +
                "denizrezapur@gmail.com\n" +
                "mahdi79saleh@gmail.com\n" +
                "Negmohtaram@gmail.com\n" +
                "mahdi1sharifnejad@gmail.com\n" +
                "arshakrezvani22@gmail.com\n" +
                "mh.shahbazian1423@gmail.com\n" +
                "Smj_fatemi@yahoo.com\n" +
                "Erfan1380sh@gmail.com\n" +
                "alireza.agm@gmail.com\n" +
                "mrgilak02@gmail.com\n" +
                "amirabbas1079@gmail.com\n" +
                "shayan.fakhraee@gmail.com\n" +
                "Ali.akhoondy.20@gmail.com\n" +
                "salarghoochi1998@gmail.com\n" +
                "mehran.montazer@ee.sharif.edu\n" +
                "Mey.amirsardari@gmail.com\n" +
                "Mahan.agharafie@gmail.com\n" +
                "Ardavan.Kav@gmail.com\n" +
                "mtv888.mt@gmail.com\n" +
                "a.r.zargaran7@gmail.com\n" +
                "alireza.agm@gmail.com\n" +
                "B.ahmadpour1380@yahoo.com\n" +
                "shahradian.p@gmail.com\n" +
                "Negmohtaram@gmail.com\n" +
                "Ghazanfari.mahyar@yahoo.com\n" +
                "behradmehr.mp@gmail.com\n" +
                "mh.shahbazian1423@gmail.com\n" +
                "Alirezasakhaeirad@gmail.com\n" +
                "Farsiomid79@gmail.com\n" +
                "alisadeghi.79924@gmail.com\n" +
                "SaeedJazaeri79@gmail.com\n" +
                "hoomania50@gmail.com\n" +
                "mhemasian79@gmail.com\n" +
                "shakermorteza1380@gmail.com\n" +
                "fjafari79@gmail.com\n" +
                "amirhoseinyari@yahoo.com\n" +
                "Fancc34567@gmail.com\n" +
                "abedinehsan1380@gmail.com\n" +
                "ashahbazi750n@gmail.com\n" +
                "asoleix@gmail.com\n" +
                "z.sorkhei@gmail.com\n" +
                "sabanasiri.200979@gmail.com\n" +
                "Ehsanghasemi7998@gmail.com\n" +
                "Smhusseinmb110@gmail.com\n" +
                "Aliakbarmahmoodzadeh0@gmail.com\n" +
                "Ali.akhoondy.20@gmail.com\n" +
                "arshakrezvani22@gmail.com\n" +
                "mapanahandeh1380@gmail.com\n" +
                "erfan.baghaei.1380@gmail.com\n" +
                "Oveyssayad@gmail.com\n" +
                "chavoshishee@yahoo.com\n" +
                "taha2001mohaghegh@gmail.com\n" +
                "amiralirazi.2000@gmail.com\n" +
                "alikhm4528@hotmail.com\n" +
                "ataei526@gmail.com\n" +
                "aminvalipour80@gmail.com\n" +
                "seyedali1123@gmail.com\n" +
                "mm.mehran79@gmail.com\n" +
                "rafizadeh7280@gmail.com\n" +
                "aria80afrooz@gmail.com\n" +
                "zahra.sodagar@yahoo.com\n" +
                "mahannourifard@gmail.com\n" +
                "boreiri.aehsan@gmail.com\n" +
                "yaghoot13@chmail.ir\n" +
                "mahdi79saleh@gmail.com\n" +
                "mohamadalimadadi2016@gmail.com\n" +
                "mmahdieh90@gmail.com\n" +
                "arminpp1379@gmail.com\n" +
                "alireza.dabbah@gmail.com\n" +
                "Alipashakhorsand@gmail.com\n" +
                "ahnmobasheri@gmail.com\n" +
                "soroushtabatabaee@icloud.com\n" +
                "Mnavidtarighat@gmail.com\n" +
                "arshia.mahdaviani@gmail.com\n" +
                "ma.rami@yahoo.com\n" +
                "bardia.t79@gmail.com\n" +
                "Erfan1380sh@gmail.com\n" +
                "Mey.amirsardari@gmail.com\n" +
                "Alirezasakhaeirad@gmail.com\n" +
                "arshakrezvani22@gmail.com\n" +
                "chavoshishee@yahoo.com\n" +
                "shahradian.p@gmail.com\n" +
                "taha2001mohaghegh@gmail.com\n" +
                "Farsiomid79@gmail.com\n" +
                "amirmm379@gmail.com\n" +
                "shakermorteza1380@gmail.com\n" +
                "Ghazanfari.mahyar@yahoo.com\n" +
                "ma.rami@yahoo.com\n" +
                "N.zendehnam@gmail.com\n" +
                "Mohammadalialikhani@gmail.com\n" +
                "Ali.akhoondy.20@gmail.com\n" +
                "mhemasian79@gmail.com\n" +
                "amir.mmehrabi79@gmail.com\n" +
                "yaghoot13@chmail.ir\n" +
                "hoomania50@gmail.com\n" +
                "Ardavan.Kav@gmail.com\n" +
                "ahnmobasheri@gmail.com\n" +
                "aminvalipour80@gmail.com\n" +
                "Aliakbarmahmoodzadeh0@gmail.com\n" +
                "boreiri.aehsan@gmail.com\n" +
                "mtv888.mt@gmail.com\n" +
                "soroushtabatabaee@icloud.com\n" +
                "mm.mehran79@gmail.com\n" +
                "Smhusseinmb110@gmail.com\n" +
                "alireza.agm@gmail.com\n" +
                "Ehsanghasemi7998@gmail.com\n" +
                "mh.shahbazian1423@gmail.com\n" +
                "denizrezapur@gmail.com\n" +
                "mehran.montazer@ee.sharif.edu\n" +
                "sinazeraatkar@gmail.com\n" +
                "dnl.d80@gmail.com\n" +
                "amiralirazi.2000@gmail.com\n" +
                "amirali.rezaee2020@gmail.com\n" +
                "anne78283@gmail.com\n" +
                "dadmehr792000@gmail.com\n" +
                "sabanasiri.200979@gmail.com\n" +
                "Sajjad1379mohammadi@gmail.com\n" +
                "Mobina.kh.8016@gmail.com\n" +
                "seyedjavad8088@gmail.com\n" +
                "alinourian10@gmail.com\n" +
                "rafizadeh7280@gmail.com\n" +
                "farbodyadollahi8081@gmail.com\n" +
                "harighisana@gmail.com\n" +
                "arminpp1379@gmail.com\n" +
                "amirhoseinyari@yahoo.com\n" +
                "mansouriali8080@gmail.com\n" +
                "seyedali1123@gmail.com\n" +
                "alikhm4528@hotmail.com\n" +
                "z.sorkhei@gmail.com\n" +
                "hoseinasadi6692@gmail.com\n" +
                "shafaee.erfan@yahoo.com\n" +
                "abedinehsan1380@gmail.com\n" +
                "Mahdi80syam@gmail.com\n" +
                "asoleix@gmail.com\n" +
                "alisadeghi.79924@gmail.com\n" +
                "ataei526@gmail.com\n" +
                "ashahbazi750n@gmail.com\n" +
                "azadmmsadeghi@gmail.com\n" +
                "Negmohtaram@gmail.com\n" +
                "fjafari79@gmail.com\n" +
                "Oveyssayad@gmail.com\n" +
                "salarghoochi1998@gmail.com\n" +
                "SaeedJazaeri79@gmail.com\n" +
                "mahdi1sharifnejad@gmail.com\n" +
                "yaghootif1379@gmail.com\n" +
                "mahdi79saleh@gmail.com\n" +
                "atashi_mahdi@yahoo.com\n" +
                "arminpp1379@gmail.com\n" +
                "Amirali.mostaghis13@gmail.com\n" +
                "chavoshishee@yahoo.com\n" +
                "dadmehr792000@gmail.com\n" +
                "amirmm379@gmail.com\n" +
                "mehran.montazer@ee.sharif.edu\n" +
                "Ali.akhoondy.20@gmail.com\n" +
                "Sjsj@gmail.com\n" +
                "yaghootif1379@gmail.com\n" +
                "z.sorkhei@gmail.com\n" +
                "alinourian10@gmail.com\n" +
                "mm.mehran79@gmail.com\n" +
                "mahannourifard@gmail.com\n" +
                "shafaee.erfan@yahoo.com\n" +
                "Armanrabie@gmail.com\n" +
                "Ardavan.Kav@gmail.com\n" +
                "Mey.amirsardari@gmail.com\n" +
                "Sajjad1379mohammadi@gmail.com\n" +
                "zahra.sodagar@yahoo.com\n" +
                "navid.nader.6n4@gmail.com\n" +
                "soroushtabatabaee@icloud.com\n" +
                "behradmehr.mp@gmail.com\n" +
                "Mohammadalialikhani@gmail.com\n" +
                "mhemasian79@gmail.com\n" +
                "arshakrezvani22@gmail.com\n" +
                "shahradian.p@gmail.com\n" +
                "alikhm4528@hotmail.com\n" +
                "ataei526@gmail.com\n" +
                "Mnavidtarighat@gmail.com\n" +
                "mehrabady.rashidi@gmail.com\n" +
                "alireza.agm@gmail.com\n" +
                "Ghazanfari.mahyar@yahoo.com\n" +
                "mp.yazdanpanah@gmail.com\n" +
                "mh.shahbazian1423@gmail.com\n" +
                "Negmohtaram@gmail.com\n" +
                "Aliakbarmahmoodzadeh0@gmail.com\n" +
                "amir.saririan@yahoo.com\n" +
                "mahdi79saleh@gmail.com\n" +
                "mansouriali8080@gmail.com\n" +
                "Alirezasakhaeirad@gmail.com\n" +
                "itsamirsoleimani@gmail.com\n" +
                "amirabbas1079@gmail.com\n" +
                "dnl.d80@gmail.com\n" +
                "alisadeghi.79924@gmail.com\n" +
                "Apourghani@gmail.com\n" +
                "Farsiomid79@gmail.com\n" +
                "sinazeraatkar@yahoo.com\n" +
                "Smhusseinmb110@gmail.com\n" +
                "Saeedrazavi87@ymail.com\n" +
                "Fancc34567@gmail.com\n" +
                "azadmmsadeghi@gmail.com\n" +
                "hoomania50@gmail.com\n" +
                "harighisana@gmail.com\n" +
                "aria80afrooz@gmail.com";


        // change to stringBuilder in one line - just for training!
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = text.split("\n");

        for (String s : split) {
            stringBuilder.append(s).append(" ");
        }

        ArrayList<String> gmailArrayList = new ArrayList<>();
        ArrayList<String> yahooArrayList = new ArrayList<>();
        ArrayList<String> elseEmailArrayList = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\S+@(\\w+)\\.com");
        Matcher matcher = pattern.matcher(stringBuilder.toString());

        HashMap<String, Integer> allEmails = new HashMap<>();

        while(matcher.find()) {
            if (allEmails.containsKey(matcher.group())) {
                allEmails.replace(matcher.group(), allEmails.get(matcher.group()) + 1);
            } else {
                allEmails.put(matcher.group(), 1);
                if (matcher.group(1).equals("gmail")) {
                    gmailArrayList.add(matcher.group());
                } else if (matcher.group(1).equals("yahoo")) {
                    yahooArrayList.add(matcher.group());
                } else {
                    elseEmailArrayList.add(matcher.group());
                }
            }
        }

        for (String s : allEmails.keySet()) {
            System.out.println(s + " : " + allEmails.get(s));
        }

    }
}
