import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


class Main  {
    public static void main(String args[]) throws ParseException {
        SimpleDateFormat format1 = new SimpleDateFormat("ddMMyyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yyyy");
        Date date = format1.parse("21012002");
        System.out.println(format2.format(date));

}}
