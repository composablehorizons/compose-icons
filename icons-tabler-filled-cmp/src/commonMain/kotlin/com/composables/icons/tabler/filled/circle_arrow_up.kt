package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleArrowUp: ImageVector
    get() {
        if (_CircleArrowUp != null) return _CircleArrowUp!!
        
        _CircleArrowUp = ImageVector.Builder(
            name = "circle-arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                close()
                moveToRelative(-4.98f, 3.66f)
                lineToRelative(-0.163f, 0.01f)
                lineToRelative(-0.086f, 0.016f)
                lineToRelative(-0.142f, 0.045f)
                lineToRelative(-0.113f, 0.054f)
                lineToRelative(-0.07f, 0.043f)
                lineToRelative(-0.095f, 0.071f)
                lineToRelative(-0.058f, 0.054f)
                lineToRelative(-4f, 4f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 1.497f, 1.32f)
                lineToRelative(2.293f, -2.293f)
                verticalLineToRelative(5.586f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                verticalLineToRelative(-5.585f)
                lineToRelative(2.293f, 2.292f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -1.497f)
                lineToRelative(-4f, -4f)
                lineToRelative(-0.082f, -0.073f)
                lineToRelative(-0.089f, -0.064f)
                lineToRelative(-0.113f, -0.062f)
                lineToRelative(-0.081f, -0.034f)
                lineToRelative(-0.113f, -0.034f)
                lineToRelative(-0.112f, -0.02f)
                lineToRelative(-0.098f, -0.006f)
                close()
            }
        }.build()
        
        return _CircleArrowUp!!
    }

private var _CircleArrowUp: ImageVector? = null

