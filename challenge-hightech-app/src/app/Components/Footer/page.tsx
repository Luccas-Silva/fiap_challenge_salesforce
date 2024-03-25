'use client'
import Image from "next/image";
import "./Footer.css"


export default function Footer() {
  return (
    <>
      <footer>
        <div className="footer_content">
            <Image className="footer_content_img" src="/assets/Logos.svg" width={100} height={100} alt=""/>
            <ul className="footer_list">
                <li><a href="" target="_blank">Dev Teams</a></li>
                <li><a href="" target="_blank">GitHub</a></li>
            </ul>
        </div>
        <div className="footer_copyright"> &#169; 2023 all rights reserved.</div>
    </footer>
    </>
  );
}
