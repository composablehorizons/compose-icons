package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SolarElectricity: ImageVector
    get() {
        if (_SolarElectricity != null) return _SolarElectricity!!
        
        _SolarElectricity = ImageVector.Builder(
            name = "solar-electricity",
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
                moveTo(4f, 6.28f)
                verticalLineToRelative(11.44f)
                arcToRelative(1f, 1f, 0f, false, false, 1.243f, 0.97f)
                lineToRelative(6f, -1.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0.757f, -0.97f)
                verticalLineToRelative(-8.44f)
                arcToRelative(1f, 1f, 0f, false, false, -0.757f, -0.97f)
                lineToRelative(-6f, -1.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1.243f, 0.97f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 6f)
                verticalLineToRelative(12f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                horizontalLineToRelative(-8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
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
        
        return _SolarElectricity!!
    }

private var _SolarElectricity: ImageVector? = null

