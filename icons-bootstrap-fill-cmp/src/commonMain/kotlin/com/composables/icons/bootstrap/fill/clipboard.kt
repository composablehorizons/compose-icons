package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Clipboard: ImageVector
    get() {
        if (_Clipboard != null) return _Clipboard!!
        
        _Clipboard = ImageVector.Builder(
            name = "clipboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                close()
                moveToRelative(-5f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 0f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11f, 1.5f)
                verticalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 4f)
                horizontalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 2.5f)
                close()
                moveToRelative(-2f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                arcTo(2.5f, 2.5f, 0f, false, false, 6.5f, 5f)
                horizontalLineToRelative(3f)
                arcTo(2.5f, 2.5f, 0f, false, false, 12f, 2.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(3.5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
            }
        }.build()
        
        return _Clipboard!!
    }

private var _Clipboard: ImageVector? = null

