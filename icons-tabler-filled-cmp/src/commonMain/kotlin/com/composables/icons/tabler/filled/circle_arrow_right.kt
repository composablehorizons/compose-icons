package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleArrowRight: ImageVector
    get() {
        if (_CircleArrowRight != null) return _CircleArrowRight!!
        
        _CircleArrowRight = ImageVector.Builder(
            name = "circle-arrow-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                lineToRelative(0.324f, 0.005f)
                arcToRelative(10f, 10f, 0f, true, true, -0.648f, 0f)
                lineToRelative(0.324f, -0.005f)
                close()
                moveToRelative(0.613f, 5.21f)
                arcToRelative(1f, 1f, 0f, false, false, -1.32f, 1.497f)
                lineToRelative(2.291f, 2.293f)
                horizontalLineToRelative(-5.584f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.117f, 1.993f)
                horizontalLineToRelative(5.584f)
                lineToRelative(-2.291f, 2.293f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 1.497f, 1.32f)
                lineToRelative(4f, -4f)
                lineToRelative(0.073f, -0.082f)
                lineToRelative(0.064f, -0.089f)
                lineToRelative(0.062f, -0.113f)
                lineToRelative(0.044f, -0.11f)
                lineToRelative(0.03f, -0.112f)
                lineToRelative(0.017f, -0.126f)
                lineToRelative(0.003f, -0.075f)
                lineToRelative(-0.007f, -0.118f)
                lineToRelative(-0.029f, -0.148f)
                lineToRelative(-0.035f, -0.105f)
                lineToRelative(-0.054f, -0.113f)
                lineToRelative(-0.071f, -0.111f)
                arcToRelative(1.008f, 1.008f, 0f, false, false, -0.097f, -0.112f)
                lineToRelative(-4f, -4f)
                close()
            }
        }.build()
        
        return _CircleArrowRight!!
    }

private var _CircleArrowRight: ImageVector? = null

