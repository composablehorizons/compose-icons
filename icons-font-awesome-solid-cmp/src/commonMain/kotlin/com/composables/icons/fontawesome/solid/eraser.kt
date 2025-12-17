package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Eraser: ImageVector
    get() {
        if (_Eraser != null) return _Eraser!!
        
        _Eraser = ImageVector.Builder(
            name = "eraser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(497.941f, 273.941f)
                curveToRelative(18.745f, -18.745f, 18.745f, -49.137f, 0f, -67.882f)
                lineToRelative(-160f, -160f)
                curveToRelative(-18.745f, -18.745f, -49.136f, -18.746f, -67.883f, 0f)
                lineToRelative(-256f, 256f)
                curveToRelative(-18.745f, 18.745f, -18.745f, 49.137f, 0f, 67.882f)
                lineToRelative(96f, 96f)
                arcTo(48.004f, 48.004f, 0f, false, false, 144f, 480f)
                horizontalLineToRelative(356f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineTo(355.883f)
                lineToRelative(142.058f, -142.059f)
                close()
                moveToRelative(-302.627f, -62.627f)
                lineToRelative(137.373f, 137.373f)
                lineTo(265.373f, 416f)
                horizontalLineTo(150.628f)
                lineToRelative(-80f, -80f)
                lineToRelative(124.686f, -124.686f)
                close()
            }
        }.build()
        
        return _Eraser!!
    }

private var _Eraser: ImageVector? = null

