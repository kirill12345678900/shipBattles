package Ships;

public class CheckShips {
    public static boolean isAvailable(int x, int y, int deck, int rotation, int[][] battlefield) {
        // out of bound check
        if (rotation == 1) {
            if (y + deck > battlefield.length) {
                return false;
            }
        }
        if (rotation == 2){
            if (x + deck > battlefield[0].length){
                return false;
            }
        }

        //neighbours check without diagonals
        //XXXX
        while (deck!=0){
            for (int i = 0; i < deck; i++) {
                int xi = 0;
                int yi = 0;
                if (rotation == 1){
                    yi = i;
                } else{
                    xi = i;
                }
//                battlefield[x ][y];
                if (x + 1 + xi < battlefield.length && x + 1 + xi >= 0){
                    if (battlefield[x + 1 + xi][y + yi]!=0){
                        return false;
                    }
                }
                if (x - 1 + xi < battlefield.length && x - 1 + xi >= 0){
                    if (battlefield[x - 1 + xi][y + yi]!=0){
                        return false;
                    }
                }
                if (y + 1 + yi < battlefield.length && y + 1 + yi >= 0){
                    if (battlefield[x + xi][y + 1 + yi]!=0){
                        return false;
                    }
                }
                if (y - 1 + yi < battlefield.length && y - 1 + yi >= 0){
                    if (battlefield[x + xi][y - 1 + yi]!=0){
                        return false;
                    }
                }
            }
            deck--;
        }
        return true;
    }
}
