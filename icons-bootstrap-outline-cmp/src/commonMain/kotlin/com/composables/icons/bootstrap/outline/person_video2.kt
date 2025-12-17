package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonVideo2: ImageVector
    get() {
        if (_PersonVideo2 != null) return _PersonVideo2!!
        
        _PersonVideo2 = ImageVector.Builder(
            name = "person-video2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 9.05f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(9f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveTo(1f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                close()
                moveToRelative(4f, 10f)
                verticalLineTo(2f)
                horizontalLineToRelative(9f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.285f, -0.12f, 0.543f, -0.31f, 0.725f)
                curveTo(14.15f, 11.494f, 12.822f, 10f, 10f, 10f)
                curveToRelative(-3.037f, 0f, -4.345f, 1.73f, -4.798f, 3f)
                close()
                moveToRelative(-4f, -2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(3f, -1f)
                horizontalLineTo(1f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineTo(1f)
                verticalLineTo(5f)
                horizontalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _PersonVideo2!!
    }

private var _PersonVideo2: ImageVector? = null

