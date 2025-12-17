package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeAi: ImageVector
    get() {
        if (_FiletypeAi != null) return _FiletypeAi!!
        
        _FiletypeAi = ImageVector.Builder(
            name = "filetype-ai",
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
                horizontalLineTo(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
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
                moveTo(1.113f, 14.82f)
                lineTo(0.8f, 15.85f)
                horizontalLineTo(0f)
                lineToRelative(1.342f, -3.999f)
                horizontalLineToRelative(0.926f)
                lineToRelative(1.336f, 3.999f)
                horizontalLineToRelative(-0.841f)
                lineToRelative(-0.314f, -1.028f)
                horizontalLineTo(1.113f)
                close()
                moveToRelative(1.178f, -0.588f)
                lineToRelative(-0.49f, -1.617f)
                horizontalLineToRelative(-0.034f)
                lineToRelative(-0.49f, 1.617f)
                close()
                moveToRelative(2.425f, -2.382f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(-0.791f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(0.79f)
                close()
            }
        }.build()
        
        return _FiletypeAi!!
    }

private var _FiletypeAi: ImageVector? = null

