package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.`4Square`: ImageVector
    get() {
        if (_4Square != null) return _4Square!!
        
        _4Square = ImageVector.Builder(
            name = "4-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.225f, 9.281f)
                verticalLineToRelative(0.053f)
                horizontalLineTo(8.85f)
                verticalLineTo(5.063f)
                horizontalLineToRelative(-0.065f)
                curveToRelative(-0.867f, 1.33f, -1.787f, 2.806f, -2.56f, 4.218f)
            }
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
                moveToRelative(5.519f, 5.057f)
                quadToRelative(0.33f, -0.527f, 0.657f, -1.055f)
                horizontalLineToRelative(1.933f)
                verticalLineToRelative(5.332f)
                horizontalLineToRelative(1.008f)
                verticalLineToRelative(1.107f)
                horizontalLineTo(10.11f)
                verticalLineTo(12f)
                horizontalLineTo(8.85f)
                verticalLineToRelative(-1.559f)
                horizontalLineTo(4.978f)
                verticalLineTo(9.322f)
                curveToRelative(0.77f, -1.427f, 1.656f, -2.847f, 2.542f, -4.265f)
                close()
            }
        }.build()
        
        return _4Square!!
    }

private var _4Square: ImageVector? = null

