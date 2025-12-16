package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Ghost: ImageVector
    get() {
        if (_Ghost != null) return _Ghost!!
        
        _Ghost = ImageVector.Builder(
            name = "ghost",
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
                moveTo(9f, 10f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 10f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, 8f)
                verticalLineToRelative(12f)
                lineToRelative(3f, -3f)
                lineToRelative(2.5f, 2.5f)
                lineTo(12f, 19f)
                lineToRelative(2.5f, 2.5f)
                lineTo(17f, 19f)
                lineToRelative(3f, 3f)
                verticalLineTo(10f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, -8f)
                close()
            }
        }.build()
        
        return _Ghost!!
    }

private var _Ghost: ImageVector? = null

