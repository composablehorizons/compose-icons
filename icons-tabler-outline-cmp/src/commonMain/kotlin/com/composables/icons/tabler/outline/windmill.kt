package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Windmill: ImageVector
    get() {
        if (_Windmill != null) return _Windmill!!
        
        _Windmill = ImageVector.Builder(
            name = "windmill",
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
                moveTo(12f, 12f)
                curveToRelative(2.76f, 0f, 5f, -2.01f, 5f, -4.5f)
                reflectiveCurveToRelative(-2.24f, -4.5f, -5f, -4.5f)
                verticalLineToRelative(9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                curveToRelative(0f, 2.76f, 2.01f, 5f, 4.5f, 5f)
                reflectiveCurveToRelative(4.5f, -2.24f, 4.5f, -5f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                curveToRelative(-2.76f, 0f, -5f, 2.01f, -5f, 4.5f)
                reflectiveCurveToRelative(2.24f, 4.5f, 5f, 4.5f)
                verticalLineToRelative(-9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                curveToRelative(0f, -2.76f, -2.01f, -5f, -4.5f, -5f)
                reflectiveCurveToRelative(-4.5f, 2.24f, -4.5f, 5f)
                horizontalLineToRelative(9f)
                close()
            }
        }.build()
        
        return _Windmill!!
    }

private var _Windmill: ImageVector? = null

