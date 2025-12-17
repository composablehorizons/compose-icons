package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypePy: ImageVector
    get() {
        if (_FiletypePy != null) return _FiletypePy!!
        
        _FiletypePy = ImageVector.Builder(
            name = "filetype-py",
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
                horizontalLineTo(7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
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
                moveTo(0f, 11.85f)
                horizontalLineToRelative(1.6f)
                quadToRelative(0.434f, 0f, 0.732f, 0.179f)
                quadToRelative(0.302f, 0.175f, 0.46f, 0.477f)
                reflectiveQuadToRelative(0.158f, 0.677f)
                reflectiveQuadToRelative(-0.16f, 0.677f)
                quadToRelative(-0.158f, 0.299f, -0.464f, 0.474f)
                arcToRelative(1.45f, 1.45f, 0f, false, true, -0.732f, 0.173f)
                horizontalLineTo(0.79f)
                verticalLineToRelative(1.342f)
                horizontalLineTo(0f)
                close()
                moveToRelative(2.06f, 1.714f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.085f, -0.381f)
                quadToRelative(0f, -0.34f, -0.185f, -0.521f)
                quadToRelative(-0.185f, -0.182f, -0.513f, -0.182f)
                horizontalLineTo(0.788f)
                verticalLineToRelative(1.406f)
                horizontalLineToRelative(0.66f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.374f, -0.082f)
                arcToRelative(0.57f, 0.57f, 0f, false, false, 0.238f, -0.24f)
                moveToRelative(2.963f, 0.75f)
                verticalLineToRelative(1.535f)
                horizontalLineTo(4.23f)
                verticalLineToRelative(-1.52f)
                lineTo(2.89f, 11.85f)
                horizontalLineToRelative(0.876f)
                lineToRelative(0.853f, 1.696f)
                horizontalLineToRelative(0.032f)
                lineToRelative(0.856f, -1.696f)
                horizontalLineToRelative(0.855f)
                close()
            }
        }.build()
        
        return _FiletypePy!!
    }

private var _FiletypePy: ImageVector? = null

