# MusicDsl [Master thesis project, scientific discipline: Domain Specific Modeling and Languages]
## Domain-specific language for sheet music modeling. 
Created domain-specific language simplifies the work with softwares for music composing and makes writing sheet music much easier.

MusicDsl incudes:<br/>
• Ecore metamodel;<br/>
• Textual concrete syntax for creating the language;<br/>
• Generators, which goal is to generate files that have formats that fit sheet music creation and reading softwares;<br/>
• Generated musicxml, mscx and xml files.<br/>

Technologies used:<br/>
• Eclipse Modeling Framework for metamodel development;<br/>
• general purpose OCL language to define model constraints;<br/>
• Xtext framework to create textual concrete syntax;<br/>
• Xtend programing language for generators.<br/>

Metamodel:<br/>

![Metamodel](https://github.com/oliverablagojevic/MusicDsl/blob/master/MusicMetamodel/musicMetamodel.jpg?raw=true "MusicDsl metamodel") </br>

The root concept of abstract syntax is Composition, where the user later enters general information about the composition he is creating (title, author, instrument for which it is intended, etc.). The composition contains line systems (Staff); it can have a maximum of two and this is a limit that could be set in the EMF. Each line system contains a key (Clef), a time value (TimeSignature) and tonality (Key). With some software for creating music scores (e.g. Flat.io) it is possible to enter the time value and tonality only once and it does not change, it remains the same for both keys, while with others for each line system these values are re-entered. (e.g. Sibelius), so the templates are adapted to that when generated. In addition to these three elements, which a line system must have, it also contains an abstract class with its other elements (StaffElement) inherited by Measure, Rest, Repetition, and Note. The types of these elements are listed in the enumeration. The note itself contains ornaments, its articulation and ties, which are located within the concept Notation.
