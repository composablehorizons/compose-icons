package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Bathroom: ImageVector
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
                    moveTo(22f, 2f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(20f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(2f)
                    close()
                    moveTo(9f, 18f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(9.55f, 18f, 9f, 18f)
                    close()
                    moveTo(9f, 15f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(9.55f, 15f, 9f, 15f)
                    close()
                    moveTo(12f, 18f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(12.55f, 18f, 12f, 18f)
                    close()
                    moveTo(12f, 15f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(12.55f, 15f, 12f, 15f)
                    close()
                    moveTo(15f, 18f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(15.55f, 18f, 15f, 18f)
                    close()
                    moveTo(15f, 15f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(15.55f, 15f, 15f, 15f)
                    close()
                    moveTo(17f, 12f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                    reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                    verticalLineTo(12f)
                    close()
                }
            }
        }.build()
        
        return _Bathroom!!
    }

private var _Bathroom: ImageVector? = null

