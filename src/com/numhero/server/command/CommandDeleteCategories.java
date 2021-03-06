package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.category.DeleteCategoriesRequest;
import com.numhero.server.model.daolite.CategoryDao;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

import static com.numhero.server.utils.BulkCommandUtils.deleteIdList;

public class CommandDeleteCategories extends AbstractAuthenticatedCommand<DeleteCategoriesRequest, BulkActionResponse> {

    @Inject
    CategoryDao dao;

    @Override
    public BulkActionResponse execute(DeleteCategoriesRequest deleteCategoriesRequest) throws Exception {
        BulkActionResponse resp = new BulkActionResponse();
        List<Long> ids = deleteCategoriesRequest.getEntityIdList();
        deleteIdList(resp, ids, dao);
        return resp;
    }
}
