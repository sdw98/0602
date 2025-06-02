public class Main {
    public static void main(String[] args) {
        // "happy", "angry", "sad", etc.
        String mood = "tired";

        switch (mood) {
            case "happy":
                System.out.println("나는 행복하다");

            case "tired":
                System.out.println("나는 피곤하다");

            case "sad":
                System.out.println("나는 슬프다");
                break;
        }
    }
}