package entity;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by fangngng on 2016/1/21.
 */
@Entity
@Table(name = "sysdiagrams", schema = "dbo", catalog = "WashRoom")
public class SysdiagramsEntity {
    private String name;
    private int principalId;
    private int diagramId;
    private Integer version;
    private byte[] definition;

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "principal_id", nullable = false, insertable = true, updatable = true)
    public int getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(int principalId) {
        this.principalId = principalId;
    }

    @Id
    @Column(name = "diagram_id", nullable = false, insertable = true, updatable = true)
    public int getDiagramId() {
        return diagramId;
    }

    public void setDiagramId(int diagramId) {
        this.diagramId = diagramId;
    }

    @Basic
    @Column(name = "version", nullable = true, insertable = true, updatable = true)
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Basic
    @Column(name = "definition", nullable = true, insertable = true, updatable = true)
    public byte[] getDefinition() {
        return definition;
    }

    public void setDefinition(byte[] definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysdiagramsEntity that = (SysdiagramsEntity) o;

        if (principalId != that.principalId) return false;
        if (diagramId != that.diagramId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (!Arrays.equals(definition, that.definition)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + principalId;
        result = 31 * result + diagramId;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (definition != null ? Arrays.hashCode(definition) : 0);
        return result;
    }
}
