'use client'
import Image from "next/image";
import "./Footer.css"
import Link from "next/link";


export default function Footer() {
  return (
    <>
      <footer>
        <div className="footer_content">
            <Image className="footer_content_img" src="/assets/Logos.svg" width={100} height={100} alt=""/>
            <ul className="footer_list">
                <li><Link href="/Pages/DevTeams" target="_blank">Dev Teams</Link></li>
                <li><Link href="/Pages/Organograma" target="_blank">Organograma</Link></li>
                <li><Link href="https://github.com/Luccas-Silva/fiap_challenge_salesforce" target="_blank">GitHub</Link></li>
            </ul>
        </div>
        <div className="footer_copyright"> &#169; 2023 all rights reserved.</div>
    </footer>
    </>
  );
}
