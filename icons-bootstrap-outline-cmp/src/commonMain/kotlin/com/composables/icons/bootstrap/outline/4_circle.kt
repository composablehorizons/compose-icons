package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.`4Circle`: ImageVector
    get() {
        if (_4Circle != null) return _4Circle!!
        
        _4Circle = ImageVector.Builder(
            name = "4-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.519f, 5.057f)
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
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, true, false, 14f, 0f)
                arcTo(7f, 7f, 0f, false, false, 1f, 8f)
            }
        }.build()
        
        return _4Circle!!
    }

private var _4Circle: ImageVector? = null

