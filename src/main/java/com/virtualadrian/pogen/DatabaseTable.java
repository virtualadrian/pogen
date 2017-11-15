package com.virtualadrian.pogen;

/**
 * The type Database table.
 */
public class DatabaseTable {

    public DatabaseTable(){}

    public DatabaseTable(String tableName) {
        this.tableName = tableName;
    }

    /**
     * TABLE_CAT String => table catalog (may be null)
     */
    String catalog;

    /**
     * TABLE_SCHEM String => table schema (may be null)
     */
    String schema;

    /**
     * TABLE_NAME String => table name
     */
    String tableName;

    /**
     * TABLE_TYPE String => table type. Typical types are "TABLE", "VIEW", "SYSTEM TABLE", "GLOBAL TEMPORARY", "LOCAL TEMPORARY", "ALIAS", "SYNONYM".
     */
    String tableType;

    /**
     * REMARKS String => explanatory comment on the table
     */
    String remarks;

    /**
     * TYPE_CAT String => the types catalog (may be null)
     */
    String typesCatalog;

    /**
     * TYPE_SCHEM String => the types schema (may be null)
     */
    String typeSchema;

    /**
     * TYPE_NAME String => type name (may be null)
     */
    String typeName;

    /**
     * SELF_REFERENCING_COL_NAME String => name of the designated "identifier" column of a typed table (may be null)
     */
    String selfReferencingColumnName;

    /**
     * REF_GENERATION String => specifies how values in SELF_REFERENCING_COL_NAME are created.
     * Values are "SYSTEM", "USER", "DERIVED". (may be null)
     */
    String referenceGeneration;

    /**
     * Gets catalog.
     *
     * @return the catalog
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * Sets catalog.
     *
     * @param catalog the catalog
     */
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * Gets schema.
     *
     * @return the schema
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets schema.
     *
     * @param schema the schema
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * Gets table name.
     *
     * @return the table name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets table name.
     *
     * @param tableName the table name
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * Gets table type.
     *
     * @return the table type
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * Sets table type.
     *
     * @param tableType the table type
     */
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    /**
     * Gets remarks.
     *
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets remarks.
     *
     * @param remarks the remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * Gets types catalog.
     *
     * @return the types catalog
     */
    public String getTypesCatalog() {
        return typesCatalog;
    }

    /**
     * Sets types catalog.
     *
     * @param typesCatalog the types catalog
     */
    public void setTypesCatalog(String typesCatalog) {
        this.typesCatalog = typesCatalog;
    }

    /**
     * Gets type schema.
     *
     * @return the type schema
     */
    public String getTypeSchema() {
        return typeSchema;
    }

    /**
     * Sets type schema.
     *
     * @param typeSchema the type schema
     */
    public void setTypeSchema(String typeSchema) {
        this.typeSchema = typeSchema;
    }

    /**
     * Gets type name.
     *
     * @return the type name
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets type name.
     *
     * @param typeName the type name
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * Gets self referencing column name.
     *
     * @return the self referencing column name
     */
    public String getSelfReferencingColumnName() {
        return selfReferencingColumnName;
    }

    /**
     * Sets self referencing column name.
     *
     * @param selfReferencingColumnName the self referencing column name
     */
    public void setSelfReferencingColumnName(String selfReferencingColumnName) {
        this.selfReferencingColumnName = selfReferencingColumnName;
    }

    /**
     * Gets reference generation.
     *
     * @return the reference generation
     */
    public String getReferenceGeneration() {
        return referenceGeneration;
    }

    /**
     * Sets reference generation.
     *
     * @param referenceGeneration the reference generation
     */
    public void setReferenceGeneration(String referenceGeneration) {
        this.referenceGeneration = referenceGeneration;
    }
}
