package edu.cmucdu.ecommerce.domain.product;

import edu.cmucdu.ecommerce.domain.util.Description;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
public class Promotion {
    @OneToOne(cascade = CascadeType.ALL)
    private SellerProduct product;

    @OneToOne(cascade = CascadeType.ALL)
    private Description description;

    private double percentDiscount;

    private double absoluteDiscount;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date stopDate;
}
