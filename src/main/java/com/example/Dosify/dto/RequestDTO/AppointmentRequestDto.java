package com.example.Dosify.dto.RequestDTO;


import com.example.Dosify.Enum.VaccineType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import com.example.Dosify.Enum.DoseNo;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class AppointmentRequestDto
{

    DoseNo doseNo;
    int userId;
    int doctorId;

    VaccineType vaccineType;

}
