package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.SignalSlash: ImageVector
    get() {
        if (_SignalSlash != null) return _SignalSlash!!
        
        _SignalSlash = ImageVector.Builder(
            name = "signal-slash",
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
                lineToRelative(8.735f, 8.735f)
                moveToRelative(0f, 0f)
                arcToRelative(0.374f, 0.374f, 0f, true, true, 0.53f, 0.53f)
                moveToRelative(-0.53f, -0.53f)
                lineToRelative(0.53f, 0.53f)
                moveToRelative(0f, 0f)
                lineTo(21f, 21f)
                moveTo(14.652f, 9.348f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 0f, 5.304f)
                moveToRelative(2.121f, -7.425f)
                arcToRelative(6.75f, 6.75f, 0f, false, true, 0f, 9.546f)
                moveToRelative(2.121f, -11.667f)
                curveToRelative(3.808f, 3.807f, 3.808f, 9.98f, 0f, 13.788f)
                moveToRelative(-9.546f, -4.242f)
                arcToRelative(3.733f, 3.733f, 0f, false, true, -1.06f, -2.122f)
                moveToRelative(-1.061f, 4.243f)
                arcToRelative(6.75f, 6.75f, 0f, false, true, -1.625f, -6.929f)
                moveToRelative(-0.496f, 9.05f)
                curveToRelative(-3.068f, -3.067f, -3.664f, -7.67f, -1.79f, -11.334f)
                moveTo(12f, 12f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                close()
            }
        }.build()
        
        return _SignalSlash!!
    }

private var _SignalSlash: ImageVector? = null

