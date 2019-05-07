package com.tanmayvijayvargiya.AuthService.connectors;

import com.tanmayvijayvargiya.AuthService.model.User;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service")
@RibbonClient(name= "user-service")
public interface UserConnector {
  @GetMapping("/v1/user")
  public User getUserFromUsername(@RequestParam("username") String username);
}

/**
 * @FeignClient(name="forex-service" url="localhost:8000")
 * public interface CurrencyExchangeServiceProxy {
 *   @GetMapping("/currency-exchange/from/{from}/to/{to}")
 *   public CurrencyConversionBean retrieveExchangeValue
 *     (@PathVariable("from") String from, @PathVariable("to") String to);
 * }
 */