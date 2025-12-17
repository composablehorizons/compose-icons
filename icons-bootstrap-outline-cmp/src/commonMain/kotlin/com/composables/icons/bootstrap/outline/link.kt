package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Link: ImageVector
    get() {
        if (_Link != null) return _Link!!
        
        _Link = ImageVector.Builder(
            name = "link",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.354f, 5.5f)
                horizontalLineTo(4f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                horizontalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, false, false, 2.83f, -4f)
                horizontalLineTo(9f)
                quadToRelative(-0.13f, 0f, -0.25f, 0.031f)
                arcTo(2f, 2f, 0f, false, true, 7f, 10.5f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, -4f)
                horizontalLineToRelative(1.535f)
                curveToRelative(0.218f, -0.376f, 0.495f, -0.714f, 0.82f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 5.5f)
                arcToRelative(3f, 3f, 0f, false, false, -2.83f, 4f)
                horizontalLineToRelative(1.098f)
                arcTo(2f, 2f, 0f, false, true, 9f, 6.5f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                horizontalLineToRelative(-1.535f)
                arcToRelative(4f, 4f, 0f, false, true, -0.82f, 1f)
                horizontalLineTo(12f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                close()
            }
        }.build()
        
        return _Link!!
    }

private var _Link: ImageVector? = null

