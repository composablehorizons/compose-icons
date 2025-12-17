package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Axe: ImageVector
    get() {
        if (_Axe != null) return _Axe!!
        
        _Axe = ImageVector.Builder(
            name = "axe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                lineToRelative(-8.381f, 8.38f)
                arcToRelative(1f, 1f, 0f, false, true, -3.001f, -3f)
                lineTo(11f, 9f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                arcTo(6.5f, 6.5f, 0f, false, false, 22f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1.672f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, -0.586f)
                lineToRelative(-5.062f, -5.062f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, -1.704f, 0f)
                lineTo(9.352f, 5.648f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, 1.704f)
                lineToRelative(5.062f, 5.062f)
                arcTo(2f, 2f, 0f, false, true, 15f, 13.828f)
                close()
            }
        }.build()
        
        return _Axe!!
    }

private var _Axe: ImageVector? = null

