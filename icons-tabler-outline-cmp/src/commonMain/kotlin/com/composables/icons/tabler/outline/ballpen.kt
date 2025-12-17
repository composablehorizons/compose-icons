package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Ballpen: ImageVector
    get() {
        if (_Ballpen != null) return _Ballpen!!
        
        _Ballpen = ImageVector.Builder(
            name = "ballpen",
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
                moveTo(14f, 6f)
                lineToRelative(7f, 7f)
                lineToRelative(-4f, 4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.828f, 18.172f)
                arcToRelative(2.828f, 2.828f, 0f, false, false, 4f, 0f)
                lineToRelative(10.586f, -10.586f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -2.829f)
                lineToRelative(-1.171f, -1.171f)
                arcToRelative(2f, 2f, 0f, false, false, -2.829f, 0f)
                lineToRelative(-10.586f, 10.586f)
                arcToRelative(2.828f, 2.828f, 0f, false, false, 0f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 20f)
                lineToRelative(1.768f, -1.768f)
            }
        }.build()
        
        return _Ballpen!!
    }

private var _Ballpen: ImageVector? = null

