package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Payments: ImageVector
    get() {
        if (_Payments != null) return _Payments!!
        
        _Payments = ImageVector.Builder(
            name = "payments",
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
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(24f)
                    verticalLineTo(0f)
                    horizontalLineTo(0f)
                    close()
                    moveTo(1f, 13f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                    verticalLineToRelative(7f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(4f)
                    curveTo(2.34f, 16f, 1f, 14.66f, 1f, 13f)
                    close()
                    moveTo(23f, 18f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(8f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineTo(18f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(23f, 8f)
                    verticalLineToRelative(10f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(8f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveTo(23f, 7.45f, 23f, 8f)
                    close()
                    moveTo(4f, 16f)
                    curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                    verticalLineToRelative(7f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(4f)
                    close()
                    moveTo(7f, 10f)
                    curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                    reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                    reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                    reflectiveCurveTo(7f, 8.34f, 7f, 10f)
                    close()
                }
            }
        }.build()
        
        return _Payments!!
    }

private var _Payments: ImageVector? = null

