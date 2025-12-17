package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PlaneSlash: ImageVector
    get() {
        if (_PlaneSlash != null) return _PlaneSlash!!
        
        _PlaneSlash = ImageVector.Builder(
            name = "plane-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(32.48f, 147.88f)
                lineTo(64f, 256f)
                lineTo(32.48f, 364.13f)
                arcTo(16f, 16f, 0f, false, false, 48f, 384f)
                horizontalLineTo(88f)
                arcToRelative(16f, 16f, 0f, false, false, 12.8f, -6.41f)
                lineTo(144f, 320f)
                horizontalLineTo(246.85f)
                lineToRelative(-49f, 171.59f)
                arcTo(16f, 16f, 0f, false, false, 213.2f, 512f)
                horizontalLineToRelative(65.5f)
                arcToRelative(16f, 16f, 0f, false, false, 13.89f, -8.06f)
                lineToRelative(66.6f, -116.54f)
                lineTo(34.35f, 136.34f)
                arcTo(15.47f, 15.47f, 0f, false, false, 32.48f, 147.88f)
                close()
                moveTo(633.82f, 458.09f)
                lineTo(455.14f, 320f)
                horizontalLineTo(512f)
                curveToRelative(35.34f, 0f, 96f, -28.66f, 96f, -64f)
                reflectiveCurveToRelative(-60.66f, -64f, -96f, -64f)
                horizontalLineTo(397.7f)
                lineTo(292.61f, 8.06f)
                curveTo(290.06f, 3.61f, 283.84f, 0f, 278.71f, 0f)
                horizontalLineTo(213.2f)
                arcToRelative(16f, 16f, 0f, false, false, -15.38f, 20.39f)
                lineToRelative(36.94f, 129.29f)
                lineTo(45.46f, 3.38f)
                arcTo(16f, 16f, 0f, false, false, 23f, 6.19f)
                lineTo(3.37f, 31.45f)
                arcTo(16f, 16f, 0f, false, false, 6.18f, 53.91f)
                lineTo(594.54f, 508.63f)
                arcTo(16f, 16f, 0f, false, false, 617f, 505.81f)
                lineToRelative(19.64f, -25.26f)
                arcTo(16f, 16f, 0f, false, false, 633.82f, 458.09f)
                close()
            }
        }.build()
        
        return _PlaneSlash!!
    }

private var _PlaneSlash: ImageVector? = null

