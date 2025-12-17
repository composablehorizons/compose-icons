package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Usb_off: ImageVector
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
                moveTo(15f, 8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.34f, -0.08f, 0.66f, -0.23f, 0.94f)
                lineTo(16f, 13.17f)
                verticalLineTo(12f)
                horizontalLineToRelative(-1f)
                verticalLineTo(8f)
                close()
                moveTo(11f, 8.17f)
                lineToRelative(2f, 2f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                lineToRelative(-3f, -4f)
                lineTo(9f, 6f)
                horizontalLineToRelative(2f)
                verticalLineTo(8.17f)
                close()
                moveTo(13f, 16f)
                verticalLineToRelative(2.28f)
                curveToRelative(0.6f, 0.34f, 1f, 0.98f, 1f, 1.72f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.74f, 0.4f, -1.37f, 1f, -1.72f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                curveToRelative(-1.11f, 0f, -2f, -0.89f, -2f, -2f)
                verticalLineToRelative(-2.28f)
                curveTo(5.4f, 11.38f, 5f, 10.74f, 5f, 10f)
                curveToRelative(0f, -0.59f, 0.26f, -1.13f, 0.68f, -1.49f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(13.17f, 16f)
                horizontalLineTo(13f)
                close()
                moveTo(11f, 14f)
                verticalLineToRelative(-0.17f)
                lineToRelative(-2.51f, -2.51f)
                curveToRelative(-0.14f, 0.16f, -0.31f, 0.29f, -0.49f, 0.4f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                close()
            }
        }.build()
        
        return _Usb_off!!
    }

private var _Usb_off: ImageVector? = null

