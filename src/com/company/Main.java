package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Number number = new Number();
        number.priceOut();
    }

    static class Number {
        int [] price = {5, 100, 20, 66, 16};
        int discount = 50;
        int offset = 1;
        int readLenght = 3;

        List<Integer> decDat; //Новые цены

        //Выводим новые цены
        void priceOut() {
            decDat = decryptData(price, discount, offset, readLenght);
            for (int i : decDat) {
                System.out.println("New price: " + i);
            }
        }

        //Основной метод
        public List<Integer> decryptData(int[] price, int discount, int offset, int readLength) {

            List<Integer> decryptPrice = new ArrayList<Integer>();
            for (int i = offset; i < offset + readLength; i++) {

                decryptPrice.add(price[i] - price[i] * discount / 100);

            }
            return decryptPrice;
        }
    }
}
