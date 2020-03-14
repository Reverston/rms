package contracts.RestaurantContracts

import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            request {
                name("requestWithAllMandatoryParametersShouldReturnOK")
                method POST()
                url("/api/add-restaurant")
                body([
                        name               : $(anyNonBlankString()),
                        category           : $(anyNonBlankString()),
                        hotline            : [
                                countryCode: $(anyNonBlankString()),
                                number     : $(anyNonBlankString())
                        ],
                        summary            : $(anyNonBlankString()),
                        startedDate        : $(anyNonBlankString()),
                        ownerId            : $(anyPositiveInt()),
                        address            : [
                                street      : $(anyNonBlankString()),
                                postalCode  : $(anyNonBlankString()),
                                addressLine1: $(anyNonBlankString()),
                                addressLine2: $(anyNonBlankString())
                        ],
                        contacts           : [[
                                                      countryCode: $(anyNonBlankString()),
                                                      number     : $(anyNonBlankString())
                                              ]],
                        location           : [
                                lat: $(anyNonBlankString()),
                                lon: $(anyNonBlankString())
                        ],
                        parkingAvailability: $(anyBoolean()),
                        openingHours       : [[
                                                      day        : $(regex("(MONDAY|SUNDAY|TUESDAY|WEDNESDAY|THURSDAY|FRIDAY|SATURDAY)")),
                                                      openingTime: $(anyNonBlankString()),
                                                      closingTime: $(anyNonBlankString())
                                              ]]
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
                        name: $(anyNonBlankString()),
                        category: $(anyNonBlankString()),
                        hotLine: $(anyNonBlankString())
                )
            }
        }
]