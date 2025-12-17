package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleArrowUpLeft: ImageVector
    get() {
        if (_CircleArrowUpLeft != null) return _CircleArrowUpLeft!!
        
        _CircleArrowUpLeft = ImageVector.Builder(
            name = "circle-arrow-up-left",
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
                moveToRelative(-2f, 4.66f)
                horizontalLineToRelative(-6f)
                lineToRelative(-0.117f, 0.007f)
                lineToRelative(-0.149f, 0.029f)
                lineToRelative(-0.105f, 0.035f)
                lineToRelative(-0.113f, 0.054f)
                lineToRelative(-0.111f, 0.071f)
                arcToRelative(1.01f, 1.01f, 0f, false, false, -0.112f, 0.097f)
                lineToRelative(-0.08f, 0.09f)
                lineToRelative(-0.067f, 0.096f)
                lineToRelative(-0.052f, 0.098f)
                lineToRelative(-0.044f, 0.11f)
                lineToRelative(-0.03f, 0.112f)
                lineToRelative(-0.017f, 0.126f)
                lineToRelative(-0.003f, 6.075f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 0.993f, 0.883f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-3.585f)
                lineToRelative(4.293f, 4.292f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -1.497f)
                lineToRelative(-4.292f, -4.293f)
                horizontalLineToRelative(3.585f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                close()
            }
        }.build()
        
        return _CircleArrowUpLeft!!
    }

private var _CircleArrowUpLeft: ImageVector? = null

