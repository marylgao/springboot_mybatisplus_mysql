package org.mary.response;

/**
 * @Auth yangyongp
 * @Create 2020/5/8 22:25
 */
public class ResultResponse {
  public static final String STATUS_SUCCESS = "success";
  public static final String STATUS_FAILED = "failed";

  private String result;
  private Object data;

  public ResultResponse(String result){
    this.result = result;
  }

  public ResultResponse(){

  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
