package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Replace: ImageVector
    get() {
        if (_Replace != null) return _Replace!!
        
        _Replace = ImageVector.Builder(
            name = "replace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2f)
                horizontalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 14f)
                horizontalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.707f, 2.293f)
                arcToRelative(1f, 1f, 0f, false, true, 0.083f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-1.293f, 1.293f)
                horizontalLineToRelative(3.586f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                horizontalLineToRelative(-3.585f)
                lineToRelative(1.292f, 1.293f)
                arcToRelative(1f, 1f, 0f, false, true, -1.32f, 1.497f)
                lineToRelative(-0.094f, -0.083f)
                lineToRelative(-3f, -3f)
                arcToRelative(0.98f, 0.98f, 0f, false, true, -0.28f, -0.872f)
                lineToRelative(0.036f, -0.146f)
                lineToRelative(0.04f, -0.104f)
                curveToRelative(0.058f, -0.126f, 0.14f, -0.24f, 0.245f, -0.334f)
                lineToRelative(2.959f, -2.958f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 12f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(3.585f)
                lineToRelative(-1.292f, -1.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, -0.083f)
                lineToRelative(0.094f, 0.083f)
                lineToRelative(3f, 3f)
                arcToRelative(0.98f, 0.98f, 0f, false, true, 0.28f, 0.872f)
                lineToRelative(-0.036f, 0.146f)
                lineToRelative(-0.04f, 0.104f)
                arcToRelative(1.02f, 1.02f, 0f, false, true, -0.245f, 0.334f)
                lineToRelative(-2.959f, 2.958f)
                arcToRelative(1f, 1f, 0f, false, true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(1.291f, -1.293f)
                horizontalLineToRelative(-3.584f)
                arcToRelative(3f, 3f, 0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _Replace!!
    }

private var _Replace: ImageVector? = null

