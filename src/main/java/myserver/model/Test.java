package myserver.model;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

import java.io.IOException;
import java.util.Scanner;

@Slf4j
public class Test {

    public static void main(String[] args) {

//        final Bar bar = new Bar();
//        bar.setId(10L);
//        bar.setName("Pub");
//        bar.setPlace("Kyiv");
//
//        System.out.println(bar.toString());

        val lviv = Bar.of(10L, "Pub 2", "Lviv");
        System.out.println(lviv.toString());


        final StringBuilder builder = new StringBuilder();

        builder.append("esfrs")
                .append("dwefre")
                .append("serfe");

        log.info("jdhthgie");

        val withoutProblems = new ResponseOrderByPageWithoutProblems("Hello");

        System.out.println(withoutProblems.getName());


    }

    @SneakyThrows
    public static void test() {
        throw new IOException("sef");
    }

    public void reader() {

        @Cleanup
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();



    }
}
