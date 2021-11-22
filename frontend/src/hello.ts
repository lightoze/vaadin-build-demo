import { css, customElement, html, LitElement } from 'lit-element';

@customElement('demo-hello')
export class Hello extends LitElement {

  static get styles() {
    return css`
    `;
  }

  render() {
    return html`
      <div>Hello, world!</div>
    `;
  }

}
