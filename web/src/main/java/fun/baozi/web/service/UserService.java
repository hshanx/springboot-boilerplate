package fun.baozi.web.service;

import fun.baozi.core.domain.page.PageBean;
import fun.baozi.web.data.dto.UserList;
import fun.baozi.web.domain.modals.UserRegister;
import fun.baozi.web.web.res.ListUserRs;
import fun.baozi.web.web.res.RegisterUserRs;

/**
 * 用户接口.
 *
 * @author baozi
 * 2020-07-15
 */
public interface UserService {

    /**
     * Register User.
     *
     * @param user user register body
     * @return register user response
     */
    RegisterUserRs register(UserRegister user);

    /**
     * Query user list.
     *
     * @param user query user list param
     * @return user list
     */
    PageBean<ListUserRs> userList(UserList user);
}
