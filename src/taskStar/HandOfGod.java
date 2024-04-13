package taskStar;

public class HandOfGod {
    public static void giveAColor(Apple apple, String newColor){
        //используем рефлексию, чтобы получить доступ к приватному полю и изменить его значение
        try {
            java.lang.reflect.Field colorField = Apple.class.getDeclaredField("color");
            colorField.setAccessible(true);  // Разрешаем доступ к приватному полю
            colorField.set(apple, newColor);  // Изменяем значение поля color
            colorField.setAccessible(false); // Запрещаем доступ к приватному полю (необязательно, но рекомендуется)
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
