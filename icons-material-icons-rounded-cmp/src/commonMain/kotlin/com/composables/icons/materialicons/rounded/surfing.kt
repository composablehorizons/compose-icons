package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Surfing: ImageVector
    get() {
        if (_Surfing != null) return _Surfing!!
        
        _Surfing = ImageVector.Builder(
            name = "surfing",
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
                moveTo(17f, 1.5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveTo(18.1f, 1.5f, 17f, 1.5f)
                close()
                moveTo(22f, 22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.03f, 0f, -2.05f, -0.25f, -3f, -0.75f)
                curveToRelative(-1.92f, 1.02f, -4.18f, 1f, -6.09f, -0.05f)
                curveToRelative(-1.79f, 0.87f, -3.92f, 0.98f, -5.58f, -0.14f)
                curveTo(5.3f, 22.69f, 4.15f, 23f, 3f, 23f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.87f, 0f, 1.73f, -0.24f, 2.53f, -0.7f)
                curveToRelative(0.29f, -0.16f, 0.65f, -0.17f, 0.94f, 0f)
                curveToRelative(1.59f, 0.9f, 3.48f, 0.9f, 5.06f, 0f)
                curveToRelative(0.29f, -0.16f, 0.65f, -0.16f, 0.94f, 0f)
                curveToRelative(1.59f, 0.9f, 3.48f, 0.9f, 5.06f, 0f)
                curveToRelative(0.29f, -0.16f, 0.65f, -0.16f, 0.94f, 0f)
                curveTo(19.27f, 20.76f, 20.13f, 21f, 21f, 21f)
                horizontalLineToRelative(0f)
                curveTo(21.55f, 21f, 22f, 21.45f, 22f, 22f)
                close()
                moveTo(8.04f, 18.86f)
                curveTo(8.35f, 18.95f, 8.67f, 19f, 9f, 19f)
                curveToRelative(0.9f, 0f, 1.72f, -0.37f, 2.39f, -0.91f)
                curveToRelative(0.35f, -0.28f, 0.87f, -0.28f, 1.22f, 0f)
                curveTo(13.28f, 18.63f, 14.1f, 19f, 15f, 19f)
                reflectiveCurveToRelative(1.72f, -0.37f, 2.39f, -0.91f)
                curveToRelative(0.03f, -0.03f, 0.07f, -0.05f, 0.11f, -0.07f)
                curveToRelative(-0.46f, -0.39f, -0.97f, -0.79f, -1.5f, -1.17f)
                verticalLineToRelative(-2.87f)
                curveToRelative(0f, -0.61f, -0.28f, -1.19f, -0.77f, -1.57f)
                lineTo(12.17f, 10f)
                lineToRelative(2.25f, -1.52f)
                curveToRelative(1.03f, 1.79f, 2.82f, 3.08f, 4.93f, 3.43f)
                curveToRelative(0.6f, 0.1f, 1.14f, -0.39f, 1.14f, -1f)
                curveToRelative(0f, -0.49f, -0.36f, -0.9f, -0.84f, -0.98f)
                curveToRelative(-1.5f, -0.25f, -2.78f, -1.18f, -3.51f, -2.46f)
                lineToRelative(-0.88f, -1.55f)
                curveToRelative(-0.29f, -0.52f, -0.77f, -0.8f, -1.22f, -0.89f)
                lineTo(9.31f, 4.15f)
                curveToRelative(-0.52f, -0.1f, -1.06f, 0.02f, -1.5f, 0.32f)
                lineTo(5.82f, 5.83f)
                curveTo(5.37f, 6.15f, 5.25f, 6.77f, 5.56f, 7.22f)
                curveTo(5.88f, 7.68f, 6.5f, 7.8f, 6.96f, 7.49f)
                lineToRelative(1.99f, -1.37f)
                lineToRelative(2f, 0.37f)
                lineTo(8.8f, 7.94f)
                curveTo(8.2f, 8.35f, 7.91f, 9.06f, 8.03f, 9.73f)
                lineToRelative(0.52f, 3.1f)
                curveTo(7.13f, 12.31f, 5.83f, 12f, 4.85f, 12f)
                curveTo(4.01f, 12f, 3f, 12.25f, 3f, 13.28f)
                curveTo(3f, 14.72f, 5.19f, 16.9f, 8.04f, 18.86f)
                close()
                moveTo(14f, 14f)
                verticalLineToRelative(1.5f)
                curveToRelative(-0.78f, -0.48f, -2.34f, -1.33f, -3.26f, -1.75f)
                lineTo(10.3f, 11.1f)
                lineTo(14f, 14f)
                close()
            }
        }.build()
        
        return _Surfing!!
    }

private var _Surfing: ImageVector? = null

