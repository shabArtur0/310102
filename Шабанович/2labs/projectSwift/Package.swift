// swift-tools-version: 6.0
// The swift-tools-version declares the minimum version of Swift required to build this package.

import PackageDescription
// swift-tools-version: 6.0
// The swift-tools-version declares the minimum version of Swift required to build this package.

let package = Package(

    name: "projectSwift",

    products: [

        // Products define the executables and libraries a package produces, making them visible to other packages.

        .executable(

            name: "main",

            targets: ["projectSwift"])

    ],

    targets: [

        // Targets are the basic building blocks of a package, defining a module or a test suite.

        // Targets can depend on other targets in this package and products from dependencies.

        .target(

            name:"projectSwift", 

            dependencies: []),

        .testTarget(

            name: "projectSwiftTests",

            dependencies: ["projectSwift"])

    ]

)
