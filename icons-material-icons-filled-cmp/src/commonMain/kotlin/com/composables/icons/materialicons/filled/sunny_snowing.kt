package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sunny_snowing: ImageVector
    get() {
        if (_Sunny_snowing != null) return _Sunny_snowing!!
        
        _Sunny_snowing = ImageVector.Builder(
            name = "sunny_snowing",
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
                moveTo(11f, 4f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveTo(11f, 4.55f, 11f, 4f)
                close()
                moveTo(18.36f, 7.05f)
                lineToRelative(1.41f, -1.42f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-1.41f, 1.42f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveTo(17.34f, 7.44f, 17.97f, 7.44f, 18.36f, 7.05f)
                close()
                moveTo(22f, 11f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveTo(22.55f, 11f, 22f, 11f)
                close()
                moveTo(5.64f, 7.05f)
                lineTo(4.22f, 5.64f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.03f, 0f, -1.41f)
                reflectiveCurveToRelative(1.03f, -0.39f, 1.41f, 0f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.03f, 0f, 1.41f)
                reflectiveCurveTo(6.02f, 7.44f, 5.64f, 7.05f)
                close()
                moveTo(2f, 13f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveTo(1.45f, 13f, 2f, 13f)
                close()
                moveTo(7f, 13.5f)
                curveToRelative(0.55f, 0f, 9.45f, 0f, 10f, 0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.29f)
                curveToRelative(0f, -3.05f, -2.19f, -5.77f, -5.21f, -6.16f)
                curveTo(9.13f, 5.58f, 6f, 8.43f, 6f, 12f)
                verticalLineToRelative(0.5f)
                curveTo(6f, 13.05f, 6.45f, 13.5f, 7f, 13.5f)
                close()
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
            }
        }.build()
        
        return _Sunny_snowing!!
    }

private var _Sunny_snowing: ImageVector? = null

