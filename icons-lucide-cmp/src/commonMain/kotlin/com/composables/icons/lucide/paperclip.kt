package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Paperclip: ImageVector
    get() {
        if (_Paperclip != null) return _Paperclip!!
        
        _Paperclip = ImageVector.Builder(
            name = "paperclip",
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
                moveTo(16f, 6f)
                lineToRelative(-8.414f, 8.586f)
                arcToRelative(2f, 2f, 0f, false, false, 2.829f, 2.829f)
                lineToRelative(8.414f, -8.586f)
                arcToRelative(4f, 4f, 0f, true, false, -5.657f, -5.657f)
                lineToRelative(-8.379f, 8.551f)
                arcToRelative(6f, 6f, 0f, true, false, 8.485f, 8.485f)
                lineToRelative(8.379f, -8.551f)
            }
        }.build()
        
        return _Paperclip!!
    }

private var _Paperclip: ImageVector? = null

