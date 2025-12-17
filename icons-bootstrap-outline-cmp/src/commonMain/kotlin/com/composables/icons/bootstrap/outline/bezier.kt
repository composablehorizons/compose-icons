package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bezier: ImageVector
    get() {
        if (_Bezier != null) return _Bezier!!
        
        _Bezier = ImageVector.Builder(
            name = "bezier",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 9f)
                horizontalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4f, 10.5f)
                verticalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 13f)
                horizontalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 11.5f)
                close()
                moveToRelative(1.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
                moveToRelative(10.5f, 0.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13.5f, 9f)
                horizontalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, -1.5f)
                close()
                moveToRelative(1.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(6f, 4.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 3f)
                horizontalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 4.5f)
                verticalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 7f)
                horizontalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6f, 5.5f)
                close()
                moveTo(7.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 4.5f)
                horizontalLineTo(1.866f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 1f)
                horizontalLineToRelative(2.668f)
                arcTo(6.52f, 6.52f, 0f, false, false, 1.814f, 9f)
                horizontalLineTo(2.5f)
                quadToRelative(0.186f, 0f, 0.358f, 0.043f)
                arcToRelative(5.52f, 5.52f, 0f, false, true, 3.185f, -3.185f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6f, 5.5f)
                close()
                moveToRelative(3.957f, 1.358f)
                arcTo(1.5f, 1.5f, 0f, false, false, 10f, 5.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.134f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 1f)
                horizontalLineToRelative(-2.668f)
                arcToRelative(6.52f, 6.52f, 0f, false, true, 2.72f, 3.5f)
                horizontalLineTo(13.5f)
                quadToRelative(-0.185f, 0f, -0.358f, 0.043f)
                arcToRelative(5.52f, 5.52f, 0f, false, false, -3.185f, -3.185f)
            }
        }.build()
        
        return _Bezier!!
    }

private var _Bezier: ImageVector? = null

