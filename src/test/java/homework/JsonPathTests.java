package homework;

import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.jayway.jsonpath.Criteria.where;

public class JsonPathTests {
    private String json = """
            {
                "store": {
                    "book": [
                        {
                            "category": "reference",
                            "author": "Nigel Rees",
                            "title": "Sayings of the Century",
                            "price": 8.95
                        },
                        {
                            "category": "fiction",
                            "author": "Evelyn Waugh",
                            "title": "Sword of Honour",
                            "price": 12.99
                        },
                        {
                            "category": "fiction",
                            "author": "Herman Melville",
                            "title": "Moby Dick",
                            "isbn": "0-553-21311-3",
                            "price": 8.99
                        },
                        {
                            "category": "fiction",
                            "author": "J. R. R. Tolkien",
                            "title": "The Lord of the Rings",
                            "isbn": "0-395-19395-8",
                            "price": 22.99
                        }
                    ],
                    "bicycle": {
                        "color": "red",
                        "price": 19.95
                    }
                },
                "expensive": 10
            }
            """;

    @Test
    public void jsonPathTest() {
        //Map<String, Object> result = JsonPath.read(json, "$.store.book[0].price");
        //Double result = JsonPath.read(json, "$.store.book[0].price");
        //ArrayList<String> result = JsonPath.read(json, "$.store.book[*].author");
        //ArrayList<String> result = JsonPath.read(json, "$..book[0,1].author");
        //Double result = JsonPath.read(json, "$..book[*].price.sum()");
        //Set<String> result = JsonPath.read(json, "$.store.book[1].keys()");
        //ArrayList<Object> result = JsonPath.read(json, "$..[?(@.price > 10)].price");
        //ArrayList<Object> result = JsonPath.read(json, "$..book[0,1][?(@.price > 10)].price");
        //ArrayList<Object> result = JsonPath.read(json, "$..book[?(@.title =~ /.*of.*/i)][?(@.price > 10)].title");
        //String result = "" + JsonPath.read(json, "$..book.size()");
        //String result = "" + JsonPath.read(json, "$..book[?(@.category in ['reference'])]");
        //ArrayList<Object> result = JsonPath.read(json, "$..book[?(@.price < $.expensive)]");

//        Predicate filter = new Predicate() {
//            @Override
//            public boolean apply(PredicateContext predicateContext) {
//                return (Double) predicateContext.item(Map.class).get("price") < 10;
//            }
//        };
//        ArrayList<Object> result = JsonPath.read(json, "$..book[?].price", filter);

        Filter filter = Filter.filter(where("price").lte(10));
        ArrayList<Object> result = JsonPath.read(json, "$..book[?].price", filter);

        System.out.printf(result.toString());
    }
}
