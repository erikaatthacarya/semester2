public class Dragon09 {
    
    int x, y, width, height;
    
    public Dragon09(int w, int h){
        width = w;
        height = h;
    }
    void moveLeft(){
        x--;
        if (x < 0) {
            x = 0;
            detectCollision();
        } 
    }
    void moveRight(){
        x++;
        if (x > width) {
            x = width;
            detectCollision();
        }
    }
    void moveUp(){
        y--;
        if (y < 0) {
            y = 0;
            detectCollision();
        } 
    }
    void moveDown(){
        y++;
        if (y > height) {
            y = height;
            detectCollision();
        }
    }
    void printPosition(){
        System.out.printf("x : %d\n y: %d", x, y);
    }
    void detectCollision(){
        if (x < 0 || x > width || y < 0 || y > height) {
            System.out.println("Game Over!");
            System.exit(0);
        }
    }
}