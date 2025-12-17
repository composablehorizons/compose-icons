package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Close_fullscreen: ImageVector
    get() {
        if (_Close_fullscreen != null) return _Close_fullscreen!!
        
        _Close_fullscreen = ImageVector.Builder(
            name = "close_fullscreen",
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
                moveTo(22f, 3.41f)
                lineToRelative(-5.29f, 5.29f)
                lineTo(20f, 12f)
                horizontalLineToRelative(-8f)
                verticalLineTo(4f)
                lineToRelative(3.29f, 3.29f)
                lineTo(20.59f, 2f)
                lineTo(22f, 3.41f)
                close()
                moveTo(3.41f, 22f)
                lineToRelative(5.29f, -5.29f)
                lineTo(12f, 20f)
                verticalLineToRelative(-8f)
                horizontalLineTo(4f)
                lineToRelative(3.29f, 3.29f)
                lineTo(2f, 20.59f)
                lineTo(3.41f, 22f)
                close()
            }
        }.build()
        
        return _Close_fullscreen!!
    }

private var _Close_fullscreen: ImageVector? = null

