package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Thermostat_auto: ImageVector
    get() {
        if (_Thermostat_auto != null) return _Thermostat_auto!!
        
        _Thermostat_auto = ImageVector.Builder(
            name = "thermostat_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(11f, 12f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                    reflectiveCurveTo(5f, 4.34f, 5f, 6f)
                    verticalLineToRelative(6f)
                    curveToRelative(-1.21f, 0.91f, -2f, 2.37f, -2f, 4f)
                    curveToRelative(0f, 1.12f, 0.38f, 2.14f, 1f, 2.97f)
                    verticalLineTo(19f)
                    horizontalLineToRelative(0.02f)
                    curveToRelative(0.91f, 1.21f, 2.35f, 2f, 3.98f, 2f)
                    reflectiveCurveToRelative(3.06f, -0.79f, 3.98f, -2f)
                    horizontalLineTo(12f)
                    verticalLineToRelative(-0.03f)
                    curveToRelative(0.62f, -0.83f, 1f, -1.85f, 1f, -2.97f)
                    curveTo(13f, 14.37f, 12.21f, 12.91f, 11f, 12f)
                    close()
                    moveTo(5f, 16f)
                    curveToRelative(0f, -0.94f, 0.45f, -1.84f, 1.2f, -2.4f)
                    lineTo(7f, 13f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(7f)
                    lineToRelative(0.8f, 0.6f)
                    curveToRelative(0.75f, 0.57f, 1.2f, 1.46f, 1.2f, 2.4f)
                    horizontalLineTo(5f)
                    close()
                    moveTo(18.62f, 4f)
                    horizontalLineToRelative(-1.61f)
                    lineToRelative(-3.38f, 9f)
                    horizontalLineToRelative(1.56f)
                    lineTo(16f, 10.7f)
                    horizontalLineToRelative(3.63f)
                    lineToRelative(0.8f, 2.3f)
                    horizontalLineTo(22f)
                    lineTo(18.62f, 4f)
                    close()
                    moveTo(16.47f, 9.39f)
                    lineToRelative(1.31f, -3.72f)
                    horizontalLineToRelative(0.08f)
                    lineToRelative(1.31f, 3.72f)
                    horizontalLineTo(16.47f)
                    close()
                }
            }
        }.build()
        
        return _Thermostat_auto!!
    }

private var _Thermostat_auto: ImageVector? = null

