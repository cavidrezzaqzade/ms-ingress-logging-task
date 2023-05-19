package az.ingress.msingressloggingtask.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author caci
 */

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    private String name;
}
