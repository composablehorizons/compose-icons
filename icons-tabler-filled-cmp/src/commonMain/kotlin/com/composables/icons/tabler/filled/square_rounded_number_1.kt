package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareRoundedNumber1: ImageVector
    get() {
        if (_SquareRoundedNumber1 != null) return _SquareRoundedNumber1!!
        
        _SquareRoundedNumber1 = ImageVector.Builder(
            name = "square-rounded-number-1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                lineToRelative(0.642f, 0.005f)
                lineToRelative(0.616f, 0.017f)
                lineToRelative(0.299f, 0.013f)
                lineToRelative(0.579f, 0.034f)
                lineToRelative(0.553f, 0.046f)
                curveToRelative(4.687f, 0.455f, 6.65f, 2.333f, 7.166f, 6.906f)
                lineToRelative(0.03f, 0.29f)
                lineToRelative(0.046f, 0.553f)
                lineToRelative(0.041f, 0.727f)
                lineToRelative(0.006f, 0.15f)
                lineToRelative(0.017f, 0.617f)
                lineToRelative(0.005f, 0.642f)
                lineToRelative(-0.005f, 0.642f)
                lineToRelative(-0.017f, 0.616f)
                lineToRelative(-0.013f, 0.299f)
                lineToRelative(-0.034f, 0.579f)
                lineToRelative(-0.046f, 0.553f)
                curveToRelative(-0.455f, 4.687f, -2.333f, 6.65f, -6.906f, 7.166f)
                lineToRelative(-0.29f, 0.03f)
                lineToRelative(-0.553f, 0.046f)
                lineToRelative(-0.727f, 0.041f)
                lineToRelative(-0.15f, 0.006f)
                lineToRelative(-0.617f, 0.017f)
                lineToRelative(-0.642f, 0.005f)
                lineToRelative(-0.642f, -0.005f)
                lineToRelative(-0.616f, -0.017f)
                lineToRelative(-0.299f, -0.013f)
                lineToRelative(-0.579f, -0.034f)
                lineToRelative(-0.553f, -0.046f)
                curveToRelative(-4.687f, -0.455f, -6.65f, -2.333f, -7.166f, -6.906f)
                lineToRelative(-0.03f, -0.29f)
                lineToRelative(-0.046f, -0.553f)
                lineToRelative(-0.041f, -0.727f)
                lineToRelative(-0.006f, -0.15f)
                lineToRelative(-0.017f, -0.617f)
                lineToRelative(-0.004f, -0.318f)
                verticalLineToRelative(-0.648f)
                lineToRelative(0.004f, -0.318f)
                lineToRelative(0.017f, -0.616f)
                lineToRelative(0.013f, -0.299f)
                lineToRelative(0.034f, -0.579f)
                lineToRelative(0.046f, -0.553f)
                curveToRelative(0.455f, -4.687f, 2.333f, -6.65f, 6.906f, -7.166f)
                lineToRelative(0.29f, -0.03f)
                lineToRelative(0.553f, -0.046f)
                lineToRelative(0.727f, -0.041f)
                lineToRelative(0.15f, -0.006f)
                lineToRelative(0.617f, -0.017f)
                curveToRelative(0.21f, -0.003f, 0.424f, -0.005f, 0.642f, -0.005f)
                close()
                moveToRelative(0.994f, 5.886f)
                curveToRelative(-0.083f, -0.777f, -1.008f, -1.16f, -1.617f, -0.67f)
                lineToRelative(-0.084f, 0.077f)
                lineToRelative(-2f, 2f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.226f)
                lineToRelative(0.083f, 0.094f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.226f, 0f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(0.293f, -0.293f)
                verticalLineToRelative(5.586f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-8f)
                lineToRelative(-0.006f, -0.114f)
                close()
            }
        }.build()
        
        return _SquareRoundedNumber1!!
    }

private var _SquareRoundedNumber1: ImageVector? = null

