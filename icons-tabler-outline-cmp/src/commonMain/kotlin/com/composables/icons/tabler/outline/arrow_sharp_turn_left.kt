package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowSharpTurnLeft: ImageVector
    get() {
        if (_ArrowSharpTurnLeft != null) return _ArrowSharpTurnLeft!!
        
        _ArrowSharpTurnLeft = ImageVector.Builder(
            name = "arrow-sharp-turn-left",
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
                moveTo(17f, 18f)
                verticalLineToRelative(-11.31f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, -1.195f, -0.495f)
                lineToRelative(-9.805f, 9.805f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 16f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
            }
        }.build()
        
        return _ArrowSharpTurnLeft!!
    }

private var _ArrowSharpTurnLeft: ImageVector? = null

