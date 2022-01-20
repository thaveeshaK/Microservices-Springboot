package me.thaveesha.UserService.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.thaveesha.UserService.entity.User;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {


    private User user;
    private Department department;

    public User getUser() {
        return user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
