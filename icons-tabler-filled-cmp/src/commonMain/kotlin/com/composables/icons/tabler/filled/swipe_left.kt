package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SwipeLeft: ImageVector
    get() {
        if (_SwipeLeft != null) return _SwipeLeft!!
        
        _SwipeLeft = ImageVector.Builder(
            name = "swipe-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 7f)
                arcToRelative(5f, 5f, 0f, true, true, -4.9f, 6.001f)
                lineToRelative(-4.685f, -0.001f)
                lineToRelative(1.292f, 1.293f)
                arcToRelative(1f, 1f, 0f, false, true, 0.083f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.097f, -0.112f)
                lineToRelative(-0.071f, -0.11f)
                lineToRelative(-0.054f, -0.114f)
                lineToRelative(-0.035f, -0.105f)
                lineToRelative(-0.025f, -0.118f)
                lineToRelative(-0.007f, -0.058f)
                lineToRelative(-0.004f, -0.09f)
                lineToRelative(0.003f, -0.075f)
                lineToRelative(0.017f, -0.126f)
                lineToRelative(0.03f, -0.111f)
                lineToRelative(0.044f, -0.111f)
                lineToRelative(0.052f, -0.098f)
                lineToRelative(0.067f, -0.096f)
                lineToRelative(0.08f, -0.09f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 1.414f)
                lineToRelative(-1.292f, 1.293f)
                horizontalLineToRelative(4.685f)
                arcToRelative(5f, 5f, 0f, false, true, 4.9f, -4f)
            }
        }.build()
        
        return _SwipeLeft!!
    }

private var _SwipeLeft: ImageVector? = null

