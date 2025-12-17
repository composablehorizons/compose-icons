package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Wifi_off: ImageVector
    get() {
        if (_Wifi_off != null) return _Wifi_off!!
        
        _Wifi_off = ImageVector.Builder(
            name = "wifi_off",
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
                moveTo(21f, 11f)
                lineToRelative(2f, -2f)
                curveToRelative(-3.73f, -3.73f, -8.87f, -5.15f, -13.7f, -4.31f)
                lineToRelative(2.58f, 2.58f)
                curveToRelative(3.3f, -0.02f, 6.61f, 1.22f, 9.12f, 3.73f)
                close()
                moveToRelative(-2f, 2f)
                curveToRelative(-1.08f, -1.08f, -2.36f, -1.85f, -3.72f, -2.33f)
                lineToRelative(3.02f, 3.02f)
                lineToRelative(0.7f, -0.69f)
                close()
                moveTo(9f, 17f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                curveToRelative(-1.65f, -1.66f, -4.34f, -1.66f, -6f, 0f)
                close()
                moveTo(3.41f, 1.64f)
                lineTo(2f, 3.05f)
                lineTo(5.05f, 6.1f)
                curveTo(3.59f, 6.83f, 2.22f, 7.79f, 1f, 9f)
                lineToRelative(2f, 2f)
                curveToRelative(1.23f, -1.23f, 2.65f, -2.16f, 4.17f, -2.78f)
                lineToRelative(2.24f, 2.24f)
                curveTo(7.79f, 10.89f, 6.27f, 11.74f, 5f, 13f)
                lineToRelative(2f, 2f)
                curveToRelative(1.35f, -1.35f, 3.11f, -2.04f, 4.89f, -2.06f)
                lineToRelative(7.08f, 7.08f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.41f, 1.64f)
                close()
            }
        }.build()
        
        return _Wifi_off!!
    }

private var _Wifi_off: ImageVector? = null

