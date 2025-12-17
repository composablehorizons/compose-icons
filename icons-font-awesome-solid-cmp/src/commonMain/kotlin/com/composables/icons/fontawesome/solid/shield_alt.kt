package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ShieldAlt: ImageVector
    get() {
        if (_ShieldAlt != null) return _ShieldAlt!!
        
        _ShieldAlt = ImageVector.Builder(
            name = "shield-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(466.5f, 83.7f)
                lineToRelative(-192f, -80f)
                arcToRelative(48.15f, 48.15f, 0f, false, false, -36.9f, 0f)
                lineToRelative(-192f, 80f)
                curveTo(27.7f, 91.1f, 16f, 108.6f, 16f, 128f)
                curveToRelative(0f, 198.5f, 114.5f, 335.7f, 221.5f, 380.3f)
                curveToRelative(11.8f, 4.9f, 25.1f, 4.9f, 36.9f, 0f)
                curveTo(360.1f, 472.6f, 496f, 349.3f, 496f, 128f)
                curveToRelative(0f, -19.4f, -11.7f, -36.9f, -29.5f, -44.3f)
                close()
                moveTo(256.1f, 446.3f)
                lineToRelative(-0.1f, -381f)
                lineToRelative(175.9f, 73.3f)
                curveToRelative(-3.3f, 151.4f, -82.1f, 261.1f, -175.8f, 307.7f)
                close()
            }
        }.build()
        
        return _ShieldAlt!!
    }

private var _ShieldAlt: ImageVector? = null

