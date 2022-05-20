import java.util.Scanner;

public class PikachuVSRaichu {
    public static void main(String[] args) {
        //0.준비
        Scanner scanner = new Scanner(System.in);
        //첫 시작 화면
        System.out.println("피카츄 : 라이츄를 만났다..");
        System.out.println("저 자식.... 한테 한번 당한 경험이 있으니..");
        System.out.println("이번 리벤지 매치는 나에게 아주 중요해..");
        System.out.println("다신 땅을 침대로 누워있을 수 없어..!!");
        System.out.println(" ");

        //피카츄 공격 10   라이츄 공격 15
        //둘현재체력 50 - a'    50 - a

        int PikachuHP = 50;
        int RaichuHP = 50;
        int HPrecovercount = 1;
        while (PikachuHP > 0 & RaichuHP > 0) {


            //공격 1 옵션
            System.out.println("피카츄의 차례, 무엇을 할까?");
            System.out.println("1. 공격하기");
            System.out.println("2. 상처약 섭취");

            int choice = scanner.nextInt();


            if (choice == 1) {
                RaichuHP -= 10;
                PikachuHP -= 15;
                System.out.println("지우: 피카츄 몸통박치기!");
                System.out.println("-- 공격 명중! 라이츄의 에너지가 10 감소했다. 라이츄는 조금 아파한다.");
                System.out.println("라이츄: 앗, 라이츄 아프다.");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("라이츄: 라이쮸!!!!!!!!!!! ");
                System.out.println("-- 피카츄 타격!! 에너지가 15 감소했다!! -- ");
                System.out.println("피카츄: 피카앍..피카핡.. ");

                if (PikachuHP <= 0) {
                    PikachuHP = 0;
                    System.out.println("피카츄 현재 체력: " + PikachuHP);
                } else {
                    System.out.println("피카츄 현재 체력: " + PikachuHP);
                }
                if (RaichuHP <= 0) {
                    RaichuHP = 0;
                    System.out.println("라이츄 현재 체력: " + RaichuHP);
                } else {
                    System.out.println("라이츄 현재 체력: " + RaichuHP);
                }
                System.out.println(" ");
            }

            if (choice == 2) {

                HPrecovercount -= 1;
                if (HPrecovercount <= -1) {
                    System.out.print("피카츄: 아..앗!! 상처약이 없다.. 아");
                    System.out.print("라이츄: ㅋㅋㅋㅋㅋ");
                    System.out.println("라이츄: 라이쮸!!!!!!!!!!! ");
                    System.out.println("-- 피카츄 타격!! 에너지가 15 감소했다!! -- ");
                    System.out.println("피카츄: 피카앍..피카핡.. ");
                    System.out.println("피카츄 현재 체력: " + PikachuHP);
                    System.out.println("라이츄 현재 체력: " + RaichuHP + 10);
                } else {
                    PikachuHP = 50;
                    System.out.println("피카츄 현재 체력: " + PikachuHP);
                    System.out.println("라이츄 현재 체력: " + RaichuHP);

                }
            }
            if (PikachuHP < 1) {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("피카츄의 패배...이변은 없었다...역사는 반복한다...");
            }
            if (RaichuHP < 1) {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("피카츄의 승리!!");
            }
        }
    }
}