package contracts.RestaurantCategoryEndPoints

import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            request {
                name("requestCreateRestaurantCategoryWithAllMandatoryParametersShouldReturnOK")
                method POST()
                url("/api/add-restaurant-category")
                body([
                        name       : $(anyNonBlankString()),
                        description: $(anyNonBlankString())
                ])
                headers {
                    contentType(applicationJson())
                    header 'CorrelationId': $(anyNonBlankString())
                }
            }
            response {
                status OK()
                headers {
                    contentType applicationJson()
                }
                body(
                        id: $(anyPositiveInt()),
                        name: $(anyNonBlankString())
                )
            }
        }
]