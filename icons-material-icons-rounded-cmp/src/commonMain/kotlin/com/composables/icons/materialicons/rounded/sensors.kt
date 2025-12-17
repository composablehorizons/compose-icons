package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sensors: ImageVector
    get() {
        if (_Sensors != null) return _Sensors!!
        
        _Sensors = ImageVector.Builder(
            name = "sensors",
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
                moveTo(8.54f, 8.54f)
                curveToRelative(0.35f, 0.35f, 0.37f, 0.88f, 0.1f, 1.29f)
                curveTo(8.24f, 10.45f, 8f, 11.2f, 8f, 12f)
                curveToRelative(0f, 0.8f, 0.24f, 1.55f, 0.64f, 2.17f)
                curveToRelative(0.27f, 0.41f, 0.24f, 0.95f, -0.11f, 1.29f)
                curveToRelative(-0.43f, 0.43f, -1.17f, 0.4f, -1.51f, -0.11f)
                curveTo(6.38f, 14.4f, 6f, 13.24f, 6f, 12f)
                curveToRelative(0f, -1.21f, 0.36f, -2.33f, 0.97f, -3.28f)
                curveTo(7.33f, 8.18f, 8.08f, 8.08f, 8.54f, 8.54f)
                close()
                moveTo(15.46f, 15.46f)
                curveToRelative(0.43f, 0.43f, 1.17f, 0.4f, 1.51f, -0.11f)
                curveTo(17.62f, 14.4f, 18f, 13.24f, 18f, 12f)
                curveToRelative(0f, -1.24f, -0.38f, -2.4f, -1.03f, -3.36f)
                curveToRelative(-0.34f, -0.5f, -1.08f, -0.54f, -1.51f, -0.11f)
                curveToRelative(-0.35f, 0.35f, -0.37f, 0.88f, -0.11f, 1.29f)
                curveTo(15.76f, 10.45f, 16f, 11.2f, 16f, 12f)
                curveToRelative(0f, 0.8f, -0.24f, 1.55f, -0.64f, 2.17f)
                curveTo(15.09f, 14.58f, 15.12f, 15.12f, 15.46f, 15.46f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveTo(13.1f, 10f, 12f, 10f)
                close()
                moveTo(18.32f, 18.32f)
                curveToRelative(0.42f, 0.42f, 1.12f, 0.39f, 1.5f, -0.08f)
                curveTo(21.18f, 16.53f, 22f, 14.36f, 22f, 12f)
                reflectiveCurveToRelative(-0.82f, -4.53f, -2.18f, -6.24f)
                curveToRelative(-0.37f, -0.47f, -1.07f, -0.5f, -1.5f, -0.08f)
                curveToRelative(-0.36f, 0.36f, -0.4f, 0.92f, -0.08f, 1.32f)
                curveToRelative(1.1f, 1.37f, 1.76f, 3.11f, 1.76f, 5f)
                reflectiveCurveToRelative(-0.66f, 3.63f, -1.76f, 5f)
                curveTo(17.92f, 17.39f, 17.96f, 17.96f, 18.32f, 18.32f)
                close()
                moveTo(5.68f, 5.68f)
                curveToRelative(-0.42f, -0.42f, -1.12f, -0.39f, -1.5f, 0.08f)
                curveTo(2.82f, 7.47f, 2f, 9.64f, 2f, 12f)
                reflectiveCurveToRelative(0.82f, 4.53f, 2.18f, 6.24f)
                curveToRelative(0.37f, 0.47f, 1.07f, 0.5f, 1.5f, 0.08f)
                curveToRelative(0.36f, -0.36f, 0.4f, -0.92f, 0.08f, -1.32f)
                curveTo(4.66f, 15.63f, 4f, 13.89f, 4f, 12f)
                reflectiveCurveToRelative(0.66f, -3.63f, 1.76f, -5f)
                curveTo(6.08f, 6.61f, 6.04f, 6.04f, 5.68f, 5.68f)
                close()
            }
        }.build()
        
        return _Sensors!!
    }

private var _Sensors: ImageVector? = null

