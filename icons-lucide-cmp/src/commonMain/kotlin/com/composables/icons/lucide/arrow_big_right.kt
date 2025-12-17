package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowBigRight: ImageVector
    get() {
        if (_ArrowBigRight != null) return _ArrowBigRight!!
        
        _ArrowBigRight = ImageVector.Builder(
            name = "arrow-big-right",
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
                moveTo(11f, 9f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(5.061f)
                arcToRelative(1f, 1f, 0f, false, true, 1.811f, -0.75f)
                lineToRelative(6.836f, 6.836f)
                arcToRelative(1.207f, 1.207f, 0f, false, true, 0f, 1.707f)
                lineToRelative(-6.836f, 6.835f)
                arcToRelative(1f, 1f, 0f, false, true, -1.811f, -0.75f)
                verticalLineTo(16f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _ArrowBigRight!!
    }

private var _ArrowBigRight: ImageVector? = null

