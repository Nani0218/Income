package org.example.javattd.service1;

import org.example.javattd.model1.Credentials;
import org.example.javattd.model1.GenerateOtp;

public class LoginService {

    public GenerateOtp generateOtp;

    public GenerateOtp login(Credentials credentials) {
        if (credentials.phoneNumber == 6281825284L) {
            GenerateOtp otp = new GenerateOtp();
            otp.generatedOtp = 252525;

            generateOtp = otp;
            System.out.println(generateOtp);
        }
        return generateOtp;
    }

    public String getLogin(Credentials credentials){
        if (generateOtp.generatedOtp==credentials.otp.generatedOtp){
            System.out.println("validOtp");
         return "login Successful";
        }else {
            System.out.println("inValidOtp");
            return "login unsuccessful";

        }
    }
}

