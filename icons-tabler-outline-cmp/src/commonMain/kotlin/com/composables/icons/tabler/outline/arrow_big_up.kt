package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowBigUp: ImageVector
    get() {
        if (_ArrowBigUp != null) return _ArrowBigUp!!
        
        _ArrowBigUp = ImageVector.Builder(
            name = "arrow-big-up",
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
                moveTo(9f, 20f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-3.586f)
                arcToRelative(1f, 1f, 0f, false, true, -0.707f, -1.707f)
                lineToRelative(6.586f, -6.586f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineToRelative(6.586f, 6.586f)
                arcToRelative(1f, 1f, 0f, false, true, -0.707f, 1.707f)
                horizontalLineToRelative(-3.586f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
        }.build()
        
        return _ArrowBigUp!!
    }

private var _ArrowBigUp: ImageVector? = null

