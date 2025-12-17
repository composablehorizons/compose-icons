package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CircleStack: ImageVector
    get() {
        if (_CircleStack != null) return _CircleStack!!
        
        _CircleStack = ImageVector.Builder(
            name = "circle-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(20.25f, 6.375f)
                curveToRelative(0f, 2.278f, -3.694f, 4.125f, -8.25f, 4.125f)
                reflectiveCurveTo(3.75f, 8.653f, 3.75f, 6.375f)
                moveToRelative(16.5f, 0f)
                curveToRelative(0f, -2.278f, -3.694f, -4.125f, -8.25f, -4.125f)
                reflectiveCurveTo(3.75f, 4.097f, 3.75f, 6.375f)
                moveToRelative(16.5f, 0f)
                verticalLineToRelative(11.25f)
                curveToRelative(0f, 2.278f, -3.694f, 4.125f, -8.25f, 4.125f)
                reflectiveCurveToRelative(-8.25f, -1.847f, -8.25f, -4.125f)
                verticalLineTo(6.375f)
                moveToRelative(16.5f, 0f)
                verticalLineToRelative(3.75f)
                moveToRelative(-16.5f, -3.75f)
                verticalLineToRelative(3.75f)
                moveToRelative(16.5f, 0f)
                verticalLineToRelative(3.75f)
                curveTo(20.25f, 16.153f, 16.556f, 18f, 12f, 18f)
                reflectiveCurveToRelative(-8.25f, -1.847f, -8.25f, -4.125f)
                verticalLineToRelative(-3.75f)
                moveToRelative(16.5f, 0f)
                curveToRelative(0f, 2.278f, -3.694f, 4.125f, -8.25f, 4.125f)
                reflectiveCurveToRelative(-8.25f, -1.847f, -8.25f, -4.125f)
            }
        }.build()
        
        return _CircleStack!!
    }

private var _CircleStack: ImageVector? = null

