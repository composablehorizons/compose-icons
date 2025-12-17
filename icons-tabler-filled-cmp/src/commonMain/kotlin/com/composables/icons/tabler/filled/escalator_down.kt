package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.EscalatorDown: ImageVector
    get() {
        if (_EscalatorDown != null) return _EscalatorDown!!
        
        _EscalatorDown = ImageVector.Builder(
            name = "escalator-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.233f, 6f)
                arcToRelative(3f, 3f, 0f, false, true, 2.006f, 0.77f)
                lineToRelative(9.145f, 8.23f)
                horizontalLineToRelative(1.116f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 3.495f, 3.308f)
                lineToRelative(0.005f, 0.192f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -3.5f, 3.5f)
                horizontalLineToRelative(-2.733f)
                arcToRelative(3f, 3f, 0f, false, true, -2.006f, -0.77f)
                lineToRelative(-9.144f, -8.23f)
                horizontalLineToRelative(-1.117f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -3.495f, -3.308f)
                lineToRelative(-0.005f, -0.192f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 3.5f, -3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4.584f)
                lineToRelative(1.293f, -1.291f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, -0.083f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.112f, 0.097f)
                lineToRelative(-0.11f, 0.071f)
                lineToRelative(-0.114f, 0.054f)
                lineToRelative(-0.105f, 0.035f)
                lineToRelative(-0.149f, 0.03f)
                lineToRelative(-0.117f, 0.006f)
                lineToRelative(-0.075f, -0.003f)
                lineToRelative(-0.126f, -0.017f)
                lineToRelative(-0.111f, -0.03f)
                lineToRelative(-0.111f, -0.044f)
                lineToRelative(-0.098f, -0.052f)
                lineToRelative(-0.096f, -0.067f)
                lineToRelative(-0.09f, -0.08f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, true, true, 1.414f, -1.414f)
                lineToRelative(1.293f, 1.293f)
                verticalLineToRelative(-4.586f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _EscalatorDown!!
    }

private var _EscalatorDown: ImageVector? = null

