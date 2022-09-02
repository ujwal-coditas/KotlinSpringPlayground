package com.ujwal.learning.controller

import com.ujwal.learning.model.GenericResponse
import com.ujwal.learning.model.LoginRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController {

    @PostMapping("login")
    fun loginWithOtp(@RequestBody loginRequest: LoginRequest) : GenericResponse {
        return GenericResponse("Otp sent to ${loginRequest.mobileNumber}")
    }

}