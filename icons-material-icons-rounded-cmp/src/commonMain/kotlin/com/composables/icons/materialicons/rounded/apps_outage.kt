package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Apps_outage: ImageVector
    get() {
        if (_Apps_outage != null) return _Apps_outage!!
        
        _Apps_outage = ImageVector.Builder(
            name = "apps_outage",
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
                moveTo(6f, 8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveTo(7.1f, 4f, 6f, 4f)
                reflectiveCurveTo(4f, 4.9f, 4f, 6f)
                reflectiveCurveTo(4.9f, 8f, 6f, 8f)
                close()
                moveTo(12f, 20f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveTo(10.9f, 20f, 12f, 20f)
                close()
                moveTo(6f, 20f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveTo(4.9f, 20f, 6f, 20f)
                close()
                moveTo(6f, 14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveTo(4.9f, 14f, 6f, 14f)
                close()
                moveTo(12f, 14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveTo(10.9f, 14f, 12f, 14f)
                close()
                moveTo(12.07f, 4f)
                curveTo(12.05f, 4f, 12.02f, 4f, 12f, 4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.22f, 0f, 0.43f, -0.04f, 0.63f, -0.1f)
                curveTo(12.22f, 7.01f, 12f, 6.03f, 12f, 5f)
                curveTo(12f, 4.66f, 12.02f, 4.33f, 12.07f, 4f)
                close()
                moveTo(19f, 12f)
                curveToRelative(-1.03f, 0f, -2.01f, -0.22f, -2.9f, -0.63f)
                curveTo(16.04f, 11.57f, 16f, 11.78f, 16f, 12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.02f, 0f, -0.05f, 0f, -0.07f)
                curveTo(19.67f, 11.98f, 19.34f, 12f, 19f, 12f)
                close()
                moveTo(18f, 20f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveTo(16.9f, 20f, 18f, 20f)
                close()
                moveTo(19f, 0f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(21.76f, 0f, 19f, 0f)
                close()
                moveTo(19.5f, 7.5f)
                curveTo(19.5f, 7.78f, 19.28f, 8f, 19f, 8f)
                curveToRelative(-0.27f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveTo(18.72f, 7f, 19f, 7f)
                reflectiveCurveTo(19.5f, 7.22f, 19.5f, 7.5f)
                close()
                moveTo(19f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                curveTo(18.5f, 2.22f, 18.72f, 2f, 19f, 2f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                curveTo(19.5f, 5.78f, 19.28f, 6f, 19f, 6f)
                close()
            }
        }.build()
        
        return _Apps_outage!!
    }

private var _Apps_outage: ImageVector? = null

