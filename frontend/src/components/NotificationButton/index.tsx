import icon from '../../assets/img/notificacao-icon.svg';
import axios from 'axios';
import { BASE_URL } from '../../utils/request';

import './styles.css';

type Props = {
    saleId: number;
}

function handleClick(id: number) {
    axios(`${BASE_URL}/sales/notification/${id}`)
        .then(response => {
            alert('SUCESSO');
        });
}


function NotificationButton({ saleId }: Props) {

    return (
        <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
            <img src={icon} alt="Notificar" />
        </div>
    )
}

export default NotificationButton;
