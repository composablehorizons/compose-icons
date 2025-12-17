package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BellRinging2: ImageVector
    get() {
        if (_BellRinging2 != null) return _BellRinging2!!
        
        _BellRinging2 = ImageVector.Builder(
            name = "bell-ringing-2",
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
                moveTo(19.364f, 4.636f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 2.828f)
                arcToRelative(7f, 7f, 0f, false, true, -1.414f, 7.072f)
                lineToRelative(-2.122f, 2.12f)
                arcToRelative(4f, 4f, 0f, false, false, -0.707f, 3.536f)
                lineToRelative(-11.313f, -11.312f)
                arcToRelative(4f, 4f, 0f, false, false, 3.535f, -0.707f)
                lineToRelative(2.121f, -2.123f)
                arcToRelative(7f, 7f, 0f, false, true, 7.072f, -1.414f)
                arcToRelative(2f, 2f, 0f, false, true, 2.828f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.343f, 12.414f)
                lineToRelative(-0.707f, 0.707f)
                arcToRelative(3f, 3f, 0f, false, false, 4.243f, 4.243f)
                lineToRelative(0.707f, -0.707f)
            }
        }.build()
        
        return _BellRinging2!!
    }

private var _BellRinging2: ImageVector? = null

