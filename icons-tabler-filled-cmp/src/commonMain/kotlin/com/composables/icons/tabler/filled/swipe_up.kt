package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SwipeUp: ImageVector
    get() {
        if (_SwipeUp != null) return _SwipeUp!!
        
        _SwipeUp = ImageVector.Builder(
            name = "swipe-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.852f, 3.011f)
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
                lineToRelative(0.001f, 4.685f)
                arcToRelative(5.002f, 5.002f, 0f, false, true, -1.001f, 9.9f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, -5f)
                lineToRelative(0.005f, -0.217f)
                arcToRelative(5f, 5f, 0f, false, true, 3.995f, -4.683f)
                verticalLineToRelative(-4.685f)
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
        
        return _SwipeUp!!
    }

private var _SwipeUp: ImageVector? = null

