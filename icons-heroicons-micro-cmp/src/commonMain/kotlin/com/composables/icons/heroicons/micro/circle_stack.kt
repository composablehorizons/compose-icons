package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CircleStack: ImageVector
    get() {
        if (_CircleStack != null) return _CircleStack!!
        
        _CircleStack = ImageVector.Builder(
            name = "circle-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 7f)
                curveToRelative(3.314f, 0f, 6f, -1.343f, 6f, -3f)
                reflectiveCurveToRelative(-2.686f, -3f, -6f, -3f)
                reflectiveCurveToRelative(-6f, 1.343f, -6f, 3f)
                reflectiveCurveToRelative(2.686f, 3f, 6f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 8.5f)
                curveToRelative(1.84f, 0f, 3.579f, -0.37f, 4.914f, -1.037f)
                arcTo(6.33f, 6.33f, 0f, false, false, 14f, 6.78f)
                verticalLineTo(8f)
                curveToRelative(0f, 1.657f, -2.686f, 3f, -6f, 3f)
                reflectiveCurveTo(2f, 9.657f, 2f, 8f)
                verticalLineTo(6.78f)
                curveToRelative(0.346f, 0.273f, 0.72f, 0.5f, 1.087f, 0.683f)
                curveTo(4.42f, 8.131f, 6.16f, 8.5f, 8f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 12.5f)
                curveToRelative(1.84f, 0f, 3.579f, -0.37f, 4.914f, -1.037f)
                curveToRelative(0.366f, -0.183f, 0.74f, -0.41f, 1.086f, -0.684f)
                verticalLineTo(12f)
                curveToRelative(0f, 1.657f, -2.686f, 3f, -6f, 3f)
                reflectiveCurveToRelative(-6f, -1.343f, -6f, -3f)
                verticalLineToRelative(-1.22f)
                curveToRelative(0.346f, 0.273f, 0.72f, 0.5f, 1.087f, 0.683f)
                curveTo(4.42f, 12.131f, 6.16f, 12.5f, 8f, 12.5f)
                close()
            }
        }.build()
        
        return _CircleStack!!
    }

private var _CircleStack: ImageVector? = null

