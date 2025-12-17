package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Stop: ImageVector
    get() {
        if (_Stop != null) return _Stop!!
        
        _Stop = ImageVector.Builder(
            name = "stop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 3.5f)
                horizontalLineToRelative(6f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12.5f, 5f)
                verticalLineToRelative(6f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 11f)
                verticalLineTo(5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 3.5f)
            }
        }.build()
        
        return _Stop!!
    }

private var _Stop: ImageVector? = null

