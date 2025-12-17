package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.`7Circle`: ImageVector
    get() {
        if (_7Circle != null) return _7Circle!!
        
        _7Circle = ImageVector.Builder(
            name = "7-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(5.37f, 5.11f)
                horizontalLineToRelative(3.972f)
                verticalLineToRelative(0.07f)
                lineTo(6.025f, 12f)
                horizontalLineTo(7.42f)
                lineToRelative(3.258f, -6.85f)
                verticalLineTo(4.002f)
                horizontalLineTo(5.369f)
                verticalLineToRelative(1.107f)
                close()
            }
        }.build()
        
        return _7Circle!!
    }

private var _7Circle: ImageVector? = null

