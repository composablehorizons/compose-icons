package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SortDescendingSmallBig: ImageVector
    get() {
        if (_SortDescendingSmallBig != null) return _SortDescendingSmallBig!!
        
        _SortDescendingSmallBig = ImageVector.Builder(
            name = "sort-descending-small-big",
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
                moveTo(10f, 15f)
                lineToRelative(-3f, 3f)
                lineToRelative(-3f, -3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 6f)
                verticalLineToRelative(12f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 18.333f)
                curveToRelative(0f, 0.369f, 0.298f, 0.667f, 0.667f, 0.667f)
                horizontalLineToRelative(2.666f)
                arcToRelative(0.667f, 0.667f, 0f, false, false, 0.667f, -0.667f)
                verticalLineToRelative(-2.666f)
                arcToRelative(0.667f, 0.667f, 0f, false, false, -0.667f, -0.667f)
                horizontalLineToRelative(-2.666f)
                arcToRelative(0.667f, 0.667f, 0f, false, false, -0.667f, 0.667f)
                verticalLineToRelative(2.666f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10.833f)
                curveToRelative(0f, 0.645f, 0.522f, 1.167f, 1.167f, 1.167f)
                horizontalLineToRelative(4.666f)
                curveToRelative(0.645f, 0f, 1.167f, -0.522f, 1.167f, -1.167f)
                verticalLineToRelative(-4.666f)
                curveToRelative(0f, -0.645f, -0.522f, -1.167f, -1.167f, -1.167f)
                horizontalLineToRelative(-4.666f)
                curveToRelative(-0.645f, 0f, -1.167f, 0.522f, -1.167f, 1.167f)
                verticalLineToRelative(4.666f)
                close()
            }
        }.build()
        
        return _SortDescendingSmallBig!!
    }

private var _SortDescendingSmallBig: ImageVector? = null

