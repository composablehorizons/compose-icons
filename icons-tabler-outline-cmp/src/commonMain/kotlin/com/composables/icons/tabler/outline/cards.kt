package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Cards: ImageVector
    get() {
        if (_Cards != null) return _Cards!!
        
        _Cards = ImageVector.Builder(
            name = "cards",
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
                moveTo(3.604f, 7.197f)
                lineToRelative(7.138f, -3.109f)
                arcToRelative(0.96f, 0.96f, 0f, false, true, 1.27f, 0.527f)
                lineToRelative(4.924f, 11.902f)
                arcToRelative(1f, 1f, 0f, false, true, -0.514f, 1.304f)
                lineToRelative(-7.137f, 3.109f)
                arcToRelative(0.96f, 0.96f, 0f, false, true, -1.271f, -0.527f)
                lineToRelative(-4.924f, -11.903f)
                arcToRelative(1f, 1f, 0f, false, true, 0.514f, -1.304f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 4f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(3.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 6f)
                curveToRelative(0.264f, 0.112f, 0.52f, 0.217f, 0.768f, 0.315f)
                arcToRelative(1f, 1f, 0f, false, true, 0.53f, 1.311f)
                lineToRelative(-2.298f, 5.374f)
            }
        }.build()
        
        return _Cards!!
    }

private var _Cards: ImageVector? = null

