package com.islam.farhad.collectionConcept.set

class ProductCatalogueTest extends GroovyTestCase {


    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception {

        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue, containsInAnyOrder( door, floorPanel));


    }

    @Test
    public void shouldOnlyFindLightVanProducts() throws Exception {

        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue, containsInAnyOrder( door, floorPanel));


    }

}
