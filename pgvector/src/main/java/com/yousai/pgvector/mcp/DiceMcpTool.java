package com.yousai.pgvector.mcp;

import java.util.Random;

import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

// @Component 
//  - 우리가 만든 스프링한테 DiceMcpTool 객체 생성해줘!

@Component
public class DiceMcpTool {
  // 외부 gpt,클로드, 코파일럿 연결하기 위해서! 사용!
  // @McpTool(name = "roll_dice", description = "주사위를 굴려서 1~6사이의 랜덤한 숫자를 반환한다.")

  @Tool(name = "roll_dice", description = "주사위를 굴려서 1~6사이의 랜덤한 숫자를 반환한다.")
  public int rollDice() {
    Random 랜덤도구 = new Random();

    int 결과 = 랜덤도구.nextInt(6) + 1;
    System.out.println("주사위 랜덤값:" + 결과);

    // AI한테 돌려준다.
    return 결과;
  }
}
