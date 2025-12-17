package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Bold: ImageVector
    get() {
        if (_Bold != null) return _Bold!!
        
        _Bold = ImageVector.Builder(
            name = "bold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(6f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 3.274f, 7.587f)
                arcTo(4.75f, 4.75f, 0f, false, true, 11.25f, 18f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(3f)
                close()
                moveToRelative(2.5f, 5.5f)
                verticalLineToRelative(-4f)
                horizontalLineTo(11f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                horizontalLineTo(6.5f)
                close()
                moveToRelative(0f, 2.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(4.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 0f, -4.5f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()
        
        return _Bold!!
    }

private var _Bold: ImageVector? = null

