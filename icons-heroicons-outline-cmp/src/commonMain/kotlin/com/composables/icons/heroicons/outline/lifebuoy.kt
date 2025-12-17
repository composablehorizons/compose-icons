package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Lifebuoy: ImageVector
    get() {
        if (_Lifebuoy != null) return _Lifebuoy!!
        
        _Lifebuoy = ImageVector.Builder(
            name = "lifebuoy",
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
                moveTo(16.712f, 4.33f)
                arcToRelative(9.027f, 9.027f, 0f, false, true, 1.652f, 1.306f)
                curveToRelative(0.51f, 0.51f, 0.944f, 1.064f, 1.306f, 1.652f)
                moveTo(16.712f, 4.33f)
                lineToRelative(-3.448f, 4.138f)
                moveToRelative(3.448f, -4.138f)
                arcToRelative(9.014f, 9.014f, 0f, false, false, -9.424f, 0f)
                moveTo(19.67f, 7.288f)
                lineToRelative(-4.138f, 3.448f)
                moveToRelative(4.138f, -3.448f)
                arcToRelative(9.014f, 9.014f, 0f, false, true, 0f, 9.424f)
                moveToRelative(-4.138f, -5.976f)
                arcToRelative(3.736f, 3.736f, 0f, false, false, -0.88f, -1.388f)
                arcToRelative(3.737f, 3.737f, 0f, false, false, -1.388f, -0.88f)
                moveToRelative(2.268f, 2.268f)
                arcToRelative(3.765f, 3.765f, 0f, false, true, 0f, 2.528f)
                moveToRelative(-2.268f, -4.796f)
                arcToRelative(3.765f, 3.765f, 0f, false, false, -2.528f, 0f)
                moveToRelative(4.796f, 4.796f)
                curveToRelative(-0.181f, 0.506f, -0.475f, 0.982f, -0.88f, 1.388f)
                arcToRelative(3.736f, 3.736f, 0f, false, true, -1.388f, 0.88f)
                moveToRelative(2.268f, -2.268f)
                lineToRelative(4.138f, 3.448f)
                moveToRelative(0f, 0f)
                arcToRelative(9.027f, 9.027f, 0f, false, true, -1.306f, 1.652f)
                curveToRelative(-0.51f, 0.51f, -1.064f, 0.944f, -1.652f, 1.306f)
                moveToRelative(0f, 0f)
                lineToRelative(-3.448f, -4.138f)
                moveToRelative(3.448f, 4.138f)
                arcToRelative(9.014f, 9.014f, 0f, false, true, -9.424f, 0f)
                moveToRelative(5.976f, -4.138f)
                arcToRelative(3.765f, 3.765f, 0f, false, true, -2.528f, 0f)
                moveToRelative(0f, 0f)
                arcToRelative(3.736f, 3.736f, 0f, false, true, -1.388f, -0.88f)
                arcToRelative(3.737f, 3.737f, 0f, false, true, -0.88f, -1.388f)
                moveToRelative(2.268f, 2.268f)
                lineTo(7.288f, 19.67f)
                moveToRelative(0f, 0f)
                arcToRelative(9.024f, 9.024f, 0f, false, true, -1.652f, -1.306f)
                arcToRelative(9.027f, 9.027f, 0f, false, true, -1.306f, -1.652f)
                moveToRelative(0f, 0f)
                lineToRelative(4.138f, -3.448f)
                moveTo(4.33f, 16.712f)
                arcToRelative(9.014f, 9.014f, 0f, false, true, 0f, -9.424f)
                moveToRelative(4.138f, 5.976f)
                arcToRelative(3.765f, 3.765f, 0f, false, true, 0f, -2.528f)
                moveToRelative(0f, 0f)
                curveToRelative(0.181f, -0.506f, 0.475f, -0.982f, 0.88f, -1.388f)
                arcToRelative(3.736f, 3.736f, 0f, false, true, 1.388f, -0.88f)
                moveToRelative(-2.268f, 2.268f)
                lineTo(4.33f, 7.288f)
                moveToRelative(6.406f, 1.18f)
                lineTo(7.288f, 4.33f)
                moveToRelative(0f, 0f)
                arcToRelative(9.024f, 9.024f, 0f, false, false, -1.652f, 1.306f)
                arcTo(9.025f, 9.025f, 0f, false, false, 4.33f, 7.288f)
            }
        }.build()
        
        return _Lifebuoy!!
    }

private var _Lifebuoy: ImageVector? = null

