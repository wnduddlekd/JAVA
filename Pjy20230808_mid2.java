import java.util.Scanner;
import java.util.Random;

public class Pjy20230808_mid2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        while (true) {
            // 게임 시작
            System.out.println("______________________________");
            System.out.println("< 컴퓨터와의 묵찌빠 게임 >");
            
            String userInput;
            while (true) {
                // 컴퓨터의 가ㅋ위바위보 선택
                String[] rpsOptions = {"가위", "바위", "보"};
                String computerChoice = rpsOptions[random.nextInt(3)];

                // 사용자 입력 받기
                System.out.println("사용자는 가위, 바위, 보 중에서 하나를 선택해주세요.");
                System.out.println("종료하려면 '종료'를 입력해주세요.");
                System.out.print("입력 : ");
                userInput = scanner.nextLine();

                if (userInput.equals("종료")) {
                    System.out.println("게임을 종료합니다.");
                    System.out.println("______________________________");
                    scanner.close();
                    return;
                }

                // 잘못된 입력 시 다시 입력
                if (!userInput.equals("가위") && !userInput.equals("바위") && !userInput.equals("보")) {
                    System.out.println();
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                    continue;
                }

                System.out.println();
                System.out.println("- 사용자는 " + userInput + "를 입력하셨습니다.");
                System.out.println("- 컴퓨터는 " + computerChoice + "를 선택하였습니다.");

                // 승자 결정
                int winner = 0;
                
                if ((userInput.equals("바위") && computerChoice.equals("가위")) ||
                    (userInput.equals("보") && computerChoice.equals("바위")) ||
                    (userInput.equals("가위") && computerChoice.equals("보"))) {
                    System.out.println(">>> 사용자 차례입니다.");
                    winner = 0;
                } else if (userInput.equals(computerChoice)) {
                    System.out.println(">>> 비겼습니다. 게임을 새로 시작합니다.");
                    System.out.println();
                    continue;
                } else {
                    System.out.println(">>> 컴퓨터 차례입니다.");
                    winner = 1;
                }
                System.out.println();

                // 묵찌빠 게임 시작
                String[] mukJjiPpaOptions = {"묵", "찌", "빠"};
                while (true) {
                    System.out.println("사용자는 묵, 찌, 빠 중에서 하나를 선택해주세요.");
                    System.out.print("입력 : ");
                    userInput = scanner.nextLine();

                    // 잘못된 입력 시 다시 입력
                    if (!userInput.equals("묵") && !userInput.equals("찌") && !userInput.equals("빠")) {
                        System.out.println();
                        System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                        continue;
                    }

                    String computerMukJjiPpa = mukJjiPpaOptions[random.nextInt(3)];

                    System.out.println();
                    System.out.println("- 사용자는 " + userInput + (userInput.equals("묵") ? "을" : "를") + " 입력하셨습니다.");
                    System.out.println("- 컴퓨터는 " + computerMukJjiPpa + (computerMukJjiPpa.equals("묵") ? "을" : "를") + " 선택하였습니다.");

                    // 묵찌빠 승자 결정
                    if ((userInput.equals("묵") && computerMukJjiPpa.equals("찌")) ||
                        (userInput.equals("빠") && computerMukJjiPpa.equals("묵")) ||
                        (userInput.equals("찌") && computerMukJjiPpa.equals("빠"))) {
                        System.out.println("사용자 차례입니다.");
                    } else if (userInput.equals(computerMukJjiPpa)) {
                        if (winner == 0) {
                            System.out.println("축하합니다! 사용자의 승리입니다.");
                        } else {
                            System.out.println("컴퓨터의 승리입니다.");
                        }
                        break;
                    } else {
                        System.out.println("컴퓨터 차례입니다.");
                    }
                    System.out.println();
                }
                break;
            }

            // 사용자에게 게임 재시작 여부 확인
            System.out.println();
            System.out.print("다시 한번 게임을 시작하시겠습니까? (yes/no): ");
            if (scanner.nextLine().equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("게임을 종료합니다.");
        System.out.println("______________________________");
        scanner.close();
    }
}
