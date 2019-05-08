/*
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://github.com/javaee/tutorial-examples/LICENSE.txt
 */
package javaeetutorial.hello1;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Hello {

    public Hello() {

    }

    private int num;
    private String result;

    public String getResult(){
        return result;
    }

    //public void setResult(){ }

    public int getNum(){
        return num;
    }

    public void setNum(int user_num) {
        if(sth(user_num)==1){
            this.num = user_num;
            result = num + "不是素数";
        }else{
            this.num = user_num;
            result = num + "是素数";
        }
    }

    private int sth(int a){
        int j=a/2, i=2;
        while (i<=j) {
            if (a % i == 0) {
                return 1;
            }
            i++;
        }
        return 0;
    }
}

