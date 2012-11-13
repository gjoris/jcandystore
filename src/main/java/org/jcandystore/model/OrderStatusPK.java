/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jcandystore.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author alexismp
 */
@Embeddable
public class OrderStatusPK implements Serializable {
	private static final long serialVersionUID = -6642891915524295111L;
	@Basic(optional = false)
    @Column(name = "ORDER_ID", nullable = false)
    private int orderId;
    @Basic(optional = false)
    @Column(name = "LINE_NUM", nullable = false)
    private int lineNum;

    public OrderStatusPK() {
    }

    public OrderStatusPK(int orderId, int lineNum) {
        this.orderId = orderId;
        this.lineNum = lineNum;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getLineNum() {
        return lineNum;
    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) orderId;
        hash += (int) lineNum;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderStatusPK)) {
            return false;
        }
        OrderStatusPK other = (OrderStatusPK) object;
        if (this.orderId != other.orderId) {
            return false;
        }
        if (this.lineNum != other.lineNum) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.candyentities.OrderStatusPK[ orderId=" + orderId + ", lineNum=" + lineNum + " ]";
    }
    
}
