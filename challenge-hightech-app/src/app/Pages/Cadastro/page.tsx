'use client'
import Image from "next/image";
import { useForm, SubmitHandler } from "react-hook-form"
import Link from "next/link";
import "./Cadastro.css";

export default function Cadastro() {
  const { register, handleSubmit } = useForm()

  function createUser(date: any) {
    console.log(date)

  }

  return (
    <>
      <section className="section_Cadastro">
        <Image src="/assets/salesforce_negativa.svg" width={250} height={250} alt="Logo da Sales Force"/>
        <h1>Cadastro</h1>

        <form onSubmit={handleSubmit(createUser)} className="form_Cadastro">
          <div className="input-box">
            <label>E-mail: </label>
            <input type="email" {...register('email')} placeholder="E-mail do usuário"/>
          </div>

          <div className="input-box">
            <label>Nome: </label>
            <input type="text" {...register('nome')} placeholder="Nome do usuário"/>
          </div>

          <div className="input-box">
            <label>Cargo: </label>
            <input type="text" {...register('cargo')} placeholder="Cargo do usuário"/>
          </div>

          <div className="input-box">
            <label>Telefone: </label>
            <input type="tel" {...register('tel')} placeholder="Telefone do usuário"/>
            <small>Format: (99)99999-9999</small>
          </div>

          <div className="input-box">
            <label>Senha: </label>
            <input type="password" {...register('password')} placeholder="Senha"/>
          </div>
        </form>

        <button className="login">
          <Link href={"/"}>Finalizar Cadastro</Link>
        </button> 
      </section>
      
      
    </>
  );
}
