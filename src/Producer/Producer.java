package Producer;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Producer {

    private final String TEXT_PATH = "/Users/kim-ilhwan/IdeaProjects/subject1/text/words.txt";
    private final String PATTERN = "^[a-zA-Z]";

    public Producer() {
    }

    public void runProducer(){
        System.out.println("run Producer");

        Path path = Paths.get(TEXT_PATH);

        try {
            ArrayList<String> arrayList = new ArrayList<>();
            Stream<String> stream = Files.lines(path, Charset.defaultCharset());
            //stream.forEach(arrayList::add);

            boolean check = Pattern.matches(PATTERN, "String");
            stream.forEach( p -> {
                if(patternMatch(p)){
                    System.out.println(p);
                }
            });

            stream.close();


            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private boolean patternMatch(String p) {
        boolean check = Pattern.matches(PATTERN, p);

        if(check){
            return true;
        }else{
            return false;
        }
    }
}
