package com.aust.mvc.controller;

import com.aust.mvc.service.IUserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/*Model（模型）是应用程序中用于处理应用程序数据逻辑的部分。
　　通常模型对象负责在数据库中存取数据。
View（视图）是应用程序中处理数据显示的部分。
　　通常视图是依据模型数据创建的。
Controller（控制器）是应用程序中处理用户交互的部分。
　　通常控制器负责从视图读取数据，控制用户输入，并向模型发送数据*/


//返回值
// a.  controller方法
//               返回字符串可以指定逻辑视图名，通过视图解析器解析为物理视图地址。
//
// b. Redirect重定向
//               Controller方法返回字符串可以重定向到一个url地址
//               如：return "redirect:/itemEdit.action?itemId=" + item.getId();
//           
// c. forward转发
//               Controller方法执行后继续执行另一个Controller方法
//               如： return "forward:/itemEdit.action";



//在Spring MVC中，当Controller将请求处理结果放入到ModelAndView中以后，DispatcherServlet会
// 根据 ModelAndView选择合适的视图进行渲染。
@Controller
public class HomeController {

    private IUserOrderService orderService;

//    @Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。
//    通过 @Autowired的使用来消除 set ，get方法。在使用@Autowired之前，我们对一个bean配置起属性时，是这用用的
//    通过这种方式来，配置比较繁琐，而且代码比较多。在Spring 2.5 引入了 @Autowired 注释
    @Autowired
    public HomeController(IUserOrderService orderService) {
        this.orderService = orderService;
    }

    //@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)控制类 网页请求
//    RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。用于类上，
//    表示类中的所有响应请求的方法都是以该地址作为父路径。

//    URL路径映射"wel"
    @GetMapping("/wel")
    public String welcome(){
        //实例化接口后,调用接口里面的方法
//        orderService.placeOrder("user_0001", "order_00010", 3000.0);
        return "welcome";
    }
}

