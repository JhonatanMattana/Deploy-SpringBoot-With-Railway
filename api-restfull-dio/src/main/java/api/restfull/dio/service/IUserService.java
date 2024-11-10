package api.restfull.dio.service;

import api.restfull.dio.domain.model.User;

public interface IUserService {

    User findById(Long id);

    User create(User user);

}