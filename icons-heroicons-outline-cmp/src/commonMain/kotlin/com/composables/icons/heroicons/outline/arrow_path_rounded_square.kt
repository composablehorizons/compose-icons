package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowPathRoundedSquare: ImageVector
    get() {
        if (_ArrowPathRoundedSquare != null) return _ArrowPathRoundedSquare!!
        
        _ArrowPathRoundedSquare = ImageVector.Builder(
            name = "arrow-path-rounded-square",
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
                moveTo(19.5f, 12f)
                curveToRelative(0f, -1.232f, -0.046f, -2.453f, -0.138f, -3.662f)
                arcToRelative(4.006f, 4.006f, 0f, false, false, -3.7f, -3.7f)
                arcToRelative(48.678f, 48.678f, 0f, false, false, -7.324f, 0f)
                arcToRelative(4.006f, 4.006f, 0f, false, false, -3.7f, 3.7f)
                curveToRelative(-0.017f, 0.22f, -0.032f, 0.441f, -0.046f, 0.662f)
                moveTo(19.5f, 12f)
                lineToRelative(3f, -3f)
                moveToRelative(-3f, 3f)
                lineToRelative(-3f, -3f)
                moveToRelative(-12f, 3f)
                curveToRelative(0f, 1.232f, 0.046f, 2.453f, 0.138f, 3.662f)
                arcToRelative(4.006f, 4.006f, 0f, false, false, 3.7f, 3.7f)
                arcToRelative(48.656f, 48.656f, 0f, false, false, 7.324f, 0f)
                arcToRelative(4.006f, 4.006f, 0f, false, false, 3.7f, -3.7f)
                curveToRelative(0.017f, -0.22f, 0.032f, -0.441f, 0.046f, -0.662f)
                moveTo(4.5f, 12f)
                lineToRelative(3f, 3f)
                moveToRelative(-3f, -3f)
                lineToRelative(-3f, 3f)
            }
        }.build()
        
        return _ArrowPathRoundedSquare!!
    }

private var _ArrowPathRoundedSquare: ImageVector? = null

