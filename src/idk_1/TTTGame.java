package idk_1;
//틱택토게임 자바
import java.util.Scanner;

public class TTTGame {

    private static char[][] board = new char[3][3]; // 3x3 크기의 게임 보드
    private static char currentPlayer = 'X'; // 현재 플레이어, 'X' 또는 'O'

    public static void main(String[] args) {
        initializeBoard(); // 게임 보드 초기화
        boolean gameInProgress = true; // 게임 진행 여부
        int moves = 0; // 플레이어들의 이동 횟수

        while (gameInProgress) {
            displayBoard(); // 게임 보드 출력
            int[] move = getPlayerMove(); // 플레이어의 이동 입력 받기
            int row = move[0];
            int col = move[1];

            if (isValidMove(row, col)) { // 유효한 이동인지 검사
                makeMove(row, col); // 이동을 게임 보드에 반영
                moves++;

                if (checkWin(row, col)) { // 승리 여부 확인
                    displayBoard();
                    System.out.println("플레이어 " + currentPlayer + "가 이겼습니다!");
                    gameInProgress = false; // 게임 종료
                } else if (moves == 9) { // 모든 칸이 채워졌는지 확인
                    displayBoard();
                    System.out.println("무승부입니다!");
                    gameInProgress = false; // 게임 종료
                } else {
                    togglePlayer(); // 다음 플레이어로 넘어가기
                }
            } else {
                System.out.println("잘못된 위치입니다. 다시 시도하세요.");
            }
        }
    }

    private static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' '; // 공백으로 초기화
            }
        }
    }

    private static void displayBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | "); // 현재 게임 보드 출력
            }
            System.out.println("\n-------------");
        }
    }

    private static int[] getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("플레이어 " + currentPlayer + ", 행(0-2)과 열(0-2)을 입력하세요 (예: 0 0): ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[]{row, col};
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    private static void makeMove(int row, int col) {
        board[row][col] = currentPlayer; // 플레이어의 이동을 게임 보드에 반영
    }

    private static void togglePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // 다음 플레이어로 넘어가기
    }

    private static boolean checkWin(int row, int col) {
        // 가로, 세로, 대각선으로 한 줄이 완성되었는지 확인
        return (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) ||
               (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer) ||
               (row == col && board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
               (row + col == 2 && board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }
}