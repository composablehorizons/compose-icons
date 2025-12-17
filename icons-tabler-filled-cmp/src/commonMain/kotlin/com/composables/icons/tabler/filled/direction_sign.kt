package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.DirectionSign: ImageVector
    get() {
        if (_DirectionSign != null) return _DirectionSign!!
        
        _DirectionSign = ImageVector.Builder(
            name = "direction-sign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.52f, 2.614f)
                arcToRelative(2.095f, 2.095f, 0f, false, true, 2.835f, -0.117f)
                lineToRelative(0.126f, 0.117f)
                lineToRelative(7.905f, 7.905f)
                curveToRelative(0.777f, 0.777f, 0.816f, 2.013f, 0.117f, 2.836f)
                lineToRelative(-0.117f, 0.126f)
                lineToRelative(-7.905f, 7.905f)
                arcToRelative(2.094f, 2.094f, 0f, false, true, -2.836f, 0.117f)
                lineToRelative(-0.126f, -0.117f)
                lineToRelative(-7.907f, -7.906f)
                arcToRelative(2.096f, 2.096f, 0f, false, true, -0.115f, -2.835f)
                lineToRelative(0.117f, -0.126f)
                lineToRelative(7.905f, -7.905f)
                close()
                moveToRelative(5.969f, 9.535f)
                lineToRelative(0.01f, -0.116f)
                lineToRelative(-0.003f, -0.12f)
                lineToRelative(-0.016f, -0.114f)
                lineToRelative(-0.03f, -0.11f)
                lineToRelative(-0.044f, -0.112f)
                lineToRelative(-0.052f, -0.098f)
                lineToRelative(-0.076f, -0.105f)
                lineToRelative(-0.07f, -0.081f)
                lineToRelative(-3.5f, -3.5f)
                lineToRelative(-0.095f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, false, -1.226f, 0f)
                lineToRelative(-0.094f, 0.083f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.226f)
                lineToRelative(0.083f, 0.094f)
                lineToRelative(1.792f, 1.793f)
                horizontalLineToRelative(-5.085f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(5.085f)
                lineToRelative(-1.792f, 1.793f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 1.403f, 1.403f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(0.097f, -0.112f)
                lineToRelative(0.05f, -0.074f)
                lineToRelative(0.037f, -0.067f)
                lineToRelative(0.05f, -0.112f)
                lineToRelative(0.023f, -0.076f)
                lineToRelative(0.025f, -0.117f)
                close()
            }
        }.build()
        
        return _DirectionSign!!
    }

private var _DirectionSign: ImageVector? = null

