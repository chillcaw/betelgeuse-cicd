package io.nology.betelgeusecicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/math")
public class MathController {
  // 1. Defining Path rules, data arguments
  // 2. Define DTOs
  // 3. Validate DTOs
  // 4. Consolidate argument data (queries, path variables)
  // 5. issue appropriate responses
  // 6. delegating where data should go (what services we are using, what methods we are using)
  
  @GetMapping(value = "/rectanglePerimeter/{height}/{width}")
  public Float rectanglePerimeter(@PathVariable Float height, @PathVariable Float width) {
    return (height + width) * 2;
  }
  
  @GetMapping(value = "circleArea/{radius}")
  public Float circleArea(@PathVariable Float radius) {
    return (float) (3.14 * Math.pow(radius, 2)); 
  }
}
