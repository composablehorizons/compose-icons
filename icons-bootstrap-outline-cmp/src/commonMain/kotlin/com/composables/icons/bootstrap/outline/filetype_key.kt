package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeKey: ImageVector
    get() {
        if (_FiletypeKey != null) return _FiletypeKey!!
        
        _FiletypeKey = ImageVector.Builder(
            name = "filetype-key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.5f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(3.21f, 11.85f)
                horizontalLineToRelative(-0.87f)
                lineTo(0.83f, 13.64f)
                horizontalLineTo(0.79f)
                verticalLineToRelative(-1.79f)
                horizontalLineTo(0f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(0.791f)
                verticalLineToRelative(-1.283f)
                lineToRelative(0.41f, -0.466f)
                lineToRelative(1.12f, 1.749f)
                horizontalLineToRelative(0.951f)
                lineToRelative(-1.488f, -2.276f)
                lineToRelative(1.427f, -1.723f)
                close()
                moveToRelative(2.903f, 3.352f)
                horizontalLineToRelative(-1.79f)
                verticalLineToRelative(-1.073f)
                horizontalLineToRelative(1.685f)
                verticalLineToRelative(-0.606f)
                horizontalLineTo(4.323f)
                verticalLineToRelative(-1.025f)
                horizontalLineToRelative(1.79f)
                verticalLineToRelative(-0.648f)
                horizontalLineTo(3.538f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(2.575f)
                close()
                moveToRelative(2.243f, -0.888f)
                verticalLineToRelative(1.535f)
                horizontalLineToRelative(-0.794f)
                verticalLineToRelative(-1.52f)
                lineTo(6.223f, 11.85f)
                horizontalLineTo(7.1f)
                lineToRelative(0.853f, 1.696f)
                horizontalLineToRelative(0.032f)
                lineToRelative(0.855f, -1.696f)
                horizontalLineToRelative(0.856f)
                close()
            }
        }.build()
        
        return _FiletypeKey!!
    }

private var _FiletypeKey: ImageVector? = null

