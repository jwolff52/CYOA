package io.github.jwolff52.cyoa;

import io.github.jwolff52.cyoa.io.FileWriter;

/*@author Timothy*/
public class driver {
    public static void main(String[] args){
        String[] strings={"This","is","a","test"};
        FileWriter tester=new FileWriter("test.txt");
        tester.write(strings);   
        System.out.println(strings[12]);
    }
}
