////import org.apache.velocity.exception.ResourceNotFoundException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//@ControllerAdvice
//public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
//    @ExceptionHandler(ResourceNotFoundException.class)
//    protected ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex) {
//        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, "Resource not found", ex.getMessage());
//        return buildResponseEntity(apiError);
//    }
//    @ExceptionHandler(InvalidRequestException.class)
//    protected ResponseEntity<Object> handleInvalidRequestException(InvalidRequestException ex) {
//        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, "Invalid request", ex.getMessage());
//        return buildResponseEntity(apiError);
//    }
//    @ExceptionHandler(Exception.class)
//    protected ResponseEntity<Object> handleGenericException(Exception ex) {
//        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error", ex.getMessage());
//        return buildResponseEntity(apiError);
//    }
//    private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
//        return new ResponseEntity<>(apiError, apiError.getStatus());
//    }
//}