package ch.eia.simulife.views.choice;

import ch.eia.simulife.controllers.GameController;
import ch.eia.simulife.games.Game;
import ch.eia.simulife.games.Listable;
import ch.eia.simulife.games.executions.Execution;
import ch.eia.simulife.models.GameModel;
import ch.eia.simulife.views.View;

public enum ChoiceState {
	CHOICE_GAME {
		@Override
		public void updateReference(Listable listable, ChoiceView vChoice) {
			vChoice.setChoiceState(CHOICE_VIEW);
			GameModel.INSTANCE.setGame((Game) listable);
			vChoice.switchSelectionView();
		}
	},
	CHOICE_VIEW {
		@Override
		public void updateReference(Listable listable, ChoiceView vChoice) {
			vChoice.setChoiceState(CHOICE_EXECUTION);
			GameController.INSTANCE.setView((View) listable);
			vChoice.switchSelectionExecution();
		}
	},
	CHOICE_EXECUTION {
		@Override
		public void updateReference(Listable listable, ChoiceView vChoice) {
			vChoice.setChoiceState(END);
			GameModel.INSTANCE.getGame().setExecution((Execution) listable);
			vChoice.switchStartGame();
		}
	},
	END {
		@Override
		public void updateReference(Listable listable, ChoiceView vChoice) {
		}
	};

	public abstract void updateReference(Listable listable, ChoiceView vChoice);
}
