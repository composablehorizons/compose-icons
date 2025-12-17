package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareArrowUp: ImageVector
    get() {
        if (_SquareArrowUp != null) return _SquareArrowUp!!
        
        _SquareArrowUp = ImageVector.Builder(
            name = "square-arrow-up",
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
                lineToRelative(-0.09f, 0.004f)
                lineToRelative(-0.058f, 0.007f)
                lineToRelative(-0.118f, 0.025f)
                lineToRelative(-0.105f, 0.035f)
                lineToRelative(-0.113f, 0.054f)
                lineToRelative(-0.111f, 0.071f)
                arcToRelative(1.008f, 1.008f, 0f, false, false, -0.112f, 0.097f)
                lineToRelative(-4f, 4f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 0.083f, 1.32f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -0.083f)
                lineToRelative(2.293f, -2.292f)
                verticalLineToRelative(5.585f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                verticalLineToRelative(-5.585f)
                lineToRelative(2.293f, 2.292f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -1.497f)
                lineToRelative(-4f, -4f)
                lineToRelative(-0.082f, -0.073f)
                lineToRelative(-0.104f, -0.074f)
                lineToRelative(-0.098f, -0.052f)
                lineToRelative(-0.11f, -0.044f)
                lineToRelative(-0.112f, -0.03f)
                lineToRelative(-0.126f, -0.017f)
                lineToRelative(-0.075f, -0.003f)
                close()
            }
        }.build()
        
        return _SquareArrowUp!!
    }

private var _SquareArrowUp: ImageVector? = null

