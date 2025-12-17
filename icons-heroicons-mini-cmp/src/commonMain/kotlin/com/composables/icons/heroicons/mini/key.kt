package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Key: ImageVector
    get() {
        if (_Key != null) return _Key!!
        
        _Key = ImageVector.Builder(
            name = "key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 7f)
                arcToRelative(5f, 5f, 0f, true, true, 3.61f, 4.804f)
                lineToRelative(-1.903f, 1.903f)
                arcTo(1f, 1f, 0f, false, true, 9f, 14f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(6f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, -0.707f)
                lineTo(8.196f, 8.39f)
                arcTo(5.002f, 5.002f, 0f, false, true, 8f, 7f)
                close()
                moveToRelative(5f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14.5f, 7f)
                arcTo(0.75f, 0.75f, 0f, false, false, 16f, 7f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                close()
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

