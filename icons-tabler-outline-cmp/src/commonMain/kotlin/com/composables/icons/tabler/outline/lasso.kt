package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Lasso: ImageVector
    get() {
        if (_Lasso != null) return _Lasso!!
        
        _Lasso = ImageVector.Builder(
            name = "lasso",
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
                curveToRelative(0f, -3.866f, 4.03f, -7f, 9f, -7f)
                reflectiveCurveToRelative(9f, 3.134f, 9f, 7f)
                reflectiveCurveToRelative(-4.03f, 7f, -9f, 7f)
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
        }.build()
        
        return _Lasso!!
    }

private var _Lasso: ImageVector? = null

