package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Bell: ImageVector
    get() {
        if (_Bell != null) return _Bell!!
        
        _Bell = ImageVector.Builder(
            name = "bell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 512f)
                curveToRelative(35.32f, 0f, 63.97f, -28.65f, 63.97f, -64f)
                horizontalLineTo(160.03f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 63.97f, 64f)
                close()
                moveToRelative(215.39f, -149.71f)
                curveToRelative(-19.32f, -20.76f, -55.47f, -51.99f, -55.47f, -154.29f)
                curveToRelative(0f, -77.7f, -54.48f, -139.9f, -127.94f, -155.16f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -14.32f, -32f, -31.98f, -32f)
                reflectiveCurveToRelative(-31.98f, 14.33f, -31.98f, 32f)
                verticalLineToRelative(20.84f)
                curveTo(118.56f, 68.1f, 64.08f, 130.3f, 64.08f, 208f)
                curveToRelative(0f, 102.3f, -36.15f, 133.53f, -55.47f, 154.29f)
                curveToRelative(-6f, 6.45f, -8.66f, 14.16f, -8.61f, 21.71f)
                curveToRelative(0.11f, 16.4f, 12.98f, 32f, 32.1f, 32f)
                horizontalLineToRelative(383.8f)
                curveToRelative(19.12f, 0f, 32f, -15.6f, 32.1f, -32f)
                curveToRelative(0.05f, -7.55f, -2.61f, -15.27f, -8.61f, -21.71f)
                close()
            }
        }.build()
        
        return _Bell!!
    }

private var _Bell: ImageVector? = null

