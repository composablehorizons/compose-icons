package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Pencil: ImageVector
    get() {
        if (_Pencil != null) return _Pencil!!
        
        _Pencil = ImageVector.Builder(
            name = "pencil",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.695f, 14.762f)
                lineToRelative(-1.262f, 3.155f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.65f, 0.65f)
                lineToRelative(3.155f, -1.262f)
                arcToRelative(4f, 4f, 0f, false, false, 1.343f, -0.886f)
                lineTo(17.5f, 5.501f)
                arcToRelative(2.121f, 2.121f, 0f, false, false, -3f, -3f)
                lineTo(3.58f, 13.419f)
                arcToRelative(4f, 4f, 0f, false, false, -0.885f, 1.343f)
                close()
            }
        }.build()
        
        return _Pencil!!
    }

private var _Pencil: ImageVector? = null

