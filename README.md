
Cumulo Reel
------

> Reel library for Cumulo

### Usage

[![Clojars Project](https://img.shields.io/clojars/v/cumulo/reel.svg)](https://clojars.org/cumulo/reel)

```edn
[cumulo/reel "0.2.0-a1"]
```

Server side:

```clojure
(defonce *reel (atom (merge cumulo-reel.core/reel-schema {:base initial-db, :db initial-db})))

(cumulo-reel.core/reel-reducer @*reel updater op op-data sid op-id op-time)

(reset! *reel (cumulo-reel.core/refresh-reel @*reel initial-db updater))
```

Client side:

```clojure
(cumulo-reel.comp.reel/comp-reel (:reel-length store) {})
```

### Workflow

https://github.com/Cumulo/cumulo-workflow

### License

MIT
