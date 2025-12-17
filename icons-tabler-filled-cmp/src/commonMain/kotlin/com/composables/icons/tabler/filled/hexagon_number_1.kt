package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.HexagonNumber1: ImageVector
    get() {
        if (_HexagonNumber1 != null) return _HexagonNumber1!!
        
        _HexagonNumber1 = ImageVector.Builder(
            name = "hexagon-number-1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.425f, 1.414f)
                arcToRelative(3.33f, 3.33f, 0f, false, true, 3.216f, 0f)
                lineToRelative(6.775f, 3.995f)
                curveToRelative(0.067f, 0.04f, 0.127f, 0.084f, 0.18f, 0.133f)
                lineToRelative(0.008f, 0.007f)
                lineToRelative(0.107f, 0.076f)
                arcToRelative(3.223f, 3.223f, 0f, false, true, 1.284f, 2.39f)
                lineToRelative(0.005f, 0.203f)
                verticalLineToRelative(7.284f)
                curveToRelative(0f, 1.175f, -0.643f, 2.256f, -1.623f, 2.793f)
                lineToRelative(-6.804f, 4.302f)
                curveToRelative(-0.98f, 0.538f, -2.166f, 0.538f, -3.2f, -0.032f)
                lineToRelative(-6.695f, -4.237f)
                arcToRelative(3.226f, 3.226f, 0f, false, true, -1.678f, -2.826f)
                verticalLineToRelative(-7.285f)
                arcToRelative(3.21f, 3.21f, 0f, false, true, 1.65f, -2.808f)
                close()
                moveToRelative(0.952f, 5.803f)
                lineToRelative(-0.084f, 0.076f)
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
                curveToRelative(-0.083f, -0.777f, -1.008f, -1.16f, -1.617f, -0.67f)
                close()
            }
        }.build()
        
        return _HexagonNumber1!!
    }

private var _HexagonNumber1: ImageVector? = null

