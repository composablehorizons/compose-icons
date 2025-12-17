package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Bathroom: ImageVector
    get() {
        if (_Bathroom != null) return _Bathroom!!
        
        _Bathroom = ImageVector.Builder(
            name = "bathroom",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(8f, 14f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                    reflectiveCurveTo(8f, 14.55f, 8f, 14f)
                    close()
                    moveTo(12f, 15f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    reflectiveCurveTo(11.45f, 15f, 12f, 15f)
                    close()
                    moveTo(15f, 15f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    reflectiveCurveTo(14.45f, 15f, 15f, 15f)
                    close()
                    moveTo(12f, 7.5f)
                    curveToRelative(-1.76f, 0f, -3.22f, 1.31f, -3.46f, 3f)
                    horizontalLineToRelative(6.93f)
                    curveTo(15.22f, 8.81f, 13.76f, 7.5f, 12f, 7.5f)
                    moveTo(12f, 6f)
                    curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-1f)
                    curveTo(7f, 8.24f, 9.24f, 6f, 12f, 6f)
                    close()
                    moveTo(9f, 18f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    reflectiveCurveTo(8.45f, 18f, 9f, 18f)
                    close()
                    moveTo(12f, 18f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    reflectiveCurveTo(11.45f, 18f, 12f, 18f)
                    close()
                    moveTo(15f, 18f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    reflectiveCurveTo(14.45f, 18f, 15f, 18f)
                    close()
                    moveTo(20f, 4f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(4f)
                    moveTo(20f, 2f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineTo(20f)
                    close()
                }
            }
        }.build()
        
        return _Bathroom!!
    }

private var _Bathroom: ImageVector? = null

