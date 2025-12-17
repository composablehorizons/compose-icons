package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Unlock: ImageVector
    get() {
        if (_Unlock != null) return _Unlock!!
        
        _Unlock = ImageVector.Builder(
            name = "unlock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1f)
                verticalLineTo(4f)
                arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(0.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 12f, 8.5f)
                verticalLineToRelative(5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 9.5f, 16f)
                horizontalLineToRelative(-7f)
                arcTo(2.5f, 2.5f, 0f, false, true, 0f, 13.5f)
                verticalLineToRelative(-5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 2.5f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
            }
        }.build()
        
        return _Unlock!!
    }

private var _Unlock: ImageVector? = null

