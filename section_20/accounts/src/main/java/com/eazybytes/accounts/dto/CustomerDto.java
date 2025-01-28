package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Singular;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information")
public class CustomerDto {

    @Schema(
            description = "Name of the customer", example = "Eazy Bytes")
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 5, max = 30, message = "Name should be between 5 and 30 characters")
    private String name;

    @Schema(
            description = "Email address of the customer", example = "tutor@eazybytes.com")
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String email;

    @Schema(
            description = "Mobile Number of the customer", example = "9345432123")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;
}
