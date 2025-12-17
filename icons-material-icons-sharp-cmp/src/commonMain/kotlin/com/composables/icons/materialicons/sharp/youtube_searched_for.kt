package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Youtube_searched_for: ImageVector
    get() {
        if (_Youtube_searched_for != null) return _Youtube_searched_for!!
        
        _Youtube_searched_for = ImageVector.Builder(
            name = "youtube_searched_for",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.01f, 14f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-0.27f, -0.27f)
                curveToRelative(0.98f, -1.14f, 1.57f, -2.61f, 1.57f, -4.23f)
                curveToRelative(0f, -3.59f, -2.91f, -6.5f, -6.5f, -6.5f)
                reflectiveCurveToRelative(-6.5f, 3f, -6.5f, 6.5f)
                horizontalLineTo(2f)
                lineToRelative(3.84f, 4f)
                lineToRelative(4.16f, -4f)
                horizontalLineTo(6.51f)
                curveTo(6.51f, 7f, 8.53f, 5f, 11.01f, 5f)
                reflectiveCurveToRelative(4.5f, 2.01f, 4.5f, 4.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                curveToRelative(-0.65f, 0f, -1.26f, -0.14f, -1.82f, -0.38f)
                lineTo(7.71f, 15.1f)
                curveToRelative(0.97f, 0.57f, 2.09f, 0.9f, 3.3f, 0.9f)
                curveToRelative(1.61f, 0f, 3.08f, -0.59f, 4.22f, -1.57f)
                lineToRelative(0.27f, 0.27f)
                verticalLineToRelative(0.79f)
                lineToRelative(5.01f, 4.99f)
                lineTo(22f, 19f)
                lineToRelative(-4.99f, -5f)
                close()
            }
        }.build()
        
        return _Youtube_searched_for!!
    }

private var _Youtube_searched_for: ImageVector? = null

