package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Font_download_off: ImageVector
    get() {
        if (_Font_download_off != null) return _Font_download_off!!
        
        _Font_download_off = ImageVector.Builder(
            name = "font_download_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.58f, 9.75f)
                lineToRelative(-0.87f, -0.87f)
                lineToRelative(0.23f, -0.66f)
                horizontalLineToRelative(0.1f)
                lineTo(12.58f, 9.75f)
                close()
                moveTo(10.35f, 7.52f)
                lineTo(10.55f, 7f)
                curveToRelative(0.23f, -0.6f, 0.8f, -1f, 1.45f, -1f)
                reflectiveCurveToRelative(1.22f, 0.4f, 1.45f, 1f)
                lineToRelative(2.17f, 5.79f)
                lineTo(22f, 19.17f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4.83f)
                lineTo(10.35f, 7.52f)
                close()
                moveTo(21.19f, 22.61f)
                lineTo(21.19f, 22.61f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineTo(19.17f, 22f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(4.83f)
                lineTo(1.39f, 4.22f)
                curveTo(1f, 3.83f, 1f, 3.2f, 1.39f, 2.81f)
                lineToRelative(0f, 0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(18.38f, 18.38f)
                curveTo(21.58f, 21.58f, 21.58f, 22.22f, 21.19f, 22.61f)
                close()
                moveTo(12.1f, 14.93f)
                lineToRelative(-3.3f, -3.3f)
                lineTo(6.9f, 16.7f)
                curveTo(6.67f, 17.33f, 7.13f, 18f, 7.8f, 18f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.41f, 0f, 0.77f, -0.26f, 0.9f, -0.64f)
                lineToRelative(0.86f, -2.43f)
                horizontalLineTo(12.1f)
                close()
            }
        }.build()
        
        return _Font_download_off!!
    }

private var _Font_download_off: ImageVector? = null

