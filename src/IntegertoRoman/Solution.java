package IntegertoRoman;


public class Solution {
    private int unit ;
    private int decade;
    private int hundred;
    private int thousand;

    public  String intToRoman(int number) {
        splitNumberAndInit ( number );
        return generateRoma();
    }

    private String generateRoma() {
        String thoundRoma = convertThoundToRoma(thousand);
        String hundredRoma = convertHundredRoma(hundred);
        String decadeRoma = convertDecadeRoma(decade);
        String unitRoma = convertUnitRoma(unit);
        return thoundRoma+hundredRoma+decadeRoma+unitRoma;
    }

    private String convertUnitRoma(int unit) {
        return generateStringUseRomaLogic ( unit,"I","V","X" );
    }

    private String generateStringUseRomaLogic(int number, String ONE, String FIVE, String TEN){
        String res = "";
        switch (number){
            case 0:
                res = "";
                break;
            case 1:
                res = ONE;
                break;
            case 2:
                res = ONE + ONE;
                break;
            case 3:
                res = ONE + ONE + ONE;
                break;
            case 4:
                res = ONE + FIVE;
                break;
            case 5:
                res = FIVE;
                break;
            case 6:
                res = FIVE + ONE;
                break;
            case 7:
                res = FIVE + ONE + ONE;
                break;
            case 8:
                res = FIVE + ONE + ONE + ONE;
                break;
            case 9:
                res = ONE + TEN;
                break;
        }
        return res;
    }

    private String convertDecadeRoma(int decade) {
        return generateStringUseRomaLogic ( decade,"X","L","C" );
    }

    private String convertHundredRoma(int hundred) {
        return generateStringUseRomaLogic ( hundred,"C","D","M" );
    }

    private String convertThoundToRoma(int thousand) {
        return generateStringUseRomaLogic ( thousand,"M","","");
    }

    private void  splitNumberAndInit(int number){
        unit = decade = hundred = thousand = 0;
        unit = number % 10;
        decade = (number % 100) / 10;
        hundred = (number % 1000) /100;
        thousand = number/1000;
    };
}


