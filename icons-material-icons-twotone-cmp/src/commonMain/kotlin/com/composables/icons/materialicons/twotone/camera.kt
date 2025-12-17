package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
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
                moveTo(10.9f, 19.91f)
                curveToRelative(0.36f, 0.05f, 0.72f, 0.09f, 1.1f, 0.09f)
                curveToRelative(2.18f, 0f, 4.16f, -0.88f, 5.61f, -2.3f)
                lineTo(14.89f, 13f)
                lineToRelative(-3.99f, 6.91f)
                close()
                moveToRelative(-1.04f, -0.21f)
                lineToRelative(2.71f, -4.7f)
                horizontalLineTo(4.59f)
                curveToRelative(0.93f, 2.28f, 2.87f, 4.03f, 5.27f, 4.7f)
                close()
                moveTo(8.54f, 12f)
                lineTo(5.7f, 7.09f)
                curveTo(4.64f, 8.45f, 4f, 10.15f, 4f, 12f)
                curveToRelative(0f, 0.69f, 0.1f, 1.36f, 0.26f, 2f)
                horizontalLineToRelative(5.43f)
                lineToRelative(-1.15f, -2f)
                close()
                moveToRelative(9.76f, 4.91f)
                curveTo(19.36f, 15.55f, 20f, 13.85f, 20f, 12f)
                curveToRelative(0f, -0.69f, -0.1f, -1.36f, -0.26f, -2f)
                horizontalLineToRelative(-5.43f)
                lineToRelative(3.99f, 6.91f)
                close()
                moveTo(13.73f, 9f)
                horizontalLineToRelative(5.68f)
                curveToRelative(-0.93f, -2.28f, -2.88f, -4.04f, -5.28f, -4.7f)
                lineTo(11.42f, 9f)
                horizontalLineToRelative(2.31f)
                close()
                moveToRelative(-3.46f, 0f)
                lineToRelative(2.83f, -4.92f)
                curveTo(12.74f, 4.03f, 12.37f, 4f, 12f, 4f)
                curveToRelative(-2.18f, 0f, -4.16f, 0.88f, -5.6f, 2.3f)
                lineTo(9.12f, 11f)
                lineToRelative(1.15f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 22f)
                curveToRelative(5.52f, 0f, 10f, -4.48f, 10f, -10f)
                curveToRelative(0f, -4.75f, -3.31f, -8.72f, -7.75f, -9.74f)
                lineToRelative(-0.08f, -0.04f)
                lineToRelative(-0.01f, 0.02f)
                curveTo(13.46f, 2.09f, 12.74f, 2f, 12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                close()
                moveToRelative(0f, -2f)
                curveToRelative(-0.38f, 0f, -0.74f, -0.04f, -1.1f, -0.09f)
                lineTo(14.89f, 13f)
                lineToRelative(2.72f, 4.7f)
                curveTo(16.16f, 19.12f, 14.18f, 20f, 12f, 20f)
                close()
                moveToRelative(8f, -8f)
                curveToRelative(0f, 1.85f, -0.64f, 3.55f, -1.7f, 4.91f)
                lineToRelative(-4f, -6.91f)
                horizontalLineToRelative(5.43f)
                curveToRelative(0.17f, 0.64f, 0.27f, 1.31f, 0.27f, 2f)
                close()
                moveToRelative(-0.59f, -3f)
                horizontalLineToRelative(-7.99f)
                lineToRelative(2.71f, -4.7f)
                curveToRelative(2.4f, 0.66f, 4.35f, 2.42f, 5.28f, 4.7f)
                close()
                moveTo(12f, 4f)
                curveToRelative(0.37f, 0f, 0.74f, 0.03f, 1.1f, 0.08f)
                lineTo(10.27f, 9f)
                lineToRelative(-1.15f, 2f)
                lineTo(6.4f, 6.3f)
                curveTo(7.84f, 4.88f, 9.82f, 4f, 12f, 4f)
                close()
                moveToRelative(-8f, 8f)
                curveToRelative(0f, -1.85f, 0.64f, -3.55f, 1.7f, -4.91f)
                lineTo(8.54f, 12f)
                lineToRelative(1.15f, 2f)
                horizontalLineTo(4.26f)
                curveTo(4.1f, 13.36f, 4f, 12.69f, 4f, 12f)
                close()
                moveToRelative(6.27f, 3f)
                horizontalLineToRelative(2.3f)
                lineToRelative(-2.71f, 4.7f)
                curveToRelative(-2.4f, -0.67f, -4.35f, -2.42f, -5.28f, -4.7f)
                horizontalLineToRelative(5.69f)
                close()
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

