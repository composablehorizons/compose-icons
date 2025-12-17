package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.DatabaseFillExclamation: ImageVector
    get() {
        if (_DatabaseFillExclamation != null) return _DatabaseFillExclamation!!
        
        _DatabaseFillExclamation = ImageVector.Builder(
            name = "database-fill-exclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                curveToRelative(-1.573f, 0f, -3.022f, 0.289f, -4.096f, 0.777f)
                curveTo(2.875f, 2.245f, 2f, 2.993f, 2f, 4f)
                reflectiveCurveToRelative(0.875f, 1.755f, 1.904f, 2.223f)
                curveTo(4.978f, 6.711f, 6.427f, 7f, 8f, 7f)
                reflectiveCurveToRelative(3.022f, -0.289f, 4.096f, -0.777f)
                curveTo(13.125f, 5.755f, 14f, 5.007f, 14f, 4f)
                reflectiveCurveToRelative(-0.875f, -1.755f, -1.904f, -2.223f)
                curveTo(11.022f, 1.289f, 9.573f, 1f, 8f, 1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 7f)
                verticalLineToRelative(-0.839f)
                curveToRelative(0.457f, 0.432f, 1.004f, 0.751f, 1.49f, 0.972f)
                curveTo(4.722f, 7.693f, 6.318f, 8f, 8f, 8f)
                reflectiveCurveToRelative(3.278f, -0.307f, 4.51f, -0.867f)
                curveToRelative(0.486f, -0.22f, 1.033f, -0.54f, 1.49f, -0.972f)
                verticalLineTo(7f)
                curveToRelative(0f, 0.424f, -0.155f, 0.802f, -0.411f, 1.133f)
                arcToRelative(4.51f, 4.51f, 0f, false, false, -4.815f, 1.843f)
                arcTo(12f, 12f, 0f, false, true, 8f, 10f)
                curveToRelative(-1.573f, 0f, -3.022f, -0.289f, -4.096f, -0.777f)
                curveTo(2.875f, 8.755f, 2f, 8.007f, 2f, 7f)
                moveToRelative(6.257f, 3.998f)
                lineTo(8f, 11f)
                curveToRelative(-1.682f, 0f, -3.278f, -0.307f, -4.51f, -0.867f)
                curveToRelative(-0.486f, -0.22f, -1.033f, -0.54f, -1.49f, -0.972f)
                verticalLineTo(10f)
                curveToRelative(0f, 1.007f, 0.875f, 1.755f, 1.904f, 2.223f)
                curveTo(4.978f, 12.711f, 6.427f, 13f, 8f, 13f)
                horizontalLineToRelative(0.027f)
                arcToRelative(4.55f, 4.55f, 0f, false, true, 0.23f, -2.002f)
                moveToRelative(-0.002f, 3f)
                lineTo(8f, 14f)
                curveToRelative(-1.682f, 0f, -3.278f, -0.307f, -4.51f, -0.867f)
                curveToRelative(-0.486f, -0.22f, -1.033f, -0.54f, -1.49f, -0.972f)
                verticalLineTo(13f)
                curveToRelative(0f, 1.007f, 0.875f, 1.755f, 1.904f, 2.223f)
                curveTo(4.978f, 15.711f, 6.427f, 16f, 8f, 16f)
                curveToRelative(0.536f, 0f, 1.058f, -0.034f, 1.555f, -0.097f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -1.3f, -1.905f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 7f, 0f)
                moveToRelative(-3.5f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                moveToRelative(0f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
            }
        }.build()
        
        return _DatabaseFillExclamation!!
    }

private var _DatabaseFillExclamation: ImageVector? = null

