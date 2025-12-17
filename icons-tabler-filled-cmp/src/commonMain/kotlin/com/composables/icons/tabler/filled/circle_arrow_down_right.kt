package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleArrowDownRight: ImageVector
    get() {
        if (_CircleArrowDownRight != null) return _CircleArrowDownRight!!
        
        _CircleArrowDownRight = ImageVector.Builder(
            name = "circle-arrow-down-right",
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
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, 0.993f)
                verticalLineToRelative(3.585f)
                lineToRelative(-4.293f, -4.292f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, false, -1.32f, 1.497f)
                lineToRelative(4.292f, 4.293f)
                horizontalLineToRelative(-3.585f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.117f, 1.993f)
                lineToRelative(6.034f, 0.001f)
                arcToRelative(0.998f, 0.998f, 0f, false, false, 0.186f, -0.025f)
                lineToRelative(0.053f, -0.014f)
                lineToRelative(0.066f, -0.02f)
                lineToRelative(0.13f, -0.059f)
                lineToRelative(0.093f, -0.055f)
                arcToRelative(0.98f, 0.98f, 0f, false, false, 0.438f, -0.828f)
                verticalLineToRelative(-6f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
            }
        }.build()
        
        return _CircleArrowDownRight!!
    }

private var _CircleArrowDownRight: ImageVector? = null

