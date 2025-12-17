package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Number10: ImageVector
    get() {
        if (_Number10 != null) return _Number10!!
        
        _Number10 = ImageVector.Builder(
            name = "number-10",
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
                moveTo(8f, 20f)
                verticalLineToRelative(-16f)
                lineToRelative(-5f, 5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 20f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -4f)
                verticalLineToRelative(-8f)
                arcToRelative(4f, 4f, 0f, true, false, -8f, 0f)
                verticalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, 4f)
            }
        }.build()
        
        return _Number10!!
    }

private var _Number10: ImageVector? = null

