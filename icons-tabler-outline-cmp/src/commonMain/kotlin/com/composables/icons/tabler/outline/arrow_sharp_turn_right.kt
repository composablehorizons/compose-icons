package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowSharpTurnRight: ImageVector
    get() {
        if (_ArrowSharpTurnRight != null) return _ArrowSharpTurnRight!!
        
        _ArrowSharpTurnRight = ImageVector.Builder(
            name = "arrow-sharp-turn-right",
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
                moveTo(7f, 18f)
                verticalLineToRelative(-11.31f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, 1.195f, -0.495f)
                lineToRelative(9.805f, 9.805f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 16f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
            }
        }.build()
        
        return _ArrowSharpTurnRight!!
    }

private var _ArrowSharpTurnRight: ImageVector? = null

