package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.YinYang: ImageVector
    get() {
        if (_YinYang != null) return _YinYang!!
        
        _YinYang = ImageVector.Builder(
            name = "yin-yang",
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
                moveTo(12f, 12f)
                moveToRelative(-9f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, 18f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, -18f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 0f, 9f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 0f, 9f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12f, 8f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11.5f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12.5f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 16.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12f, 17f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11.5f, 16.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12.5f, 16.5f)
                close()
            }
        }.build()
        
        return _YinYang!!
    }

private var _YinYang: ImageVector? = null

