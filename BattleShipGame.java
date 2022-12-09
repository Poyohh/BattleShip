import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.Font;

public class BattleShipGame extends Canvas {
    
    //private BattleShipMap[][] PlayerMap; // [12]x[12] MAP
    private BattleShipMap[][] PlayerGuessMap;
    private BattleShipType[][] CpuMap;
    //private BattleShipMap[][] CpuGuessMap;
    private BattleShipPlayer Turn; // Turn of either player or CPU
    
    public BattleShipGame() {
    		/*
    		p1Map = new PlayerMap[12][12];
    		for (int i = 0; i < 12; i++) {
    		    for (int j = 0; j < 12; j++) {
    		        p1Map[i][j] = PlayerMap.Empty;
    		    }
    		}
    		cpuGuessMap = new CpuGuessMap[12][12];
    		for (int i = 0; i < 12; i++) {
    		    for (int j = 0; j < 12; j++) {
    		        cpuGuessMap[i][j] = CpuGuessMap.Empty;
    		    }
    		}
    		*/
    		PlayerGuessMap = new BattleShipMap[12][12];
    		for (int i = 0; i < 12; i++) {
    		    for (int j = 0; j < 12; j++) {
    		        PlayerGuessMap[i][j] = BattleShipMap.Empty;
    		    }
    		}
    		
    		
    		
    		Turn = BattleShipPlayer.Player1;
    		
    		
    	   setSize(1360, 800); // (width, height)
           setBackground(Color.BLACK);
    }
   
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GREEN);
        
        g2d.drawString("Welcome to BattleShip", 265, 40); // TITLE
        
        g2d.drawRect(65, 60, 540, 600); // BORDER
 
        //PlayerGuessMap
        // VERTICAL LINES
        int v = 110; 
        while (v <= 560) {
            g2d.drawLine(v, 60, v, 660);
            v += 45;
        }
        // HORIZONTAL LINES
        int h = 110;
        while (h <= 610) {
            g2d.drawLine(65, h, 605, h);
            h += 50;
        }
        // SHIP PLACEMENT
        /*
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                switch (p1Map[i][j]) {
                   
                }
            }
        }
        */
        //add off 680
        int v2 = 790; 
        while (v2 <= 1350) {
            g2d.drawLine(v2, 60, v2, 660);
            v2 += 45;
        }
        // HORIZONTAL LINES
        int h2 = 790;
        while (h2 <= 1290) {
            g2d.drawLine(660, h2, 1210, h2);
            h2 += 50;
        }
        
      }
    /*
    public void p1GuessMap(Graphics g) {
        Graphics2d g2d = (Graphics2D) g;
        g2d.setColor(Color.GREEN);
        g2d.drawRect(65, 60, 540, 600); // BORDER
 
        // VERTICAL LINES
        int v = 110; 
        while (v <= 560) {
            g2d.drawLine(v, 60, v, 660);
            v += 45;
        }
        // HORIZONTAL LINES
        int h = 110;
        while (h <= 610) {
            g2d.drawLine(65, h, 605, h);
            h += 50;
        }
        // SHIP GUESSES
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                switch (p1GuessMap[i][j]) {
                case Hit:
                    draw X
                case Miss:
                    draw O   
                }
            }
        }
        
    } 
    */
    
    

}







