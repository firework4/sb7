package com.example.sb7.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName bss
 */
@TableName(value ="bss")
@Data
public class Bss implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer colId;

    /**
     * 
     */
    private Integer colName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Bss other = (Bss) that;
        return (this.getColId() == null ? other.getColId() == null : this.getColId().equals(other.getColId()))
            && (this.getColName() == null ? other.getColName() == null : this.getColName().equals(other.getColName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getColId() == null) ? 0 : getColId().hashCode());
        result = prime * result + ((getColName() == null) ? 0 : getColName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", colId=").append(colId);
        sb.append(", colName=").append(colName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}