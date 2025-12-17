package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ChartCohort: ImageVector
    get() {
        if (_ChartCohort != null) return _ChartCohort!!
        
        _ChartCohort = ImageVector.Builder(
            name = "chart-cohort",
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
                moveTo(3f, 9f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-18f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 15f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-12f)
            }
        }.build()
        
        return _ChartCohort!!
    }

private var _ChartCohort: ImageVector? = null

