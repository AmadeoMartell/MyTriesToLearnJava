package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while (!((line = reader.readLine()).equals("Stop"))){
                switch (line){
                    case "Москва", "Владивосток", "Ростов": {
                        System.out.println("Россия");
                        break;
                    }
                    case "Рим", "Милан", "Турин": {
                        System.out.println("Италия");
                        break;
                    }
                    case "Ливерпуль", "Манчестер", "Лондон":{
                        System.out.println("Англия");
                        break;
                    }
                    case "Берлин", "Мюнхен", "Кёльн":{
                        System.out.println("Германия");
                        break;
                    }
                    default:
                        System.out.println("Неизвестная страна");
                }
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
