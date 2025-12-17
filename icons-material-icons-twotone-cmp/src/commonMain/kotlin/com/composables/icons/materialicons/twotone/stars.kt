package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Stars: ImageVector
    get() {
        if (_Stars != null) return _Stars!!
        
        _Stars = ImageVector.Builder(
            name = "stars",
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
                moveTo(19.47f, 9.16f)
                curveToRelative(-1.1f, -2.87f, -3.8f, -4.95f, -7.01f, -5.14f)
                lineToRelative(2f, 4.71f)
                lineToRelative(5.01f, 0.43f)
                close()
                moveToRelative(-7.93f, -5.14f)
                curveToRelative(-3.22f, 0.18f, -5.92f, 2.27f, -7.02f, 5.15f)
                lineToRelative(5.02f, -0.43f)
                lineToRelative(2f, -4.72f)
                close()
                moveToRelative(-7.31f, 6.12f)
                curveTo(4.08f, 10.74f, 4f, 11.36f, 4f, 12f)
                curveToRelative(0f, 2.48f, 1.14f, 4.7f, 2.91f, 6.17f)
                lineToRelative(1.11f, -4.75f)
                lineToRelative(-3.79f, -3.28f)
                close()
                moveToRelative(15.54f, -0.01f)
                lineToRelative(-3.79f, 3.28f)
                lineToRelative(1.1f, 4.76f)
                curveTo(18.86f, 16.7f, 20f, 14.48f, 20f, 12f)
                curveToRelative(0f, -0.64f, -0.09f, -1.27f, -0.23f, -1.87f)
                close()
                moveTo(7.84f, 18.82f)
                curveToRelative(1.21f, 0.74f, 2.63f, 1.18f, 4.15f, 1.18f)
                curveToRelative(1.53f, 0f, 2.95f, -0.44f, 4.17f, -1.18f)
                lineTo(12f, 16.31f)
                lineToRelative(-4.16f, 2.51f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.99f, 2f)
                curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.47f, 10f, 9.99f, 10f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                reflectiveCurveTo(17.52f, 2f, 11.99f, 2f)
                close()
                moveToRelative(7.48f, 7.16f)
                lineToRelative(-5.01f, -0.43f)
                lineToRelative(-2f, -4.71f)
                curveToRelative(3.21f, 0.19f, 5.91f, 2.27f, 7.01f, 5.14f)
                close()
                moveTo(12f, 8.06f)
                lineToRelative(1.09f, 2.56f)
                lineToRelative(2.78f, 0.24f)
                lineToRelative(-2.11f, 1.83f)
                lineToRelative(0.63f, 2.73f)
                lineTo(12f, 13.98f)
                lineToRelative(-2.39f, 1.44f)
                lineToRelative(0.63f, -2.72f)
                lineToRelative(-2.11f, -1.83f)
                lineToRelative(2.78f, -0.24f)
                lineTo(12f, 8.06f)
                close()
                moveToRelative(-0.46f, -4.04f)
                lineToRelative(-2f, 4.72f)
                lineToRelative(-5.02f, 0.43f)
                curveToRelative(1.1f, -2.88f, 3.8f, -4.97f, 7.02f, -5.15f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -0.64f, 0.08f, -1.26f, 0.23f, -1.86f)
                lineToRelative(3.79f, 3.28f)
                lineToRelative(-1.11f, 4.75f)
                curveTo(5.14f, 16.7f, 4f, 14.48f, 4f, 12f)
                close()
                moveToRelative(7.99f, 8f)
                curveToRelative(-1.52f, 0f, -2.94f, -0.44f, -4.15f, -1.18f)
                lineTo(12f, 16.31f)
                lineToRelative(4.16f, 2.51f)
                curveToRelative(-1.22f, 0.74f, -2.64f, 1.18f, -4.17f, 1.18f)
                close()
                moveToRelative(5.1f, -1.83f)
                lineToRelative(-1.1f, -4.76f)
                lineToRelative(3.79f, -3.28f)
                curveToRelative(0.13f, 0.6f, 0.22f, 1.23f, 0.22f, 1.87f)
                curveToRelative(0f, 2.48f, -1.14f, 4.7f, -2.91f, 6.17f)
                close()
            }
        }.build()
        
        return _Stars!!
    }

private var _Stars: ImageVector? = null

