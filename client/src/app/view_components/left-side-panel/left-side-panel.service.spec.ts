import { TestBed, inject } from '@angular/core/testing';

import { LeftSidePanelService } from './left-side-panel.service';

describe('LeftSidePanelService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [LeftSidePanelService]
    });
  });

  it('should be created', inject([LeftSidePanelService], (service: LeftSidePanelService) => {
    expect(service).toBeTruthy();
  }));
});
