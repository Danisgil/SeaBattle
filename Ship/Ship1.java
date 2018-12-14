public class Ship1 {
    public static void main(String[] args) {
        int[][][] mape = new int[3][10][10];

        int p = (int) (Math.random() * 4);


        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        int z = (int) (Math.random() * 3);


        switch (p) {
            case 0 : // Рандомное расположение однобалубных кораблей
                mape[z][x][y] = 1;
                p--;
                break;
            case 1 :
                int d = (int) (Math.random() * 4); //Рандомное расположение двухпалобных кароблей
                    switch (d) {
                        case 0 :                // d = 0 => up
                            mape[z][x][y] = 1;
                            mape[z][x][y + 1] = 1;
                            break;
                        case 1 :                // d = 1 => down
                            mape[z][x][y] = 1;
                            mape[z][x][y - 1] = 1;
                            break;
                        case 2 :                 // d = 2 => left
                            mape[z][x][y] = 1;
                            mape[z][x - 1][y] = 1;
                            break;
                        case 3 :                 //d = 3 => right
                            mape[z][x][y] = 1;
                            mape[z][x + 1][y] = 1;
                            break;
                            }
            case 2 :                                        //Рандомное размещение трехпалубников
                int k = (int) (Math.random() * 4);
                        switch (k) {
                            case 0:                 // d = 0 => up
                                mape[z][x][y] = 1;
                                mape[z][x][y + 1] = 1;
                                mape[z][x][y + 2] = 1;
                                break;
                            case 1:               // d = 1 => down
                                mape[z][x][y] = 1;
                                mape[z][x][y - 1] = 1;
                                mape[z][x][y - 2] = 1;
                                break;
                            case 2:               // d = 2 => left
                                mape[z][x][y] = 1;
                                mape[z][x - 1][y] = 1;
                                mape[z][x - 2][y] = 1;
                                break;
                            case 3:                //d = 3 => right
                                mape[z][x][y] = 1;
                                mape[z][x + 1][y] = 1;
                                mape[z][x + 2][y] = 1;
                                break;
                        }
            case 3 :                                   // рандомное расположение 4 кораблей
                int h = (int) (Math.random() * 4);
                    switch (h) {
                        case 0 :                 // d = 0 => up
                            mape[z][x][y] = 1;
                            mape[z][x][y + 1] = 1;
                            mape[z][x][y + 2] = 1;
                            mape[z][x][y + 3] = 1;
                            break;

                        case 1 :              // d = 1 => down
                            mape[z][x][y] = 1;
                            mape[z][x][y - 1] = 1;
                            mape[z][x][y - 2] = 1;
                            mape[z][x][y - 3] = 1;
                            break;

                        case 2 :                // d = 2 => left
                            mape[z][x][y] = 1;
                            mape[z][x - 1][y] = 1;
                            mape[z][x - 2][y] = 1;
                            mape[z][x - 3][y] = 1;
                            break;


                        case 3 :                //d = 3 => right
                            mape[z][x][y] = 1;
                            mape[z][x + 1][y] = 1;
                            mape[z][x + 2][y] = 1;
                            mape[z][x + 3][y] = 1;
                            break;
                    }
                }
            }
        }


