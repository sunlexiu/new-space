package com.warrior.mercury.model.param;

import com.warrior.mercury.common.exception.BusinessCode;
import com.warrior.mercury.common.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

import static com.warrior.mercury.common.ConstantSymbol.EMPTY_SPACE;
import static java.util.regex.Pattern.CASE_INSENSITIVE;

/**
 * @author:       Charon
 * @create:       2020/6/11 22:34
 */
public class BasePage implements Page {

    private static final String DEFAULT_ORDER = "asc";

    private static final String ORDER_PATTERN_STRING = "^asc|desc$";

    private static final String sort_pattern_string = "^[a-zA-Z]\\w*$";

    private static final Pattern ORDER_PATTERN = Pattern.compile(ORDER_PATTERN_STRING, CASE_INSENSITIVE);

    private static final Pattern SORT_PATTERN = Pattern.compile(sort_pattern_string, CASE_INSENSITIVE);

    private int page = 0;

    private int size = 10;

    private String sort;

    private String order;

    @Override
    public String orderBy() {
        if (StringUtils.isBlank(sort)) {
            return null;
        }

        if (StringUtils.isBlank(order)) {
            order = DEFAULT_ORDER;
        }

        return sort.concat(EMPTY_SPACE).concat(order);
    }

    public void setSort(String sort) {
        if (!SORT_PATTERN.matcher(sort).matches()) {
            throw new BusinessException(BusinessCode.PARAM_ERROR, "invalid param: sort=" + sort);
        }
        this.sort = sort;
    }

    public void setOrder(String order) {
        if (!ORDER_PATTERN.matcher(order).matches()) {
            throw new BusinessException(BusinessCode.PARAM_ERROR, "invalid param: order=" + order);
        }
        this.order = order;
    }

    @Override
    public int page() {
        return page;
    }

    @Override
    public int size() {
        return size;
    }

    public void setPage(int page) {
        if (page < 0) {
            throw new BusinessException(BusinessCode.PARAM_ERROR, "invalid param: page=" + page);
        }
        this.page = page;
    }

    public void setSize(int size) {
        if (size < 0 || size > 100) {
            throw new BusinessException(BusinessCode.PARAM_ERROR,
                    "invalid param: size=" + size + ", size must be between 0 and 100!");
        }
        this.size = size;
    }
}
