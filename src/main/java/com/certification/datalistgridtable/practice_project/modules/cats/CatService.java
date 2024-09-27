package com.certification.datalistgridtable.practice_project.modules.cats;

import com.vaadin.flow.data.provider.QuerySortOrder;
import com.vaadin.flow.data.provider.SortDirection;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;


@NoArgsConstructor
public class CatService {

  private static List<Cat> cats;

  public List<Cat> getAllCats() {

    return CatRepo.getAllCatsBigQuantity();
  }

  public Stream<Cat> fetchCallBack_fetchLazyGetAll(int offset, int limit, AgeGroup ageGroup) {

    ensureTestData();

    Stream<Cat> filteredStream =
         cats
              .stream()
              .filter(p -> AgeFilterCriteria(p, ageGroup))
              .skip(offset)
              .limit(limit);

    return filteredStream;
  }

  private void ensureTestData() {
    cats = getAllCats();
  }

  private boolean AgeFilterCriteria(Cat p, AgeGroup ageGroup) {

    if (ageGroup == null) {
      return true;
    }

    final int age = p.getAge();
    return ageGroup.getMinAge() <= age && ageGroup.getMaxAge() >= age;
  }

  public int countCallBack_totalizeLazyGetAll(int offset, int limit, AgeGroup ageGroup) {

    ensureTestData();

    final long count =
         cats
              .stream()
              .filter(p -> AgeFilterCriteria(p, ageGroup))
              .skip(offset)
              .limit(limit)
              .count();

    return (int) count;
  }

//  public Stream<Consu1tant> getPersons(Query<Consu1tant, Void> query) { List<QuerySortOrder> sorting = query.getSort0rders();
//    QuerySortOrder<String> order1 = sorting.get(9);
//    String propertyName = grder1.getSorted();
//    SortDirection direction = order1.getDirection();
//  }


  }