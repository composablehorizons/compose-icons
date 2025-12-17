package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Headset: ImageVector
    get() {
        if (_Headset != null) return _Headset!!
        
        _Headset = ImageVector.Builder(
            name = "headset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(6f)
                arcToRelative(6f, 6f, 0f, true, true, 12f, 0f)
                verticalLineToRelative(6f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, 2.5f)
                horizontalLineTo(9.366f)
                arcToRelative(1f, 1f, 0f, false, true, -0.866f, 0.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 0.866f, 0.5f)
                horizontalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 13f, 12f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineTo(6f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, -5f)
            }
        }.build()
        
        return _Headset!!
    }

private var _Headset: ImageVector? = null

