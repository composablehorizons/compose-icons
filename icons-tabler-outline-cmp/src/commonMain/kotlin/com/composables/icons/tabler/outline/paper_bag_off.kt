package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PaperBagOff: ImageVector
    get() {
        if (_PaperBagOff != null) return _PaperBagOff!!
        
        _PaperBagOff = ImageVector.Builder(
            name = "paper-bag-off",
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
                moveTo(7.158f, 3.185f)
                curveToRelative(0.256f, -0.119f, 0.542f, -0.185f, 0.842f, -0.185f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1.82f)
                arcToRelative(5f, 5f, 0f, false, false, 0.528f, 2.236f)
                lineToRelative(0.944f, 1.888f)
                arcToRelative(5f, 5f, 0f, false, true, 0.528f, 2.236f)
                verticalLineToRelative(2.82f)
                moveToRelative(-0.177f, 3.824f)
                arcToRelative(2f, 2f, 0f, false, true, -1.823f, 1.176f)
                horizontalLineToRelative(-12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-5.82f)
                arcToRelative(5f, 5f, 0f, false, true, 0.528f, -2.236f)
                lineToRelative(1.472f, -2.944f)
                verticalLineToRelative(-2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.185f, 13.173f)
                arcToRelative(2f, 2f, 0f, true, false, 2.64f, 2.647f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 21f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-5.82f)
                arcToRelative(5f, 5f, 0f, false, false, -0.528f, -2.236f)
                lineToRelative(-1.472f, -2.944f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 7f)
                horizontalLineToRelative(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _PaperBagOff!!
    }

private var _PaperBagOff: ImageVector? = null

