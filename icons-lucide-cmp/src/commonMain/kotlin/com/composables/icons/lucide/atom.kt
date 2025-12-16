package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Atom: ImageVector
    get() {
        if (_Atom != null) return _Atom!!
        
        _Atom = ImageVector.Builder(
            name = "atom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 12f)
                arcTo(1f, 1f, 0f, false, true, 12f, 13f)
                arcTo(1f, 1f, 0f, false, true, 11f, 12f)
                arcTo(1f, 1f, 0f, false, true, 13f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.2f, 20.2f)
                curveToRelative(2.04f, -2.03f, 0.02f, -7.36f, -4.5f, -11.9f)
                curveToRelative(-4.54f, -4.52f, -9.87f, -6.54f, -11.9f, -4.5f)
                curveToRelative(-2.04f, 2.03f, -0.02f, 7.36f, 4.5f, 11.9f)
                curveToRelative(4.54f, 4.52f, 9.87f, 6.54f, 11.9f, 4.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.7f, 15.7f)
                curveToRelative(4.52f, -4.54f, 6.54f, -9.87f, 4.5f, -11.9f)
                curveToRelative(-2.03f, -2.04f, -7.36f, -0.02f, -11.9f, 4.5f)
                curveToRelative(-4.52f, 4.54f, -6.54f, 9.87f, -4.5f, 11.9f)
                curveToRelative(2.03f, 2.04f, 7.36f, 0.02f, 11.9f, -4.5f)
                close()
            }
        }.build()
        
        return _Atom!!
    }

private var _Atom: ImageVector? = null

