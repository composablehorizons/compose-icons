package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.VariablePlus: ImageVector
    get() {
        if (_VariablePlus != null) return _VariablePlus!!
        
        _VariablePlus = ImageVector.Builder(
            name = "variable-plus",
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
                moveTo(5f, 4f)
                curveToRelative(-2.5f, 5f, -2.5f, 10f, 0f, 16f)
                moveToRelative(14f, -16f)
                curveToRelative(1.38f, 2.76f, 2f, 5.52f, 1.855f, 8.448f)
                moveToRelative(-11.855f, -3.448f)
                horizontalLineToRelative(1f)
                curveToRelative(1f, 0f, 1f, 1f, 2.016f, 3.527f)
                curveToRelative(0.785f, 1.972f, 0.944f, 3.008f, 1.483f, 3.346f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16f)
                curveToRelative(1.5f, 0f, 3f, -2f, 4f, -3.5f)
                reflectiveCurveToRelative(2.5f, -3.5f, 4f, -3.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(6f)
            }
        }.build()
        
        return _VariablePlus!!
    }

private var _VariablePlus: ImageVector? = null

