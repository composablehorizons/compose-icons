package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.VideoSlash: ImageVector
    get() {
        if (_VideoSlash != null) return _VideoSlash!!
        
        _VideoSlash = ImageVector.Builder(
            name = "video-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(633.8f, 458.1f)
                lineToRelative(-55f, -42.5f)
                curveToRelative(15.4f, -1.4f, 29.2f, -13.7f, 29.2f, -31.1f)
                verticalLineToRelative(-257f)
                curveToRelative(0f, -25.5f, -29.1f, -40.4f, -50.4f, -25.8f)
                lineTo(448f, 177.3f)
                verticalLineToRelative(137.2f)
                lineToRelative(-32f, -24.7f)
                verticalLineToRelative(-178f)
                curveToRelative(0f, -26.4f, -21.4f, -47.8f, -47.8f, -47.8f)
                horizontalLineTo(123.9f)
                lineTo(45.5f, 3.4f)
                curveTo(38.5f, -2f, 28.5f, -0.8f, 23f, 6.2f)
                lineTo(3.4f, 31.4f)
                curveToRelative(-5.4f, 7f, -4.2f, 17f, 2.8f, 22.4f)
                lineTo(42.7f, 82f)
                lineTo(416f, 370.6f)
                lineToRelative(178.5f, 138f)
                curveToRelative(7f, 5.4f, 17f, 4.2f, 22.5f, -2.8f)
                lineToRelative(19.6f, -25.3f)
                curveToRelative(5.5f, -6.9f, 4.2f, -17f, -2.8f, -22.4f)
                close()
                moveTo(32f, 400.2f)
                curveToRelative(0f, 26.4f, 21.4f, 47.8f, 47.8f, 47.8f)
                horizontalLineToRelative(288.4f)
                curveToRelative(11.2f, 0f, 21.4f, -4f, 29.6f, -10.5f)
                lineTo(32f, 154.7f)
                verticalLineToRelative(245.5f)
                close()
            }
        }.build()
        
        return _VideoSlash!!
    }

private var _VideoSlash: ImageVector? = null

