package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandPowershell: ImageVector
    get() {
        if (_BrandPowershell != null) return _BrandPowershell!!
        
        _BrandPowershell = ImageVector.Builder(
            name = "brand-powershell",
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
                moveTo(4.887f, 20f)
                horizontalLineToRelative(11.868f)
                curveToRelative(0.893f, 0f, 1.664f, -0.665f, 1.847f, -1.592f)
                lineToRelative(2.358f, -12f)
                curveToRelative(0.212f, -1.081f, -0.442f, -2.14f, -1.462f, -2.366f)
                arcToRelative(1.784f, 1.784f, 0f, false, false, -0.385f, -0.042f)
                horizontalLineToRelative(-11.868f)
                curveToRelative(-0.893f, 0f, -1.664f, 0.665f, -1.847f, 1.592f)
                lineToRelative(-2.358f, 12f)
                curveToRelative(-0.212f, 1.081f, 0.442f, 2.14f, 1.462f, 2.366f)
                curveToRelative(0.127f, 0.028f, 0.256f, 0.042f, 0.385f, 0.042f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 8f)
                lineToRelative(4f, 4f)
                lineToRelative(-6f, 4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                horizontalLineToRelative(3f)
            }
        }.build()
        
        return _BrandPowershell!!
    }

private var _BrandPowershell: ImageVector? = null

