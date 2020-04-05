package contracts.RestaurantCategoryEndPoints

import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            request {
                name("requestCreateRestaurantCategoryWithAllMandatoryParametersShouldReturnOK")
                method POST()
                url("/api/restaurant-category")
                body([
                        name       : $(anyNonBlankString()),
                        description: $(anyNonBlankString())
                ])
                headers {
                    contentType(applicationJson())
                    header 'X-Correlation-Id': $(anyNonBlankString())
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
        },
        Contract.make {
            request {
                name("requestGetCategoryWithAllMandatoryParametersShouldReturnOK")
                method GET()
                url("/api/restaurant-category")
                headers {
                    contentType(applicationJson())
                    header 'X-Correlation-Id': $(anyNonBlankString())
                }
            }
            response {
                status OK()
                headers {
                    contentType applicationJson()
                }
                body([
                        id  : $(anyPositiveInt()),
                        name: $(anyNonBlankString())
                ]
                )
            }
        }
]