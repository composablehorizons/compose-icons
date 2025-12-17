package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ThumbDown: ImageVector
    get() {
        if (_ThumbDown != null) return _ThumbDown!!
        
        _ThumbDown = ImageVector.Builder(
            name = "thumb-down",
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
                moveTo(7f, 13f)
                verticalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                lineToRelative(-1f, -5f)
                arcToRelative(2f, 3f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-7f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
            }
        }.build()
        
        return _ThumbDown!!
    }

private var _ThumbDown: ImageVector? = null

