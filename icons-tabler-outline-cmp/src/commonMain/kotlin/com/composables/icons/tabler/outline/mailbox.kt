package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Mailbox: ImageVector
    get() {
        if (_Mailbox != null) return _Mailbox!!
        
        _Mailbox = ImageVector.Builder(
            name = "mailbox",
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
                moveTo(10f, 21f)
                verticalLineToRelative(-6.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -7f, 0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-6f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                horizontalLineToRelative(-10.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 11f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(4f)
                lineToRelative(2f, 2f)
                lineToRelative(-2f, 2f)
                horizontalLineToRelative(-4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 15f)
                horizontalLineToRelative(1f)
            }
        }.build()
        
        return _Mailbox!!
    }

private var _Mailbox: ImageVector? = null

