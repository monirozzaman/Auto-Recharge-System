/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.util.UUID;

/**
 * @author monirozzamanroni
 */
public class User {

    public static String getUserId() {

        return UUID.randomUUID().toString();
    }

}
