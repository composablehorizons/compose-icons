package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GraduationCap: ImageVector
    get() {
        if (_GraduationCap != null) return _GraduationCap!!
        
        _GraduationCap = ImageVector.Builder(
            name = "graduation-cap",
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
                moveTo(21.42f, 10.922f)
                arcToRelative(1f, 1f, 0f, false, false, -0.019f, -1.838f)
                lineTo(12.83f, 5.18f)
                arcToRelative(2f, 2f, 0f, false, false, -1.66f, 0f)
                lineTo(2.6f, 9.08f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.832f)
                lineToRelative(8.57f, 3.908f)
                arcToRelative(2f, 2f, 0f, false, false, 1.66f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 10f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12.5f)
                verticalLineTo(16f)
                arcToRelative(6f, 3f, 0f, false, false, 12f, 0f)
                verticalLineToRelative(-3.5f)
            }
        }.build()
        
        return _GraduationCap!!
    }

private var _GraduationCap: ImageVector? = null

