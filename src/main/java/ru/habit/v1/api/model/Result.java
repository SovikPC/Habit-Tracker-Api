package ru.habit.v1.api.model;

public class Result<T> {

    private T data;
    private String error;
    private Boolean success;
    
    public Result(T data, String error, Boolean success) {
        this.data = data;
        this.error = error;
        this.success = success;
    }

    public static <T> Result<T> success(T data){
        return new Result<T>(data, null, true);
    }

    public static <T> Result<T> error(String error){
        return new Result<T>(null, error, false);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
