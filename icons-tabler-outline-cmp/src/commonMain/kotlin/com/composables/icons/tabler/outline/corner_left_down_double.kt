package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CornerLeftDownDouble: ImageVector
    get() {
        if (_CornerLeftDownDouble != null) return _CornerLeftDownDouble!!
        
        _CornerLeftDownDouble = ImageVector.Builder(
            name = "corner-left-down-double",
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
                moveTo(18f, 4f)
                horizontalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(7f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 10f)
                lineToRelative(-4f, 4f)
                lineToRelative(-4f, -4f)
                moveToRelative(8f, 5f)
                lineToRelative(-4f, 4f)
                lineToRelative(-4f, -4f)
            }
        }.build()
        
        return _CornerLeftDownDouble!!
    }

private var _CornerLeftDownDouble: ImageVector? = null

