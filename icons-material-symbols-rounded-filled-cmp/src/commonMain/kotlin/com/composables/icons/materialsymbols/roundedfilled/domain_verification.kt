package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Domain_verification: ImageVector
    get() {
        if (_Domain_verification != null) return _Domain_verification!!
        
        _Domain_verification = ImageVector.Builder(
            name = "domain_verification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(438f, 546f)
                lineToRelative(-55f, -55f)
                quadToRelative(-12f, -12f, -29f, -12f)
                reflectiveQuadToRelative(-29f, 12f)
                quadToRelative(-12f, 12f, -12f, 29f)
                reflectiveQuadToRelative(12f, 29f)
                lineToRelative(85f, 85f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(169f, -169f)
                quadToRelative(12f, -12f, 12f, -29f)
                reflectiveQuadToRelative(-12f, -29f)
                quadToRelative(-12f, -12f, -29f, -12f)
                reflectiveQuadToRelative(-29f, 12f)
                lineTo(438f, 546f)
                close()
                moveTo(160f, 320f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 480f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Domain_verification!!
    }

private var _Domain_verification: ImageVector? = null

