package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Clipboard: ImageVector
    get() {
        if (_Clipboard != null) return _Clipboard!!
        
        _Clipboard = ImageVector.Builder(
            name = "clipboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(15.666f, 3.888f)
                arcTo(2.25f, 2.25f, 0f, false, false, 13.5f, 2.25f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.03f, 0f, -1.9f, 0.693f, -2.166f, 1.638f)
                moveToRelative(7.332f, 0f)
                curveToRelative(0.055f, 0.194f, 0.084f, 0.4f, 0.084f, 0.612f)
                verticalLineToRelative(0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.212f, 0.03f, -0.418f, 0.084f, -0.612f)
                moveToRelative(7.332f, 0f)
                curveToRelative(0.646f, 0.049f, 1.288f, 0.11f, 1.927f, 0.184f)
                curveToRelative(1.1f, 0.128f, 1.907f, 1.077f, 1.907f, 2.185f)
                verticalLineTo(19.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, 2.25f)
                horizontalLineTo(6.75f)
                arcTo(2.25f, 2.25f, 0f, false, true, 4.5f, 19.5f)
                verticalLineTo(6.257f)
                curveToRelative(0f, -1.108f, 0.806f, -2.057f, 1.907f, -2.185f)
                arcToRelative(48.208f, 48.208f, 0f, false, true, 1.927f, -0.184f)
            }
        }.build()
        
        return _Clipboard!!
    }

private var _Clipboard: ImageVector? = null

