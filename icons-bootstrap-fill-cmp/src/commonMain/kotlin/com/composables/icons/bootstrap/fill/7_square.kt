package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.`7Square`: ImageVector
    get() {
        if (_7Square != null) return _7Square!!
        
        _7Square = ImageVector.Builder(
            name = "7-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(3.37f, 5.11f)
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
        
        return _7Square!!
    }

private var _7Square: ImageVector? = null

