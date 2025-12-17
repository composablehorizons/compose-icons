package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeRaw: ImageVector
    get() {
        if (_FiletypeRaw != null) return _FiletypeRaw!!
        
        _FiletypeRaw = ImageVector.Builder(
            name = "filetype-raw",
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
                moveTo(1.597f, 11.85f)
                horizontalLineTo(0f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(0.782f)
                verticalLineToRelative(-1.491f)
                horizontalLineToRelative(0.71f)
                lineToRelative(0.7f, 1.491f)
                horizontalLineToRelative(1.651f)
                lineToRelative(0.313f, -1.028f)
                horizontalLineToRelative(1.336f)
                lineToRelative(0.314f, 1.028f)
                horizontalLineToRelative(0.84f)
                lineTo(5.31f, 11.85f)
                horizontalLineToRelative(-0.925f)
                lineToRelative(-1.329f, 3.96f)
                lineToRelative(-0.783f, -1.572f)
                arcTo(1.18f, 1.18f, 0f, false, false, 3f, 13.116f)
                quadToRelative(0f, -0.384f, -0.167f, -0.668f)
                arcToRelative(1.1f, 1.1f, 0f, false, false, -0.478f, -0.44f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, -0.758f, -0.158f)
                moveToRelative(-0.815f, 1.913f)
                verticalLineToRelative(-1.292f)
                horizontalLineToRelative(0.7f)
                arcToRelative(0.74f, 0.74f, 0f, false, true, 0.507f, 0.17f)
                quadToRelative(0.194f, 0.17f, 0.194f, 0.49f)
                quadToRelative(0f, 0.315f, -0.194f, 0.474f)
                quadToRelative(-0.19f, 0.158f, -0.518f, 0.158f)
                close()
                moveToRelative(4.063f, -1.148f)
                lineToRelative(0.489f, 1.617f)
                horizontalLineTo(4.32f)
                lineToRelative(0.49f, -1.617f)
                close()
                moveToRelative(4.006f, 0.445f)
                lineToRelative(-0.74f, 2.789f)
                horizontalLineToRelative(-0.73f)
                lineTo(6.326f, 11.85f)
                horizontalLineToRelative(0.855f)
                lineToRelative(0.601f, 2.903f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.706f, -2.903f)
                horizontalLineToRelative(0.683f)
                lineToRelative(0.706f, 2.903f)
                horizontalLineToRelative(0.04f)
                lineToRelative(0.596f, -2.903f)
                horizontalLineToRelative(0.858f)
                lineToRelative(-1.055f, 3.999f)
                horizontalLineToRelative(-0.73f)
                lineToRelative(-0.74f, -2.789f)
                horizontalLineTo(8.85f)
                close()
            }
        }.build()
        
        return _FiletypeRaw!!
    }

private var _FiletypeRaw: ImageVector? = null

