package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sports_bar: ImageVector
    get() {
        if (_Sports_bar != null) return _Sports_bar!!
        
        _Sports_bar = ImageVector.Builder(
            name = "sports_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 9f)
                horizontalLineToRelative(-1.56f)
                curveToRelative(0.33f, -0.55f, 0.53f, -1.18f, 0.55f, -1.86f)
                curveToRelative(0.04f, -1.03f, -0.43f, -1.99f, -1.16f, -2.71f)
                curveToRelative(-1.54f, -1.54f, -2.74f, -1.56f, -3.82f, -1.29f)
                curveTo(12.2f, 2.45f, 11.16f, 2.02f, 10f, 2.02f)
                curveToRelative(-1.89f, 0f, -3.51f, 1.11f, -4.27f, 2.71f)
                curveTo(4.15f, 5.26f, 3f, 6.74f, 3f, 8.5f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                lineTo(6f, 19f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(7f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(0f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-6f)
                curveTo(21f, 9.9f, 20.1f, 9f, 19f, 9f)
                close()
                moveTo(7f, 10.5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.85f, 0.55f, -1.6f, 1.37f, -1.88f)
                lineToRelative(0.8f, -0.27f)
                lineToRelative(0.36f, -0.76f)
                curveTo(8f, 4.62f, 8.94f, 4.02f, 10f, 4.02f)
                curveToRelative(0.79f, 0f, 1.39f, 0.35f, 1.74f, 0.65f)
                lineToRelative(0.78f, 0.65f)
                curveToRelative(0f, 0f, 0.64f, -0.32f, 1.47f, -0.32f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0f, -3f, 0f, -3f, 0f)
                curveTo(9.67f, 7f, 9.15f, 10.5f, 7f, 10.5f)
                close()
                moveTo(19f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineTo(17f)
                close()
            }
        }.build()
        
        return _Sports_bar!!
    }

private var _Sports_bar: ImageVector? = null

