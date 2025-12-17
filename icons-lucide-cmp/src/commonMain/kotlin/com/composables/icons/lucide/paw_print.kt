package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PawPrint: ImageVector
    get() {
        if (_PawPrint != null) return _PawPrint!!
        
        _PawPrint = ImageVector.Builder(
            name = "paw-print",
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
                moveTo(13f, 4f)
                arcTo(2f, 2f, 0f, false, true, 11f, 6f)
                arcTo(2f, 2f, 0f, false, true, 9f, 4f)
                arcTo(2f, 2f, 0f, false, true, 13f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 8f)
                arcTo(2f, 2f, 0f, false, true, 18f, 10f)
                arcTo(2f, 2f, 0f, false, true, 16f, 8f)
                arcTo(2f, 2f, 0f, false, true, 20f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 16f)
                arcTo(2f, 2f, 0f, false, true, 20f, 18f)
                arcTo(2f, 2f, 0f, false, true, 18f, 16f)
                arcTo(2f, 2f, 0f, false, true, 22f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 10f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                verticalLineToRelative(3.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -6.84f, 1.045f)
                quadTo(6.52f, 17.48f, 4.46f, 16.84f)
                arcTo(3.5f, 3.5f, 0f, false, true, 5.5f, 10f)
                close()
            }
        }.build()
        
        return _PawPrint!!
    }

private var _PawPrint: ImageVector? = null

