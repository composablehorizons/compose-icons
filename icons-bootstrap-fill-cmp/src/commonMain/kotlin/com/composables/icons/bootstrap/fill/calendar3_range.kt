package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Calendar3Range: ImageVector
    get() {
        if (_Calendar3Range != null) return _Calendar3Range!!
        
        _Calendar3Range = ImageVector.Builder(
            name = "calendar3-range",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 5f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                horizontalLineToRelative(16f)
                close()
                moveToRelative(-2f, -5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                horizontalLineTo(0f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
        }.build()
        
        return _Calendar3Range!!
    }

private var _Calendar3Range: ImageVector? = null

