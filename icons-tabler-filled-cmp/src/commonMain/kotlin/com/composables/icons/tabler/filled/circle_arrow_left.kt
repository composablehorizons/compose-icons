package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleArrowLeft: ImageVector
    get() {
        if (_CircleArrowLeft != null) return _CircleArrowLeft!!
        
        _CircleArrowLeft = ImageVector.Builder(
            name = "circle-arrow-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                arcToRelative(10f, 10f, 0f, false, true, 0.324f, 19.995f)
                lineToRelative(-0.324f, 0.005f)
                lineToRelative(-0.324f, -0.005f)
                arcToRelative(10f, 10f, 0f, false, true, 0.324f, -19.995f)
                close()
                moveToRelative(0.707f, 5.293f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-4f, 4f)
                arcToRelative(1.048f, 1.048f, 0f, false, false, -0.083f, 0.094f)
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
                lineToRelative(0.043f, 0.07f)
                lineToRelative(0.071f, 0.095f)
                lineToRelative(0.054f, 0.058f)
                lineToRelative(4f, 4f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -1.497f)
                lineToRelative(-2.292f, -2.293f)
                horizontalLineToRelative(5.585f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                horizontalLineToRelative(-5.586f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                close()
            }
        }.build()
        
        return _CircleArrowLeft!!
    }

private var _CircleArrowLeft: ImageVector? = null

