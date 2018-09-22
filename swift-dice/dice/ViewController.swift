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
        
        updateImages()
    }
    
    @IBAction func rollButtonPressed(_ sender: UIButton) {
        updateImages()
    }
    
    private func updateImages() {
        diceImageView1.image = createImage(index: random())
        diceImageView2.image = createImage(index: random())
    }
    
    private func random() -> Int {
        return Int.random(in: 0 ... 5)
    }
    
    private func createImage(index: Int) -> UIImage {
        return UIImage(named: images[index])!
    }

}

