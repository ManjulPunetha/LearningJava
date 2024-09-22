package exceptionHandling;

import exceptionHandling.Exception.InvalidCandidateException;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Candidate {
    private int age;
    private String name;

    public void voting(int age) throws InvalidCandidateException {
        if (age < 18)
            throw new InvalidCandidateException("Age less than 18. Not eligible to vote");
        else
            System.out.println("Welcome to voting");
    }
}

public class Vote {
    public static void main(String[] args) {
        Candidate candidate = new Candidate(19, "Rahul");
        try {
            candidate.voting(candidate.getAge());
        } catch (InvalidCandidateException ex) {
            System.out.println("Exception: " + ex);
        }
        System.out.println("\nNormal flow");
    }


}
