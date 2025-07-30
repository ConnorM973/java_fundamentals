package labs_examples.input_output.labs.Exercise4;

import java.io.*;
import java.util.ArrayList;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        String filepath = "C:\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\Exercise4\\Cats";
        String filepath2 = "C:\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\Exercise4\\Exercise2Part2";

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                cats.add(mapValuesToCatObject(values));
            }

        } catch(FileNotFoundException exc){
            exc.printStackTrace();
        } catch(IOException exc2){
            exc2.printStackTrace();
        }

        for(Cat cat: cats){
            System.out.println(cat.toString());
        }

        try (BufferedWriter bw= new BufferedWriter(new FileWriter(filepath2))){
            String line;
            for(Cat cat: cats){
                line=cat.getName()+","+cat.getAge()+","+cat.isShorthair();
                bw.write(line);
                bw.newLine();
            }

        }
        catch(FileNotFoundException exc){
            exc.printStackTrace();
        } catch(IOException exc2){
            exc2.printStackTrace();
        }
    }

    private static Cat mapValuesToCatObject(String[] values) {
        Cat cat= new Cat();

        cat.setName(values[0]);
        cat.setAge(Integer.parseInt(values[1]));
        cat.setShorthair(Boolean.parseBoolean(values[2]));

        return cat;
    }
}