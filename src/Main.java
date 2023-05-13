import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Users/Bob/Desktop/znaki.txt");
        if (!Files.exists(path))
            Files.createFile(path);

        List<String> linie = Files.readAllLines(path);
        Map<String, Integer> slowa = new HashMap<>();

        String nazwa = null;

        for (int i = 0; i<linie.size(); i++)
        {
            for (int d = 0; d< linie.size();d++)
            {
                if (linie.get(d).equals(linie.get(i)) == true)
                {
                    nazwa = linie.get(i);
                    int iloscPowtorzen = 0;
                    iloscPowtorzen++;
                    slowa.put(nazwa, iloscPowtorzen);
                }
            }
            System.out.println(slowa.get(i));
        }
    }

}