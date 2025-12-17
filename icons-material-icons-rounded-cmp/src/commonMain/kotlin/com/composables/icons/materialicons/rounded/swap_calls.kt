package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Swap_calls: ImageVector
    get() {
        if (_Swap_calls != null) return _Swap_calls!!
        
        _Swap_calls = ImageVector.Builder(
            name = "swap_calls",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.65f, 4.35f)
                lineToRelative(-2.79f, 2.79f)
                curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.35f, 0.86f)
                horizontalLineTo(17f)
                verticalLineToRelative(6.88f)
                curveToRelative(0f, 1f, -0.67f, 1.93f, -1.66f, 2.09f)
                curveToRelative(-1.25f, 0.21f, -2.34f, -0.76f, -2.34f, -1.97f)
                verticalLineTo(8.17f)
                curveToRelative(0f, -2.09f, -1.53f, -3.95f, -3.61f, -4.15f)
                curveTo(7.01f, 3.79f, 5f, 5.66f, 5f, 8f)
                verticalLineToRelative(7f)
                horizontalLineTo(3.21f)
                curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(2.79f, -2.79f)
                curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f)
                horizontalLineTo(7f)
                verticalLineTo(8.12f)
                curveToRelative(0f, -1f, 0.67f, -1.93f, 1.66f, -2.09f)
                curveTo(9.91f, 5.82f, 11f, 6.79f, 11f, 8f)
                verticalLineToRelative(6.83f)
                curveToRelative(0f, 2.09f, 1.53f, 3.95f, 3.61f, 4.15f)
                curveTo(16.99f, 19.21f, 19f, 17.34f, 19f, 15f)
                verticalLineTo(8f)
                horizontalLineToRelative(1.79f)
                curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.7f, -0.01f)
                close()
            }
        }.build()
        
        return _Swap_calls!!
    }

private var _Swap_calls: ImageVector? = null

