package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Sports_bar: ImageVector
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
                moveTo(15f, 19f)
                horizontalLineTo(8f)
                lineToRelative(0f, -6.63f)
                curveToRelative(1.26f, -0.34f, 2.11f, -1.27f, 2.77f, -1.99f)
                curveTo(11.6f, 9.47f, 12.08f, 9f, 13f, 9f)
                lineToRelative(2f, 0f)
                verticalLineTo(19f)
                close()
                moveTo(10f, 2.02f)
                curveToRelative(-1.89f, 0f, -3.51f, 1.11f, -4.27f, 2.71f)
                curveTo(4.15f, 5.26f, 3f, 6.74f, 3f, 8.5f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                lineTo(6f, 21f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1.56f)
                curveTo(17.79f, 8.41f, 18f, 7.73f, 18f, 7f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-0.34f, 0f, -0.66f, 0.05f, -0.98f, 0.13f)
                curveTo(12.2f, 2.45f, 11.16f, 2.02f, 10f, 2.02f)
                lineTo(10f, 2.02f)
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
                curveTo(7f, 10.5f, 7f, 10.5f, 7f, 10.5f)
                lineTo(7f, 10.5f)
                close()
                moveTo(17f, 17f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineTo(17f)
                lineTo(17f, 17f)
                close()
            }
        }.build()
        
        return _Sports_bar!!
    }

private var _Sports_bar: ImageVector? = null

