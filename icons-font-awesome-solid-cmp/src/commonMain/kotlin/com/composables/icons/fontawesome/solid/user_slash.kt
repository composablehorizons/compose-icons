package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserSlash: ImageVector
    get() {
        if (_UserSlash != null) return _UserSlash!!
        
        _UserSlash = ImageVector.Builder(
            name = "user-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(633.8f, 458.1f)
                lineTo(362.3f, 248.3f)
                curveTo(412.1f, 230.7f, 448f, 183.8f, 448f, 128f)
                curveTo(448f, 57.3f, 390.7f, 0f, 320f, 0f)
                curveToRelative(-67.1f, 0f, -121.5f, 51.8f, -126.9f, 117.4f)
                lineTo(45.5f, 3.4f)
                curveTo(38.5f, -2f, 28.5f, -0.8f, 23f, 6.2f)
                lineTo(3.4f, 31.4f)
                curveToRelative(-5.4f, 7f, -4.2f, 17f, 2.8f, 22.4f)
                lineToRelative(588.4f, 454.7f)
                curveToRelative(7f, 5.4f, 17f, 4.2f, 22.5f, -2.8f)
                lineToRelative(19.6f, -25.3f)
                curveToRelative(5.4f, -6.8f, 4.1f, -16.9f, -2.9f, -22.3f)
                close()
                moveTo(96f, 422.4f)
                verticalLineTo(464f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(350.2f)
                lineTo(207.4f, 290.3f)
                curveTo(144.2f, 301.3f, 96f, 356f, 96f, 422.4f)
                close()
            }
        }.build()
        
        return _UserSlash!!
    }

private var _UserSlash: ImageVector? = null

