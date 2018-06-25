package com.github.kiddaedalus.presentation

import org.two.js.Two
import kotlin.browser.document
import kotlin.math.roundToLong

/**
 * Create an anchor point at the origin
 */
fun anchor(): Two.Anchor = anchor(0.0, 0.0)
/**
 * Convenience function for making an anchor. Sets the control points for each vertex directly on the vertex itself
 */
fun anchor(x: Double, y: Double, command: Two.Commands = Two.Commands.line): Two.Anchor =
        Two.Anchor(x,y,x,y,x,y,command)

/**
 * For some reason setting opacity through the usual property doesn't work
 */
var Two.Path.svgOpacity: Double
    get() {
        val element = document.getElementById(this.id)
        return element?.getAttribute("fill-opacity")?.toDouble() ?: 0.0

    }
    set(value) {
        // Try to keep the two.js model in sync with the view
        this.opactiy = value
        val element = document.getElementById(this.id)
        element?.setAttribute("fill-opacity", value.toString())
    }