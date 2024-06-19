import java.util.Scanner;
import java.util.Random;

public class Pjy20230808_mid1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        while (true) {
        	// 게임 시작
            System.out.println("______________________________");
            System.out.println("< 컴퓨터와의 가위바위보 게임 >");
            
            // 컴퓨터의 가위바위보 선택
            int ran = random.nextInt(3);
            String com;
            
            if (ran == 0) {
                com = "가위";
            } else if (ran == 1) {
                com = "바위";
            } else {
                com = "보";
            }

            // 사용자의 입력 받기
            System.out.println("사용자는 가위, 바위, 보 중에서 하나를 선택해주세요.");
            System.out.println("종료하려면 '종료'를 입력해주세요.");
            System.out.print("입력 : ");
            String user = scanner.nextLine();

            if (user.equals("종료")) {
                break;
            }

            // 잘못된 입력 시 다시 입력
            if (!user.equals("가위") && !user.equals("바위") && !user.equals("보")) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                continue;
            }

            System.out.println();
            System.out.println("- 사용자는 " + user + "를 입력하셨습니다.");
            System.out.println("- 컴퓨터는 " + com + "를 선택하였습니다.");
            
            // 가위바위보 승자 정하기
            if ((user.equals("바위") && com.equals("가위")) ||
                (user.equals("보") && com.equals("바위")) ||
                (user.equals("가위") && com.equals("보"))) {
                System.out.println(">>> 사용자가 승리하였습니다.");
            } else if (user.equals(com)) {
                System.out.println(">>> 비겼습니다.");
            } else {
                System.out.println(">>> 컴퓨터가 승리했습니다.");
            }
            System.out.println();
            
            // 사용자에게 게임 재시작 여부 확인
            System.out.print("다시 한번 게임을 시작하시겠습니까? (yes/no): ");
            String re = scanner.nextLine();
            if (re.equals("no")) {
            	break;
            }
        }

        System.out.println();
        System.out.println("게임을 종료합니다.");
        System.out.println("______________________________");
        
        scanner.close();
    }
}