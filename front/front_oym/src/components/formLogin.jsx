export const FormLogin = () => {
    const formStyle = {
        display: 'flex',
        flexDirection: 'column',
        maxWidth: '300px',
        margin: 'auto',
    };

    const inputStyle = {
        marginBottom: '10px',
        padding: '8px',
        fontSize: '16px',
    };
    return(
        <div>
            <form action="" className="FormRegister" style={formStyle}>
                <input type="text" placeholder="Nombre" style={inputStyle} />
                <input type="text" placeholder="Apellido" style={inputStyle} />
                <input type="email" placeholder="Correo electrónico" style={inputStyle} />
                <input type="password" placeholder="Contraseña" style={inputStyle} />
                <button type="submit" style={{ padding: '10px', fontSize: '16px' }}>Enviar</button>
            </form>
        </div>
    )
    
};
