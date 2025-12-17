package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeWav: ImageVector
    get() {
        if (_FiletypeWav != null) return _FiletypeWav!!
        
        _FiletypeWav = ImageVector.Builder(
            name = "filetype-wav",
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
                moveTo(1.784f, 15.849f)
                lineToRelative(0.741f, -2.789f)
                horizontalLineToRelative(0.033f)
                lineToRelative(0.74f, 2.789f)
                horizontalLineToRelative(0.73f)
                lineToRelative(1.055f, -3.999f)
                horizontalLineToRelative(-0.858f)
                lineToRelative(-0.595f, 2.903f)
                horizontalLineToRelative(-0.041f)
                lineToRelative(-0.706f, -2.903f)
                horizontalLineTo(2.2f)
                lineToRelative(-0.706f, 2.903f)
                horizontalLineToRelative(-0.038f)
                lineToRelative(-0.6f, -2.903f)
                horizontalLineTo(0f)
                lineToRelative(1.055f, 3.999f)
                close()
                moveToRelative(3.715f, 0f)
                lineToRelative(0.314f, -1.028f)
                horizontalLineToRelative(1.336f)
                lineToRelative(0.313f, 1.028f)
                horizontalLineToRelative(0.841f)
                lineTo(6.967f, 11.85f)
                horizontalLineToRelative(-0.926f)
                lineTo(4.7f, 15.849f)
                horizontalLineToRelative(0.8f)
                close()
                moveToRelative(1.002f, -3.234f)
                lineToRelative(0.49f, 1.617f)
                horizontalLineTo(5.977f)
                lineToRelative(0.49f, -1.617f)
                horizontalLineTo(6.5f)
                close()
                moveToRelative(3.604f, 3.234f)
                horizontalLineToRelative(-0.952f)
                lineTo(7.814f, 11.85f)
                horizontalLineToRelative(0.917f)
                lineToRelative(0.897f, 3.138f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.888f, -3.138f)
                horizontalLineToRelative(0.879f)
                close()
            }
        }.build()
        
        return _FiletypeWav!!
    }

private var _FiletypeWav: ImageVector? = null

