package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Kid_star: ImageVector
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
            }
        }.build()
        
        return _Kid_star!!
    }

private var _Kid_star: ImageVector? = null

