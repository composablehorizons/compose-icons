package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareRoundedArrowLeft: ImageVector
    get() {
        if (_SquareRoundedArrowLeft != null) return _SquareRoundedArrowLeft!!
        
        _SquareRoundedArrowLeft = ImageVector.Builder(
            name = "square-rounded-arrow-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                lineToRelative(0.324f, 0.001f)
                lineToRelative(0.318f, 0.004f)
                lineToRelative(0.616f, 0.017f)
                lineToRelative(0.299f, 0.013f)
                lineToRelative(0.579f, 0.034f)
                lineToRelative(0.553f, 0.046f)
                curveToRelative(4.785f, 0.464f, 6.732f, 2.411f, 7.196f, 7.196f)
                lineToRelative(0.046f, 0.553f)
                lineToRelative(0.034f, 0.579f)
                curveToRelative(0.005f, 0.098f, 0.01f, 0.198f, 0.013f, 0.299f)
                lineToRelative(0.017f, 0.616f)
                lineToRelative(0.005f, 0.642f)
                lineToRelative(-0.005f, 0.642f)
                lineToRelative(-0.017f, 0.616f)
                lineToRelative(-0.013f, 0.299f)
                lineToRelative(-0.034f, 0.579f)
                lineToRelative(-0.046f, 0.553f)
                curveToRelative(-0.464f, 4.785f, -2.411f, 6.732f, -7.196f, 7.196f)
                lineToRelative(-0.553f, 0.046f)
                lineToRelative(-0.579f, 0.034f)
                curveToRelative(-0.098f, 0.005f, -0.198f, 0.01f, -0.299f, 0.013f)
                lineToRelative(-0.616f, 0.017f)
                lineToRelative(-0.642f, 0.005f)
                lineToRelative(-0.642f, -0.005f)
                lineToRelative(-0.616f, -0.017f)
                lineToRelative(-0.299f, -0.013f)
                lineToRelative(-0.579f, -0.034f)
                lineToRelative(-0.553f, -0.046f)
                curveToRelative(-4.785f, -0.464f, -6.732f, -2.411f, -7.196f, -7.196f)
                lineToRelative(-0.046f, -0.553f)
                lineToRelative(-0.034f, -0.579f)
                arcToRelative(28.058f, 28.058f, 0f, false, true, -0.013f, -0.299f)
                lineToRelative(-0.017f, -0.616f)
                curveToRelative(-0.003f, -0.21f, -0.005f, -0.424f, -0.005f, -0.642f)
                lineToRelative(0.001f, -0.324f)
                lineToRelative(0.004f, -0.318f)
                lineToRelative(0.017f, -0.616f)
                lineToRelative(0.013f, -0.299f)
                lineToRelative(0.034f, -0.579f)
                lineToRelative(0.046f, -0.553f)
                curveToRelative(0.464f, -4.785f, 2.411f, -6.732f, 7.196f, -7.196f)
                lineToRelative(0.553f, -0.046f)
                lineToRelative(0.579f, -0.034f)
                curveToRelative(0.098f, -0.005f, 0.198f, -0.01f, 0.299f, -0.013f)
                lineToRelative(0.616f, -0.017f)
                curveToRelative(0.21f, -0.003f, 0.424f, -0.005f, 0.642f, -0.005f)
                close()
                moveToRelative(0.707f, 5.293f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-4f, 4f)
                arcToRelative(1.037f, 1.037f, 0f, false, false, -0.2f, 0.284f)
                lineToRelative(-0.022f, 0.052f)
                arcToRelative(0.95f, 0.95f, 0f, false, false, -0.06f, 0.222f)
                lineToRelative(-0.008f, 0.067f)
                lineToRelative(-0.002f, 0.063f)
                verticalLineToRelative(-0.035f)
                verticalLineToRelative(0.073f)
                arcToRelative(1.034f, 1.034f, 0f, false, false, 0.07f, 0.352f)
                lineToRelative(0.023f, 0.052f)
                lineToRelative(0.03f, 0.061f)
                lineToRelative(0.022f, 0.037f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, 0.05f, 0.074f)
                lineToRelative(0.024f, 0.03f)
                lineToRelative(0.073f, 0.082f)
                lineToRelative(4f, 4f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -0.083f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                lineToRelative(-2.292f, -2.293f)
                horizontalLineToRelative(5.585f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                horizontalLineToRelative(-5.585f)
                lineToRelative(2.292f, -2.293f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                close()
            }
        }.build()
        
        return _SquareRoundedArrowLeft!!
    }

private var _SquareRoundedArrowLeft: ImageVector? = null

