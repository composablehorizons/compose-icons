package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Windows: ImageVector
    get() {
        if (_Windows != null) return _Windows!!
        
        _Windows = ImageVector.Builder(
            name = "windows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.555f, 1.375f)
                lineTo(0f, 2.237f)
                verticalLineToRelative(5.45f)
                horizontalLineToRelative(6.555f)
                close()
                moveTo(0f, 13.795f)
                lineToRelative(6.555f, 0.933f)
                verticalLineTo(8.313f)
                horizontalLineTo(0f)
                close()
                moveToRelative(7.278f, -5.4f)
                lineToRelative(0.026f, 6.378f)
                lineTo(16f, 16f)
                verticalLineTo(8.395f)
                close()
                moveTo(16f, 0f)
                lineTo(7.33f, 1.244f)
                verticalLineToRelative(6.414f)
                horizontalLineTo(16f)
                close()
            }
        }.build()
        
        return _Windows!!
    }

private var _Windows: ImageVector? = null

