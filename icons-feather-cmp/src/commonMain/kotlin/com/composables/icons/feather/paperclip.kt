package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Paperclip: ImageVector
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.44f, 11.05f)
                lineToRelative(-9.19f, 9.19f)
                arcToRelative(6f, 6f, 0f, false, true, -8.49f, -8.49f)
                lineToRelative(9.19f, -9.19f)
                arcToRelative(4f, 4f, 0f, false, true, 5.66f, 5.66f)
                lineToRelative(-9.2f, 9.19f)
                arcToRelative(2f, 2f, 0f, false, true, -2.83f, -2.83f)
                lineToRelative(8.49f, -8.48f)
            }
        }.build()
        
        return _Paperclip!!
    }

private var _Paperclip: ImageVector? = null

