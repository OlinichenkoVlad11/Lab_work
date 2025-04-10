package LAB7.task4;

class UserAccount {
    private String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        setPassword(password); // Використання методу для безпеки
    }

    // Гетер
    public String getUsername() {
        return username;
    }

    // Метод входу в систему
    public void login(String enteredPassword) {
        if (this.password.equals(enteredPassword)) {
            System.out.println("Успішний вхід для користувача: " + username);
        } else {
            System.out.println("Невірний пароль!");
        }
    }

    // Метод для безпечної зміни пароля
    public void setPassword(String newPassword) {
        if (newPassword.length() >= 6) {
            this.password = newPassword;
            System.out.println("Пароль успішно змінено.");
        } else {
            System.out.println("Пароль повинен містити щонайменше 6 символів.");
        }
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        UserAccount user = new UserAccount("Vlad_radar", "Pin cod_oop");

        user.login("wrongness"); // Невірний пароль
        user.login("Pin cod_oop"); // Вірний пароль

        user.setPassword("123"); // Некоректний пароль
        user.setPassword("oop456"); // Коректний пароль
        user.login("oop456"); // Вхід з новим паролем
    }
}

