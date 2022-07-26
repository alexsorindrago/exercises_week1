package day2.exercise2;

import java.util.HashMap;
import java.util.Map;

public class EmailService {

    String emails[] = {

            "ramesh@gmail.com",
            "rakesh@outlook.com",
            "lokesh@linkedin.com",
            "mahesh@gmail.com",
            "ganesh@gmail.com",
            "rajesh@outlook.com"
    };

    public void countEmailProvider(String[] emails) {
        EmailService emailService = new EmailService();
        Map<String, Integer> domainsCount = new HashMap<>();

        for (String email : emailService.emails) {
            String domain = email.split("@")[1];

            if (domainsCount.containsKey(domain)) {
                domainsCount.put(domain, domainsCount.get(domain) + 1);
            } else {
                domainsCount.put(domain, 1);
            }
        }

        for (Map.Entry<String, Integer> occurance : domainsCount.entrySet()) {
            System.out.println(occurance.getKey() + " has " + occurance.getValue() + " occurrences");
        }
    }
}

