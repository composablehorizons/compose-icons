package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.DatabaseFillLock: ImageVector
    get() {
        if (_DatabaseFillLock != null) return _DatabaseFillLock!!
        
        _DatabaseFillLock = ImageVector.Builder(
            name = "database-fill-lock",
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
                moveTo(3.904f, 9.223f)
                curveTo(2.875f, 8.755f, 2f, 8.007f, 2f, 7f)
                verticalLineToRelative(-0.839f)
                curveToRelative(0.457f, 0.432f, 1.004f, 0.751f, 1.49f, 0.972f)
                curveTo(4.722f, 7.693f, 6.318f, 8f, 8f, 8f)
                reflectiveCurveToRelative(3.278f, -0.307f, 4.51f, -0.867f)
                curveToRelative(0.486f, -0.22f, 1.033f, -0.54f, 1.49f, -0.972f)
                verticalLineTo(7f)
                curveToRelative(0f, 0.424f, -0.155f, 0.802f, -0.411f, 1.133f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -1.364f, -0.125f)
                arcToRelative(3f, 3f, 0f, false, false, -2.197f, 0.731f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -1.254f, 1.237f)
                arcTo(12f, 12f, 0f, false, true, 8f, 10f)
                curveToRelative(-1.573f, 0f, -3.022f, -0.289f, -4.096f, -0.777f)
                moveTo(8f, 14f)
                curveToRelative(-1.682f, 0f, -3.278f, -0.307f, -4.51f, -0.867f)
                curveToRelative(-0.486f, -0.22f, -1.033f, -0.54f, -1.49f, -0.972f)
                verticalLineTo(13f)
                curveToRelative(0f, 1.007f, 0.875f, 1.755f, 1.904f, 2.223f)
                curveTo(4.978f, 15.711f, 6.427f, 16f, 8f, 16f)
                quadToRelative(0.134f, 0f, 0.266f, -0.003f)
                arcTo(2f, 2f, 0f, false, true, 8f, 15f)
                close()
                moveToRelative(0f, -1.5f)
                quadToRelative(0f, 0.15f, 0.01f, 0.3f)
                arcTo(2f, 2f, 0f, false, false, 8f, 13f)
                curveToRelative(-1.573f, 0f, -3.022f, -0.289f, -4.096f, -0.777f)
                curveTo(2.875f, 11.755f, 2f, 11.007f, 2f, 10f)
                verticalLineToRelative(-0.839f)
                curveToRelative(0.457f, 0.432f, 1.004f, 0.751f, 1.49f, 0.972f)
                curveTo(4.722f, 10.693f, 6.318f, 11f, 8f, 11f)
                quadToRelative(0.13f, 0f, 0.257f, -0.002f)
                arcTo(4.5f, 4.5f, 0f, false, false, 8f, 12.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 13f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _DatabaseFillLock!!
    }

private var _DatabaseFillLock: ImageVector? = null

