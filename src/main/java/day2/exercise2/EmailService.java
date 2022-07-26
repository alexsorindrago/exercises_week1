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
        Map<String, Integer> emailDomainsMap = new HashMap<>();

        for (String email : emailService.emails) {
            String domain = email.split("@")[1];

            if (emailDomainsMap.containsKey(domain)) {
                emailDomainsMap.put(domain, emailDomainsMap.get(domain) + 1);
            } else {
                emailDomainsMap.put(domain, 1);
            }
        }

        for (Map.Entry<String, Integer> occurance : emailDomainsMap.entrySet()) {
            System.out.println(occurance.getKey() + " has " + occurance.getValue() + " occurrences");
        }
    }
}

