package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Cloudy_snowing: ImageVector
    get() {
        if (_Cloudy_snowing != null) return _Cloudy_snowing!!
        
        _Cloudy_snowing = ImageVector.Builder(
            name = "cloudy_snowing",
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
                moveTo(5f, 18f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(5f, 17.45f, 5f, 18f)
                close()
                moveTo(17f, 18f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(17f, 17.45f, 17f, 18f)
                close()
                moveTo(8f, 22f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(8f, 21.45f, 8f, 22f)
                close()
                moveTo(11f, 18f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(11f, 17.45f, 11f, 18f)
                close()
                moveTo(14f, 22f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(14f, 21.45f, 14f, 22f)
                close()
                moveTo(17.5f, 16f)
                horizontalLineToRelative(-10f)
                curveTo(4.47f, 16f, 2f, 13.53f, 2f, 10.5f)
                curveToRelative(0f, -2.76f, 2.09f, -5.09f, 4.78f, -5.44f)
                curveTo(7.83f, 3.18f, 9.82f, 2f, 12f, 2f)
                curveToRelative(2.97f, 0f, 5.45f, 2.18f, 5.92f, 5.02f)
                curveTo(20.21f, 7.23f, 22f, 9.16f, 22f, 11.5f)
                curveTo(22f, 13.98f, 19.98f, 16f, 17.5f, 16f)
                close()
            }
        }.build()
        
        return _Cloudy_snowing!!
    }

private var _Cloudy_snowing: ImageVector? = null

