package com.example.kttkht_wk4;

import jdepend.swingui.JDepend;

import java.io.IOException;

public class SwingUI_Main {
    public static void main(String[] args) throws IOException {
        JDepend depend =new JDepend();
        depend.addDirectory("T:\\KTTKPM_Wk4\\LibraryAssistant");
        depend.analyze();
        System.out.println("DONE");
    }
}
