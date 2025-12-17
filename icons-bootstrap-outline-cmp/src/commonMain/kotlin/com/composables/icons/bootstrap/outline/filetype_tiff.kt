package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeTiff: ImageVector
    get() {
        if (_FiletypeTiff != null) return _FiletypeTiff!!
        
        _FiletypeTiff = ImageVector.Builder(
            name = "filetype-tiff",
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
                moveTo(1.928f, 12.512f)
                verticalLineToRelative(3.337f)
                horizontalLineToRelative(-0.794f)
                verticalLineToRelative(-3.337f)
                horizontalLineTo(0f)
                verticalLineToRelative(-0.662f)
                horizontalLineToRelative(3.064f)
                verticalLineToRelative(0.662f)
                close()
                moveToRelative(2.131f, -0.662f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(-0.79f)
                verticalLineTo(11.85f)
                close()
                moveToRelative(1.373f, 3.999f)
                verticalLineToRelative(-1.59f)
                horizontalLineToRelative(1.606f)
                verticalLineToRelative(-0.64f)
                horizontalLineTo(5.432f)
                verticalLineToRelative(-1.116f)
                horizontalLineTo(7.19f)
                verticalLineToRelative(-0.653f)
                horizontalLineTo(4.641f)
                verticalLineToRelative(3.999f)
                close()
                moveToRelative(2.868f, -1.59f)
                verticalLineToRelative(1.59f)
                horizontalLineToRelative(-0.791f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(2.548f)
                verticalLineToRelative(0.653f)
                horizontalLineTo(8.3f)
                verticalLineToRelative(1.117f)
                horizontalLineToRelative(1.605f)
                verticalLineToRelative(0.638f)
                close()
            }
        }.build()
        
        return _FiletypeTiff!!
    }

private var _FiletypeTiff: ImageVector? = null

