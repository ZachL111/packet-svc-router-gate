# Packet Svc Router Gate Walkthrough

The fixture is intentionally compact, so the review starts with the cases that pull farthest apart.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 195 | ship |
| stress | retry load | 281 | ship |
| edge | worker slack | 194 | ship |
| recovery | session drift | 180 | ship |
| stale | queue pressure | 271 | ship |

Start with `stress` and `recovery`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `retry load` against `session drift`, not the raw score alone.
