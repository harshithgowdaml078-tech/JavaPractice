import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class contactdata {
    private static final String emaildata = """
            Mickey Mouse, mckmouse@gmail.com
            Mickey Mouse, micky1@aws.com
            Minnie Mouse, minnie@verizon.net
            Robin Hood, rhood@gmail.com
            Linus Van Pelt, lvpelt2015@gmail.com
            Daffy Duck, daffy@google.com
            
            """;
    private static final String phonedata = """
            Charlie Brown, 3334445555
            Maid Marion, 1234567890
            Mickey Mouse, 9998887777
            Mickey Mouse, 1247489758
            Minnie Mouse, 4567805666
            Robin Hood, 5647893000
            Robin Hood, 7899028222
            Lucy Van Pelt, 5642086852
            Mickey Mouse, 9998887777
            
            """;
    public static List<contacts> getdata(String type) {
        List<contacts> datalist = new ArrayList<>();
        Scanner scanner = new Scanner(type.equals("phone") ? phonedata : emaildata);
        while(scanner.hasNext()) {
            String[] data = scanner.nextLine().split(",");
            Arrays.asList(data).replaceAll(String::trim);
            if(type.equals("phone")) {
                datalist.add(new contacts(data[0], Long.parseLong(data[1])));
            }else if(type.equals("email")) {
                datalist.add(new contacts(data[0], data[1]));
            }
        }
        return datalist;
    }
}
