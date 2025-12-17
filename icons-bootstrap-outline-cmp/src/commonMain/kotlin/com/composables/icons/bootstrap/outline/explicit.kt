package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Explicit: ImageVector
    get() {
        if (_Explicit != null) return _Explicit!!
        
        _Explicit = ImageVector.Builder(
            name = "explicit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.826f, 10.88f)
                horizontalLineTo(10.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(-5f)
                verticalLineTo(4.002f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1.12f)
                horizontalLineTo(6.826f)
                verticalLineTo(7.4f)
                horizontalLineToRelative(3.457f)
                verticalLineToRelative(1.073f)
                horizontalLineTo(6.826f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 0f)
                arcTo(2.5f, 2.5f, 0f, false, false, 0f, 2.5f)
                verticalLineToRelative(11f)
                arcTo(2.5f, 2.5f, 0f, false, false, 2.5f, 16f)
                horizontalLineToRelative(11f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-11f)
                arcTo(2.5f, 2.5f, 0f, false, false, 13.5f, 0f)
                close()
                moveTo(1f, 2.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 1f)
                horizontalLineToRelative(11f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15f, 2.5f)
                verticalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-11f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1f, 13.5f)
                close()
            }
        }.build()
        
        return _Explicit!!
    }

private var _Explicit: ImageVector? = null

