package lk.ijse.dep10.assignmentpractice2.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    @NotBlank(message = "User Name Can not be null")
    private String userName;
    @NotBlank(message = "Password can not be null")
    private String password;
}
