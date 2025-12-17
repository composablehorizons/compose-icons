package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Lightning: ImageVector
    get() {
        if (_Lightning != null) return _Lightning!!
        
        _Lightning = ImageVector.Builder(
            name = "lightning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.52f, 0.359f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 0f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.474f, 0.658f)
                lineTo(8.694f, 6f)
                horizontalLineTo(12.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.395f, 0.807f)
                lineToRelative(-7f, 9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.873f, -0.454f)
                lineTo(6.823f, 9.5f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.48f, -0.641f)
                close()
                moveTo(6.374f, 1f)
                lineTo(4.168f, 8.5f)
                horizontalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.478f, 0.647f)
                lineTo(6.78f, 13.04f)
                lineTo(11.478f, 7f)
                horizontalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.474f, -0.658f)
                lineTo(9.306f, 1f)
                close()
            }
        }.build()
        
        return _Lightning!!
    }

private var _Lightning: ImageVector? = null

