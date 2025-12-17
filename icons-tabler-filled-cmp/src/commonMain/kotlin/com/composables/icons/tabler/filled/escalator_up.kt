package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.EscalatorUp: ImageVector
    get() {
        if (_EscalatorUp != null) return _EscalatorUp!!
        
        _EscalatorUp = ImageVector.Builder(
            name = "escalator-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.5f, 6f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 7f)
                horizontalLineToRelative(-1.086f)
                lineToRelative(-8.12f, 8.121f)
                arcToRelative(3f, 3f, 0f, false, true, -1.924f, 0.872f)
                lineToRelative(-0.198f, 0.007f)
                horizontalLineToRelative(-3.672f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, -7f)
                horizontalLineToRelative(2.084f)
                lineToRelative(8.123f, -8.121f)
                arcToRelative(3f, 3f, 0f, false, true, 1.923f, -0.872f)
                lineToRelative(0.198f, -0.007f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.5f, 8f)
                horizontalLineToRelative(-2.672f)
                arcToRelative(1f, 1f, 0f, false, false, -0.707f, 0.293f)
                lineToRelative(-8.414f, 8.414f)
                arcToRelative(1f, 1f, 0f, false, true, -0.707f, 0.293f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                horizontalLineToRelative(3.672f)
                arcToRelative(1f, 1f, 0f, false, false, 0.707f, -0.293f)
                lineToRelative(8.414f, -8.414f)
                arcToRelative(1f, 1f, 0f, false, true, 0.707f, -0.293f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.852f, 2.011f)
                lineToRelative(0.058f, -0.007f)
                lineToRelative(0.09f, -0.004f)
                lineToRelative(0.075f, 0.003f)
                lineToRelative(0.126f, 0.017f)
                lineToRelative(0.111f, 0.03f)
                lineToRelative(0.111f, 0.044f)
                lineToRelative(0.098f, 0.052f)
                lineToRelative(0.104f, 0.074f)
                lineToRelative(0.082f, 0.073f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, true, true, -1.414f, 1.414f)
                lineToRelative(-1.293f, -1.292f)
                verticalLineToRelative(4.585f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-4.585f)
                lineToRelative(-1.293f, 1.292f)
                arcToRelative(1f, 1f, 0f, false, true, -1.32f, 0.083f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.414f)
                lineToRelative(3f, -3f)
                quadToRelative(0.053f, -0.054f, 0.112f, -0.097f)
                lineToRelative(0.11f, -0.071f)
                lineToRelative(0.114f, -0.054f)
                lineToRelative(0.105f, -0.035f)
                close()
            }
        }.build()
        
        return _EscalatorUp!!
    }

private var _EscalatorUp: ImageVector? = null

