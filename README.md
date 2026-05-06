# packet-svc-router-gate

`packet-svc-router-gate` keeps a focused Kotlin implementation around backend services. The project goal is to design a Kotlin verification harness for router systems, covering protocol validation, framed sample traffic, and failure-oriented tests.

## Problem It Tries To Make Smaller

This is intentionally local and self-contained so it can be inspected without credentials, services, or seeded history.

## Packet Svc Router Gate Review Notes

`stress` and `recovery` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## Working Pieces

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/packet-svc-router-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `retry load` and `session drift`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Design Notes

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The added Kotlin path is deliberately direct, with fixtures doing most of the explaining.

## Example Run

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

That command is also the regression path. It verifies the domain cases and catches mismatches between the CSV, metadata, and code.

## Known Limits

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
