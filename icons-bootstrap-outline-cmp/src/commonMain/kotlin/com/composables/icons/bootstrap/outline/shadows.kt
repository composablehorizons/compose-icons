package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Shadows: ImageVector
    get() {
        if (_Shadows != null) return _Shadows!!
        
        _Shadows = ImageVector.Builder(
            name = "shadows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveToRelative(-8f, 7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(3.5f)
                quadToRelative(0.048f, 0f, 0.093f, 0.009f)
                arcTo(7f, 7f, 0f, false, false, 12.9f, 13f)
                horizontalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(5.745f)
                quadToRelative(0.331f, -0.474f, 0.581f, -1f)
                horizontalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(6.71f)
                arcToRelative(7f, 7f, 0f, false, false, 0.22f, -1f)
                horizontalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(7f)
                quadToRelative(0f, -0.51f, -0.07f, -1f)
                horizontalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(6.71f)
                arcToRelative(7f, 7f, 0f, false, false, -0.384f, -1f)
                horizontalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(5.745f)
                arcToRelative(7f, 7f, 0f, false, false, -0.846f, -1f)
                horizontalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(3.608f)
                arcTo(7f, 7f, 0f, true, false, 8f, 15f)
            }
        }.build()
        
        return _Shadows!!
    }

private var _Shadows: ImageVector? = null

