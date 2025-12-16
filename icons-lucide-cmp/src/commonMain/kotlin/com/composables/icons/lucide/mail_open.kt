package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MailOpen: ImageVector
    get() {
        if (_MailOpen != null) return _MailOpen!!
        
        _MailOpen = ImageVector.Builder(
            name = "mail-open",
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
                moveTo(21.2f, 8.4f)
                curveToRelative(0.5f, 0.38f, 0.8f, 0.97f, 0.8f, 1.6f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(10f)
                arcToRelative(2f, 2f, 0f, false, true, 0.8f, -1.6f)
                lineToRelative(8f, -6f)
                arcToRelative(2f, 2f, 0f, false, true, 2.4f, 0f)
                lineToRelative(8f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 10f)
                lineToRelative(-8.97f, 5.7f)
                arcToRelative(1.94f, 1.94f, 0f, false, true, -2.06f, 0f)
                lineTo(2f, 10f)
            }
        }.build()
        
        return _MailOpen!!
    }

private var _MailOpen: ImageVector? = null

