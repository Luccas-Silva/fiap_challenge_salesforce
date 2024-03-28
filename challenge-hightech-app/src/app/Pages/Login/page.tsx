'use client'
import Image from "next/image";
import Link from "next/link";
import { useForm, SubmitHandler } from "react-hook-form"
import "./Login.css"


export default function Login() {
  const { register, handleSubmit } = useForm()

  function user(date: any) {
    console.log(date)

  }
  
  return (
    <>
      <section className="section_Login">
        <Image src="/assets/salesforce_negativa.svg" width={250} height={250} alt="Logo da Sales Force"/>
        <h1>Login</h1>

        <form onSubmit={handleSubmit(user)} className="form_Login">
          <div className="input-box">
            <label>E-mail do usuário:</label>
            <input type="email" {...register('email')} placeholder="E-mail do usuário"/>
          </div>

          <div className="input-box">
            <label>Senha: <a href="/Pages/Cadastro">Esqueceu sua senha?</a></label>
            
            <input type="password" {...register('password')} placeholder="Senha"/>
          </div>

          <div className="input-box">
              <button type="submit" className="login"><a href="">Fazer Login</a></button>
          </div>
        </form>

        <p>Não é um cliente?</p>
        <button className="login">
          <Link href={"/Pages/Cadastro"} >Cadastrar-se</Link>
        </button> 
      </section>

    </>
  );
}

