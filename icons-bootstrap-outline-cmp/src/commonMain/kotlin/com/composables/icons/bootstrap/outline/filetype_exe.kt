package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeExe: ImageVector
    get() {
        if (_FiletypeExe != null) return _FiletypeExe!!
        
        _FiletypeExe = ImageVector.Builder(
            name = "filetype-exe",
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
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
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
                moveTo(2.575f, 15.202f)
                horizontalLineTo(0.785f)
                verticalLineToRelative(-1.073f)
                horizontalLineTo(2.47f)
                verticalLineToRelative(-0.606f)
                horizontalLineTo(0.785f)
                verticalLineToRelative(-1.025f)
                horizontalLineToRelative(1.79f)
                verticalLineToRelative(-0.648f)
                horizontalLineTo(0f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(2.575f)
                close()
                moveTo(6.31f, 11.85f)
                horizontalLineToRelative(-0.893f)
                lineToRelative(-0.823f, 1.439f)
                horizontalLineToRelative(-0.036f)
                lineToRelative(-0.832f, -1.439f)
                horizontalLineToRelative(-0.931f)
                lineToRelative(1.227f, 1.983f)
                lineToRelative(-1.239f, 2.016f)
                horizontalLineToRelative(0.861f)
                lineToRelative(0.853f, -1.415f)
                horizontalLineToRelative(0.035f)
                lineToRelative(0.85f, 1.415f)
                horizontalLineToRelative(0.908f)
                lineToRelative(-1.254f, -1.992f)
                close()
                moveToRelative(1.025f, 3.352f)
                horizontalLineToRelative(1.79f)
                verticalLineToRelative(0.647f)
                horizontalLineTo(6.548f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(2.576f)
                verticalLineToRelative(0.648f)
                horizontalLineToRelative(-1.79f)
                verticalLineToRelative(1.025f)
                horizontalLineToRelative(1.684f)
                verticalLineToRelative(0.606f)
                horizontalLineTo(7.334f)
                verticalLineToRelative(1.073f)
                close()
            }
        }.build()
        
        return _FiletypeExe!!
    }

private var _FiletypeExe: ImageVector? = null

