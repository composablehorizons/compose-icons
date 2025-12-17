package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Barrel: ImageVector
    get() {
        if (_Barrel != null) return _Barrel!!
        
        _Barrel = ImageVector.Builder(
            name = "barrel",
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
                moveTo(7.278f, 4f)
                horizontalLineToRelative(9.444f)
                arcToRelative(2f, 2f, 0f, false, true, 1.841f, 1.22f)
                curveToRelative(0.958f, 2.26f, 1.437f, 4.52f, 1.437f, 6.78f)
                curveToRelative(0f, 2.26f, -0.479f, 4.52f, -1.437f, 6.78f)
                arcToRelative(2f, 2f, 0f, false, true, -1.841f, 1.22f)
                horizontalLineToRelative(-9.444f)
                arcToRelative(2f, 2f, 0f, false, true, -1.841f, -1.22f)
                curveToRelative(-0.958f, -2.26f, -1.437f, -4.52f, -1.437f, -6.78f)
                curveToRelative(0f, -2.26f, 0.479f, -4.52f, 1.437f, -6.78f)
                arcToRelative(2f, 2f, 0f, false, true, 1.841f, -1.22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 4f)
                curveToRelative(0.667f, 2.667f, 1f, 5.333f, 1f, 8f)
                reflectiveCurveToRelative(-0.333f, 5.333f, -1f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 4f)
                curveToRelative(-0.667f, 2.667f, -1f, 5.333f, -1f, 8f)
                reflectiveCurveToRelative(0.333f, 5.333f, 1f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 16f)
                horizontalLineToRelative(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.5f, 8f)
                horizontalLineToRelative(-15f)
            }
        }.build()
        
        return _Barrel!!
    }

private var _Barrel: ImageVector? = null

