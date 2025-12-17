package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Pentagram: ImageVector
    get() {
        if (_Pentagram != null) return _Pentagram!!
        
        _Pentagram = ImageVector.Builder(
            name = "pentagram",
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
                moveTo(5.636f, 5.636f)
                arcToRelative(9f, 9f, 0f, true, true, 12.728f, 12.728f)
                arcToRelative(9f, 9f, 0f, false, true, -12.728f, -12.728f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.236f, 11f)
                lineToRelative(5.264f, 4f)
                horizontalLineToRelative(-6.5f)
                lineToRelative(-2f, 6f)
                lineToRelative(-2f, -6f)
                horizontalLineToRelative(-6.5f)
                lineToRelative(5.276f, -4f)
                lineToRelative(-2.056f, -6.28f)
                lineToRelative(5.28f, 3.78f)
                lineToRelative(5.28f, -3.78f)
                close()
            }
        }.build()
        
        return _Pentagram!!
    }

private var _Pentagram: ImageVector? = null

