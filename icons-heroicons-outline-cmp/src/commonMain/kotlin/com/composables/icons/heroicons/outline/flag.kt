package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Flag: ImageVector
    get() {
        if (_Flag != null) return _Flag!!
        
        _Flag = ImageVector.Builder(
            name = "flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(3f, 3f)
                verticalLineToRelative(1.5f)
                moveTo(3f, 21f)
                verticalLineToRelative(-6f)
                moveToRelative(0f, 0f)
                lineToRelative(2.77f, -0.693f)
                arcToRelative(9f, 9f, 0f, false, true, 6.208f, 0.682f)
                lineToRelative(0.108f, 0.054f)
                arcToRelative(9f, 9f, 0f, false, false, 6.086f, 0.71f)
                lineToRelative(3.114f, -0.732f)
                arcToRelative(48.524f, 48.524f, 0f, false, true, -0.005f, -10.499f)
                lineToRelative(-3.11f, 0.732f)
                arcToRelative(9f, 9f, 0f, false, true, -6.085f, -0.711f)
                lineToRelative(-0.108f, -0.054f)
                arcToRelative(9f, 9f, 0f, false, false, -6.208f, -0.682f)
                lineTo(3f, 4.5f)
                moveTo(3f, 15f)
                verticalLineTo(4.5f)
            }
        }.build()
        
        return _Flag!!
    }

private var _Flag: ImageVector? = null

