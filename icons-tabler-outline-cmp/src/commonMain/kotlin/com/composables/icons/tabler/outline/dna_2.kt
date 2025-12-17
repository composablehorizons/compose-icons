package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Dna2: ImageVector
    get() {
        if (_Dna2 != null) return _Dna2!!
        
        _Dna2 = ImageVector.Builder(
            name = "dna-2",
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
                moveTo(17f, 3f)
                verticalLineToRelative(1f)
                curveToRelative(-0.01f, 3.352f, -1.68f, 6.023f, -5.008f, 8.014f)
                curveToRelative(-3.328f, 1.99f, 3.336f, -2f, 0.008f, -0.014f)
                curveToRelative(-3.328f, 1.99f, -5f, 4.662f, -5.008f, 8.014f)
                verticalLineToRelative(1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 21.014f)
                verticalLineToRelative(-1f)
                curveToRelative(-0.01f, -3.352f, -1.68f, -6.023f, -5.008f, -8.014f)
                curveToRelative(-3.328f, -1.99f, 3.336f, 2f, 0.008f, 0.014f)
                curveToRelative(-3.328f, -1.991f, -5f, -4.662f, -5.008f, -8.014f)
                verticalLineToRelative(-1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 4f)
                horizontalLineToRelative(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 20f)
                horizontalLineToRelative(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 8f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16f)
                horizontalLineToRelative(8f)
            }
        }.build()
        
        return _Dna2!!
    }

private var _Dna2: ImageVector? = null

