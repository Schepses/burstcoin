/*
 * This file is generated by jOOQ.
*/
package brs.schema.tables;


import brs.schema.Db;
import brs.schema.Indexes;
import brs.schema.Keys;
import brs.schema.tables.records.PurchasePublicFeedbackRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PurchasePublicFeedback extends TableImpl<PurchasePublicFeedbackRecord> {

    private static final long serialVersionUID = -1605263846;

    /**
     * The reference instance of <code>DB.purchase_public_feedback</code>
     */
    public static final PurchasePublicFeedback PURCHASE_PUBLIC_FEEDBACK = new PurchasePublicFeedback();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PurchasePublicFeedbackRecord> getRecordType() {
        return PurchasePublicFeedbackRecord.class;
    }

    /**
     * The column <code>DB.purchase_public_feedback.db_id</code>.
     */
    public final TableField<PurchasePublicFeedbackRecord, Long> DB_ID = createField("db_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>DB.purchase_public_feedback.id</code>.
     */
    public final TableField<PurchasePublicFeedbackRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.purchase_public_feedback.public_feedback</code>.
     */
    public final TableField<PurchasePublicFeedbackRecord, String> PUBLIC_FEEDBACK = createField("public_feedback", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>DB.purchase_public_feedback.height</code>.
     */
    public final TableField<PurchasePublicFeedbackRecord, Integer> HEIGHT = createField("height", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DB.purchase_public_feedback.latest</code>.
     */
    public final TableField<PurchasePublicFeedbackRecord, Boolean> LATEST = createField("latest", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false));

    /**
     * Create a <code>DB.purchase_public_feedback</code> table reference
     */
    public PurchasePublicFeedback() {
        this(DSL.name("purchase_public_feedback"), null);
    }

    /**
     * Create an aliased <code>DB.purchase_public_feedback</code> table reference
     */
    public PurchasePublicFeedback(String alias) {
        this(DSL.name(alias), PURCHASE_PUBLIC_FEEDBACK);
    }

    /**
     * Create an aliased <code>DB.purchase_public_feedback</code> table reference
     */
    public PurchasePublicFeedback(Name alias) {
        this(alias, PURCHASE_PUBLIC_FEEDBACK);
    }

    private PurchasePublicFeedback(Name alias, Table<PurchasePublicFeedbackRecord> aliased) {
        this(alias, aliased, null);
    }

    private PurchasePublicFeedback(Name alias, Table<PurchasePublicFeedbackRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Db.DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PURCHASE_PUBLIC_FEEDBACK_PRIMARY, Indexes.PURCHASE_PUBLIC_FEEDBACK_PURCHASE_PUBLIC_FEEDBACK_ID_HEIGHT_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PurchasePublicFeedbackRecord, Long> getIdentity() {
        return Keys.IDENTITY_PURCHASE_PUBLIC_FEEDBACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PurchasePublicFeedbackRecord> getPrimaryKey() {
        return Keys.KEY_PURCHASE_PUBLIC_FEEDBACK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PurchasePublicFeedbackRecord>> getKeys() {
        return Arrays.<UniqueKey<PurchasePublicFeedbackRecord>>asList(Keys.KEY_PURCHASE_PUBLIC_FEEDBACK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PurchasePublicFeedback as(String alias) {
        return new PurchasePublicFeedback(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PurchasePublicFeedback as(Name alias) {
        return new PurchasePublicFeedback(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PurchasePublicFeedback rename(String name) {
        return new PurchasePublicFeedback(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PurchasePublicFeedback rename(Name name) {
        return new PurchasePublicFeedback(name, null);
    }
}
