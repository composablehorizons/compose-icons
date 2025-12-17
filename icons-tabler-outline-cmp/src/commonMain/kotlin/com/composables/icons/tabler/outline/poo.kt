package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Poo: ImageVector
    get() {
        if (_Poo != null) return _Poo!!
        
        _Poo = ImageVector.Builder(
            name = "poo",
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
                moveTo(10f, 12f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 16f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 4f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 4f)
                curveToRelative(2f, 0f, 3.5f, 1.5f, 3.5f, 4f)
                lineToRelative(0.164f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 2.196f, 3.32f)
                arcToRelative(3f, 3f, 0f, false, true, 1.615f, 3.063f)
                arcToRelative(3f, 3f, 0f, false, true, -1.299f, 5.607f)
                lineToRelative(-0.176f, 0f)
                horizontalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, false, true, -1.474f, -5.613f)
                arcToRelative(3f, 3f, 0f, false, true, 1.615f, -3.062f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 2.195f, -3.32f)
                lineToRelative(0.164f, 0f)
                curveToRelative(1.5f, 0f, 2.5f, -2f, 1.5f, -4f)
                close()
            }
        }.build()
        
        return _Poo!!
    }

private var _Poo: ImageVector? = null

