package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Flask: ImageVector
    get() {
        if (_Flask != null) return _Flask!!
        
        _Flask = ImageVector.Builder(
            name = "flask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(437.2f, 403.5f)
                lineTo(320f, 215f)
                verticalLineTo(64f)
                horizontalLineToRelative(8f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                horizontalLineTo(120f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(151f)
                lineTo(10.8f, 403.5f)
                curveTo(-18.5f, 450.6f, 15.3f, 512f, 70.9f, 512f)
                horizontalLineToRelative(306.2f)
                curveToRelative(55.7f, 0f, 89.4f, -61.5f, 60.1f, -108.5f)
                close()
                moveTo(137.9f, 320f)
                lineToRelative(48.2f, -77.6f)
                curveToRelative(3.7f, -5.2f, 5.8f, -11.6f, 5.8f, -18.4f)
                verticalLineTo(64f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(160f)
                curveToRelative(0f, 6.9f, 2.2f, 13.2f, 5.8f, 18.4f)
                lineToRelative(48.2f, 77.6f)
                horizontalLineToRelative(-172f)
                close()
            }
        }.build()
        
        return _Flask!!
    }

private var _Flask: ImageVector? = null

