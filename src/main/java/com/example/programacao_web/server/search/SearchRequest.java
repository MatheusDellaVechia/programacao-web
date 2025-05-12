package com.example.programacao_web.server.search;

import com.example.programacao_web.server.search.filter.SearchFilter;
import com.example.programacao_web.server.search.sort.SearchSort;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchRequest {

    @Builder.Default
    private List<SearchFilter> filters = new ArrayList<>();

    @Builder.Default
    private SearchSort sort = new SearchSort("id", SearchSort.Type.ASC);

    @Builder.Default
    private Integer page = 0;

    @Builder.Default
    private Integer rows = 50;
}