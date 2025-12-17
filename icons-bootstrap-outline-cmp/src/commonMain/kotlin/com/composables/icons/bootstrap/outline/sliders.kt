package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Sliders: ImageVector
    get() {
        if (_Sliders != null) return _Sliders!!
        
        _Sliders = ImageVector.Builder(
            name = "sliders",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 2f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
                moveTo(9.05f, 3f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 4.9f, 0f)
                horizontalLineTo(16f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.05f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -4.9f, 0f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                close()
                moveTo(4.5f, 7f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
                moveTo(2.05f, 8f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 4.9f, 0f)
                horizontalLineTo(16f)
                verticalLineToRelative(1f)
                horizontalLineTo(6.95f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -4.9f, 0f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                close()
                moveToRelative(9.45f, 4f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
                moveToRelative(-2.45f, 1f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 4.9f, 0f)
                horizontalLineTo(16f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.05f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -4.9f, 0f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                close()
            }
        }.build()
        
        return _Sliders!!
    }

private var _Sliders: ImageVector? = null

