package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Sliders2: ImageVector
    get() {
        if (_Sliders2 != null) return _Sliders2!!
        
        _Sliders2 = ImageVector.Builder(
            name = "sliders2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(10f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveTo(12f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(-6.5f, 2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 6f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveTo(1f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 8f)
                moveToRelative(9.5f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(13f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(10f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveToRelative(1.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _Sliders2!!
    }

private var _Sliders2: ImageVector? = null

