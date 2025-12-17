package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Backspace: ImageVector
    get() {
        if (_Backspace != null) return _Backspace!!
        
        _Backspace = ImageVector.Builder(
            name = "backspace",
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
                moveTo(12f, 9.75f)
                lineTo(14.25f, 12f)
                moveToRelative(0f, 0f)
                lineToRelative(2.25f, 2.25f)
                moveTo(14.25f, 12f)
                lineToRelative(2.25f, -2.25f)
                moveTo(14.25f, 12f)
                lineTo(12f, 14.25f)
                moveToRelative(-2.58f, 4.92f)
                lineToRelative(-6.374f, -6.375f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 0f, -1.59f)
                lineTo(9.42f, 4.83f)
                curveToRelative(0.21f, -0.211f, 0.497f, -0.33f, 0.795f, -0.33f)
                horizontalLineTo(19.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, 2.25f)
                verticalLineToRelative(10.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, 2.25f)
                horizontalLineToRelative(-9.284f)
                curveToRelative(-0.298f, 0f, -0.585f, -0.119f, -0.795f, -0.33f)
                close()
            }
        }.build()
        
        return _Backspace!!
    }

private var _Backspace: ImageVector? = null

