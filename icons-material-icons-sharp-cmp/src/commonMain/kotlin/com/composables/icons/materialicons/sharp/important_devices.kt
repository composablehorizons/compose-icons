package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Important_devices: ImageVector
    get() {
        if (_Important_devices != null) return _Important_devices!!
        
        _Important_devices = ImageVector.Builder(
            name = "important_devices",
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
                moveTo(24f, 11.01f)
                lineTo(17f, 11f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(7f)
                verticalLineTo(11.01f)
                close()
                moveTo(23f, 20f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(7f)
                close()
                moveTo(22f, 2f)
                horizontalLineTo(0f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                close()
                moveTo(11.97f, 9f)
                lineTo(11f, 6f)
                lineToRelative(-0.97f, 3f)
                horizontalLineTo(7f)
                lineToRelative(2.47f, 1.76f)
                lineToRelative(-0.94f, 2.91f)
                lineToRelative(2.47f, -1.8f)
                lineToRelative(2.47f, 1.8f)
                lineToRelative(-0.94f, -2.91f)
                lineTo(15f, 9f)
                horizontalLineToRelative(-3.03f)
                close()
            }
        }.build()
        
        return _Important_devices!!
    }

private var _Important_devices: ImageVector? = null

