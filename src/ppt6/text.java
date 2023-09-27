	package ppt6;

	import javax.swing.*;
	import javax.swing.border.Border;

	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.util.Random;

	public class text extends JFrame {
	    private static final int BOARD_SIZE = 3;

	    private char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
	    private char currentPlayer = 'X'; //현재 플레이어

	    private boolean playerX = true; // 플레이어 X 차례를 나타내는 플래그
	    private boolean gameStarted = false; // 게임 시작 여부를 나타내는 플래그
	    private Random random = new Random();
	    
	    private JButton[][] buttons = new JButton[BOARD_SIZE][BOARD_SIZE];
	    private JButton startButton; // 시작 버튼 추가

	    private boolean gameStarted1 = false; // 게임시작안누르면 시작안함

	    public text() {
	        setTitle("Tic Tac Toe"); 
	        setLocation(500,300);// 창뜨는 위치설정
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(300, 350); // 게임 창 크기
	        setLayout(new BorderLayout());
	        
	        JPanel boardPanel = new JPanel();
	        boardPanel.setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));
	        add(boardPanel, BorderLayout.CENTER); //가운데 설정
	        boardPanel.setBackground(Color.white);
	        //boardPanel.setLayout(BorderLayout(3,3,2,2));

	        initializeBoard(); // 게임 보드 초기화

	        //게임보드에 클릭할 버튼들추가
	        for (int row = 0; row < BOARD_SIZE; row++) {
	            for (int col = 0; col < BOARD_SIZE; col++) {
	                buttons[row][col] = new JButton();
	                buttons[row][col].setFont(new Font("Arial", Font.PLAIN, 48));
	                buttons[row][col].setBackground(Color.white);
	                buttons[row][col].setFocusPainted(false);
	                
	                //버튼클릭리스너
	                final int r = row;
	                final int c = col;
	                buttons[row][col].addActionListener(new ActionListener() {
	                    public void actionPerformed(ActionEvent e) {
	                        onButtonClick(r, c);
	                    }
	                });
	                boardPanel.add(buttons[row][col]);//게임패널에추가
	            }
	            
	        }

	        //시작버튼
	        startButton = new JButton("Start"); // 시작 버튼 생성
	        startButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		onStartButtonClick();
	        	}
	        });
	        startButton.setBackground(new Color(25,25,112));
	        startButton.setForeground(Color.white);
	        startButton.setBorder(null);
	        startButton.setFont(new Font("Arial", Font.BOLD, 20));
	        
	        JPanel startPanel = new JPanel();
	        startPanel.add(startButton);//패널에 추가
	        startPanel.setBackground(new Color(25,25,112));
	        add(startPanel, BorderLayout.NORTH); //게임창 상단에 추가
	    }

	    private void initializeBoard() {
	        for (int row = 0; row < BOARD_SIZE; row++) {
	            for (int col = 0; col < BOARD_SIZE; col++) {
	                board[row][col] = ' ';
	            }
	        }
	    }

	    private void onButtonClick(int row, int col) {
	        if (!gameStarted) {
	            JOptionPane.showMessageDialog(this, "게임을 시작해주세요.");
	            return;
	        }

	        if (isValidMove(row, col) ) { //&& gameActive()) {
	            makeMove(row, col);
	            buttons[row][col].setText(String.valueOf(currentPlayer));
	            buttons[row][col].setEnabled(false);

	         // 배경색 변경
	         if (currentPlayer == 'X') {
	             buttons[row][col].setBackground(new Color(0,191,255));
	         } else {
	             buttons[row][col].setBackground(new Color(176,224,230));
	         }
	            
	            //게임결과
	            if (checkWin(row, col)) {
	                JOptionPane.showMessageDialog(this, "플레이어 " + currentPlayer + "가 이겼습니다!");
	                resetGame();
	            } else if (isBoardFull()) {
	                JOptionPane.showMessageDialog(this, "무승부입니다!");
	                resetGame();
	            } else {
	                togglePlayer();
	                if (currentPlayer == 'O') {
	                    // 플레이어 O의 차례일 때 랜덤한 위치에 놓기
	                    int[] randomMove = getRandomEmptyCell();
	                    if (randomMove != null) {
	                        onButtonClick(randomMove[0], randomMove[1]);
	                    }
	                }
	            }
	        }
	    }

	    private int[] getRandomEmptyCell() {
	        int[] move = new int[2];
	        do {
	            move[0] = random.nextInt(3);
	            move[1] = random.nextInt(3);
	        } while (!isValidMove(move[0], move[1]));
	        return move;
	    }
	    
	    
	    private boolean isValidMove(int row, int col) {
	        return board[row][col] == ' ';
	    }

	    private void makeMove(int row, int col) {
	        board[row][col] = currentPlayer;
	    }

	    private boolean checkWin(int row, int col) {
	        // 가로, 세로, 대각선으로 한 줄이 완성되었는지 확인
	        return (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) ||
	               (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer) ||
	               (row == col && board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
	               (row + col == 2 && board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
	    }

	    private boolean isBoardFull() {
	        for (int row = 0; row < BOARD_SIZE; row++) {
	            for (int col = 0; col < BOARD_SIZE; col++) {
	                if (board[row][col] == ' ') {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    private boolean gameActive() {
	        return gameStarted && !isBoardFull() && !checkWin(0, 0);
	    }

	    private void togglePlayer() {
	        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	    }

	    private void onStartButtonClick() {
	        if (!gameStarted) {
	            gameStarted = true;
	            startButton.setEnabled(false);
	            resetGame();
	        }
	    }

	    private void resetGame() {
	        initializeBoard();
	        currentPlayer = 'X';

	        for (int row = 0; row < BOARD_SIZE; row++) {
	            for (int col = 0; col < BOARD_SIZE; col++) {
	                buttons[row][col].setText("");
	                buttons[row][col].setEnabled(true);
	            }
	        }
	        
	        for (int row = 0; row < BOARD_SIZE; row++) {
	            for (int col = 0; col < BOARD_SIZE; col++) {
	                buttons[row][col].setBackground(Color.white);
	            }
	        }
	        
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new TicTacTokGame().setVisible(true);
	            }
	        });
	    }
	}
