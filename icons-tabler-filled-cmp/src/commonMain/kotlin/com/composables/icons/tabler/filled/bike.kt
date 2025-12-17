package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Bike: ImageVector
    get() {
        if (_Bike != null) return _Bike!!
        
        _Bike = ImageVector.Builder(
            name = "bike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 14f)
                arcToRelative(4f, 4f, 0f, true, true, -4f, 4f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4f, 4f, 0f, false, true, 3.995f, -3.8f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 14f)
                arcToRelative(4f, 4f, 0f, true, true, -4f, 4f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4f, 4f, 0f, false, true, 3.995f, -3.8f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.832f, 7.445f)
                lineToRelative(1.703f, 2.555f)
                horizontalLineToRelative(2.465f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.832f, -0.445f)
                lineToRelative(-1.396f, -2.093f)
                lineToRelative(-3.275f, 2.62f)
                lineToRelative(2.21f, 2.21f)
                arcToRelative(1f, 1f, 0f, false, true, 0.284f, 0.577f)
                lineToRelative(0.009f, 0.131f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-3.585f)
                lineToRelative(-2.707f, -2.708f)
                arcToRelative(1f, 1f, 0f, false, true, -0.01f, -1.403f)
                lineToRelative(0.092f, -0.085f)
                lineToRelative(5f, -4f)
                arcToRelative(1f, 1f, 0f, false, true, 1.457f, 0.226f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3f)
                arcToRelative(2f, 2f, 0f, true, true, -2f, 2f)
                lineToRelative(0.005f, -0.15f)
                arcToRelative(2f, 2f, 0f, false, true, 1.995f, -1.85f)
            }
        }.build()
        
        return _Bike!!
    }

private var _Bike: ImageVector? = null

