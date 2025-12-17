package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Database: ImageVector
    get() {
        if (_Database != null) return _Database!!
        
        _Database = ImageVector.Builder(
            name = "database",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.904f, 1.777f)
                curveTo(4.978f, 1.289f, 6.427f, 1f, 8f, 1f)
                reflectiveCurveToRelative(3.022f, 0.289f, 4.096f, 0.777f)
                curveTo(13.125f, 2.245f, 14f, 2.993f, 14f, 4f)
                reflectiveCurveToRelative(-0.875f, 1.755f, -1.904f, 2.223f)
                curveTo(11.022f, 6.711f, 9.573f, 7f, 8f, 7f)
                reflectiveCurveToRelative(-3.022f, -0.289f, -4.096f, -0.777f)
                curveTo(2.875f, 5.755f, 2f, 5.007f, 2f, 4f)
                reflectiveCurveToRelative(0.875f, -1.755f, 1.904f, -2.223f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 6.161f)
                verticalLineTo(7f)
                curveToRelative(0f, 1.007f, 0.875f, 1.755f, 1.904f, 2.223f)
                curveTo(4.978f, 9.71f, 6.427f, 10f, 8f, 10f)
                reflectiveCurveToRelative(3.022f, -0.289f, 4.096f, -0.777f)
                curveTo(13.125f, 8.755f, 14f, 8.007f, 14f, 7f)
                verticalLineToRelative(-0.839f)
                curveToRelative(-0.457f, 0.432f, -1.004f, 0.751f, -1.49f, 0.972f)
                curveTo(11.278f, 7.693f, 9.682f, 8f, 8f, 8f)
                reflectiveCurveToRelative(-3.278f, -0.307f, -4.51f, -0.867f)
                curveToRelative(-0.486f, -0.22f, -1.033f, -0.54f, -1.49f, -0.972f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 9.161f)
                verticalLineTo(10f)
                curveToRelative(0f, 1.007f, 0.875f, 1.755f, 1.904f, 2.223f)
                curveTo(4.978f, 12.711f, 6.427f, 13f, 8f, 13f)
                reflectiveCurveToRelative(3.022f, -0.289f, 4.096f, -0.777f)
                curveTo(13.125f, 11.755f, 14f, 11.007f, 14f, 10f)
                verticalLineToRelative(-0.839f)
                curveToRelative(-0.457f, 0.432f, -1.004f, 0.751f, -1.49f, 0.972f)
                curveToRelative(-1.232f, 0.56f, -2.828f, 0.867f, -4.51f, 0.867f)
                reflectiveCurveToRelative(-3.278f, -0.307f, -4.51f, -0.867f)
                curveToRelative(-0.486f, -0.22f, -1.033f, -0.54f, -1.49f, -0.972f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 12.161f)
                verticalLineTo(13f)
                curveToRelative(0f, 1.007f, 0.875f, 1.755f, 1.904f, 2.223f)
                curveTo(4.978f, 15.711f, 6.427f, 16f, 8f, 16f)
                reflectiveCurveToRelative(3.022f, -0.289f, 4.096f, -0.777f)
                curveTo(13.125f, 14.755f, 14f, 14.007f, 14f, 13f)
                verticalLineToRelative(-0.839f)
                curveToRelative(-0.457f, 0.432f, -1.004f, 0.751f, -1.49f, 0.972f)
                curveToRelative(-1.232f, 0.56f, -2.828f, 0.867f, -4.51f, 0.867f)
                reflectiveCurveToRelative(-3.278f, -0.307f, -4.51f, -0.867f)
                curveToRelative(-0.486f, -0.22f, -1.033f, -0.54f, -1.49f, -0.972f)
            }
        }.build()
        
        return _Database!!
    }

private var _Database: ImageVector? = null

