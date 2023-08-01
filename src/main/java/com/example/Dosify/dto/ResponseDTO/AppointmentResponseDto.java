package com.example.Dosify.dto.ResponseDTO;

import com.example.Dosify.Enum.VaccineType;
import com.example.Dosify.dto.RequestDTO.CenterRequestDto;
import lombok.*;
import lombok.experimental.FieldDefaults;
import com.example.Dosify.Enum.DoseNo;
import java.util.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Builder
public class AppointmentResponseDto {
    String userName;
    String appointmentNo;
    Date dateOfAppointment;

    DoseNo doseNo;

    CenterResponseDto centerResponseDto;
    String doctorName;

    VaccineType vaccineType;
}
