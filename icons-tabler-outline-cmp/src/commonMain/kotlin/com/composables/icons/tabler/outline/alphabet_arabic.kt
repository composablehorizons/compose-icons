package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.AlphabetArabic: ImageVector
    get() {
        if (_AlphabetArabic != null) return _AlphabetArabic!!
        
        _AlphabetArabic = ImageVector.Builder(
            name = "alphabet-arabic",
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
                moveTo(10f, 6f)
                verticalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 14f)
                horizontalLineToRelative(8f)
                quadToRelative(-2.518f, -3f, -4f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 6f)
                verticalLineToRelative(9.958f)
                curveToRelative(0f, 0.963f, 0f, 1.444f, -0.293f, 1.743f)
                reflectiveCurveToRelative(-0.764f, 0.299f, -1.707f, 0.299f)
                horizontalLineToRelative(-1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 6f)
                verticalLineToRelative(9.958f)
                curveToRelative(0f, 0.963f, 0f, 1.444f, -0.293f, 1.743f)
                reflectiveCurveToRelative(-0.764f, 0.299f, -1.707f, 0.299f)
                horizontalLineToRelative(-1f)
            }
        }.build()
        
        return _AlphabetArabic!!
    }

private var _AlphabetArabic: ImageVector? = null

