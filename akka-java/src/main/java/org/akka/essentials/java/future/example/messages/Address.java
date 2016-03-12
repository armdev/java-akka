package org.akka.essentials.java.future.example.messages;

import scala.collection.mutable.StringBuilder;

public class Address {

    private Integer userId = null;
    private String fullName = null;
    private String address1 = null;
    private String address2 = null;

    public Address(Integer inUserId, String inFullName, String inAddress1,
            String inAddress2) {
        userId = inUserId;
        fullName = inFullName;
        address1 = inAddress1;
        address2 = inAddress2;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("FullName->").append(fullName).append(" ,Address1->")
                .append(address1).append(" ,Address2->").append(address2);
        return result.toString();
    }
}
