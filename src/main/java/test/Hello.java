package test;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

@Tag("demo-hello")
@JsModule("./src/hello.ts")
public class Hello extends LitTemplate {
}
