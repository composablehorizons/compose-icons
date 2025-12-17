package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserAltSlash: ImageVector
    get() {
        if (_UserAltSlash != null) return _UserAltSlash!!
        
        _UserAltSlash = ImageVector.Builder(
            name = "user-alt-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(633.8f, 458.1f)
                lineTo(389.6f, 269.3f)
                curveTo(433.8f, 244.7f, 464f, 198.1f, 464f, 144f)
                curveTo(464f, 64.5f, 399.5f, 0f, 320f, 0f)
                curveToRelative(-67.1f, 0f, -123f, 46.1f, -139f, 108.2f)
                lineTo(45.5f, 3.4f)
                curveTo(38.5f, -2f, 28.5f, -0.8f, 23f, 6.2f)
                lineTo(3.4f, 31.4f)
                curveToRelative(-5.4f, 7f, -4.2f, 17f, 2.8f, 22.4f)
                lineToRelative(588.4f, 454.7f)
                curveToRelative(7f, 5.4f, 17f, 4.2f, 22.5f, -2.8f)
                lineToRelative(19.6f, -25.3f)
                curveToRelative(5.4f, -6.8f, 4.1f, -16.9f, -2.9f, -22.3f)
                close()
                moveTo(198.4f, 320f)
                curveTo(124.2f, 320f, 64f, 380.2f, 64f, 454.4f)
                verticalLineToRelative(9.6f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(382.2f)
                lineTo(245.8f, 320f)
                horizontalLineToRelative(-47.4f)
                close()
            }
        }.build()
        
        return _UserAltSlash!!
    }

private var _UserAltSlash: ImageVector? = null

