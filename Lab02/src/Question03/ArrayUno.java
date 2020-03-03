package Question03;

import java.util.Arrays;
import java.util.Random;

public class ArrayUno<T> implements Uno<T> {

    private final T[] card;
    private final int draw;

    public ArrayUno(int draw) {
        this.draw = draw;
        this.card = (T[]) new Object[this.draw];
    }

    /**
     *
     */
    @Override
    public void draw() {
        Random ran = new Random();
        String[][] unocards = new String[4][27];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 27; j++) {
                switch (i) {
                    case 0:
                        switch (j) {
                            case 0:
                                unocards[i][j] = "Blue Zero";
                                break;
                            case 1:
                                unocards[i][j] = "Blue One";
                                break;
                            case 2:
                                unocards[i][j] = "Blue One";
                                break;
                            case 3:
                                unocards[i][j] = "Blue Two";
                                break;
                            case 4:
                                unocards[i][j] = "Blue Two";
                                break;
                            case 5:
                                unocards[i][j] = "Blue Three";
                                break;
                            case 6:
                                unocards[i][j] = "Blue Three";
                                break;
                            case 7:
                                unocards[i][j] = "Blue Four";
                                break;
                            case 8:
                                unocards[i][j] = "Blue Four";
                                break;
                            case 9:
                                unocards[i][j] = "Blue Five";
                                break;
                            case 10:
                                unocards[i][j] = "Blue Five";
                                break;
                            case 11:
                                unocards[i][j] = "Blue Six";
                                break;
                            case 12:
                                unocards[i][j] = "Blue Six";
                                break;
                            case 13:
                                unocards[i][j] = "Blue Seven";
                                break;
                            case 14:
                                unocards[i][j] = "Blue Seven";
                                break;
                            case 15:
                                unocards[i][j] = "Blue Eight";
                                break;
                            case 16:
                                unocards[i][j] = "Blue Eight";
                                break;
                            case 17:
                                unocards[i][j] = "Blue Nine";
                                break;
                            case 18:
                                unocards[i][j] = "Blue Nine";
                                break;
                            case 19:
                                unocards[i][j] = "Blue Draw Two";
                                break;
                            case 20:
                                unocards[i][j] = "Blue Draw Two";
                                break;
                            case 21:
                                unocards[i][j] = "Blue Reverse";
                                break;
                            case 22:
                                unocards[i][j] = "Blue Reverse";
                                break;
                            case 23:
                                unocards[i][j] = "Blue Skip";
                                break;
                            case 24:
                                unocards[i][j] = "Blue Skip";
                                break;
                            case 25:
                                unocards[i][j] = "Pick Colour";
                                break;
                            case 26:
                                unocards[i][j] = "Draw Four";
                                break;
                        }
                        break;
                    case 1:
                        switch (j) {
                            case 0:
                                unocards[i][j] = "Red Zero";
                                break;
                            case 1:
                                unocards[i][j] = "Red One";
                                break;
                            case 2:
                                unocards[i][j] = "Red One";
                                break;
                            case 3:
                                unocards[i][j] = "Red Two";
                                break;
                            case 4:
                                unocards[i][j] = "Red Two";
                                break;
                            case 5:
                                unocards[i][j] = "Red Three";
                                break;
                            case 6:
                                unocards[i][j] = "Red Three";
                                break;
                            case 7:
                                unocards[i][j] = "Red Four";
                                break;
                            case 8:
                                unocards[i][j] = "Red Four";
                                break;
                            case 9:
                                unocards[i][j] = "Red Five";
                                break;
                            case 10:
                                unocards[i][j] = "Red Five";
                                break;
                            case 11:
                                unocards[i][j] = "Red Six";
                                break;
                            case 12:
                                unocards[i][j] = "Red Six";
                                break;
                            case 13:
                                unocards[i][j] = "Red Seven";
                                break;
                            case 14:
                                unocards[i][j] = "Red Seven";
                                break;
                            case 15:
                                unocards[i][j] = "Red Eight";
                                break;
                            case 16:
                                unocards[i][j] = "Red Eight";
                                break;
                            case 17:
                                unocards[i][j] = "Red Nine";
                                break;
                            case 18:
                                unocards[i][j] = "Red Nine";
                                break;
                            case 19:
                                unocards[i][j] = "Red Draw Two";
                                break;
                            case 20:
                                unocards[i][j] = "Red Draw Two";
                                break;
                            case 21:
                                unocards[i][j] = "Red Reverse";
                                break;
                            case 22:
                                unocards[i][j] = "Red Reverse";
                                break;
                            case 23:
                                unocards[i][j] = "Red Skip";
                                break;
                            case 24:
                                unocards[i][j] = "Red Skip";
                                break;
                            case 25:
                                unocards[i][j] = "Pick Colour";
                                break;
                            case 26:
                                unocards[i][j] = "Draw Four";
                                break;
                        }
                        break;
                    case 2:
                        switch (j) {
                            case 0:
                                unocards[i][j] = "Yellow Zero";
                                break;
                            case 1:
                                unocards[i][j] = "Yellow One";
                                break;
                            case 2:
                                unocards[i][j] = "Yellow One";
                                break;
                            case 3:
                                unocards[i][j] = "Yellow Two";
                                break;
                            case 4:
                                unocards[i][j] = "Yellow Two";
                                break;
                            case 5:
                                unocards[i][j] = "Yellow Three";
                                break;
                            case 6:
                                unocards[i][j] = "Yellow Three";
                                break;
                            case 7:
                                unocards[i][j] = "Yellow Four";
                                break;
                            case 8:
                                unocards[i][j] = "Yellow Four";
                                break;
                            case 9:
                                unocards[i][j] = "Yellow Five";
                                break;
                            case 10:
                                unocards[i][j] = "Yellow Five";
                                break;
                            case 11:
                                unocards[i][j] = "Yellow Six";
                                break;
                            case 12:
                                unocards[i][j] = "Yellow Six";
                                break;
                            case 13:
                                unocards[i][j] = "Yellow Seven";
                                break;
                            case 14:
                                unocards[i][j] = "Yellow Seven";
                                break;
                            case 15:
                                unocards[i][j] = "Yellow Eight";
                                break;
                            case 16:
                                unocards[i][j] = "Yellow Eight";
                                break;
                            case 17:
                                unocards[i][j] = "Yellow Nine";
                                break;
                            case 18:
                                unocards[i][j] = "Yellow Nine";
                                break;
                            case 19:
                                unocards[i][j] = "Yellow Draw Two";
                                break;
                            case 20:
                                unocards[i][j] = "Yellow Draw Two";
                                break;
                            case 21:
                                unocards[i][j] = "Yellow Reverse";
                                break;
                            case 22:
                                unocards[i][j] = "Yellow Reverse";
                                break;
                            case 23:
                                unocards[i][j] = "Yellow Skip";
                                break;
                            case 24:
                                unocards[i][j] = "Yellow Skip";
                                break;
                            case 25:
                                unocards[i][j] = "Pick Colour";
                                break;
                            case 26:
                                unocards[i][j] = "Draw Four";
                                break;
                        }
                        break;
                    case 3:
                        switch (j) {
                            case 0:
                                unocards[i][j] = "Green Zero";
                                break;
                            case 1:
                                unocards[i][j] = "Green One";
                                break;
                            case 2:
                                unocards[i][j] = "Green One";
                                break;
                            case 3:
                                unocards[i][j] = "Green Two";
                                break;
                            case 4:
                                unocards[i][j] = "Green Two";
                                break;
                            case 5:
                                unocards[i][j] = "Green Three";
                                break;
                            case 6:
                                unocards[i][j] = "Green Three";
                                break;
                            case 7:
                                unocards[i][j] = "Green Four";
                                break;
                            case 8:
                                unocards[i][j] = "Green Four";
                                break;
                            case 9:
                                unocards[i][j] = "Green Five";
                                break;
                            case 10:
                                unocards[i][j] = "Green Five";
                                break;
                            case 11:
                                unocards[i][j] = "Green Six";
                                break;
                            case 12:
                                unocards[i][j] = "Green Six";
                                break;
                            case 13:
                                unocards[i][j] = "Green Seven";
                                break;
                            case 14:
                                unocards[i][j] = "Green Seven";
                                break;
                            case 15:
                                unocards[i][j] = "Green Eight";
                                break;
                            case 16:
                                unocards[i][j] = "Green Eight";
                                break;
                            case 17:
                                unocards[i][j] = "Green Nine";
                                break;
                            case 18:
                                unocards[i][j] = "Green Nine";
                                break;
                            case 19:
                                unocards[i][j] = "Green Draw Two";
                                break;
                            case 20:
                                unocards[i][j] = "Green Draw Two";
                                break;
                            case 21:
                                unocards[i][j] = "Green Reverse";
                                break;
                            case 22:
                                unocards[i][j] = "Green Reverse";
                                break;
                            case 23:
                                unocards[i][j] = "Green Skip";
                                break;
                            case 24:
                                unocards[i][j] = "Green Skip";
                                break;
                            case 25:
                                unocards[i][j] = "Pick Colour";
                                break;
                            case 26:
                                unocards[i][j] = "Draw Four";
                                break;
                        }
                        break;

                }
            }
        }
        for (int i = 0; i < card.length; i++) {
            card[i] = (T) unocards[ran.nextInt(4)][ran.nextInt(27)];
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < card.length; i++) {
            if (i == 6) {
                str += card[i];
            } else {
                str += card[i] + " :: ";
            }
        }
        return  str;
    }

}
