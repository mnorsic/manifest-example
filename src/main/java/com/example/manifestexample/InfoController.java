package com.example.manifestexample;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

  @GetMapping
  public ResponseEntity<Map<String, String>> getAppInfo() {
    Map<String, String> response = new HashMap<>();
    response.put("version", getClass().getPackage().getImplementationVersion());
    response.put("title", getClass().getPackage().getImplementationTitle());
    response.put("vendor", getClass().getPackage().getImplementationVendor());

    return ResponseEntity.ok(response);
  }

}
