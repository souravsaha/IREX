
package common;

/**
 *
 * @author dwaipayan
 */
public class DocField {

    /**
     * TREC ad hoc text collection.
     */
    /**
     * The unique document id of each of the documents.
     */
    static final public String FIELD_ID = "docid";
//    static final public String FIELD_ID = "id";
    /**
     * The analyzed content of each of the documents.
     */
    static final public String FIELD_BOW = "content";
//    static final public String FIELD_BOW = "words";
    /**
     * Analyzed full content (including tag informations): Mainly used for WT10G initial retrieval.
     */
    static final public String FIELD_FULL_BOW = "full-content";

    /**
     * The meta content, that is removed from the the full-content to get the cleaned-content.
     */
    static final public String FIELD_META = "meta-content";
    
    
/**
 * **** Washington Post data set used in TREC-News track **** *
 *
 */
    /**
     * Unique document id.
     */
    static final public String WAPO_DOCID = "docid";

    /**
     * URL of the article.
     */
    static final public String WAPO_URL = "url";

    /**
     * Title of the news.
     */
    static final public String WAPO_TITLE = "title";

    /**
     * Author of the article.
     */
    static final public String WAPO_AUTHOR = "author";

    /**
     * Publication date of the article.
     */
    static final public String WAPO_DATE = "date";

    /**
     * Content of the article.
     */
    static final public String WAPO_CONTENT = "contents";

    /**
     * Category of the news article.
     */
    static final public String WAPO_CATEGORY = "category";

}
