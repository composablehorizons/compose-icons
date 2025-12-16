package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Lectern: ImageVector
    get() {
        if (_Lectern != null) return _Lectern!!
        
        _Lectern = ImageVector.Builder(
            name = "lectern",
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
                moveTo(16f, 12f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, false, 1.902f, -1.38f)
                lineToRelative(1.056f, -3.333f)
                arcTo(1f, 1f, 0f, false, false, 21f, 6f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -0.958f, 1.287f)
                lineToRelative(1.056f, 3.334f)
                arcTo(2f, 2f, 0f, false, false, 5f, 12f)
                horizontalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 6f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 10f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 16f, 11f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, false, true, 15f, 22f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 8f, 21f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, false, true, 9f, 10f)
                close()
            }
        }.build()
        
        return _Lectern!!
    }

private var _Lectern: ImageVector? = null

