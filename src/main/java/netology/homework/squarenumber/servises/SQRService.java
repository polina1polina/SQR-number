package netology.homework.squarenumber.servises;

public class SQRService {

    public int calcSqr(int min, int max) {
        int count = 0;
        for (int number = 10; number <= 99; number++) {
            if (number * number >= min && number * number <= max) {
                    count++;
            }
        }
        return count++;
    }
}
