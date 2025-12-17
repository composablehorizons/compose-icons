package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MailFast: ImageVector
    get() {
        if (_MailFast != null) return _MailFast!!
        
        _MailFast = ImageVector.Builder(
            name = "mail-fast",
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
                moveTo(3f, 7f)
                horizontalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 11f)
                horizontalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.02f, 8.801f)
                lineToRelative(-0.6f, 6f)
                arcToRelative(2f, 2f, 0f, false, false, 1.99f, 2.199f)
                horizontalLineToRelative(7.98f)
                arcToRelative(2f, 2f, 0f, false, false, 1.99f, -1.801f)
                lineToRelative(0.6f, -6f)
                arcToRelative(2f, 2f, 0f, false, false, -1.99f, -2.199f)
                horizontalLineToRelative(-7.98f)
                arcToRelative(2f, 2f, 0f, false, false, -1.99f, 1.801f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.8f, 7.5f)
                lineToRelative(2.982f, 3.28f)
                arcToRelative(3f, 3f, 0f, false, false, 4.238f, 0.202f)
                lineToRelative(3.28f, -2.982f)
            }
        }.build()
        
        return _MailFast!!
    }

private var _MailFast: ImageVector? = null

