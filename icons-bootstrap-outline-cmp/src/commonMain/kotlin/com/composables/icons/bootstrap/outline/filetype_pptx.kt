package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypePptx: ImageVector
    get() {
        if (_FiletypePptx != null) return _FiletypePptx!!
        
        _FiletypePptx = ImageVector.Builder(
            name = "filetype-pptx",
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
                moveTo(1.5f, 11.85f)
                horizontalLineToRelative(1.6f)
                quadToRelative(0.434f, 0f, 0.732f, 0.179f)
                quadToRelative(0.302f, 0.175f, 0.46f, 0.477f)
                reflectiveQuadToRelative(0.158f, 0.677f)
                reflectiveQuadToRelative(-0.16f, 0.677f)
                quadToRelative(-0.159f, 0.299f, -0.464f, 0.474f)
                arcToRelative(1.45f, 1.45f, 0f, false, true, -0.732f, 0.173f)
                horizontalLineTo(2.29f)
                verticalLineToRelative(1.342f)
                horizontalLineTo(1.5f)
                close()
                moveToRelative(2.06f, 1.714f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.085f, -0.381f)
                quadToRelative(0f, -0.34f, -0.185f, -0.521f)
                quadToRelative(-0.185f, -0.182f, -0.513f, -0.182f)
                horizontalLineToRelative(-0.659f)
                verticalLineToRelative(1.406f)
                horizontalLineToRelative(0.66f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.374f, -0.082f)
                arcToRelative(0.57f, 0.57f, 0f, false, false, 0.238f, -0.24f)
                moveToRelative(1.302f, -1.714f)
                horizontalLineToRelative(1.6f)
                quadToRelative(0.434f, 0f, 0.732f, 0.179f)
                quadToRelative(0.302f, 0.175f, 0.46f, 0.477f)
                reflectiveQuadToRelative(0.158f, 0.677f)
                reflectiveQuadToRelative(-0.16f, 0.677f)
                quadToRelative(-0.158f, 0.299f, -0.464f, 0.474f)
                arcToRelative(1.45f, 1.45f, 0f, false, true, -0.732f, 0.173f)
                horizontalLineToRelative(-0.803f)
                verticalLineToRelative(1.342f)
                horizontalLineToRelative(-0.79f)
                close()
                moveToRelative(2.06f, 1.714f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.085f, -0.381f)
                quadToRelative(0f, -0.34f, -0.185f, -0.521f)
                quadToRelative(-0.184f, -0.182f, -0.513f, -0.182f)
                horizontalLineTo(5.65f)
                verticalLineToRelative(1.406f)
                horizontalLineToRelative(0.66f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.374f, -0.082f)
                arcToRelative(0.57f, 0.57f, 0f, false, false, 0.238f, -0.24f)
                moveToRelative(2.852f, 2.285f)
                verticalLineToRelative(-3.337f)
                horizontalLineToRelative(1.137f)
                verticalLineToRelative(-0.662f)
                horizontalLineTo(7.846f)
                verticalLineToRelative(0.662f)
                horizontalLineTo(8.98f)
                verticalLineToRelative(3.337f)
                close()
                moveToRelative(3.796f, -3.999f)
                horizontalLineToRelative(0.893f)
                lineToRelative(-1.274f, 2.007f)
                lineToRelative(1.254f, 1.992f)
                horizontalLineToRelative(-0.908f)
                lineToRelative(-0.85f, -1.415f)
                horizontalLineToRelative(-0.035f)
                lineToRelative(-0.853f, 1.415f)
                horizontalLineToRelative(-0.861f)
                lineToRelative(1.24f, -2.016f)
                lineToRelative(-1.228f, -1.983f)
                horizontalLineToRelative(0.931f)
                lineToRelative(0.832f, 1.439f)
                horizontalLineToRelative(0.035f)
                close()
            }
        }.build()
        
        return _FiletypePptx!!
    }

private var _FiletypePptx: ImageVector? = null

