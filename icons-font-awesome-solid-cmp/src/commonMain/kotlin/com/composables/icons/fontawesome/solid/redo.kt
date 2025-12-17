package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Redo: ImageVector
    get() {
        if (_Redo != null) return _Redo!!
        
        _Redo = ImageVector.Builder(
            name = "redo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500.33f, 0f)
                horizontalLineToRelative(-47.41f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, 12.57f)
                lineToRelative(4f, 82.76f)
                arcTo(247.42f, 247.42f, 0f, false, false, 256f, 8f)
                curveTo(119.34f, 8f, 7.9f, 119.53f, 8f, 256.19f)
                curveTo(8.1f, 393.07f, 119.1f, 504f, 256f, 504f)
                arcToRelative(247.1f, 247.1f, 0f, false, false, 166.18f, -63.91f)
                arcToRelative(12f, 12f, 0f, false, false, 0.48f, -17.43f)
                lineToRelative(-34f, -34f)
                arcToRelative(12f, 12f, 0f, false, false, -16.38f, -0.55f)
                arcTo(176f, 176f, 0f, true, true, 402.1f, 157.8f)
                lineToRelative(-101.53f, -4.87f)
                arcToRelative(12f, 12f, 0f, false, false, -12.57f, 12f)
                verticalLineToRelative(47.41f)
                arcToRelative(12f, 12f, 0f, false, false, 12f, 12f)
                horizontalLineToRelative(200.33f)
                arcToRelative(12f, 12f, 0f, false, false, 12f, -12f)
                verticalLineTo(12f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, -12f)
                close()
            }
        }.build()
        
        return _Redo!!
    }

private var _Redo: ImageVector? = null

