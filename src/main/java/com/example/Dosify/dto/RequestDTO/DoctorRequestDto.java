package com.example.Dosify.dto.RequestDTO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import com.example.Dosify.Enum.Gender;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class DoctorRequestDto {
    int centerId;

    String name;
    int age;
    String emailId;
    String mobNo;
    Gender gender;
}
