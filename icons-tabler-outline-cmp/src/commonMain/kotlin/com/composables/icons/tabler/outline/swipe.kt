package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Swipe: ImageVector
    get() {
        if (_Swipe != null) return _Swipe!!
        
        _Swipe = ImageVector.Builder(
            name = "swipe",
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
                moveTo(15f, 16.572f)
                verticalLineToRelative(2.42f)
                arcToRelative(2.01f, 2.01f, 0f, false, true, -2.009f, 2.008f)
                horizontalLineToRelative(-7.981f)
                arcToRelative(2.01f, 2.01f, 0f, false, true, -2.01f, -2.009f)
                verticalLineToRelative(-7.981f)
                arcToRelative(2.01f, 2.01f, 0f, false, true, 2.009f, -2.01f)
                horizontalLineToRelative(2.954f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.167f, 4.511f)
                arcToRelative(2.04f, 2.04f, 0f, false, true, 2.496f, -1.441f)
                lineToRelative(7.826f, 2.097f)
                arcToRelative(2.04f, 2.04f, 0f, false, true, 1.441f, 2.496f)
                lineToRelative(-2.097f, 7.826f)
                arcToRelative(2.04f, 2.04f, 0f, false, true, -2.496f, 1.441f)
                lineToRelative(-7.827f, -2.097f)
                arcToRelative(2.04f, 2.04f, 0f, false, true, -1.441f, -2.496f)
                lineToRelative(2.098f, -7.827f)
                close()
            }
        }.build()
        
        return _Swipe!!
    }

private var _Swipe: ImageVector? = null

