import logo from '../../assets/img/logo.svg';
import './styles.css';

function Header() {
    return (
        <>
            <header>
                <div className="dsmeta-logo-container">
                    <img src={logo} alt="DSMeta" />
                    <h1>Sistema</h1>
                    <p>
                        Desenvolvido por
                        <a href="#"> @ferreira._.marcelo</a>
                    </p>
                </div>
            </header>
        </>
    )
}

export default Header;
