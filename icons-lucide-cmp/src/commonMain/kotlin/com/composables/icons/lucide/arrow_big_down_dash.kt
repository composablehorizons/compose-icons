package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowBigDownDash: ImageVector
    get() {
        if (_ArrowBigDownDash != null) return _ArrowBigDownDash!!
        
        _ArrowBigDownDash = ImageVector.Builder(
            name = "arrow-big-down-dash",
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
                moveTo(15f, 11f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2.939f)
                arcToRelative(1f, 1f, 0f, false, true, 0.75f, 1.811f)
                lineToRelative(-6.835f, 6.836f)
                arcToRelative(1.207f, 1.207f, 0f, false, true, -1.707f, 0f)
                lineTo(4.31f, 13.81f)
                arcToRelative(1f, 1f, 0f, false, true, 0.75f, -1.811f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 4f)
                horizontalLineToRelative(6f)
            }
        }.build()
        
        return _ArrowBigDownDash!!
    }

private var _ArrowBigDownDash: ImageVector? = null

