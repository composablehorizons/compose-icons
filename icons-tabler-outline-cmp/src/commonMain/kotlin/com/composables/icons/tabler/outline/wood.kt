package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Wood: ImageVector
    get() {
        if (_Wood != null) return _Wood!!
        
        _Wood = ImageVector.Builder(
            name = "wood",
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
                moveTo(12f, 5.5f)
                moveToRelative(-6f, 0f)
                arcToRelative(6f, 2.5f, 0f, true, false, 12f, 0f)
                arcToRelative(6f, 2.5f, 0f, true, false, -12f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 5.5f)
                verticalLineToRelative(4.626f)
                arcToRelative(1.415f, 1.415f, 0f, false, true, 1.683f, 2.18f)
                lineToRelative(-0.097f, 0.108f)
                lineToRelative(-1.586f, 1.586f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.61f, -2.54f, 2.925f, -5.725f, 3f)
                lineToRelative(-0.275f, 0f)
                curveToRelative(-3.314f, 0f, -6f, -1.343f, -6f, -3f)
                verticalLineToRelative(-2f)
                lineToRelative(-1.586f, -1.586f)
                arcToRelative(1.414f, 1.414f, 0f, false, true, 1.586f, -2.287f)
                verticalLineToRelative(-6.627f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12.5f)
                verticalLineToRelative(1.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 16f)
                verticalLineToRelative(1f)
            }
        }.build()
        
        return _Wood!!
    }

private var _Wood: ImageVector? = null

