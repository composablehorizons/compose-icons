package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Volume2: ImageVector
    get() {
        if (_Volume2 != null) return _Volume2!!
        
        _Volume2 = ImageVector.Builder(
            name = "volume-2",
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
                moveTo(15f, 8f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 15f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2f)
                lineToRelative(3.5f, -4.5f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, 1.5f, 0.5f)
                verticalLineToRelative(14f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -1.5f, 0.5f)
                lineToRelative(-3.5f, -4.5f)
            }
        }.build()
        
        return _Volume2!!
    }

private var _Volume2: ImageVector? = null

