package parentapp;

import java.io.IOException;

public class Emulators {

    static int flag = 0;

    public static void startEmulator(String emulator) throws IOException, InterruptedException {
        if (emulator.contains("pixel5")) {
            Runtime.getRuntime()
                   .exec(System.getProperty("user.dir") + "\\src\\main\\resources\\startEmulatorPixel5.bat");
        } else if (emulator.contains("pixel4a")) {
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "\\src\\resources\\startEmulatorPixel4A.bat");
        } else if (emulator.contains("01")) {
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "\\src\\resources\\startEmulator01.bat");
        } else {
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "\\src\\resources\\startEmulator.bat");
        }
        if (flag == 0) {
            Thread.sleep(15000);
            flag++;
        }
    }
}
