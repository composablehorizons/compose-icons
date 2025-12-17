package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.`1Circle`: ImageVector
    get() {
        if (_1Circle != null) return _1Circle!!
        
        _1Circle = ImageVector.Builder(
            name = "1-circle",
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
                moveTo(9.283f, 4.002f)
                horizontalLineTo(7.971f)
                lineTo(6.072f, 5.385f)
                verticalLineToRelative(1.271f)
                lineToRelative(1.834f, -1.318f)
                horizontalLineToRelative(0.065f)
                verticalLineTo(12f)
                horizontalLineToRelative(1.312f)
                close()
            }
        }.build()
        
        return _1Circle!!
    }

private var _1Circle: ImageVector? = null

