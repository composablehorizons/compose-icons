package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.`7Circle`: ImageVector
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
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, true, false, 14f, 0f)
                arcTo(7f, 7f, 0f, false, false, 1f, 8f)
                moveToRelative(15f, 0f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(5.37f, 5.11f)
                verticalLineTo(4.001f)
                horizontalLineToRelative(5.308f)
                verticalLineTo(5.15f)
                lineTo(7.42f, 12f)
                horizontalLineTo(6.025f)
                lineToRelative(3.317f, -6.82f)
                verticalLineToRelative(-0.07f)
                horizontalLineTo(5.369f)
                close()
            }
        }.build()
        
        return _7Circle!!
    }

private var _7Circle: ImageVector? = null

