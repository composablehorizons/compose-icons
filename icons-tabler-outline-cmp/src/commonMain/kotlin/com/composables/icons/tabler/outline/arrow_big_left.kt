package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowBigLeft: ImageVector
    get() {
        if (_ArrowBigLeft != null) return _ArrowBigLeft!!
        
        _ArrowBigLeft = ImageVector.Builder(
            name = "arrow-big-left",
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
                moveTo(20f, 15f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(3.586f)
                arcToRelative(1f, 1f, 0f, false, true, -1.707f, 0.707f)
                lineToRelative(-6.586f, -6.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.414f)
                lineToRelative(6.586f, -6.586f)
                arcToRelative(1f, 1f, 0f, false, true, 1.707f, 0.707f)
                verticalLineToRelative(3.586f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                close()
            }
        }.build()
        
        return _ArrowBigLeft!!
    }

private var _ArrowBigLeft: ImageVector? = null

