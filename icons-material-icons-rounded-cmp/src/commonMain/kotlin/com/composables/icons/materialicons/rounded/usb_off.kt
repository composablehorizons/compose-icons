package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Usb_off: ImageVector
    get() {
        if (_Usb_off != null) return _Usb_off!!
        
        _Usb_off = ImageVector.Builder(
            name = "usb_off",
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
                moveTo(9.6f, 5.2f)
                lineToRelative(2f, -2.67f)
                curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0f)
                lineToRelative(2f, 2.67f)
                curveTo(14.65f, 5.53f, 14.41f, 6f, 14f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.17f)
                lineToRelative(-2f, -2f)
                verticalLineTo(6f)
                horizontalLineToRelative(-1f)
                curveTo(9.59f, 6f, 9.35f, 5.53f, 9.6f, 5.2f)
                close()
                moveTo(15.5f, 12f)
                horizontalLineTo(16f)
                verticalLineToRelative(1.17f)
                lineToRelative(1.77f, 1.77f)
                curveTo(17.91f, 14.66f, 18f, 14.34f, 18f, 14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3f)
                curveTo(19f, 8.22f, 18.78f, 8f, 18.5f, 8f)
                horizontalLineToRelative(-3f)
                curveTo(15.22f, 8f, 15f, 8.22f, 15f, 8.5f)
                verticalLineToRelative(3f)
                curveTo(15f, 11.78f, 15.22f, 12f, 15.5f, 12f)
                close()
                moveTo(20.49f, 21.9f)
                lineTo(20.49f, 21.9f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-5.9f, -5.9f)
                horizontalLineTo(13f)
                verticalLineToRelative(2.28f)
                curveToRelative(0.6f, 0.34f, 1f, 0.98f, 1f, 1.72f)
                curveToRelative(0f, 1.2f, -1.07f, 2.16f, -2.31f, 1.98f)
                curveToRelative(-0.88f, -0.13f, -1.59f, -0.88f, -1.68f, -1.77f)
                curveToRelative(-0.08f, -0.83f, 0.33f, -1.55f, 0.99f, -1.93f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2.28f)
                curveTo(5.4f, 11.38f, 5f, 10.74f, 5f, 10f)
                curveToRelative(0f, -0.59f, 0.26f, -1.13f, 0.68f, -1.5f)
                lineTo(2.1f, 4.93f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(16.97f, 16.97f)
                curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f)
                close()
                moveTo(11f, 13.83f)
                lineToRelative(-2.51f, -2.51f)
                curveToRelative(-0.14f, 0.16f, -0.31f, 0.29f, -0.49f, 0.4f)
                verticalLineTo(14f)
                horizontalLineToRelative(3f)
                verticalLineTo(13.83f)
                close()
            }
        }.build()
        
        return _Usb_off!!
    }

private var _Usb_off: ImageVector? = null

