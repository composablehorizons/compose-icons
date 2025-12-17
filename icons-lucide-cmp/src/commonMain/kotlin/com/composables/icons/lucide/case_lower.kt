package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CaseLower: ImageVector
    get() {
        if (_CaseLower != null) return _CaseLower!!
        
        _CaseLower = ImageVector.Builder(
            name = "case-lower",
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
                moveTo(10f, 9f)
                verticalLineToRelative(7f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 6f)
                verticalLineToRelative(10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 17.5f, 16f)
                arcTo(3.5f, 3.5f, 0f, false, true, 14f, 12.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 21f, 12.5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 6.5f, 16f)
                arcTo(3.5f, 3.5f, 0f, false, true, 3f, 12.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 10f, 12.5f)
                close()
            }
        }.build()
        
        return _CaseLower!!
    }

private var _CaseLower: ImageVector? = null

