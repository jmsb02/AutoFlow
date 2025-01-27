package com.travellog.autoflow.test.controller.docs;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "healthCheck", description = "HealthCheck API")
public interface TestControllerDocs {

    @Operation(
            summary = "초기 HealthCheck 컨트롤러",
            description = "Elastic Beanstalk의 Health Check를 위한 컨트롤러"
    )
    @ApiResponses(value = {
            @ApiResponse(
                    description = "헬스 체크 성공",
                    responseCode = "200"
            ),
            @ApiResponse(
                    description = """
                <발생 가능한 에러 케이스>
                                
                1. 서버가 정상적으로 응답하지 않을 때 (서버 다운 또는 네트워크 문제)
                                
                2. 잘못된 요청: 요청 헤더 또는 파라미터가 누락되었거나 유효하지 않음
                                
                3. 서버 과부하: 현재 요청을 처리할 수 없는 상태
                                
                4. 내부 서버 오류: 예기치 못한 오류로 인해 응답 실패
                """,
                    responseCode = "500"
            )
    })
    ResponseEntity<String> healthCheck();
}

