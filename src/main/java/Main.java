import com.google.gson.Gson;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;




public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton but1 = new JButton("click here");
        frame.getContentPane().add(but1);
        frame.setSize(300, 300);
        frame.setVisible(true);



        String path_to_file = "";
        if (args[0] != null) {
            path_to_file = args[0];
        }

        File file = new File(path_to_file);
        List<String> strings = new ArrayList<>();
        Scanner sc;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim(); // trim() - обрезание пробелов
                strings.add(line);
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }






        try (FileWriter writer = new FileWriter(file);) {
            writer.write("something interesting");
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.getMessage();
        }














        /**/
        List<String> staff = new LinkedList<String>();
        staff.add("Any");
        staff.add("Bob");
        staff.add("Karl");
        for (String s : staff) {
            System.out.println(s);
        }
        Iterator<String> iter = staff.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println(staff.remove("Bob"));

        Set<Integer> set = new HashSet<>();
        set.add(67);
        set.add(233);
        set.add(5467);
        for(int i : set) {
            System.out.println(i);
        }




        System.out.println(path_to_file);



        RemoteControl pult = new RemoteControl();

        Light bedroom = new Light();
        Light bathroom = new Light();

        LightOnCommand bedroomLightOn = new LightOnCommand(bedroom);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedroom);

        LightOnCommand bathroomLightOn = new LightOnCommand(bathroom);
        LightOffCommand bathroomLightOff = new LightOffCommand(bathroom);

        pult.setCommand(0, bedroomLightOn, bedroomLightOff);
        pult.setCommand(1, bathroomLightOn, bathroomLightOff);

        System.out.println(pult);

        pult.onButtonWasPushed(0);
        pult.offButtonWasPushed(1);


    }

    public void xmlReader() {
        File file = new File("");
    }
}
