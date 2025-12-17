package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.LassoPolygon: ImageVector
    get() {
        if (_LassoPolygon != null) return _LassoPolygon!!
        
        _LassoPolygon = ImageVector.Builder(
            name = "lasso-polygon",
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
                moveTo(4.028f, 13.252f)
                lineToRelative(-1.028f, -3.252f)
                lineToRelative(2f, -7f)
                lineToRelative(7f, 5f)
                lineToRelative(8f, -3f)
                lineToRelative(1f, 9f)
                lineToRelative(-9f, 3f)
                lineToRelative(-5.144f, -1.255f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 15f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 17f)
                curveToRelative(0f, 1.42f, 0.316f, 2.805f, 1f, 4f)
            }
        }.build()
        
        return _LassoPolygon!!
    }

private var _LassoPolygon: ImageVector? = null

