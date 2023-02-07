# **ESpin**
## 1. Description
ESpin is a tool which aims to verify and analyze the behaviors of envent-driven systems using model checking techniques. We propose a method using a domain-specific language (DSL) for describing the behaviors of the system with the corresponding peroperties to be verified. This language provides a high-level support for the succinct specification of the behaviors of the system, the configurations to indicate the initial states of the system, the scenariors which the events can be happend, the rules and/or the CTL/RTCTL properties to be verified and analyzed.

The tool is implemented based on the SpinJa model checker (a re-implementation of the core of Spin in Java). There are three main components in this tool: a converter, a compiler, and an analysis. We implement the DSL and the converter under XText framework. The specification of an event-driven system in the DSL is the input of this tool. This specification is then used to generate the Promela program by the converter. The compiler will compile this program into a model in Java. The analysis component will explore the state of the system to build the system graph then and label this graph to produce the results of the analysis.

## 2. Source code
1. _\modelchecker: The model checking tool
1. _\schedulingDSL.parent: The DSL implemented in XText
1. _\Experiments: Some small examples for the experiment


See [1] for the short description of the approach and the language
The full definition (and implementation) of the language is in _\schedulingDSL.parent directory


----------------------------------------
[1] Tran, N.H.: A specication-based approach to model checking event-driven systems.
In: Proceedings of the Tenth International Symposium on Information and Communication Technology. pp. 449-456 (2019)

