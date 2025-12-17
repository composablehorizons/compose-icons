package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.WavesElectricity: ImageVector
    get() {
        if (_WavesElectricity != null) return _WavesElectricity!!
        
        _WavesElectricity = ImageVector.Builder(
            name = "waves-electricity",
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
                moveTo(3f, 12f)
                curveToRelative(0.576f, -0.643f, 1.512f, -1.017f, 2.5f, -1f)
                curveToRelative(0.988f, -0.017f, 1.924f, 0.357f, 2.5f, 1f)
                curveToRelative(0.576f, 0.643f, 1.512f, 1.017f, 2.5f, 1f)
                curveToRelative(0.988f, 0.017f, 1.924f, -0.357f, 2.5f, -1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 16f)
                curveToRelative(0.576f, -0.643f, 1.512f, -1.017f, 2.5f, -1f)
                curveToRelative(0.988f, -0.017f, 1.924f, 0.357f, 2.5f, 1f)
                curveToRelative(0.576f, 0.643f, 1.512f, 1.017f, 2.5f, 1f)
                curveToRelative(0.988f, 0.017f, 1.924f, -0.357f, 2.5f, -1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 8f)
                curveToRelative(0.576f, -0.643f, 1.512f, -1.017f, 2.5f, -1f)
                curveToRelative(0.988f, -0.017f, 1.924f, 0.357f, 2.5f, 1f)
                curveToRelative(0.576f, 0.643f, 1.512f, 1.017f, 2.5f, 1f)
                curveToRelative(0.988f, 0.017f, 1.924f, -0.357f, 2.5f, -1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 7f)
                lineToRelative(-3f, 5f)
                horizontalLineToRelative(4f)
                lineToRelative(-3f, 5f)
            }
        }.build()
        
        return _WavesElectricity!!
    }

private var _WavesElectricity: ImageVector? = null

