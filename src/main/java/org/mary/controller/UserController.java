package org.mary.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import java.util.ArrayList;
import java.util.List;
import org.mary.entity.User;
import org.mary.response.ResultResponse;
import org.mary.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
* <p>
  *  前端控制器
  * </p>
*
* @author mary
* @since 2020-05-08
*/
@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  private IUserService userService;

  @RequestMapping(value = "/add", method = RequestMethod.POST)
  @ResponseBody
  public ResultResponse addUser(@RequestBody User user){
    boolean result = userService.save(user);
    ResultResponse response = new ResultResponse();
    response.setResult(result ? ResultResponse.STATUS_SUCCESS: ResultResponse.STATUS_FAILED);
    return response;
  }

  @RequestMapping(value = "/getAll", method = RequestMethod.GET)
  @ResponseBody
  public ResultResponse getList(){
    ResultResponse response = new ResultResponse();
    response.setResult(ResultResponse.STATUS_SUCCESS);
    List<User> userList = userService.list();
    if(userList == null){
      response.setData(new ArrayList<>(0));
    }else{
      response.setData(userList);
    }
    return response;
  }

  @RequestMapping(value = "/update", method = RequestMethod.POST)
  @ResponseBody
  public ResultResponse updateUser(@RequestBody User user){
    boolean result = userService.updateById(user);
    ResultResponse response = new ResultResponse();
    response.setResult(result ? ResultResponse.STATUS_SUCCESS: ResultResponse.STATUS_FAILED);
    return response;
  }

  @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
  @ResponseBody
  public ResultResponse deleteUserById(Integer id){
    if(id == null){
      return new ResultResponse(ResultResponse.STATUS_SUCCESS);
    }
    boolean result = userService.removeById(id);
    ResultResponse response = new ResultResponse();
    response.setResult(result ? ResultResponse.STATUS_SUCCESS: ResultResponse.STATUS_FAILED);
    return response;
  }


}
