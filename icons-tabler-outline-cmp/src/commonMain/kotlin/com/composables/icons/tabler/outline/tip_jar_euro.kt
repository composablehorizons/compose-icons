package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.TipJarEuro: ImageVector
    get() {
        if (_TipJarEuro != null) return _TipJarEuro!!
        
        _TipJarEuro = ImageVector.Builder(
            name = "tip-jar-euro",
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
                moveTo(17f, 4f)
                verticalLineToRelative(1.882f)
                curveToRelative(0f, 0.685f, 0.387f, 1.312f, 1f, 1.618f)
                reflectiveCurveToRelative(1f, 0.933f, 1f, 1.618f)
                verticalLineToRelative(8.882f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-8f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-8.882f)
                curveToRelative(0f, -0.685f, 0.387f, -1.312f, 1f, -1.618f)
                reflectiveCurveToRelative(1f, -0.933f, 1f, -1.618f)
                verticalLineToRelative(-1.882f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 4f)
                horizontalLineToRelative(12f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                horizontalLineToRelative(-3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10.172f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 5.656f)
            }
        }.build()
        
        return _TipJarEuro!!
    }

private var _TipJarEuro: ImageVector? = null

