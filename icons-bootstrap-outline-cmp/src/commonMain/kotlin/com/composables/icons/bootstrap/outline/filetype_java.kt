package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeJava: ImageVector
    get() {
        if (_FiletypeJava != null) return _FiletypeJava!!
        
        _FiletypeJava = ImageVector.Builder(
            name = "filetype-java",
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
                moveTo(1.521f, 15.175f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, -0.082f, -0.466f)
                horizontalLineToRelative(0.765f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, 0.073f, 0.27f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.454f, 0.246f)
                quadToRelative(0.285f, 0f, 0.422f, -0.164f)
                quadToRelative(0.138f, -0.165f, 0.138f, -0.466f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(2.725f)
                quadToRelative(0f, 0.66f, -0.357f, 1.005f)
                quadToRelative(-0.354f, 0.345f, -0.984f, 0.345f)
                arcToRelative(1.6f, 1.6f, 0f, false, true, -0.568f, -0.094f)
                arcToRelative(1.1f, 1.1f, 0f, false, true, -0.408f, -0.266f)
                arcToRelative(1.1f, 1.1f, 0f, false, true, -0.243f, -0.39f)
                moveToRelative(3.972f, -0.354f)
                lineToRelative(-0.314f, 1.028f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(1.342f, -3.999f)
                horizontalLineToRelative(0.926f)
                lineToRelative(1.336f, 3.999f)
                horizontalLineToRelative(-0.84f)
                lineToRelative(-0.314f, -1.028f)
                close()
                moveToRelative(1.178f, -0.59f)
                lineToRelative(-0.49f, -1.616f)
                horizontalLineToRelative(-0.035f)
                lineToRelative(-0.49f, 1.617f)
                close()
                moveToRelative(2.342f, 1.618f)
                horizontalLineToRelative(0.952f)
                lineToRelative(1.327f, -3.999f)
                horizontalLineToRelative(-0.878f)
                lineToRelative(-0.888f, 3.138f)
                horizontalLineToRelative(-0.038f)
                lineTo(8.59f, 11.85f)
                horizontalLineToRelative(-0.917f)
                close()
                moveToRelative(3.087f, -1.028f)
                lineToRelative(-0.314f, 1.028f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(1.342f, -3.999f)
                horizontalLineToRelative(0.926f)
                lineToRelative(1.336f, 3.999f)
                horizontalLineToRelative(-0.84f)
                lineToRelative(-0.314f, -1.028f)
                close()
                moveToRelative(1.178f, -0.59f)
                lineToRelative(-0.49f, -1.616f)
                horizontalLineToRelative(-0.035f)
                lineToRelative(-0.49f, 1.617f)
                close()
            }
        }.build()
        
        return _FiletypeJava!!
    }

private var _FiletypeJava: ImageVector? = null

