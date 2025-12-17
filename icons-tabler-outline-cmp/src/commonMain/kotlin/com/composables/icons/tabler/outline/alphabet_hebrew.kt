package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.AlphabetHebrew: ImageVector
    get() {
        if (_AlphabetHebrew != null) return _AlphabetHebrew!!
        
        _AlphabetHebrew = ImageVector.Builder(
            name = "alphabet-hebrew",
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
                moveTo(7f, 6f)
                curveToRelative(2.333f, 5.143f, 6.611f, 6.857f, 9.333f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.667f, 14f)
                curveToRelative(2.505f, -1.5f, 2.666f, -4.141f, 2.666f, -5.333f)
                curveToRelative(0f, -1.778f, -0.443f, -2.667f, -0.443f, -2.667f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.485f, 18f)
                reflectiveCurveToRelative(-0.485f, -0.905f, -0.485f, -2.714f)
                curveToRelative(0f, -1.172f, 0.164f, -3.722f, 2.641f, -5.27f)
            }
        }.build()
        
        return _AlphabetHebrew!!
    }

private var _AlphabetHebrew: ImageVector? = null

