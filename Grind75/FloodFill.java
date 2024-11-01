package Grind75;

public class FloodFill {
    public static void main(String[] args){
        int[][] result = floodFill(new int[][]{{0,0,0},{0,0,0}}, 0,0,0);
        System.out.println();
        for(int[] sr : result){
            for(int sc : sr){
                System.out.print(sc + " ");
            }
            System.out.println();
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // int originColor = image[sr][sc];
        coloring(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public static void coloring(int[][] image, int sr, int sc, int color, int originColor){
        System.out.println("sr = " + sr + " / sc = " + sc);

        if(originColor == color){
            return;
        }

        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[sr].length){
            return;
        }
        
        if(image[sr][sc] == originColor){
            image[sr][sc] = color;
            coloring(image, sr-1, sc, color, originColor);
            coloring(image, sr+1, sc, color, originColor);
            coloring(image, sr, sc-1, color, originColor);
            coloring(image, sr, sc+1, color, originColor);
        }
    }
}
