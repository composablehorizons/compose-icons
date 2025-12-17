package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Usb: ImageVector
    get() {
        if (_Usb != null) return _Usb!!
        
        _Usb = ImageVector.Builder(
            name = "usb",
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
                moveTo(15f, 7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                lineToRelative(-3f, -4f)
                lineToRelative(-3f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineTo(8f)
                verticalLineToRelative(-2.07f)
                curveToRelative(0.7f, -0.37f, 1.2f, -1.08f, 1.2f, -1.93f)
                curveToRelative(0f, -1.21f, -0.99f, -2.2f, -2.2f, -2.2f)
                reflectiveCurveTo(4.8f, 7.79f, 4.8f, 9f)
                curveToRelative(0f, 0.85f, 0.5f, 1.56f, 1.2f, 1.93f)
                verticalLineTo(13f)
                curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.05f)
                curveToRelative(-0.71f, 0.37f, -1.2f, 1.1f, -1.2f, 1.95f)
                curveToRelative(0f, 1.22f, 0.99f, 2.2f, 2.2f, 2.2f)
                reflectiveCurveToRelative(2.2f, -0.98f, 2.2f, -2.2f)
                curveToRelative(0f, -0.85f, -0.49f, -1.58f, -1.2f, -1.95f)
                verticalLineTo(15f)
                horizontalLineToRelative(3f)
                curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineTo(7f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _Usb!!
    }

private var _Usb: ImageVector? = null

