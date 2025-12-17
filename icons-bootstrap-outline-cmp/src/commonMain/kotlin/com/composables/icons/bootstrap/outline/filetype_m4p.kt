package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeM4p: ImageVector
    get() {
        if (_FiletypeM4p != null) return _FiletypeM4p!!
        
        _FiletypeM4p = ImageVector.Builder(
            name = "filetype-m4p",
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
                verticalLineToRelative(-1f)
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
                moveTo(0.706f, 15.849f)
                verticalLineToRelative(-2.66f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.952f, 2.16f)
                horizontalLineToRelative(0.516f)
                lineToRelative(0.946f, -2.16f)
                horizontalLineToRelative(0.038f)
                verticalLineToRelative(2.66f)
                horizontalLineToRelative(0.715f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-1.14f, 2.596f)
                horizontalLineToRelative(-0.026f)
                lineTo(0.805f, 11.85f)
                horizontalLineTo(0f)
                verticalLineToRelative(3.999f)
                close()
                moveToRelative(5.237f, -3.999f)
                quadToRelative(-0.393f, 0.65f, -0.79f, 1.3f)
                reflectiveQuadToRelative(-0.748f, 1.31f)
                verticalLineToRelative(0.648f)
                horizontalLineToRelative(1.937f)
                verticalLineToRelative(0.741f)
                horizontalLineToRelative(0.74f)
                verticalLineToRelative(-0.741f)
                horizontalLineToRelative(0.49f)
                verticalLineToRelative(-0.639f)
                horizontalLineToRelative(-0.49f)
                verticalLineTo(11.85f)
                horizontalLineTo(5.944f)
                close()
                moveToRelative(-0.82f, 2.62f)
                verticalLineToRelative(-0.021f)
                quadToRelative(0.27f, -0.51f, 0.571f, -1.017f)
                quadToRelative(0.304f, -0.507f, 0.607f, -0.984f)
                horizontalLineToRelative(0.04f)
                verticalLineToRelative(2.021f)
                horizontalLineTo(5.124f)
                close()
                moveToRelative(2.893f, -2.62f)
                horizontalLineToRelative(1.6f)
                quadToRelative(0.434f, 0f, 0.732f, 0.179f)
                quadToRelative(0.302f, 0.175f, 0.46f, 0.477f)
                reflectiveQuadToRelative(0.158f, 0.677f)
                reflectiveQuadToRelative(-0.16f, 0.677f)
                quadToRelative(-0.159f, 0.298f, -0.464f, 0.474f)
                arcToRelative(1.45f, 1.45f, 0f, false, true, -0.732f, 0.173f)
                horizontalLineToRelative(-0.803f)
                verticalLineToRelative(1.342f)
                horizontalLineToRelative(-0.79f)
                close()
                moveToRelative(2.06f, 1.714f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.085f, -0.381f)
                quadToRelative(0f, -0.34f, -0.185f, -0.521f)
                quadToRelative(-0.184f, -0.183f, -0.513f, -0.182f)
                horizontalLineToRelative(-0.659f)
                verticalLineToRelative(1.406f)
                horizontalLineToRelative(0.66f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.374f, -0.082f)
                arcToRelative(0.57f, 0.57f, 0f, false, false, 0.238f, -0.24f)
            }
        }.build()
        
        return _FiletypeM4p!!
    }

private var _FiletypeM4p: ImageVector? = null

