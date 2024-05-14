import javax.sound.sampled.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        File file = new File("Luz Solart - Luna Cantina.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);


        String response = "";

        while(!response.equals("Q")){
            System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();
        switch (response){
            case ("P") : clip.start();
                break;
            case ("S") : clip.stop();
                break;
            case ("R") : clip.setMicrosecondPosition(0);
            case ("Q") : clip.close();
                break;
            default: System.out.println("Not a valid response");
        }

        }

        System.out.println("Byeeee!");
    }
}