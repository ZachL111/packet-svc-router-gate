fun main() {
    val signalcase_1 = Signal(83, 87, 20, 13, 5)
    check(Policy.score(signalcase_1) == 191)
    check(Policy.classify(signalcase_1) == "accept")
    val signalcase_2 = Signal(89, 86, 19, 11, 12)
    check(Policy.score(signalcase_2) == 254)
    check(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(81, 74, 16, 25, 12)
    check(Policy.score(signalcase_3) == 176)
    check(Policy.classify(signalcase_3) == "accept")
    val domainReview = DomainReview(59, 39, 15, 83)
    check(DomainReviewLens.score(domainReview) == 195)
    check(DomainReviewLens.lane(domainReview) == "ship")
}
