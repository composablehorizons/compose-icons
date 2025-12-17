package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Kid_star: ImageVector
    get() {
        if (_Kid_star != null) return _Kid_star!!
        
        _Kid_star = ImageVector.Builder(
            name = "kid_star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(305f, 256f)
                lineToRelative(175f, -227f)
                lineToRelative(175f, 227f)
                lineToRelative(274f, 92f)
                lineToRelative(-173f, 245f)
                lineToRelative(7f, 273f)
                lineToRelative(-283f, -79f)
                lineToRelative(-283f, 79f)
                lineToRelative(7f, -274f)
                lineTo(32f, 348f)
                lineToRelative(273f, -92f)
                close()
                moveToRelative(49f, 69f)
                lineToRelative(-194f, 64f)
                lineToRelative(124f, 179f)
                lineToRelative(-4f, 191f)
                lineToRelative(200f, -55f)
                lineToRelative(200f, 56f)
                lineToRelative(-4f, -192f)
                lineToRelative(124f, -177f)
                lineToRelative(-194f, -66f)
                lineToRelative(-126f, -165f)
                lineToRelative(-126f, 165f)
                close()
                moveToRelative(126f, 135f)
                close()
            }
        }.build()
        
        return _Kid_star!!
    }

private var _Kid_star: ImageVector? = null

