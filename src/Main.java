public class Main {
    public static void main(String[] args) {
        // "happy", "angry", "sad", etc.
        String mood = "angry";

//        switch (mood) {
//            case "happy":           //mood == "happy" 생략
//                System.out.println("나는 행복하다");
//
//            case "tired":
//                System.out.println("나는 피곤하다");
//
//            case "sad":
//                System.out.println("나는 슬프다");
//                break;
//
//            default:
//                System.out.println("표현불가");

        if (mood == "happy") {
            System.out.println("나는행복하다.");
        } else if(mood == "tired") {
            System.out.println("나는 피곤하다.");
        } else if (mood == "sad"){
            System.out.println("나는 슬프다.");
        } else {
            System.out.println("표현불가");
        }
    }
}
