public class Main {
    public static void main(String[] args) {

    }

    public static boolean method(String login, String password, String confirmPassword) {
        String regex = "\\W";
        Pattern pattern = Pattern.compile(regex);

        try {
            Matcher matcher = pattern.matcher(login);

            if (matcher.find() || login.length() >= 20) {
                throw new WrongLoginException();
            }

            matcher = pattern.matcher(password);

            if (matcher.find() || password.length() >= 20 || password != confirmPassword) {
                throw new WrongPasswordException();
            }
        } catch (WrongLoginException exception) {
            return false;
        } catch (WrongPasswordException exception) {
            return false;
        }

        return true;
    }
}
