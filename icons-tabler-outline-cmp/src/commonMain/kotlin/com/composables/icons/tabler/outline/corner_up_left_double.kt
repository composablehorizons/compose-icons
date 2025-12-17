package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CornerUpLeftDouble: ImageVector
    get() {
        if (_CornerUpLeftDouble != null) return _CornerUpLeftDouble!!
        
        _CornerUpLeftDouble = ImageVector.Builder(
            name = "corner-up-left-double",
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
                moveTo(19f, 18f)
                verticalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(-7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 13f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
                moveToRelative(-5f, 8f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
            }
        }.build()
        
        return _CornerUpLeftDouble!!
    }

private var _CornerUpLeftDouble: ImageVector? = null

