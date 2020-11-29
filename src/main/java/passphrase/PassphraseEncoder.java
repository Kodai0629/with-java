package passphrase;

public class PassphraseEncoder {
    static String encode(String pass){
        StringBuffer newpass=new StringBuffer();
        for (int index = 0; index < pass.length(); index++) {
            if(Character.isLowerCase(pass.charAt(index))) {
                newpass.append(Character.toUpperCase(pass.charAt(index)));
            } else if (Character.isUpperCase(pass.charAt(index))) {
                newpass.append(Character.toLowerCase(pass.charAt(index)));
            } else {
                newpass.append(pass.charAt(index));
            }
        }
        return newpass.toString();
    }

    static String decode(String pass){
        StringBuffer newpass=new StringBuffer();
        for (int index = 0; index < pass.length(); index++) {
            if(Character.isLowerCase(pass.charAt(index))) {
                newpass.append(Character.toUpperCase(pass.charAt(index)));
            } else if (Character.isUpperCase(pass.charAt(index))) {
                newpass.append(Character.toLowerCase(pass.charAt(index)));
            } else {
                newpass.append(pass.charAt(index));
            }
        }
        return newpass.toString();}
}
