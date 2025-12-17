package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Sparkles: ImageVector
    get() {
        if (_Sparkles != null) return _Sparkles!!
        
        _Sparkles = ImageVector.Builder(
            name = "sparkles",
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
                moveTo(16f, 18f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                close()
                moveToRelative(0f, -12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                close()
                moveToRelative(-7f, 12f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                close()
            }
        }.build()
        
        return _Sparkles!!
    }

private var _Sparkles: ImageVector? = null

