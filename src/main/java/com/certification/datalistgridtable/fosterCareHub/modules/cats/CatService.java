package com.certification.datalistgridtable.fosterCareHub.modules.cats;

import com.certification.datalistgridtable.fosterCareHub.modules.cats.config.AgeRangeFilter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Stream;


@NoArgsConstructor
public class CatService {

  private static List<Cat> cats;

  public List<Cat> getAllCats() {

    return CatRepo.getAllCatsBigQuantity();
  }

  public Stream<Cat> fetchCallBack_byAgeRangeFilter
       (int offset,
        int limit,
        AgeRangeFilter range) {

    cats = getAllCats();

    Stream<Cat> filteredStream =
         cats
              .stream()
              .filter(cat -> filteringByAgeRange(cat, range))
              .skip(offset)
              .limit(limit);

    return filteredStream;
  }

  public int countCallBack_byAgeRangeFilter
       (int offset,
        int limit,
        AgeRangeFilter range) {

    cats = getAllCats();

    final long count =
         cats
              .stream()
              .filter(cat -> filteringByAgeRange(cat, range))
              .skip(offset)
              .limit(limit)
              .count();

    return (int) count;
  }

  private boolean filteringByAgeRange(Cat cat, AgeRangeFilter range) {

    if (range == null)  return true;

   var age = cat.getAge();
    return range.getMinAge() <= age && range.getMaxAge() >= age;
  }

//    public Stream<Consultant> getPersons(Query<Consultant, Void> query) { List<QuerySortOrder>
//    sorting = query.getSortOrders();
//      QuerySortOrder<String> order1 = sorting.get(9);
//      String propertyName = order1.getSorted();
//      SortDirection direction = order1.getDirection();
//    }


}