import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Szachownica {
    public static void main(String[] args) {

            try {
                int count = 1;

                int width = 1, height = 1, horizontally = 1, vertically = 1;

                String wright = "";
                String black = "";

                for (String arg : args) {

                    if (count == 1) {
                        width = Integer.parseInt(arg);

                    } else if (count == 2) {
                        height = Integer.parseInt(arg);

                    } else if (count == 3) {
                        horizontally = Integer.parseInt(arg);

                    } else if (count == 4) {
                        vertically = Integer.parseInt(arg);

                    } else if (count == 5) {
                        wright = arg;

                    } else if (count == 6) {
                        black = arg;

                    }

                    count++;
                }
                if (count != 7) {
                    System.exit(0);
                }

                int counter_1 = 1, counter_2;
                counter_2 = height;

                if (width<16 && height<16 && horizontally<16 && vertically<16) {

                for (int n = 0; n < vertically; n++) {

                    if ((counter_1 % 2) == 0) {

                        for (int b = 0; b < horizontally; b++) {

                            for (int j = 0; j < height; j++) {

                                if ((counter_2 % 2) == 0) {

                                    for (int i = 0; i < width; i++) {
                                        System.out.print(wright);
                                    }
                                    counter_2--;

                                } else {

                                    for (int k = 0; k < width; k++) {
                                        System.out.print(black);
                                    }
                                    counter_2--;

                                }

                            }
                            counter_2 = height;
                            System.out.println("");

                        }

                        counter_1++;

                    } else {

                        for (int b = 0; b < horizontally; b++) {

                            for (int j = 0; j < height; j++) {

                                if ((counter_2 % 2) == 0) {

                                    for (int i = 0; i < width; i++) {
                                        System.out.print(black);
                                    }
                                    counter_2--;

                                } else {
                                    for (int k = 0; k < width; k++) {
                                        System.out.print(wright);
                                    }
                                    counter_2--;

                                }
                            }

                            counter_2 = height;
                            System.out.println("");
                        }

                        counter_1++;
                    }
                }
            }

            } catch (Exception e) {}
            }
        }

