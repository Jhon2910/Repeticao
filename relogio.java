public class relogio {
    public static void main(String[] args) {

        for(int h=0; h<24; h++){
            for(int m=0; m<60; m++){
                for(int s=0; s<60; s++) {
                    System.out.printf("%02d:%02d:%02d\n", h, m, s);

                    try {
                        Thread.sleep(100); // pausa de 1000 ms = 1 segundo real
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
