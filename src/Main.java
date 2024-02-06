public class Main {
    public static void main(String[] args) {
        //первое видео
        String phone = "+ 960-415 75-37";
        //удаляем тире и пробел
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        }
        //второе видео
        else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println(phone);
        System.out.println("phone = " + phone);
        //видео №3
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        //Приступаю к домашке
        //Задача 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String resultName = firstName + middleName + lastName;
        System.out.println(resultName);
        String resultName1 = firstName +" "+ middleName +" "+ lastName;
        System.out.println(resultName1);
        String[] strings = {firstName, middleName, lastName};
        String joinStr = String.join(" ", strings);
        System.out.println("resultName1 = " + resultName1);
        System.out.println(joinStr);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 1; i++) {
            res.append(firstName).append(" ").append(middleName).append(" ").append(lastName);
            System.out.println("StringBuilder - " +res.toString());
        }
        //Задача 2
        String fullName = "Ivanov Ivan Ivanovich";
        String s1 = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "+s1);
        //Задача 3
        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — "+fullName2);
    }
}