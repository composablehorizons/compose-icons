package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.AlphabetBangla: ImageVector
    get() {
        if (_AlphabetBangla != null) return _AlphabetBangla!!
        
        _AlphabetBangla = ImageVector.Builder(
            name = "alphabet-bangla",
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
                moveTo(14f, 12f)
                curveToRelative(0.904f, -0.027f, 3f, 2f, 3f, 7f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 11f)
                curveToRelative(0f, -0.955f, 0f, -2f, 0.786f, -2.677f)
                curveToRelative(1.262f, -1.089f, 3.025f, 0.55f, 3.2f, 2.06f)
                curveToRelative(0.086f, 0.741f, -0.215f, 3.109f, -1.489f, 4.527f)
                curveToRelative(-0.475f, 0.53f, -0.904f, 0.992f, -1.711f, 1.074f)
                curveToRelative(-0.75f, 0.076f, -1.364f, -0.122f, -2.076f, -0.588f)
                curveToRelative(-1.138f, -0.743f, -2.327f, -1.997f, -3.336f, -3.73f)
                curveToRelative(-1.078f, -1.849f, -1.66f, -3.113f, -2.374f, -5.666f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.37f, 7.072f)
                curveToRelative(0.769f, -0.836f, 5.246f, -4.094f, 8.4f, -0.202f)
                curveToRelative(0.382f, 0.472f, 0.573f, 0.708f, 0.9f, 1.63f)
                curveToRelative(0.326f, 0.921f, 0.326f, 1.562f, 0.326f, 2.844f)
                verticalLineToRelative(7.656f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 10f)
                curveToRelative(0f, -1.989f, 1.5f, -4f, 4f, -4f)
            }
        }.build()
        
        return _AlphabetBangla!!
    }

private var _AlphabetBangla: ImageVector? = null

