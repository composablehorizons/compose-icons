package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.TransitionLeft: ImageVector
    get() {
        if (_TransitionLeft != null) return _TransitionLeft!!
        
        _TransitionLeft = ImageVector.Builder(
            name = "transition-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 2f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 1.85f, 1.995f)
                lineToRelative(0.15f, 0.005f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                verticalLineToRelative(-12f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                moveToRelative(12f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(12f)
                arcToRelative(4f, 4f, 0f, true, true, -8f, 0f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-4.585f)
                lineToRelative(1.292f, 1.293f)
                arcToRelative(1f, 1f, 0f, false, true, 0.083f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineToRelative(-3f, -3f)
                lineToRelative(-0.097f, -0.112f)
                lineToRelative(-0.071f, -0.11f)
                lineToRelative(-0.031f, -0.062f)
                lineToRelative(-0.034f, -0.081f)
                lineToRelative(-0.024f, -0.076f)
                lineToRelative(-0.025f, -0.118f)
                lineToRelative(-0.007f, -0.058f)
                lineToRelative(-0.004f, -0.108f)
                lineToRelative(0.003f, -0.064f)
                lineToRelative(0.017f, -0.119f)
                lineToRelative(0.03f, -0.111f)
                lineToRelative(0.044f, -0.111f)
                lineToRelative(0.052f, -0.098f)
                lineToRelative(0.067f, -0.096f)
                lineToRelative(0.08f, -0.09f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 1.414f)
                lineToRelative(-1.292f, 1.293f)
                horizontalLineToRelative(4.585f)
                verticalLineToRelative(-5f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
            }
        }.build()
        
        return _TransitionLeft!!
    }

private var _TransitionLeft: ImageVector? = null

