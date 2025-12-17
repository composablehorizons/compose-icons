package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Lock: ImageVector
    get() {
        if (_Lock != null) return _Lock!!
        
        _Lock = ImageVector.Builder(
            name = "lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(2.05f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 2f, 2.45f)
                verticalLineToRelative(5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-7f)
                arcTo(2.5f, 2.5f, 0f, false, true, 2f, 13.5f)
                verticalLineToRelative(-5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 2f, -2.45f)
                verticalLineTo(4f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                moveToRelative(0f, 1f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineTo(4f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
            }
        }.build()
        
        return _Lock!!
    }

private var _Lock: ImageVector? = null

