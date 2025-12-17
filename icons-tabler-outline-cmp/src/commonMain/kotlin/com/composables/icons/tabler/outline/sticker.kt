package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Sticker: ImageVector
    get() {
        if (_Sticker != null) return _Sticker!!
        
        _Sticker = ImageVector.Builder(
            name = "sticker",
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
                moveTo(20f, 12f)
                lineToRelative(-2f, 0.5f)
                arcToRelative(6f, 6f, 0f, false, true, -6.5f, -6.5f)
                lineToRelative(0.5f, -2f)
                lineToRelative(8f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                arcToRelative(8f, 8f, 0f, true, true, -8f, -8f)
            }
        }.build()
        
        return _Sticker!!
    }

private var _Sticker: ImageVector? = null

