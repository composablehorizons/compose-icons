package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SearchCode: ImageVector
    get() {
        if (_SearchCode != null) return _SearchCode!!
        
        _SearchCode = ImageVector.Builder(
            name = "search-code",
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
                moveTo(13f, 13.5f)
                lineToRelative(2f, -2.5f)
                lineToRelative(-2f, -2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 21f)
                lineToRelative(-4.3f, -4.3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 8.5f)
                lineTo(7f, 11f)
                lineToRelative(2f, 2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 11f)
                arcTo(8f, 8f, 0f, false, true, 11f, 19f)
                arcTo(8f, 8f, 0f, false, true, 3f, 11f)
                arcTo(8f, 8f, 0f, false, true, 19f, 11f)
                close()
            }
        }.build()
        
        return _SearchCode!!
    }

private var _SearchCode: ImageVector? = null

