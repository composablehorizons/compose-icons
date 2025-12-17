package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.LassoOff: ImageVector
    get() {
        if (_LassoOff != null) return _LassoOff!!
        
        _LassoOff = ImageVector.Builder(
            name = "lasso-off",
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
                moveTo(4.028f, 13.252f)
                curveToRelative(-0.657f, -0.972f, -1.028f, -2.078f, -1.028f, -3.252f)
                curveToRelative(0f, -1.804f, 0.878f, -3.449f, 2.319f, -4.69f)
                moveToRelative(2.49f, -1.506f)
                arcToRelative(11.066f, 11.066f, 0f, false, true, 4.191f, -0.804f)
                curveToRelative(4.97f, 0f, 9f, 3.134f, 9f, 7f)
                curveToRelative(0f, 1.799f, -0.873f, 3.44f, -2.307f, 4.68f)
                moveToRelative(-2.503f, 1.517f)
                arcToRelative(11.066f, 11.066f, 0f, false, true, -4.19f, 0.803f)
                curveToRelative(-1.913f, 0f, -3.686f, -0.464f, -5.144f, -1.255f)
            }
            path(
                fill = SolidColor(Color.Transparent),
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 17f)
                curveToRelative(0f, 1.42f, 0.316f, 2.805f, 1f, 4f)
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
        
        return _LassoOff!!
    }

private var _LassoOff: ImageVector? = null

