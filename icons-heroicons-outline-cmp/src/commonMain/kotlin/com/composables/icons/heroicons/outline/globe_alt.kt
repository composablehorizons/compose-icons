package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.GlobeAlt: ImageVector
    get() {
        if (_GlobeAlt != null) return _GlobeAlt!!
        
        _GlobeAlt = ImageVector.Builder(
            name = "globe-alt",
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
                moveTo(12f, 21f)
                arcToRelative(9.004f, 9.004f, 0f, false, false, 8.716f, -6.747f)
                moveTo(12f, 21f)
                arcToRelative(9.004f, 9.004f, 0f, false, true, -8.716f, -6.747f)
                moveTo(12f, 21f)
                curveToRelative(2.485f, 0f, 4.5f, -4.03f, 4.5f, -9f)
                reflectiveCurveTo(14.485f, 3f, 12f, 3f)
                moveToRelative(0f, 18f)
                curveToRelative(-2.485f, 0f, -4.5f, -4.03f, -4.5f, -9f)
                reflectiveCurveTo(9.515f, 3f, 12f, 3f)
                moveToRelative(0f, 0f)
                arcToRelative(8.997f, 8.997f, 0f, false, true, 7.843f, 4.582f)
                moveTo(12f, 3f)
                arcToRelative(8.997f, 8.997f, 0f, false, false, -7.843f, 4.582f)
                moveToRelative(15.686f, 0f)
                arcTo(11.953f, 11.953f, 0f, false, true, 12f, 10.5f)
                curveToRelative(-2.998f, 0f, -5.74f, -1.1f, -7.843f, -2.918f)
                moveToRelative(15.686f, 0f)
                arcTo(8.959f, 8.959f, 0f, false, true, 21f, 12f)
                curveToRelative(0f, 0.778f, -0.099f, 1.533f, -0.284f, 2.253f)
                moveToRelative(0f, 0f)
                arcTo(17.919f, 17.919f, 0f, false, true, 12f, 16.5f)
                curveToRelative(-3.162f, 0f, -6.133f, -0.815f, -8.716f, -2.247f)
                moveToRelative(0f, 0f)
                arcTo(9.015f, 9.015f, 0f, false, true, 3f, 12f)
                curveToRelative(0f, -1.605f, 0.42f, -3.113f, 1.157f, -4.418f)
            }
        }.build()
        
        return _GlobeAlt!!
    }

private var _GlobeAlt: ImageVector? = null

