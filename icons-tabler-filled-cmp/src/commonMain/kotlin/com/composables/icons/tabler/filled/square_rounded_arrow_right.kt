package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareRoundedArrowRight: ImageVector
    get() {
        if (_SquareRoundedArrowRight != null) return _SquareRoundedArrowRight!!
        
        _SquareRoundedArrowRight = ImageVector.Builder(
            name = "square-rounded-arrow-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(-0.218f, 0f, -0.432f, 0.002f, -0.642f, 0.005f)
                lineToRelative(-0.616f, 0.017f)
                lineToRelative(-0.299f, 0.013f)
                lineToRelative(-0.579f, 0.034f)
                lineToRelative(-0.553f, 0.046f)
                curveToRelative(-4.785f, 0.464f, -6.732f, 2.411f, -7.196f, 7.196f)
                lineToRelative(-0.046f, 0.553f)
                lineToRelative(-0.034f, 0.579f)
                curveToRelative(-0.005f, 0.098f, -0.01f, 0.198f, -0.013f, 0.299f)
                lineToRelative(-0.017f, 0.616f)
                lineToRelative(-0.004f, 0.318f)
                lineToRelative(-0.001f, 0.324f)
                curveToRelative(0f, 0.218f, 0.002f, 0.432f, 0.005f, 0.642f)
                lineToRelative(0.017f, 0.616f)
                lineToRelative(0.013f, 0.299f)
                lineToRelative(0.034f, 0.579f)
                lineToRelative(0.046f, 0.553f)
                curveToRelative(0.464f, 4.785f, 2.411f, 6.732f, 7.196f, 7.196f)
                lineToRelative(0.553f, 0.046f)
                lineToRelative(0.579f, 0.034f)
                curveToRelative(0.098f, 0.005f, 0.198f, 0.01f, 0.299f, 0.013f)
                lineToRelative(0.616f, 0.017f)
                lineToRelative(0.642f, 0.005f)
                lineToRelative(0.642f, -0.005f)
                lineToRelative(0.616f, -0.017f)
                lineToRelative(0.299f, -0.013f)
                lineToRelative(0.579f, -0.034f)
                lineToRelative(0.553f, -0.046f)
                curveToRelative(4.785f, -0.464f, 6.732f, -2.411f, 7.196f, -7.196f)
                lineToRelative(0.046f, -0.553f)
                lineToRelative(0.034f, -0.579f)
                curveToRelative(0.005f, -0.098f, 0.01f, -0.198f, 0.013f, -0.299f)
                lineToRelative(0.017f, -0.616f)
                lineToRelative(0.005f, -0.642f)
                lineToRelative(-0.005f, -0.642f)
                lineToRelative(-0.017f, -0.616f)
                lineToRelative(-0.013f, -0.299f)
                lineToRelative(-0.034f, -0.579f)
                lineToRelative(-0.046f, -0.553f)
                curveToRelative(-0.464f, -4.785f, -2.411f, -6.732f, -7.196f, -7.196f)
                lineToRelative(-0.553f, -0.046f)
                lineToRelative(-0.579f, -0.034f)
                arcToRelative(28.058f, 28.058f, 0f, false, false, -0.299f, -0.013f)
                lineToRelative(-0.616f, -0.017f)
                lineToRelative(-0.318f, -0.004f)
                lineToRelative(-0.324f, -0.001f)
                close()
                moveToRelative(0.613f, 5.21f)
                lineToRelative(0.094f, 0.083f)
                lineToRelative(4f, 4f)
                arcToRelative(0.927f, 0.927f, 0f, false, true, 0.097f, 0.112f)
                lineToRelative(0.071f, 0.11f)
                lineToRelative(0.054f, 0.114f)
                lineToRelative(0.035f, 0.105f)
                lineToRelative(0.03f, 0.148f)
                lineToRelative(0.006f, 0.118f)
                lineToRelative(-0.003f, 0.075f)
                lineToRelative(-0.017f, 0.126f)
                lineToRelative(-0.03f, 0.111f)
                lineToRelative(-0.044f, 0.111f)
                lineToRelative(-0.052f, 0.098f)
                lineToRelative(-0.074f, 0.104f)
                lineToRelative(-0.073f, 0.082f)
                lineToRelative(-4f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(2.292f, -2.293f)
                horizontalLineToRelative(-5.585f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(5.585f)
                lineToRelative(-2.292f, -2.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, -0.083f)
                close()
            }
        }.build()
        
        return _SquareRoundedArrowRight!!
    }

private var _SquareRoundedArrowRight: ImageVector? = null

