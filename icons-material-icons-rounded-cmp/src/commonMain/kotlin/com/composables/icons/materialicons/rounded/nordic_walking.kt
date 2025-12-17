package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Nordic_walking: ImageVector
    get() {
        if (_Nordic_walking != null) return _Nordic_walking!!
        
        _Nordic_walking = ImageVector.Builder(
            name = "nordic_walking",
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
                moveTo(18.25f, 23f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineToRelative(8.25f)
                curveTo(19f, 22.66f, 18.66f, 23f, 18.25f, 23f)
                close()
                moveTo(4.93f, 23f)
                curveToRelative(0.35f, 0f, 0.66f, -0.24f, 0.73f, -0.59f)
                lineTo(7.53f, 14f)
                horizontalLineTo(6f)
                lineToRelative(-1.8f, 8.09f)
                curveTo(4.1f, 22.56f, 4.45f, 23f, 4.93f, 23f)
                close()
                moveTo(13.5f, 5.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f)
                close()
                moveTo(14f, 23f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5.64f)
                curveToRelative(0f, -0.55f, -0.22f, -1.07f, -0.62f, -1.45f)
                lineTo(12.9f, 13.5f)
                lineToRelative(0.6f, -3f)
                curveToRelative(1.07f, 1.24f, 2.62f, 2.13f, 4.36f, 2.41f)
                curveToRelative(0.6f, 0.1f, 1.14f, -0.38f, 1.14f, -0.99f)
                curveToRelative(0f, -0.49f, -0.35f, -0.91f, -0.83f, -0.98f)
                curveToRelative(-1.53f, -0.24f, -2.79f, -1.14f, -3.47f, -2.33f)
                lineToRelative(-1f, -1.6f)
                curveToRelative(-0.56f, -0.89f, -1.68f, -1.25f, -2.66f, -0.84f)
                lineTo(7.22f, 7.78f)
                curveTo(6.48f, 8.1f, 6f, 8.82f, 6f, 9.62f)
                verticalLineTo(12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(9.6f)
                lineToRelative(1.8f, -0.7f)
                lineTo(7.25f, 21.76f)
                curveTo(7.12f, 22.4f, 7.61f, 23f, 8.27f, 23f)
                curveToRelative(0.49f, 0f, 0.91f, -0.34f, 1.02f, -0.81f)
                lineTo(10.9f, 15f)
                lineToRelative(2.1f, 2f)
                verticalLineToRelative(5f)
                curveTo(13f, 22.55f, 13.45f, 23f, 14f, 23f)
                close()
            }
        }.build()
        
        return _Nordic_walking!!
    }

private var _Nordic_walking: ImageVector? = null

