package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Domain_verification_off: ImageVector
    get() {
        if (_Domain_verification_off != null) return _Domain_verification_off!!
        
        _Domain_verification_off = ImageVector.Builder(
            name = "domain_verification_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(790f, 903f)
                lineTo(686f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                verticalLineToRelative(114f)
                lineTo(54f, 168f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(735f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(790f, 903f)
                close()
                moveTo(160f, 720f)
                horizontalLineToRelative(446f)
                lineTo(206f, 320f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(447f, -227f)
                lineToRelative(-58f, -58f)
                lineToRelative(28f, -28f)
                quadToRelative(12f, -12f, 29f, -12f)
                reflectiveQuadToRelative(29f, 12f)
                quadToRelative(12f, 12f, 12f, 29f)
                reflectiveQuadToRelative(-12f, 29f)
                lineToRelative(-28f, 28f)
                close()
                moveToRelative(-57f, 57f)
                lineToRelative(-84f, 84f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-85f, -85f)
                quadToRelative(-12f, -12f, -12f, -29f)
                reflectiveQuadToRelative(12f, -29f)
                quadToRelative(12f, -12f, 29f, -12f)
                reflectiveQuadToRelative(29f, 12f)
                lineToRelative(55f, 55f)
                lineToRelative(54f, -54f)
                lineToRelative(58f, 58f)
                close()
                moveToRelative(330f, -310f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(840f, 720f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(800f, 679f)
                verticalLineToRelative(-359f)
                horizontalLineTo(467f)
                quadToRelative(-16f, 0f, -30.5f, -6f)
                reflectiveQuadTo(411f, 297f)
                lineToRelative(-69f, -69f)
                quadToRelative(-9f, -10f, -11f, -21f)
                reflectiveQuadToRelative(3f, -22f)
                quadToRelative(5f, -11f, 14f, -18f)
                reflectiveQuadToRelative(23f, -7f)
                horizontalLineToRelative(429f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                close()
            }
        }.build()
        
        return _Domain_verification_off!!
    }

private var _Domain_verification_off: ImageVector? = null

