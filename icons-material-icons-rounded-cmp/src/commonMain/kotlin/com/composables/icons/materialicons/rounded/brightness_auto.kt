package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Brightness_auto: ImageVector
    get() {
        if (_Brightness_auto != null) return _Brightness_auto!!
        
        _Brightness_auto = ImageVector.Builder(
            name = "brightness_auto",
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
                moveTo(10.85f, 12.65f)
                horizontalLineToRelative(2.3f)
                lineTo(12f, 9f)
                lineToRelative(-1.15f, 3.65f)
                close()
                moveTo(20f, 8.69f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-2.69f)
                lineToRelative(-1.9f, -1.9f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                lineTo(8.69f, 4f)
                horizontalLineTo(6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2.69f)
                lineToRelative(-1.9f, 1.9f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                lineToRelative(1.9f, 1.9f)
                verticalLineTo(18f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2.69f)
                lineToRelative(1.9f, 1.9f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                lineToRelative(1.9f, -1.9f)
                horizontalLineTo(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2.69f)
                lineToRelative(1.9f, -1.9f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                lineTo(20f, 8.69f)
                close()
                moveToRelative(-5.91f, 6.71f)
                lineTo(13.6f, 14f)
                horizontalLineToRelative(-3.2f)
                lineToRelative(-0.49f, 1.4f)
                curveToRelative(-0.13f, 0.36f, -0.46f, 0.6f, -0.84f, 0.6f)
                curveToRelative(-0.62f, 0f, -1.05f, -0.61f, -0.84f, -1.19f)
                lineToRelative(2.44f, -6.86f)
                curveToRelative(0.2f, -0.57f, 0.73f, -0.95f, 1.33f, -0.95f)
                curveToRelative(0.6f, 0f, 1.13f, 0.38f, 1.34f, 0.94f)
                lineToRelative(2.44f, 6.86f)
                curveToRelative(0.21f, 0.58f, -0.22f, 1.19f, -0.84f, 1.19f)
                curveToRelative(-0.39f, 0.01f, -0.72f, -0.23f, -0.85f, -0.59f)
                close()
            }
        }.build()
        
        return _Brightness_auto!!
    }

private var _Brightness_auto: ImageVector? = null

