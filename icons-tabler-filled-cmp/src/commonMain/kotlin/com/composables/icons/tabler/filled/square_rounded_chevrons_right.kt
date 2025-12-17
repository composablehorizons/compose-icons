package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareRoundedChevronsRight: ImageVector
    get() {
        if (_SquareRoundedChevronsRight != null) return _SquareRoundedChevronsRight!!
        
        _SquareRoundedChevronsRight = ImageVector.Builder(
            name = "square-rounded-chevrons-right",
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
                moveToRelative(-3.707f, 6.293f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, -0.083f)
                lineToRelative(0.094f, 0.083f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.083f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(2.292f, -2.293f)
                lineToRelative(-2.292f, -2.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                close()
                moveToRelative(4f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, -0.083f)
                lineToRelative(0.094f, 0.083f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.083f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(2.292f, -2.293f)
                lineToRelative(-2.292f, -2.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                close()
            }
        }.build()
        
        return _SquareRoundedChevronsRight!!
    }

private var _SquareRoundedChevronsRight: ImageVector? = null

