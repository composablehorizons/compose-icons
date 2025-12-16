package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowBigUpDash: ImageVector
    get() {
        if (_ArrowBigUpDash != null) return _ArrowBigUpDash!!
        
        _ArrowBigUpDash = ImageVector.Builder(
            name = "arrow-big-up-dash",
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
                moveTo(9f, 13f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(5.061f)
                arcToRelative(1f, 1f, 0f, false, true, -0.75f, -1.811f)
                lineToRelative(6.836f, -6.835f)
                arcToRelative(1.207f, 1.207f, 0f, false, true, 1.707f, 0f)
                lineToRelative(6.835f, 6.835f)
                arcToRelative(1f, 1f, 0f, false, true, -0.75f, 1.811f)
                horizontalLineTo(16f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 20f)
                horizontalLineToRelative(6f)
            }
        }.build()
        
        return _ArrowBigUpDash!!
    }

private var _ArrowBigUpDash: ImageVector? = null

