package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareArrowDown: ImageVector
    get() {
        if (_SquareArrowDown != null) return _SquareArrowDown!!
        
        _SquareArrowDown = ImageVector.Builder(
            name = "square-arrow-down",
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
                moveToRelative(-7f, 5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(5.585f)
                lineToRelative(-2.293f, -2.292f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, false, -1.32f, 1.497f)
                lineToRelative(4f, 4f)
                lineToRelative(0.094f, 0.083f)
                lineToRelative(0.092f, 0.064f)
                lineToRelative(0.098f, 0.052f)
                lineToRelative(0.11f, 0.044f)
                lineToRelative(0.112f, 0.03f)
                lineToRelative(0.126f, 0.017f)
                lineToRelative(0.075f, 0.003f)
                lineToRelative(0.117f, -0.007f)
                lineToRelative(0.149f, -0.029f)
                lineToRelative(0.105f, -0.035f)
                lineToRelative(0.113f, -0.054f)
                lineToRelative(0.111f, -0.071f)
                arcToRelative(0.939f, 0.939f, 0f, false, false, 0.112f, -0.097f)
                lineToRelative(4f, -4f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, false, -1.32f, 0.083f)
                lineToRelative(-2.293f, 2.292f)
                verticalLineToRelative(-5.585f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
            }
        }.build()
        
        return _SquareArrowDown!!
    }

private var _SquareArrowDown: ImageVector? = null

