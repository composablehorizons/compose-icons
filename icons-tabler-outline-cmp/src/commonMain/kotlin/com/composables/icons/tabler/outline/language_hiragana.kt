package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.LanguageHiragana: ImageVector
    get() {
        if (_LanguageHiragana != null) return _LanguageHiragana!!
        
        _LanguageHiragana = ImageVector.Builder(
            name = "language-hiragana",
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
                moveTo(4f, 5f)
                horizontalLineToRelative(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 4f)
                curveToRelative(0f, 4.846f, 0f, 7f, 0.5f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 8.5f)
                curveToRelative(0f, 2.286f, -2f, 4.5f, -3.5f, 4.5f)
                reflectiveCurveToRelative(-2.5f, -1.135f, -2.5f, -2f)
                curveToRelative(0f, -2f, 1f, -3f, 3f, -3f)
                reflectiveCurveToRelative(5f, 0.57f, 5f, 2.857f)
                curveToRelative(0f, 1.524f, -0.667f, 2.571f, -2f, 3.143f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20f)
                lineToRelative(4f, -9f)
                lineToRelative(4f, 9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.1f, 18f)
                horizontalLineToRelative(-6.2f)
            }
        }.build()
        
        return _LanguageHiragana!!
    }

private var _LanguageHiragana: ImageVector? = null

