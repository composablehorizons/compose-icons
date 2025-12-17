package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Umbrella2: ImageVector
    get() {
        if (_Umbrella2 != null) return _Umbrella2!!
        
        _Umbrella2 = ImageVector.Builder(
            name = "umbrella-2",
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
                moveTo(5.343f, 7.343f)
                arcToRelative(8f, 8f, 0f, true, true, 11.314f, 11.314f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.828f, 13.34f)
                lineToRelative(-4.242f, 4.243f)
                arcToRelative(2f, 2f, 0f, true, false, 2.828f, 2.828f)
            }
        }.build()
        
        return _Umbrella2!!
    }

private var _Umbrella2: ImageVector? = null

