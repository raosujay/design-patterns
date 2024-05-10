# Design Patterns

| Design Pattern               | Use Case                                                                                        | Real-Life Example                                                                                                    |
| ---------------------------- | ----------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| Singleton Pattern            | Ensure only one instance of a class exists and provide global access to it.                     | Configuration Manager in a software application, ensuring only one configuration instance exists throughout.         |
| Factory Method Pattern       | Delegate the instantiation logic to subclasses while controlling which subclass to instantiate. | GUI Frameworks creating different types of buttons (e.g., Windows button, macOS button) based on the platform.       |
| Builder Pattern              | Construct complex objects with many optional parameters or multiple construction paths.         | HTML builder for generating complex web pages with various elements and attributes.                                   |
| Prototype & Registry Pattern | Create new instances by copying an existing instance and maintain a registry of prototypes.     | Prototyping in architecture, where a model house is replicated with variations and stored for future reference.       |
| Adapter Pattern              | Make two incompatible interfaces compatible without altering existing code.                     | Power adapter converting voltage from one standard to another, allowing a device to be used in different regions.    |
| Decorator Pattern            | Add behavior or responsibilities to objects dynamically and transparently.                      | Coffee shop allowing customers to customize their orders with options like whipped cream, syrup, or extra shot.      |
| Observer Pattern             | Establish one-to-many dependencies between objects to notify and update dependents.             | Stock market application notifying users when the price of a stock they are following changes.                        |
| Strategy Pattern             | Define a family of algorithms, encapsulate each, and make them interchangeable.                 | Payment processing system allowing different payment methods like credit card, PayPal, or bank transfer interchangeably. |
| Facade Pattern               | Simplify a complex subsystem by providing a unified interface.                                   | Online shopping website providing a single interface for users to browse, add to cart, and checkout various products. |
| Flyweight Pattern            | Minimize memory usage and improve performance by sharing common parts of state between objects. | Graphic design software reusing commonly used shapes (e.g., circles, squares) across multiple designs.               |

Learning Materials:

1.[https://refactoring.guru/design-patterns](https://refactoring.guru/design-patterns)
2. [Design Patterns](https://www.coursera.org/learn/design-patterns)

Additional Notes:

For user creation and password management, a combination of several design patterns might be employed depending on the specific requirements and architecture of the system. However, one commonly used design pattern for managing authentication and user-related functionality is the **Facade Pattern**.

Here's how the Facade Pattern can be applied:

1. **Facade Pattern**:
   - **Use Case**: The Facade Pattern provides a unified interface to a set of interfaces in a subsystem, simplifying their usage. In the context of user creation and password management, the Facade can encapsulate the complex interactions between different components such as user registration, authentication, password hashing, and password validation.
   - **Example**: Let's say you have a `UserManagementFacade` class that provides methods like `registerUser()`, `authenticateUser()`, `changePassword()`, etc. Internally, this facade class coordinates with other classes responsible for handling user creation, password hashing, database interactions, and authentication. Clients interact with the facade, which shields them from the complexities of the underlying subsystems.

In addition to the Facade Pattern, other design patterns might also be used:

- **Singleton Pattern**: This could be used for components such as a password hashing service or a user authentication service to ensure there is only one instance, providing global access to these services.
- **Builder Pattern**: For creating complex user objects with various optional parameters during the user creation process.
- **Strategy Pattern**: For handling different password hashing strategies or authentication strategies depending on security requirements.
- **Observer Pattern**: To notify other parts of the system when a user is successfully registered or when a password is changed.

?descriptionFromFileType=function+toLocaleUpperCase()+{+[native+code]+}+File&mimeType=application/octet-stream&fileName=Design+Patterns.md&fileType=undefined&fileExtension=md
