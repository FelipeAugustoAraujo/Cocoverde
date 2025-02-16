package br.com.lisetech.cocoverde.service.criteria;

import java.io.Serializable;
import java.util.Objects;
import org.springdoc.core.annotations.ParameterObject;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.*;

/**
 * Criteria class for the {@link br.com.lisetech.cocoverde.domain.Configuracao} entity. This class is used
 * in {@link br.com.lisetech.cocoverde.web.rest.ConfiguracaoResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /configuracaos?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
@ParameterObject
@SuppressWarnings("common-java:DuplicatedBlocks")
public class ConfiguracaoCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private Boolean distinct;

    public ConfiguracaoCriteria() {}

    public ConfiguracaoCriteria(ConfiguracaoCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.distinct = other.distinct;
    }

    @Override
    public ConfiguracaoCriteria copy() {
        return new ConfiguracaoCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public LongFilter id() {
        if (id == null) {
            id = new LongFilter();
        }
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final ConfiguracaoCriteria that = (ConfiguracaoCriteria) o;
        return Objects.equals(id, that.id) && Objects.equals(distinct, that.distinct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ConfiguracaoCriteria{" +
            (id != null ? "id=" + id + ", " : "") +
            (distinct != null ? "distinct=" + distinct + ", " : "") +
            "}";
    }
}
