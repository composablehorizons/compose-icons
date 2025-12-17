package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.TransitionBottom: ImageVector
    get() {
        if (_TransitionBottom != null) return _TransitionBottom!!
        
        _TransitionBottom = ImageVector.Builder(
            name = "transition-bottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 17f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineToRelative(-12f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 1.995f, -1.85f)
                lineToRelative(0.005f, -0.15f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                moveToRelative(-9f, 1f)
                lineToRelative(-0.082f, -0.004f)
                lineToRelative(-0.119f, -0.016f)
                lineToRelative(-0.111f, -0.03f)
                lineToRelative(-0.111f, -0.044f)
                lineToRelative(-0.098f, -0.052f)
                lineToRelative(-0.096f, -0.067f)
                lineToRelative(-0.09f, -0.08f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, -1.414f)
                lineToRelative(1.293f, 1.293f)
                verticalLineToRelative(-4.586f)
                horizontalLineToRelative(-5f)
                arcToRelative(4f, 4f, 0f, true, true, 0f, -8f)
                horizontalLineToRelative(12f)
                arcToRelative(4f, 4f, 0f, true, true, 0f, 8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(4.583f)
                lineToRelative(1.293f, -1.29f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, -0.083f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-3f, 3f)
                lineToRelative(-0.112f, 0.097f)
                lineToRelative(-0.11f, 0.071f)
                lineToRelative(-0.062f, 0.031f)
                lineToRelative(-0.081f, 0.034f)
                lineToRelative(-0.076f, 0.024f)
                lineToRelative(-0.149f, 0.03f)
                close()
            }
        }.build()
        
        return _TransitionBottom!!
    }

private var _TransitionBottom: ImageVector? = null

