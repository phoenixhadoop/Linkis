/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.wedatasphere.linkis.database.service;

import com.webank.wedatasphere.linkis.database.domain.View;

import java.util.List;
/**
 * Created by shanhuang on 9/13/18.
 */
public interface ViewService {

    List<View> find(String name, String owner);

    View getById(Integer id);

    void create(View view, String userName) throws Exception;

    void update(View view, String userName) throws Exception;

    void delete(Integer id) throws Exception;

}
