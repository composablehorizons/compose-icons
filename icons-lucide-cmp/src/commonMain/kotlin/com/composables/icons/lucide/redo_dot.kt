package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.RedoDot: ImageVector
    get() {
        if (_RedoDot != null) return _RedoDot!!
        
        _RedoDot = ImageVector.Builder(
            name = "redo-dot",
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
                moveTo(13f, 17f)
                arcTo(1f, 1f, 0f, false, true, 12f, 18f)
                arcTo(1f, 1f, 0f, false, true, 11f, 17f)
                arcTo(1f, 1f, 0f, false, true, 13f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 17f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, -9f)
                arcToRelative(9f, 9f, 0f, false, true, 6f, 2.3f)
                lineToRelative(3f, 2.7f)
            }
        }.build()
        
        return _RedoDot!!
    }

private var _RedoDot: ImageVector? = null

