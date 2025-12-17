package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Variable: ImageVector
    get() {
        if (_Variable != null) return _Variable!!
        
        _Variable = ImageVector.Builder(
            name = "variable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(4.745f, 3f)
                arcTo(23.933f, 23.933f, 0f, false, false, 3f, 12f)
                curveToRelative(0f, 3.183f, 0.62f, 6.22f, 1.745f, 9f)
                moveTo(19.5f, 3f)
                curveToRelative(0.967f, 2.78f, 1.5f, 5.817f, 1.5f, 9f)
                reflectiveCurveToRelative(-0.533f, 6.22f, -1.5f, 9f)
                moveTo(8.25f, 8.885f)
                lineToRelative(1.444f, -0.89f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.105f, 0.402f)
                lineToRelative(2.402f, 7.206f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.104f, 0.401f)
                lineToRelative(1.445f, -0.889f)
                moveToRelative(-8.25f, 0.75f)
                lineToRelative(0.213f, 0.09f)
                arcToRelative(1.687f, 1.687f, 0f, false, false, 2.062f, -0.617f)
                lineToRelative(4.45f, -6.676f)
                arcToRelative(1.688f, 1.688f, 0f, false, true, 2.062f, -0.618f)
                lineToRelative(0.213f, 0.09f)
            }
        }.build()
        
        return _Variable!!
    }

private var _Variable: ImageVector? = null

