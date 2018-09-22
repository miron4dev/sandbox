//
//  ViewController.swift
//  swift sandbox
//
//  Created by Evgeny Mironenko on 09/09/2018.
//  Copyright © 2018 Evgeny Mironenko. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var diceImageView1: UIImageView!
    @IBOutlet weak var diceImageView2: UIImageView!
    
    private let images = ["dice1", "dice2", "dice3", "dice4", "dice5", "dice6"]
    
    override func viewDidLoad() {
        super.viewDidLoad()
    }
    
    @IBAction func rollButtonPressed(_ sender: UIButton) {
        let randomIndex1 = Int.random(in: 0 ... 5)
        let randomIndex2 = Int.random(in: 0 ... 5)
        
        diceImageView1.image = UIImage(named: images[randomIndex1])
        diceImageView2.image = UIImage(named: images[randomIndex2])
    }
}

