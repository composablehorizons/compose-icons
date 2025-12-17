package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Concierge: ImageVector
    get() {
        if (_Concierge != null) return _Concierge!!
        
        _Concierge = ImageVector.Builder(
            name = "concierge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                close()
                moveToRelative(40f, -120f)
                quadToRelative(0f, -81f, 51f, -141.5f)
                reflectiveQuadTo(620f, 544f)
                verticalLineToRelative(-25f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(660f, 479f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(700f, 519f)
                verticalLineToRelative(25f)
                quadToRelative(77f, 14f, 128.5f, 74.5f)
                reflectiveQuadTo(880f, 760f)
                horizontalLineTo(440f)
                close()
                moveTo(40f, 520f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-440f)
                horizontalLineTo(40f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(79f)
                lineToRelative(282f, -105f)
                quadToRelative(17f, -7f, 28f, -22.5f)
                reflectiveQuadToRelative(11f, -34.5f)
                quadToRelative(0f, -16f, -11f, -27f)
                reflectiveQuadToRelative(-27f, -11f)
                horizontalLineTo(520f)
                lineToRelative(-70f, 27f)
                lineToRelative(-14f, -37f)
                lineToRelative(84f, -30f)
                horizontalLineToRelative(280f)
                quadToRelative(32f, 0f, 56f, -23f)
                reflectiveQuadToRelative(24f, -57f)
                lineTo(560f, 80f)
                lineToRelative(-280f, 78f)
                verticalLineToRelative(362f)
                close()
            }
        }.build()
        
        return _Concierge!!
    }

private var _Concierge: ImageVector? = null

