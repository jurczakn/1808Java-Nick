import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent implements OnInit {

  title = 'Data Binding';

  interpolationNotation = '{{}}';

  twoWayValue = '';

  objectStyle = {
    color: 'purple',
    border: '40px solid green',
    cursor: 'pointer',
    margin: '12px',
    backgroundColor: 'orange',
    fontSize: '70px'
  };

  counter = 0;

  public changeStyles(): void {
    if (this.objectStyle.color === 'purple') {
      this.objectStyle.color = 'yellow';
      this.objectStyle.backgroundColor = 'black';
      this.objectStyle.border = '30px solid grey';
    } else if (this.objectStyle.color === 'yellow') {
      this.objectStyle.color = 'pink';
      this.objectStyle.backgroundColor = 'brown';
      this.objectStyle.border = '20px solid aquamarine';
    } else if (this.objectStyle.color === 'pink') {
      this.objectStyle.color = 'purple';
      this.objectStyle.backgroundColor = 'orange';
      this.objectStyle.border = '40px solid green';
    }
  }

  public addToCounter() {
    this.counter++;
  }

  public clearInput() {
    this.twoWayValue = '';
  }

  constructor() { }

  ngOnInit() {
  }



}
