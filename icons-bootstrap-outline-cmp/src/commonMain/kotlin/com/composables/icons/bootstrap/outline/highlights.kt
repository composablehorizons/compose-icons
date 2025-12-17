package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Highlights: ImageVector
    get() {
        if (_Highlights != null) return _Highlights!!
        
        _Highlights = ImageVector.Builder(
            name = "highlights",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, false, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, false, 16f, 0f)
                moveToRelative(-8f, 5f)
                verticalLineToRelative(1f)
                horizontalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.093f, 0.009f)
                arcTo(7f, 7f, 0f, false, true, 3.1f, 13f)
                close()
                moveToRelative(0f, -1f)
                horizontalLineTo(2.255f)
                arcToRelative(7f, 7f, 0f, false, true, -0.581f, -1f)
                horizontalLineTo(8f)
                close()
                moveToRelative(-6.71f, -2f)
                arcToRelative(7f, 7f, 0f, false, true, -0.22f, -1f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                close()
                moveTo(1f, 8f)
                quadToRelative(0f, -0.51f, 0.07f, -1f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(0.29f, -2f)
                quadToRelative(0.155f, -0.519f, 0.384f, -1f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(0.965f, -2f)
                quadToRelative(0.377f, -0.54f, 0.846f, -1f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(2.137f, -2f)
                arcTo(6.97f, 6.97f, 0f, false, true, 8f, 1f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _Highlights!!
    }

private var _Highlights: ImageVector? = null

