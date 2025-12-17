package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeHtml: ImageVector
    get() {
        if (_FiletypeHtml != null) return _FiletypeHtml!!
        
        _FiletypeHtml = ImageVector.Builder(
            name = "filetype-html",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(-1f)
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
                moveToRelative(-9.736f, 7.35f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(-0.791f)
                verticalLineToRelative(-1.714f)
                horizontalLineTo(1.79f)
                verticalLineToRelative(1.714f)
                horizontalLineTo(1f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(0.791f)
                verticalLineToRelative(1.626f)
                horizontalLineToRelative(1.682f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(0.79f)
                close()
                moveToRelative(2.251f, 0.662f)
                verticalLineToRelative(3.337f)
                horizontalLineToRelative(-0.794f)
                verticalLineToRelative(-3.337f)
                horizontalLineTo(4.588f)
                verticalLineToRelative(-0.662f)
                horizontalLineToRelative(3.064f)
                verticalLineToRelative(0.662f)
                close()
                moveToRelative(2.176f, 3.337f)
                verticalLineToRelative(-2.66f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.952f, 2.159f)
                horizontalLineToRelative(0.516f)
                lineToRelative(0.946f, -2.16f)
                horizontalLineToRelative(0.038f)
                verticalLineToRelative(2.661f)
                horizontalLineToRelative(0.715f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-1.14f, 2.596f)
                horizontalLineTo(9.93f)
                lineTo(8.79f, 11.85f)
                horizontalLineToRelative(-0.805f)
                verticalLineToRelative(3.999f)
                close()
                moveToRelative(4.71f, -0.674f)
                horizontalLineToRelative(1.696f)
                verticalLineToRelative(0.674f)
                horizontalLineTo(12.61f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(3.325f)
                close()
            }
        }.build()
        
        return _FiletypeHtml!!
    }

private var _FiletypeHtml: ImageVector? = null

