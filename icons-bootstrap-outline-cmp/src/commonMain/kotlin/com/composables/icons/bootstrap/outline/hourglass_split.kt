package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.HourglassSplit: ImageVector
    get() {
        if (_HourglassSplit != null) return _HourglassSplit!!
        
        _HourglassSplit = ImageVector.Builder(
            name = "hourglass-split",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 15f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 2.557f, -4.06f)
                curveToRelative(0.29f, -0.139f, 0.443f, -0.377f, 0.443f, -0.59f)
                verticalLineToRelative(-0.7f)
                curveToRelative(0f, -0.213f, -0.154f, -0.451f, -0.443f, -0.59f)
                arcTo(4.5f, 4.5f, 0f, false, true, 3.5f, 3f)
                verticalLineTo(2f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -2.557f, 4.06f)
                curveToRelative(-0.29f, 0.139f, -0.443f, 0.377f, -0.443f, 0.59f)
                verticalLineToRelative(0.7f)
                curveToRelative(0f, 0.213f, 0.154f, 0.451f, 0.443f, 0.59f)
                arcTo(4.5f, 4.5f, 0f, false, true, 12.5f, 13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                close()
                moveToRelative(2f, -13f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.537f, 0.12f, 1.045f, 0.337f, 1.5f)
                horizontalLineToRelative(6.326f)
                curveToRelative(0.216f, -0.455f, 0.337f, -0.963f, 0.337f, -1.5f)
                verticalLineTo(2f)
                close()
                moveToRelative(3f, 6.35f)
                curveToRelative(0f, 0.701f, -0.478f, 1.236f, -1.011f, 1.492f)
                arcTo(3.5f, 3.5f, 0f, false, false, 4.5f, 13f)
                reflectiveCurveToRelative(0.866f, -1.299f, 3f, -1.48f)
                close()
                moveToRelative(1f, 0f)
                verticalLineToRelative(3.17f)
                curveToRelative(2.134f, 0.181f, 3f, 1.48f, 3f, 1.48f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -1.989f, -3.158f)
                curveTo(8.978f, 9.586f, 8.5f, 9.052f, 8.5f, 8.351f)
                close()
            }
        }.build()
        
        return _HourglassSplit!!
    }

private var _HourglassSplit: ImageVector? = null

