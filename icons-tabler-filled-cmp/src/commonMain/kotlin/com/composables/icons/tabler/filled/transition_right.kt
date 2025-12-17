package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.TransitionRight: ImageVector
    get() {
        if (_TransitionRight != null) return _TransitionRight!!
        
        _TransitionRight = ImageVector.Builder(
            name = "transition-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 2f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(12f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-12f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                moveToRelative(-8f, 16f)
                arcToRelative(4f, 4f, 0f, true, true, -8f, 0f)
                verticalLineToRelative(-12f)
                arcToRelative(4f, 4f, 0f, true, true, 8f, 0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4.585f)
                lineToRelative(-1.292f, -1.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineToRelative(3f, 3f)
                lineToRelative(0.097f, 0.112f)
                lineToRelative(0.071f, 0.11f)
                lineToRelative(0.031f, 0.062f)
                lineToRelative(0.034f, 0.081f)
                lineToRelative(0.024f, 0.076f)
                lineToRelative(0.03f, 0.148f)
                lineToRelative(0.006f, 0.118f)
                lineToRelative(-0.004f, 0.085f)
                lineToRelative(-0.016f, 0.116f)
                lineToRelative(-0.03f, 0.111f)
                lineToRelative(-0.044f, 0.111f)
                lineToRelative(-0.052f, 0.098f)
                lineToRelative(-0.074f, 0.104f)
                lineToRelative(-0.073f, 0.082f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, -1.414f)
                lineToRelative(1.292f, -1.293f)
                horizontalLineToRelative(-4.585f)
                close()
            }
        }.build()
        
        return _TransitionRight!!
    }

private var _TransitionRight: ImageVector? = null

