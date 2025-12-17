package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Font_download: ImageVector
    get() {
        if (_Font_download != null) return _Font_download!!
        
        _Font_download = ImageVector.Builder(
            name = "font_download",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.93f, 13.5f)
                horizontalLineToRelative(4.14f)
                lineTo(12f, 7.98f)
                lineTo(9.93f, 13.5f)
                close()
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-4.29f, 15.88f)
                lineToRelative(-0.9f, -2.38f)
                horizontalLineTo(9.17f)
                lineToRelative(-0.89f, 2.37f)
                curveToRelative(-0.14f, 0.38f, -0.5f, 0.63f, -0.91f, 0.63f)
                curveToRelative(-0.68f, 0f, -1.15f, -0.69f, -0.9f, -1.32f)
                lineToRelative(4.25f, -10.81f)
                curveToRelative(0.22f, -0.53f, 0.72f, -0.87f, 1.28f, -0.87f)
                reflectiveCurveToRelative(1.06f, 0.34f, 1.27f, 0.87f)
                lineToRelative(4.25f, 10.81f)
                curveToRelative(0.25f, 0.63f, -0.22f, 1.32f, -0.9f, 1.32f)
                curveToRelative(-0.4f, 0f, -0.76f, -0.25f, -0.91f, -0.62f)
                close()
            }
        }.build()
        
        return _Font_download!!
    }

private var _Font_download: ImageVector? = null

