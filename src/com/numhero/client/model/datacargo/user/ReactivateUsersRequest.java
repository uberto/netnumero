package com.numhero.client.model.datacargo.user;

import com.numhero.shared.datacargo.BulkActionRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class ReactivateUsersRequest extends BulkActionRequest {

    public ReactivateUsersRequest() {
        setCommand(ApplicationCommandEnum.CommandReactivateUsers);
    }
}