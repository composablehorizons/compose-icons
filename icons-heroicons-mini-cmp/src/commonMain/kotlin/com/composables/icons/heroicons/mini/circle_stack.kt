package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CircleStack: ImageVector
    get() {
        if (_CircleStack != null) return _CircleStack!!
        
        _CircleStack = ImageVector.Builder(
            name = "circle-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 1f)
                curveToRelative(3.866f, 0f, 7f, 1.79f, 7f, 4f)
                reflectiveCurveToRelative(-3.134f, 4f, -7f, 4f)
                reflectiveCurveToRelative(-7f, -1.79f, -7f, -4f)
                reflectiveCurveToRelative(3.134f, -4f, 7f, -4f)
                close()
                moveToRelative(5.694f, 8.13f)
                curveToRelative(0.464f, -0.264f, 0.91f, -0.583f, 1.306f, -0.952f)
                verticalLineTo(10f)
                curveToRelative(0f, 2.21f, -3.134f, 4f, -7f, 4f)
                reflectiveCurveToRelative(-7f, -1.79f, -7f, -4f)
                verticalLineTo(8.178f)
                curveToRelative(0.396f, 0.37f, 0.842f, 0.688f, 1.306f, 0.953f)
                curveTo(5.838f, 10.006f, 7.854f, 10.5f, 10f, 10.5f)
                reflectiveCurveToRelative(4.162f, -0.494f, 5.694f, -1.37f)
                close()
                moveTo(3f, 13.179f)
                verticalLineTo(15f)
                curveToRelative(0f, 2.21f, 3.134f, 4f, 7f, 4f)
                reflectiveCurveToRelative(7f, -1.79f, 7f, -4f)
                verticalLineToRelative(-1.822f)
                curveToRelative(-0.396f, 0.37f, -0.842f, 0.688f, -1.306f, 0.953f)
                curveToRelative(-1.532f, 0.875f, -3.548f, 1.369f, -5.694f, 1.369f)
                reflectiveCurveToRelative(-4.162f, -0.494f, -5.694f, -1.37f)
                arcTo(7.009f, 7.009f, 0f, false, true, 3f, 13.179f)
                close()
            }
        }.build()
        
        return _CircleStack!!
    }

private var _CircleStack: ImageVector? = null

