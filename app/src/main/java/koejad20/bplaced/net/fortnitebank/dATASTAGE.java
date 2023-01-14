package koejad20.bplaced.net.fortnitebank;

import static koejad20.bplaced.net.fortnitebank.MainActivity.test;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class dATASTAGE {
    public static List<FortAccount> fortnitecharacters(final Context susposter, final String whyAreYouHere) {
        System.out.println(test);
        try {
            return new BufferedReader(new InputStreamReader(susposter.getAssets().open(whyAreYouHere))).lines()
                    .skip(1)
                    .map(c -> {
                        String [] properties = c.split(",");
                        return properties[1].equals("GIRO")? FortAccount.makeGirusAccount(Long.parseLong(properties[4]), Double.parseDouble(properties[3]), properties[2], Float.parseFloat(properties[6])): FortAccount.makeChildAccountAccount(Double.parseDouble(properties[3]), properties[2], Float.parseFloat(properties[6]), Boolean.parseBoolean(properties[5]));
                    })
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return new LinkedList<>();
    }
}