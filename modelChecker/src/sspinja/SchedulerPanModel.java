package sspinja;
import sspinja.Run;

import spinja.util.DataReader;
import spinja.util.DataWriter;
import spinja.promela.model.*;
import spinja.exceptions.*;
import sspinja.scheduler.promela.model.*;
import sspinja.scheduling.SchedulerObject;

public class SchedulerPanModel extends SchedulerPromelaModel {


	public static void main(String[] args) {
		//scheduler DFS
		Run run = new Run(6);
		run.parseArguments(args,"SchedulerPan");
		if (SchedulerPanModel.scheduler.InitSchedulerObject(run.scheduleropt.getOption()))
		run.search(SchedulerPanModel.class);
	}


	public SchedulerPanModel() throws SpinJaException {
		super("SchedulerPan", 1);

		// Initialize the default values
		// Initialize the starting processes
	}

	public void encode(DataWriter _writer) {
		scheduler.encode(_writer);
		_writer.writeByte(_nrProcs);
		int _i = 0 ;
		int _pcount = 0 ;
		while (_pcount < _nrProcs && _i < 255) {
			if (_procs[_i] != null && SchedulerObject.processInScheduler[_i]) {
				_procs[_i].encode(_writer);
				_pcount++;
			}
			_i++;
		}
	}

	public boolean decode(DataReader _reader) {
		scheduler.decode(_reader) ; 
		_nrProcs = _reader.readByte();

		int _start = _reader.getMark();
		for(int _i = 0; _i < _nrProcs; _i++) {
			_reader.storeMark();
			if(SchedulerObject.processInScheduler[_i]) {
				if(_procs[_i] == null || !_procs[_i].decode(_reader)) { // change local variables
					_reader.resetMark();
					switch(_reader.peekByte()) {
						case 0: _procs[_i] = new P1_0(true, _i); break;
						case 1: _procs[_i] = new P2_0(true, _i); break;
						default: return false;
					}
					if(!_procs[_i].decode(_reader)) return false;
				}
			}
		}
		_process_size = _reader.getMark() - _start;
		//updateProcessListInScheduler(_nrProcs) ;
		return true;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("+ SchedulerPanModel: \n");
		for(int i = 0; i < _nrProcs; i++) {
		  sb.append('\n').append(_procs[i]);
		}
		for(int i = 0; i < _nrChannels; i++) {
		  sb.append('\n').append(_channels[i]);
		}
		return sb.toString();
	}

	public int getChannelCount() {
		return 0;
	}

	public class P1_0 extends PromelaProcess {

		public P1_0(boolean decoding, int pid) {
			super(SchedulerPanModel.this, pid, new State[20], 0);

			PromelaTransitionFactory factory;
			factory = 
				new PromelaTransitionFactory(true, 42, 0, 1, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[0] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 43, 1, 2, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[1] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 44, 2, 3, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[2] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 45, 3, 4, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[3] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 46, 4, 5, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[4] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 47, 5, 6, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[5] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 48, 6, 7, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[6] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 49, 7, 8, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[7] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 50, 8, 9, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[8] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 51, 9, 10, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[9] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 52, 10, 11, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[10] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 53, 11, 12, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[11] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 54, 12, 13, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[12] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 55, 13, 14, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[13] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 56, 14, 15, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[14] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 57, 15, 16, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[15] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 58, 16, 17, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[16] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 59, 17, 18, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[17] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 60, 18, 19, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[18] = new State(P1_0.this, factory, false, false, false);

			factory = 
				new EndTransitionFactory(61);
			_stateTable[19] = new State(P1_0.this, factory, true, false, false);

		}

		public P1_0() throws ValidationException {
			this(false, _nrProcs);

		}

		public int getSize() {
		  return 2;
		}

		public void encode(DataWriter _writer) {
			_writer.writeByte(0x0);
			_writer.writeByte(_sid);
		}

		public boolean decode(DataReader _reader) {
			if(_reader.readByte() != 0x0) return false;
			_sid = _reader.readByte();
			return true;
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			if(_exclusive ==  _pid) sb.append("<atomic>");
			sb.append("P1_0 (" +  _pid + "," + _sid + "): ");
			return sb.toString();
		}

		public String getName() {
			return "P1" ;
		}

		public int getChannelCount() {
			return 0;
		}
	}

	public class P2_0 extends PromelaProcess {

		public P2_0(boolean decoding, int pid) {
			super(SchedulerPanModel.this, pid, new State[22], 0);

			PromelaTransitionFactory factory;
			factory = 
				new PromelaTransitionFactory(true, 62, 0, 1, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[0] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 63, 1, 2, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[1] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 64, 2, 3, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[2] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 65, 3, 4, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[3] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 66, 4, 5, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[4] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 67, 5, 6, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[5] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 68, 6, 7, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[6] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 69, 7, 8, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[7] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 70, 8, 9, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[8] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 71, 9, 10, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[9] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 72, 10, 11, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[10] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 73, 11, 12, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[11] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 74, 12, 13, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[12] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 75, 13, 14, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[13] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 76, 14, 15, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[14] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 77, 15, 16, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[15] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 78, 16, 17, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[16] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 79, 17, 18, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[17] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 80, 18, 19, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[18] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 81, 19, 20, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[19] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new PromelaTransitionFactory(true, 82, 20, 21, "skip") {
					public final PromelaTransition newTransition() {
						return new NonAtomicTransition() {
							public final void undoImpl() {
								//undo statement
							}
						};
					}
				};
			_stateTable[20] = new State(P2_0.this, factory, false, false, false);

			factory = 
				new EndTransitionFactory(83);
			_stateTable[21] = new State(P2_0.this, factory, true, false, false);

		}

		public P2_0() throws ValidationException {
			this(false, _nrProcs);

		}

		public int getSize() {
		  return 2;
		}

		public void encode(DataWriter _writer) {
			_writer.writeByte(0x1);
			_writer.writeByte(_sid);
		}

		public boolean decode(DataReader _reader) {
			if(_reader.readByte() != 0x1) return false;
			_sid = _reader.readByte();
			return true;
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			if(_exclusive ==  _pid) sb.append("<atomic>");
			sb.append("P2_0 (" +  _pid + "," + _sid + "): ");
			return sb.toString();
		}

		public String getName() {
			return "P2" ;
		}

		public int getChannelCount() {
			return 0;
		}
	}
	public String sysGet(String va) {
		String result = "";
		switch (va) {
		}
		return result ;
	}
}
