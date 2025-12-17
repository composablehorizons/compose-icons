package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.LightBulb: ImageVector
    get() {
        if (_LightBulb != null) return _LightBulb!!
        
        _LightBulb = ImageVector.Builder(
            name = "light-bulb",
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
                moveTo(12f, 18f)
                verticalLineToRelative(-5.25f)
                moveToRelative(0f, 0f)
                arcToRelative(6.01f, 6.01f, 0f, false, false, 1.5f, -0.189f)
                moveToRelative(-1.5f, 0.189f)
                arcToRelative(6.01f, 6.01f, 0f, false, true, -1.5f, -0.189f)
                moveToRelative(3.75f, 7.478f)
                arcToRelative(12.06f, 12.06f, 0f, false, true, -4.5f, 0f)
                moveToRelative(3.75f, 2.383f)
                arcToRelative(14.406f, 14.406f, 0f, false, true, -3f, 0f)
                moveTo(14.25f, 18f)
                verticalLineToRelative(-0.192f)
                curveToRelative(0f, -0.983f, 0.658f, -1.823f, 1.508f, -2.316f)
                arcToRelative(7.5f, 7.5f, 0f, true, false, -7.517f, 0f)
                curveToRelative(0.85f, 0.493f, 1.509f, 1.333f, 1.509f, 2.316f)
                verticalLineTo(18f)
            }
        }.build()
        
        return _LightBulb!!
    }

private var _LightBulb: ImageVector? = null

