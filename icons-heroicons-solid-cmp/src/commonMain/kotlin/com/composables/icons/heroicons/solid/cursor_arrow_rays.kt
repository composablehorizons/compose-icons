package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.CursorArrowRays: ImageVector
    get() {
        if (_CursorArrowRays != null) return _CursorArrowRays!!
        
        _CursorArrowRays = ImageVector.Builder(
            name = "cursor-arrow-rays",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(2.25f)
                arcTo(0.75f, 0.75f, 0f, false, true, 12f, 1.5f)
                close()
                moveTo(5.636f, 4.136f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(1.592f, 1.591f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.061f, 1.06f)
                lineToRelative(-1.591f, -1.59f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.061f)
                close()
                moveToRelative(12.728f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-1.591f, 1.592f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.061f)
                lineToRelative(1.59f, -1.591f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.061f, 0f)
                close()
                moveToRelative(-6.816f, 4.496f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.82f, 0.311f)
                lineToRelative(5.228f, 7.917f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.777f, 1.148f)
                lineToRelative(-2.097f, -0.43f)
                lineToRelative(1.045f, 3.9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.45f, 0.388f)
                lineToRelative(-1.044f, -3.899f)
                lineToRelative(-1.601f, 1.42f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.247f, -0.606f)
                lineToRelative(0.569f, -9.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.554f, -0.68f)
                close()
                moveTo(3f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineTo(6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(3.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 10.5f)
                close()
                moveToRelative(14.25f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(18f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveToRelative(-8.962f, 3.712f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.061f)
                lineToRelative(-1.591f, 1.591f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.061f, -1.06f)
                lineToRelative(1.591f, -1.592f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
            }
        }.build()
        
        return _CursorArrowRays!!
    }

private var _CursorArrowRays: ImageVector? = null

