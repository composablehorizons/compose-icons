package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Filter2Spark: ImageVector
    get() {
        if (_Filter2Spark != null) return _Filter2Spark!!
        
        _Filter2Spark = ImageVector.Builder(
            name = "filter-2-spark",
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
                moveTo(4f, 6f)
                horizontalLineToRelative(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                horizontalLineToRelative(9.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                horizontalLineToRelative(2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 21.5f)
                curveToRelative(0.205f, -0.849f, 0.641f, -1.625f, 1.258f, -2.242f)
                curveToRelative(0.617f, -0.617f, 1.393f, -1.053f, 2.242f, -1.258f)
                curveToRelative(-0.849f, -0.205f, -1.625f, -0.641f, -2.242f, -1.258f)
                curveToRelative(-0.617f, -0.617f, -1.053f, -1.393f, -1.258f, -2.242f)
                curveToRelative(-0.205f, 0.849f, -0.641f, 1.625f, -1.258f, 2.242f)
                curveToRelative(-0.617f, 0.617f, -1.393f, 1.053f, -2.242f, 1.258f)
                curveToRelative(0.849f, 0.205f, 1.625f, 0.641f, 2.242f, 1.258f)
                curveToRelative(0.617f, 0.617f, 1.053f, 1.393f, 1.258f, 2.242f)
                close()
            }
        }.build()
        
        return _Filter2Spark!!
    }

private var _Filter2Spark: ImageVector? = null

