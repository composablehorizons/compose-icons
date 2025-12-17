package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Kid_star: ImageVector
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
                lineToRelative(112f, -145f)
                quadToRelative(12f, -16f, 28.5f, -23.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(18f, 0f, 34.5f, 7.5f)
                reflectiveQuadTo(543f, 111f)
                lineToRelative(112f, 145f)
                lineToRelative(170f, 57f)
                quadToRelative(26f, 8f, 41f, 29.5f)
                reflectiveQuadToRelative(15f, 47.5f)
                quadToRelative(0f, 12f, -3.5f, 24f)
                reflectiveQuadTo(866f, 437f)
                lineTo(756f, 593f)
                lineToRelative(4f, 164f)
                quadToRelative(1f, 35f, -23f, 59f)
                reflectiveQuadToRelative(-56f, 24f)
                quadToRelative(-2f, 0f, -22f, -3f)
                lineToRelative(-179f, -50f)
                lineToRelative(-179f, 50f)
                quadToRelative(-5f, 2f, -11f, 2.5f)
                reflectiveQuadToRelative(-11f, 0.5f)
                quadToRelative(-32f, 0f, -56f, -24f)
                reflectiveQuadToRelative(-23f, -59f)
                lineToRelative(4f, -165f)
                lineTo(95f, 437f)
                quadToRelative(-8f, -11f, -11.5f, -23f)
                reflectiveQuadTo(80f, 390f)
                quadToRelative(0f, -25f, 14.5f, -46.5f)
                reflectiveQuadTo(135f, 313f)
                lineToRelative(170f, -57f)
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

