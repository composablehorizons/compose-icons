package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Person_2: ImageVector
    get() {
        if (_Person_2 != null) return _Person_2!!
        
        _Person_2 = ImageVector.Builder(
            name = "person_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(391f, 480f)
                quadToRelative(-36f, 0f, -60f, -27f)
                reflectiveQuadToRelative(-19f, -63f)
                lineToRelative(13f, -98f)
                quadToRelative(8f, -57f, 52f, -94.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(59f, 0f, 103f, 37.5f)
                reflectiveQuadToRelative(52f, 94.5f)
                lineToRelative(13f, 98f)
                quadToRelative(5f, 36f, -19f, 63f)
                reflectiveQuadToRelative(-60f, 27f)
                horizontalLineTo(391f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(178f)
                lineToRelative(-13f, -96f)
                quadToRelative(-4f, -28f, -25.5f, -46f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-29f, 0f, -50.5f, 18f)
                reflectiveQuadTo(404f, 304f)
                lineToRelative(-13f, 96f)
                close()
                moveToRelative(89f, 0f)
                close()
                moveTo(160f, 800f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(66f, 0f, 130f, 15.5f)
                reflectiveQuadTo(736f, 582f)
                quadToRelative(29f, 15f, 46.5f, 43.5f)
                reflectiveQuadTo(800f, 688f)
                verticalLineToRelative(112f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -11f, -5.5f, -20f)
                reflectiveQuadTo(700f, 654f)
                quadToRelative(-54f, -27f, -109f, -40.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-56f, 0f, -111f, 13.5f)
                reflectiveQuadTo(260f, 654f)
                quadToRelative(-9f, 5f, -14.5f, 14f)
                reflectiveQuadToRelative(-5.5f, 20f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(240f, 0f)
                close()
            }
        }.build()
        
        return _Person_2!!
    }

private var _Person_2: ImageVector? = null

