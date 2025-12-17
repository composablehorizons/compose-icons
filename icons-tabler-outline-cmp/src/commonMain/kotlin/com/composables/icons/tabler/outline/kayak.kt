package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Kayak: ImageVector
    get() {
        if (_Kayak != null) return _Kayak!!
        
        _Kayak = ImageVector.Builder(
            name = "kayak",
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
                moveTo(6.414f, 6.414f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -2.828f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.828f, 2.828f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(2f, 2f, 0f, false, false, 2.828f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.586f, 17.586f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 2.828f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.828f, -2.828f)
                lineToRelative(-1.414f, -1.414f)
                arcToRelative(2f, 2f, 0f, false, false, -2.828f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 6.5f)
                lineToRelative(11f, 11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2.5f)
                curveToRelative(-9.983f, 2.601f, -17.627f, 7.952f, -20f, 19.5f)
                curveToRelative(9.983f, -2.601f, 17.627f, -7.952f, 20f, -19.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 12.5f)
                lineToRelative(5f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 6.5f)
                lineToRelative(5f, 5f)
            }
        }.build()
        
        return _Kayak!!
    }

private var _Kayak: ImageVector? = null

