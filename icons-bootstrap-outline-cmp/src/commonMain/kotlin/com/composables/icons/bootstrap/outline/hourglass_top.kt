package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.HourglassTop: ImageVector
    get() {
        if (_HourglassTop != null) return _HourglassTop!!
        
        _HourglassTop = ImageVector.Builder(
            name = "hourglass-top",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -2.557f, -4.06f)
                curveToRelative(-0.29f, -0.139f, -0.443f, -0.377f, -0.443f, -0.59f)
                verticalLineToRelative(-0.7f)
                curveToRelative(0f, -0.213f, 0.154f, -0.451f, 0.443f, -0.59f)
                arcTo(4.5f, 4.5f, 0f, false, false, 12.5f, 3f)
                verticalLineTo(2f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 2.557f, 4.06f)
                curveToRelative(0.29f, 0.139f, 0.443f, 0.377f, 0.443f, 0.59f)
                verticalLineToRelative(0.7f)
                curveToRelative(0f, 0.213f, -0.154f, 0.451f, -0.443f, 0.59f)
                arcTo(4.5f, 4.5f, 0f, false, false, 3.5f, 13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveToRelative(2.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 1.989f, -3.158f)
                curveToRelative(0.533f, -0.256f, 1.011f, -0.79f, 1.011f, -1.491f)
                verticalLineToRelative(-0.702f)
                reflectiveCurveToRelative(0.18f, 0.101f, 0.5f, 0.101f)
                reflectiveCurveToRelative(0.5f, -0.1f, 0.5f, -0.1f)
                verticalLineToRelative(0.7f)
                curveToRelative(0f, 0.701f, 0.478f, 1.236f, 1.011f, 1.492f)
                arcTo(3.5f, 3.5f, 0f, false, true, 11.5f, 13f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _HourglassTop!!
    }

private var _HourglassTop: ImageVector? = null

