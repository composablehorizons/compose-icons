package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Usb: ImageVector
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
                moveTo(18f, 7f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineTo(5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.41f, 0f, 0.65f, -0.47f, 0.4f, -0.8f)
                lineToRelative(-2f, -2.67f)
                curveToRelative(-0.2f, -0.27f, -0.6f, -0.27f, -0.8f, 0f)
                lineToRelative(-2f, 2.67f)
                curveToRelative(-0.25f, 0.33f, -0.01f, 0.8f, 0.4f, 0.8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                horizontalLineTo(8f)
                verticalLineToRelative(-2.07f)
                curveToRelative(0.83f, -0.44f, 1.38f, -1.36f, 1.14f, -2.43f)
                curveToRelative(-0.17f, -0.77f, -0.77f, -1.4f, -1.52f, -1.61f)
                curveTo(6.15f, 6.48f, 4.8f, 7.59f, 4.8f, 9f)
                curveToRelative(0f, 0.85f, 0.5f, 1.56f, 1.2f, 1.93f)
                verticalLineTo(13f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.05f)
                curveToRelative(-0.86f, 0.45f, -1.39f, 1.42f, -1.13f, 2.49f)
                curveToRelative(0.18f, 0.75f, 0.79f, 1.38f, 1.54f, 1.58f)
                curveToRelative(1.46f, 0.39f, 2.8f, -0.7f, 2.8f, -2.12f)
                curveToRelative(0f, -0.85f, -0.49f, -1.58f, -1.2f, -1.95f)
                verticalLineTo(15f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(8f)
                curveTo(19f, 7.45f, 18.55f, 7f, 18f, 7f)
                close()
            }
        }.build()
        
        return _Usb!!
    }

private var _Usb: ImageVector? = null

