package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Content_paste_off: ImageVector
    get() {
        if (_Content_paste_off != null) return _Content_paste_off!!
        
        _Content_paste_off = ImageVector.Builder(
            name = "content_paste_off",
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
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(3f, 5.83f)
                verticalLineTo(19f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(13.17f)
                lineToRelative(1.61f, 1.61f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(5f, 19f)
                verticalLineTo(7.83f)
                lineTo(16.17f, 19f)
                horizontalLineTo(5f)
                close()
                moveTo(17f, 8f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(11.17f)
                lineToRelative(2f, 2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4.18f)
                curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                horizontalLineTo(5.83f)
                lineToRelative(5f, 5f)
                horizontalLineTo(17f)
                close()
                moveTo(12f, 3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveTo(11.45f, 3f, 12f, 3f)
                close()
            }
        }.build()
        
        return _Content_paste_off!!
    }

private var _Content_paste_off: ImageVector? = null

