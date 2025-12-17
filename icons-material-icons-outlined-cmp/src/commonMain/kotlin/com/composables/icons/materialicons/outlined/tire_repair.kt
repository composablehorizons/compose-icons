package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Tire_repair: ImageVector
    get() {
        if (_Tire_repair != null) return _Tire_repair!!
        
        _Tire_repair = ImageVector.Builder(
            name = "tire_repair",
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
                    moveTo(19f, 8f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.28f, 0.11f, -0.53f, 0.29f, -0.71f)
                    curveToRelative(0.4f, -0.4f, 2.46f, -1.04f, 2.46f, -1.04f)
                    reflectiveCurveToRelative(-0.64f, 2.06f, -1.04f, 2.46f)
                    curveTo(19.53f, 7.89f, 19.28f, 8f, 19f, 8f)
                    close()
                    moveTo(20f, 13f)
                    verticalLineToRelative(5f)
                    curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                    reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                    verticalLineToRelative(-2f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(6f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineToRelative(8.17f)
                    curveToRelative(0.31f, -0.11f, 0.65f, -0.17f, 1f, -0.17f)
                    curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-5f)
                    horizontalLineToRelative(-1f)
                    lineToRelative(0f, -1.42f)
                    curveToRelative(-1.77f, -0.77f, -3f, -2.53f, -3f, -4.58f)
                    curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                    reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                    curveToRelative(0f, 2.05f, -1.23f, 3.81f, -3f, 4.58f)
                    lineTo(21f, 13f)
                    horizontalLineTo(20f)
                    close()
                    moveTo(22f, 7f)
                    curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                    reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                    reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                    reflectiveCurveTo(22f, 8.66f, 22f, 7f)
                    close()
                    moveTo(10f, 7f)
                    lineTo(8f, 9f)
                    verticalLineTo(6.17f)
                    lineTo(9.17f, 5f)
                    horizontalLineTo(4.83f)
                    lineTo(6f, 6.17f)
                    verticalLineTo(9f)
                    lineTo(4f, 7f)
                    verticalLineToRelative(2.17f)
                    lineToRelative(2f, 2f)
                    verticalLineTo(14f)
                    lineToRelative(-2f, -2f)
                    verticalLineToRelative(2.17f)
                    lineToRelative(2f, 2f)
                    verticalLineTo(19f)
                    lineToRelative(-2f, -2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(-2f)
                    lineToRelative(-2f, 2f)
                    verticalLineToRelative(-2.83f)
                    lineToRelative(2f, -2f)
                    verticalLineTo(12f)
                    lineToRelative(-2f, 2f)
                    verticalLineToRelative(-2.83f)
                    lineToRelative(2f, -2f)
                    verticalLineTo(7f)
                    close()
                }
            }
        }.build()
        
        return _Tire_repair!!
    }

private var _Tire_repair: ImageVector? = null

