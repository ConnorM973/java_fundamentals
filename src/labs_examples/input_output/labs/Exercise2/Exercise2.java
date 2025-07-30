package labs_examples.input_output.labs.Exercise2;

import java.io.*;

public class Exercise2 {
    public static void main(String[] args) {

        String str;
        int i;
        String filepath = "C:\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\Exercise2\\Exercise2Part2";
        String filepath2 = "C:\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\Exercise2\\Exercise2Read";
        try (BufferedReader br = new BufferedReader(new FileReader(filepath)); BufferedWriter bw = new BufferedWriter(new FileWriter(filepath2))) {

                while ((i = br.read()) != -1){
                char c= (char)i;
                    if (c=='a') {
                        bw.write('-');
                    } else if (c=='e'){
                        bw.write('~');
                    }
                     else {
                    bw.write(c);
                }
            }

        } catch (FileNotFoundException exc2) {
            System.out.println("File not found");
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        try (BufferedReader br2 = new BufferedReader(new FileReader(filepath2))) {
            while ((i = br2.read()) != -1){
                char c= (char)i;
                if (c=='-') {
                    System.out.print('a');
                } else if (c=='~'){
                    System.out.print('e');
                }
                else {
                    System.out.print(c);
                }
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
