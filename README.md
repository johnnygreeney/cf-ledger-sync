<div align="center">

[![Clean, Build](https://github.com/cardano-foundation/cf-ledger-sync/actions/workflows/build.yml/badge.svg)](https://github.com/cardano-foundation/cf-ledger-sync/actions/workflows/build.yml)
[![CodeQL](https://github.com/cardano-foundation/cf-ledger-sync/actions/workflows/codeql.yml/badge.svg)](https://github.com/cardano-foundation/cf-ledger-sync/actions/workflows/codeql.yml)
[![License](https://img.shields.io:/github/license/cardano-foundation/cf-ledger-sync?color=blue&label=license)](https://github.com/cardano-foundation/cf-ledger-sync/blob/master/LICENSE)

</div>

## Overview

Ledger Sync is a Java application designed to provide efficient access to Cardano blockchain data.

Released under an open-source licence, Ledger Sync aims to achieve the same data completeness as Cardano DB Sync while offering flexibility and customizations for developers. By addressing challenges in blockchain data retrieval and offering a reliable Java-based solution, Ledger Sync enhances accessibility to blockchain-related data, supporting diverse projects and fostering Cardano's open-source maturity.

Ongoing developments include improving functionality, such as parallel processing during initial sync, scoping indexing, rewards data, governance off-chain data, granular pattern matching filtering, etc providing blueprints for various development scenarios, with the Foundation encouraging community engagement and contributions to further enhance Ledger Sync's capabilities.

https://github.com/user-attachments/assets/1304ada3-2cf3-46b2-8de8-cb4293e791b4

### Modules

1. **Ledger Sync**: This is the main indexer application that reads data from the Cardano blockchain and writes to a PostgreSQL database.

2. **Ledger Sync - Scheduler App**: This is an optional application for scheduling jobs in Ledger Sync. By default, specific Ledger Sync schedule jobs are executed as part of the main Ledger Sync application, but you can also run them independently with this application.

3. **Ledger Sync - Streaming App:** This app reads data from a Cardano node and publishes blockchain data to messaging middleware like Kafka or RabbitMQ. It publishes blockchain data in the form of events. There are various types of events that can be published by the streaming app, but you can configure which events you want to publish. This is useful when you want to listen to blockchain events but build your own storage layer. For more details about Streaming App, please check here

4. **Ledger Sync - Aggregation App:** This app delivers aggregated data (eg. address balance), facilitating easy analysis and interpretation. This data is collected separately from the main app and can be stored in a dedicated or in the same schema as the main app. This provides a flexibility for independently sync without impacting the main app sync.

## Documentation

Check out [**Ledger Sync documentation site**](https://cardano-foundation.github.io/cf-ledger-sync/) for more information.

## Building from source

### Prerequisites
- Java 21
- Cardano Node or connection to a remote Cardano node
- PostgreSQL database

### Build JAR
```bash
git clone https://github.com/cardano-foundation/cf-ledger-sync
cd cf-ledger-sync
./gradlew clean build -x test
```

### Contributing to Ledger Sync
We love your input! We want to make contributing to this project as easy and transparent as possible, whether it's:

- Reporting a bug
- Discussing the current state of the code
- Submitting a fix
- Proposing new features

Please check the details [here](https://github.com/cardano-foundation/cf-ledger-sync/blob/main/CONTRIBUTING.md).
