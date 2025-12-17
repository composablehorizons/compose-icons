package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Animation: ImageVector
    get() {
        if (_Animation != null) return _Animation!!
        
        _Animation = ImageVector.Builder(
            name = "animation",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 2f)
                curveToRelative(-2.71f, 0f, -5.05f, 1.54f, -6.22f, 3.78f)
                curveToRelative(-1.28f, 0.67f, -2.34f, 1.72f, -3f, 3f)
                curveTo(3.54f, 9.95f, 2f, 12.29f, 2f, 15f)
                curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                curveToRelative(2.71f, 0f, 5.05f, -1.54f, 6.22f, -3.78f)
                curveToRelative(1.28f, -0.67f, 2.34f, -1.72f, 3f, -3f)
                curveTo(20.46f, 14.05f, 22f, 11.71f, 22f, 9f)
                curveToRelative(0f, -3.87f, -3.13f, -7f, -7f, -7f)
                close()
                moveTo(9f, 20f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -1.12f, 0.37f, -2.16f, 1f, -3f)
                curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                curveToRelative(-0.84f, 0.63f, -1.88f, 1f, -3f, 1f)
                close()
                moveToRelative(3f, -3f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -1.12f, 0.37f, -2.16f, 1f, -3f)
                curveToRelative(0f, 3.86f, 3.13f, 6.99f, 7f, 7f)
                curveToRelative(-0.84f, 0.63f, -1.88f, 1f, -3f, 1f)
                close()
                moveToRelative(4.7f, -3.3f)
                curveToRelative(-0.53f, 0.19f, -1.1f, 0.3f, -1.7f, 0.3f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -0.6f, 0.11f, -1.17f, 0.3f, -1.7f)
                curveToRelative(0.53f, -0.19f, 1.1f, -0.3f, 1.7f, -0.3f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 0.6f, -0.11f, 1.17f, -0.3f, 1.7f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, -3.86f, -3.13f, -6.99f, -7f, -7f)
                curveToRelative(0.84f, -0.63f, 1.87f, -1f, 3f, -1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 1.12f, -0.37f, 2.16f, -1f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
        }.build()
        
        return _Animation!!
    }

private var _Animation: ImageVector? = null

