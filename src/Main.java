public class Main {
    public static void main(String[] args) {
        //Задание 6
        System.out.println("Задание 6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println("Общий вес двух бойцов равен " + (boxerWeight1+boxerWeight2) + " кг.");
        System.out.println("Разница между весами бойцов составляет " + (boxerWeight2-boxerWeight1) + " кг.");

        //Задание 7
        System.out.println("Задание 7");
        System.out.println("Разница между весами бойцов составляет " + (boxerWeight2 - boxerWeight1) + " кг. (1-й способ)");
        System.out.println("Разница между весами бойцов составляет " + (boxerWeight2 % boxerWeight1) + " кг. (2-й способ)");

        //Задание 8
        System.out.println("Задание 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var amountOfWorkers = totalWorkingHours/hoursPerDay;
        System.out.println("Всего работников в компании – " + amountOfWorkers  + " человек");
        var extraWorkers = 94 ;
        var finalAmountOfWorkers = extraWorkers+amountOfWorkers;

        System.out.println("Если в компании работает " + (amountOfWorkers+extraWorkers) + " человека, то всего " + (finalAmountOfWorkers * hoursPerDay) + " часа работы может быть поделено между сотрудниками.");


    }
}