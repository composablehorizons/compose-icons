package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Close_fullscreen: ImageVector
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
                moveTo(21.29f, 4.12f)
                lineToRelative(-4.59f, 4.59f)
                lineToRelative(1.59f, 1.59f)
                curveToRelative(0.63f, 0.63f, 0.18f, 1.71f, -0.71f, 1.71f)
                horizontalLineTo(13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(6.41f)
                curveToRelative(0f, -0.89f, 1.08f, -1.34f, 1.71f, -0.71f)
                lineToRelative(1.59f, 1.59f)
                lineToRelative(4.59f, -4.59f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                verticalLineToRelative(0f)
                curveTo(21.68f, 3.1f, 21.68f, 3.73f, 21.29f, 4.12f)
                close()
                moveTo(4.12f, 21.29f)
                lineToRelative(4.59f, -4.59f)
                lineToRelative(1.59f, 1.59f)
                curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f)
                verticalLineTo(13f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(6.41f)
                curveToRelative(-0.89f, 0f, -1.34f, 1.08f, -0.71f, 1.71f)
                lineToRelative(1.59f, 1.59f)
                lineToRelative(-4.59f, 4.59f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(0f, 0f)
                curveTo(3.1f, 21.68f, 3.73f, 21.68f, 4.12f, 21.29f)
                close()
            }
        }.build()
        
        return _Close_fullscreen!!
    }

private var _Close_fullscreen: ImageVector? = null

