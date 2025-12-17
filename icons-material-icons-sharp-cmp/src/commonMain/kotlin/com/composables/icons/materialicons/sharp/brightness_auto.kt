package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Brightness_auto: ImageVector
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
                verticalLineTo(4f)
                horizontalLineToRelative(-4.69f)
                lineTo(12f, 0.69f)
                lineTo(8.69f, 4f)
                horizontalLineTo(4f)
                verticalLineToRelative(4.69f)
                lineTo(0.69f, 12f)
                lineTo(4f, 15.31f)
                verticalLineTo(20f)
                horizontalLineToRelative(4.69f)
                lineTo(12f, 23.31f)
                lineTo(15.31f, 20f)
                horizontalLineTo(20f)
                verticalLineToRelative(-4.69f)
                lineTo(23.31f, 12f)
                lineTo(20f, 8.69f)
                close()
                moveTo(14.3f, 16f)
                lineToRelative(-0.7f, -2f)
                horizontalLineToRelative(-3.2f)
                lineToRelative(-0.7f, 2f)
                horizontalLineTo(7.8f)
                lineTo(11f, 7f)
                horizontalLineToRelative(2f)
                lineToRelative(3.2f, 9f)
                horizontalLineToRelative(-1.9f)
                close()
            }
        }.build()
        
        return _Brightness_auto!!
    }

private var _Brightness_auto: ImageVector? = null

