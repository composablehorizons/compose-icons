package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Paperclip: ImageVector
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
                moveTo(15f, 7f)
                lineToRelative(-6.5f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 3f)
                lineToRelative(6.5f, -6.5f)
                arcToRelative(3f, 3f, 0f, false, false, -6f, -6f)
                lineToRelative(-6.5f, 6.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 9f, 9f)
                lineToRelative(6.5f, -6.5f)
            }
        }.build()
        
        return _Paperclip!!
    }

private var _Paperclip: ImageVector? = null

