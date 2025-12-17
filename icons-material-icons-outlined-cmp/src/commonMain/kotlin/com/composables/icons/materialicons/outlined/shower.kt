package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Shower: ImageVector
    get() {
        if (_Shower != null) return _Shower!!
        
        _Shower = ImageVector.Builder(
            name = "shower",
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
                    moveTo(9f, 17f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveTo(9f, 16.45f, 9f, 17f)
                    close()
                    moveTo(12f, 16f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                    reflectiveCurveTo(12.55f, 16f, 12f, 16f)
                    close()
                    moveTo(16f, 16f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveTo(16.55f, 16f, 16f, 16f)
                    close()
                    moveTo(19f, 12f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-2f)
                    curveToRelative(0f, -3.53f, 2.61f, -6.43f, 6f, -6.92f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2.08f)
                    curveTo(16.39f, 5.57f, 19f, 8.47f, 19f, 12f)
                    close()
                    moveTo(17f, 12f)
                    curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                    reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                    horizontalLineTo(17f)
                    close()
                    moveTo(8f, 19f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                    reflectiveCurveTo(8.55f, 19f, 8f, 19f)
                    close()
                    moveTo(12f, 19f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                    reflectiveCurveTo(12.55f, 19f, 12f, 19f)
                    close()
                    moveTo(16f, 19f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveTo(16.55f, 19f, 16f, 19f)
                    close()
                }
            }
        }.build()
        
        return _Shower!!
    }

private var _Shower: ImageVector? = null

