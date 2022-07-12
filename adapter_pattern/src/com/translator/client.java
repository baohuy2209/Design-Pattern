package com.translator;


import com.translator.VietnameseTarget ;
import com.translator.TranslatorAdapter ;
import com.translator.JapanAdaptee ;


public class client {
    public static void main(String [] args){
        VietnameseTarget client = new TranslatorAdapter(new JapanAdaptee());

        client.send("Xin chao");
    }
}
