> [!NOTE]
> **This repository is no longer actively maintained.**
> 
> We appreciate all the contributions and support from the community over the years. For those interested in continuing the development, feel free to fork the repository.
> 
> If you have any questions or need assistance, please refer to the existing documentation and issues. Thank you for your understanding.

# Loqate Bank Verification

## Features

A Mendix implementation of Loqate's Bank Verification API set. It provides the following actions:

### BankAccountValidation Batch Validate (v1)

Batch validates the bank account and sort code for any UK bank account to confirm they are correct. Returns details of the holding branch, IBAN and correct BACS account details.

### BankAccountValidation Interactive RetrieveBySortcode (v1)

Returns details of any UK holding branch.

### BankAccountValidation Interactive Validate (v2)

Validates the bank account and sort code for any UK bank account are correct. Returns details of the holding branch, IBAN and correct BACS account details.

### InternationalBankValidation Interactive Validate (v1)

Validates if the international bank account number for an international bank account is correct. (Does not apply to US banks)

Use of this module requires a valid API key. See <https://www.loqate.com/resources/support/apis/bankaccountvalidation/> for more details of the API actions.

## Dependencies

* Community Commons

## Installation

Add the module from the Marketplace and change the constant Loqate_BankVerification.ServiceKey to your own key.
