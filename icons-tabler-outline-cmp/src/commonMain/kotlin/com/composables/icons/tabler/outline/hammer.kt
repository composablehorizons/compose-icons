package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Hammer: ImageVector
    get() {
        if (_Hammer != null) return _Hammer!!
        
        _Hammer = ImageVector.Builder(
            name = "hammer",
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
                moveTo(11.414f, 10f)
                lineToRelative(-7.383f, 7.418f)
                arcToRelative(2.091f, 2.091f, 0f, false, false, 0f, 2.967f)
                arcToRelative(2.11f, 2.11f, 0f, false, false, 2.976f, 0f)
                lineToRelative(7.407f, -7.385f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.121f, 15.293f)
                lineToRelative(2.586f, -2.586f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                lineToRelative(-7.586f, -7.586f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-2.586f, 2.586f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(7.586f, 7.586f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                close()
            }
        }.build()
        
        return _Hammer!!
    }

private var _Hammer: ImageVector? = null

