package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sort_by_alpha: ImageVector
    get() {
        if (_Sort_by_alpha != null) return _Sort_by_alpha!!
        
        _Sort_by_alpha = ImageVector.Builder(
            name = "sort_by_alpha",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.93f, 2.65f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-2.01f, 2.01f)
                horizontalLineToRelative(4.72f)
                lineToRelative(-2f, -2.01f)
                close()
                moveToRelative(-0.7f, 18.7f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(1.98f, -1.98f)
                horizontalLineToRelative(-4.66f)
                lineToRelative(1.97f, 1.98f)
                close()
                moveToRelative(-1.25f, -3.62f)
                curveToRelative(0.6f, 0f, 1.01f, -0.6f, 0.79f, -1.16f)
                lineTo(8.04f, 7.03f)
                curveToRelative(-0.18f, -0.46f, -0.63f, -0.76f, -1.12f, -0.76f)
                curveToRelative(-0.49f, 0f, -0.94f, 0.3f, -1.12f, 0.76f)
                lineToRelative(-3.74f, 9.53f)
                curveToRelative(-0.22f, 0.56f, 0.19f, 1.16f, 0.79f, 1.16f)
                curveToRelative(0.35f, 0f, 0.67f, -0.22f, 0.8f, -0.55f)
                lineToRelative(0.71f, -1.9f)
                horizontalLineToRelative(5.11f)
                lineToRelative(0.71f, 1.9f)
                curveToRelative(0.13f, 0.34f, 0.45f, 0.56f, 0.8f, 0.56f)
                close()
                moveToRelative(-6.01f, -4.09f)
                lineToRelative(1.94f, -5.18f)
                lineToRelative(1.94f, 5.18f)
                horizontalLineTo(4.97f)
                close()
                moveToRelative(16.08f, 2.5f)
                horizontalLineToRelative(-5.33f)
                lineToRelative(5.72f, -8.29f)
                curveToRelative(0.46f, -0.66f, -0.02f, -1.57f, -0.82f, -1.57f)
                horizontalLineToRelative(-6.48f)
                curveToRelative(-0.44f, 0f, -0.79f, 0.36f, -0.79f, 0.8f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 0.44f, 0.36f, 0.8f, 0.79f, 0.8f)
                horizontalLineToRelative(5.09f)
                lineToRelative(-5.73f, 8.28f)
                curveToRelative(-0.46f, 0.66f, 0.02f, 1.57f, 0.82f, 1.57f)
                horizontalLineToRelative(6.72f)
                curveToRelative(0.44f, 0f, 0.79f, -0.36f, 0.79f, -0.79f)
                curveToRelative(0.02f, -0.45f, -0.34f, -0.81f, -0.78f, -0.81f)
                close()
            }
        }.build()
        
        return _Sort_by_alpha!!
    }

private var _Sort_by_alpha: ImageVector? = null

