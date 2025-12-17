package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CircuitResistor: ImageVector
    get() {
        if (_CircuitResistor != null) return _CircuitResistor!!
        
        _CircuitResistor = ImageVector.Builder(
            name = "circuit-resistor",
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
                moveTo(2f, 12f)
                horizontalLineToRelative(2f)
                lineToRelative(2f, -5f)
                lineToRelative(3f, 10f)
                lineToRelative(3f, -10f)
                lineToRelative(3f, 10f)
                lineToRelative(3f, -10f)
                lineToRelative(1.5f, 5f)
                horizontalLineToRelative(2.5f)
            }
        }.build()
        
        return _CircuitResistor!!
    }

private var _CircuitResistor: ImageVector? = null

