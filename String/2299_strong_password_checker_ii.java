class Solution {
    public boolean strongPasswordCheckerII(String password) {
       if(password.length() < 8)
            return false;
        boolean lower = false, upper = false, digit = false, special = false, valid = true;
        for(int i = 0; i < password.length(); i++)
        {
            char cur = password.charAt(i);
            if(Character.isLowerCase(cur))
                lower = true;
            else if(Character.isUpperCase(cur))
                upper = true;
            else if(Character.isDigit(cur))
                digit = true;
            else
                special = true;
            if(i > 0 && password.charAt(i-1) == cur)
                valid = false;
        }
        return (valid && lower && upper && digit && special);
    }
}