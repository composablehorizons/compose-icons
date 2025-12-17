package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Telescope: ImageVector
    get() {
        if (_Telescope != null) return _Telescope!!
        
        _Telescope = ImageVector.Builder(
            name = "telescope",
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
                moveTo(6f, 21f)
                lineToRelative(6f, -5f)
                lineToRelative(6f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                verticalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.294f, 13.678f)
                lineToRelative(0.166f, 0.281f)
                curveToRelative(0.52f, 0.88f, 1.624f, 1.265f, 2.605f, 0.91f)
                lineToRelative(14.242f, -5.165f)
                arcToRelative(1.023f, 1.023f, 0f, false, false, 0.565f, -1.456f)
                lineToRelative(-2.62f, -4.705f)
                arcToRelative(1.087f, 1.087f, 0f, false, false, -1.447f, -0.42f)
                lineToRelative(-0.056f, 0.032f)
                lineToRelative(-12.694f, 7.618f)
                curveToRelative(-1.02f, 0.613f, -1.357f, 1.897f, -0.76f, 2.905f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 5f)
                lineToRelative(3f, 5.5f)
            }
        }.build()
        
        return _Telescope!!
    }

private var _Telescope: ImageVector? = null

