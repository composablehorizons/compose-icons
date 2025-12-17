package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleArrowDownLeft: ImageVector
    get() {
        if (_CircleArrowDownLeft != null) return _CircleArrowDownLeft!!
        
        _CircleArrowDownLeft = ImageVector.Builder(
            name = "circle-arrow-down-left",
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
                moveToRelative(-8f, 4.66f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6f)
                lineToRelative(0.007f, 0.117f)
                lineToRelative(0.029f, 0.149f)
                lineToRelative(0.035f, 0.105f)
                lineToRelative(0.054f, 0.113f)
                lineToRelative(0.071f, 0.111f)
                curveToRelative(0.03f, 0.04f, 0.061f, 0.077f, 0.097f, 0.112f)
                lineToRelative(0.09f, 0.08f)
                lineToRelative(0.096f, 0.067f)
                lineToRelative(0.098f, 0.052f)
                lineToRelative(0.11f, 0.044f)
                lineToRelative(0.112f, 0.03f)
                lineToRelative(0.126f, 0.017f)
                lineToRelative(6.075f, 0.003f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, -0.993f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                horizontalLineToRelative(-3.586f)
                lineToRelative(4.293f, -4.293f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -1.497f, -1.32f)
                lineToRelative(-4.293f, 4.291f)
                verticalLineToRelative(-3.584f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
            }
        }.build()
        
        return _CircleArrowDownLeft!!
    }

private var _CircleArrowDownLeft: ImageVector? = null

