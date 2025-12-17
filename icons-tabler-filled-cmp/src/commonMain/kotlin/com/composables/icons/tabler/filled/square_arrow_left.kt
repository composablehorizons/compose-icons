package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareArrowLeft: ImageVector
    get() {
        if (_SquareArrowLeft != null) return _SquareArrowLeft!!
        
        _SquareArrowLeft = ImageVector.Builder(
            name = "square-arrow-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-6.293f, 5.293f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-4f, 4f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-0.064f, 0.092f)
                lineToRelative(-0.052f, 0.098f)
                lineToRelative(-0.044f, 0.11f)
                lineToRelative(-0.03f, 0.112f)
                lineToRelative(-0.017f, 0.126f)
                lineToRelative(-0.003f, 0.075f)
                lineToRelative(0.004f, 0.09f)
                lineToRelative(0.007f, 0.058f)
                lineToRelative(0.025f, 0.118f)
                lineToRelative(0.035f, 0.105f)
                lineToRelative(0.054f, 0.113f)
                lineToRelative(0.071f, 0.111f)
                curveToRelative(0.03f, 0.04f, 0.061f, 0.077f, 0.097f, 0.112f)
                lineToRelative(4f, 4f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -0.083f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                lineToRelative(-2.292f, -2.293f)
                horizontalLineToRelative(5.585f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                horizontalLineToRelative(-5.585f)
                lineToRelative(2.292f, -2.293f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                close()
            }
        }.build()
        
        return _SquareArrowLeft!!
    }

private var _SquareArrowLeft: ImageVector? = null

