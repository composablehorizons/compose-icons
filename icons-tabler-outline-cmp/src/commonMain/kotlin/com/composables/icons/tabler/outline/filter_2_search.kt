package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Filter2Search: ImageVector
    get() {
        if (_Filter2Search != null) return _Filter2Search!!
        
        _Filter2Search = ImageVector.Builder(
            name = "filter-2-search",
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
                moveTo(4f, 6f)
                horizontalLineToRelative(16f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                horizontalLineToRelative(8.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                horizontalLineToRelative(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 18f)
                curveToRelative(0f, 0.796f, 0.316f, 1.559f, 0.879f, 2.121f)
                curveToRelative(0.563f, 0.563f, 1.326f, 0.879f, 2.121f, 0.879f)
                curveToRelative(0.796f, 0f, 1.559f, -0.316f, 2.121f, -0.879f)
                curveToRelative(0.563f, -0.563f, 0.879f, -1.326f, 0.879f, -2.121f)
                curveToRelative(0f, -0.796f, -0.316f, -1.559f, -0.879f, -2.121f)
                curveToRelative(-0.563f, -0.563f, -1.326f, -0.879f, -2.121f, -0.879f)
                curveToRelative(-0.796f, 0f, -1.559f, 0.316f, -2.121f, 0.879f)
                curveToRelative(-0.563f, 0.563f, -0.879f, 1.326f, -0.879f, 2.121f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.2f, 20.2f)
                lineToRelative(1.8f, 1.8f)
            }
        }.build()
        
        return _Filter2Search!!
    }

private var _Filter2Search: ImageVector? = null

