package com.wzy.easyexcellist.easyexcelwzylist.lister;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 * Copyright (C) [2023/09/08] [wangZiYan/null]
 *
 * Licensed under the [Apache License 2.0] (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     [https://www.apache.org/licenses/LICENSE-2.0]
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


public abstract  class ListenerList<T> extends AnalysisEventListener<T> {

    static  List lists=new CopyOnWriteArrayList();

    @Override
    public void invoke(T t, AnalysisContext analysisContext) {
        lists.add(t);
    }



    public List getList(){
        return (List) lists;
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    }
}
