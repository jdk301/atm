package virtualatm.service;

public enum AtmServiceError {
   SUCCESS,
   ACCOUNT_NOT_OWNED,
   USER_ACCOUNT_NOT_FOUND,
   BANK_ACCOUNT_NOT_FOUND,
   INSUFFICIENT_FUNDS,
   SOURCE_ACCOUNT_NOT_FOUND,
   DESTINATION_ACCOUNT_NOT_FOUND,
   SOURCE_BANK_ACCOUNT_NOT_OWNED,
   DESTINATION_BANK_ACCOUNT_NOT_OWNED,
   USER_ACCOUNT_LOCKED,
   INVALID_USER_CREDENTIALS,
   LOGOUT_REMINDER,
}
