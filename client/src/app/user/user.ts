export class User {
 
  id: number;
  username: string;
  fullname: string;
  email: string;
 
  constructor(id: number, username: string, fullname: string, email: string){
    this.id = id;
    this.username = username;
    this.fullname = fullname;
    this.email = email;
  }
 
}
