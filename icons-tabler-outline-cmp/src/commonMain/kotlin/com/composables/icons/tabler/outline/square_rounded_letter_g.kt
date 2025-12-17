package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SquareRoundedLetterG: ImageVector
    get() {
        if (_SquareRoundedLetterG != null) return _SquareRoundedLetterG!!
        
        _SquareRoundedLetterG = ImageVector.Builder(
            name = "square-rounded-letter-g",
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
                moveTo(14f, 8f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                curveToRelative(7.2f, 0f, 9f, 1.8f, 9f, 9f)
                reflectiveCurveToRelative(-1.8f, 9f, -9f, 9f)
                reflectiveCurveToRelative(-9f, -1.8f, -9f, -9f)
                reflectiveCurveToRelative(1.8f, -9f, 9f, -9f)
                close()
            }
        }.build()
        
        return _SquareRoundedLetterG!!
    }

private var _SquareRoundedLetterG: ImageVector? = null

