/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author iskandar
 */
@Component
@Scope("singleton")
public class UserBoImpl implements UserBo {

    public UserBoImpl() {
        System.out.println("======================== UserBoImpl constructor ============================");
    }
    
    @Override
    public String getMessage() {
        return "Hello, World!";
    }

}
