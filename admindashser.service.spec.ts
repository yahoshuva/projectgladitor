import { TestBed } from '@angular/core/testing';

import { AdmindashserService } from './admindashser.service';

describe('AdmindashserService', () => {
  let service: AdmindashserService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdmindashserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
