export class HubRetweeter {

  id: number;
  created_at: Date;
  updated_at: Date;
  location: string;
  name: string;
  numberOfEdges: number;
  score: number;
  screenName: string;

  constructor(id: number, created_at: Date, updated_at: Date, location: string, name: string, numberOfEdges: number, score: number, screenName: string){
    this.id = id;
    this.created_at = created_at;
    this.updated_at = updated_at;
    this.location = location;
    this.name = name;
    this.numberOfEdges = numberOfEdges;
    this.score = score;
    this.screenName = screenName;
  }

}
