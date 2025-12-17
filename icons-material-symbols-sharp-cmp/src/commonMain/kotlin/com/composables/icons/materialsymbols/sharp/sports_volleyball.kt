package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sports_volleyball: ImageVector
    get() {
        if (_Sports_volleyball != null) return _Sports_volleyball!!
        
        _Sports_volleyball = ImageVector.Builder(
            name = "sports_volleyball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(782f, 378f)
                quadToRelative(-31f, -87f, -101f, -145.5f)
                reflectiveQuadTo(520f, 162f)
                verticalLineToRelative(64f)
                lineToRelative(262f, 152f)
                close()
                moveTo(320f, 526f)
                lineToRelative(120f, -70f)
                verticalLineToRelative(-294f)
                quadToRelative(-32f, 3f, -62f, 14.5f)
                reflectiveQuadTo(320f, 204f)
                verticalLineToRelative(322f)
                close()
                moveToRelative(-134f, 78f)
                lineToRelative(54f, -32f)
                verticalLineToRelative(-302f)
                quadToRelative(-39f, 44f, -59.5f, 98f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 32f, 6.5f, 63.5f)
                reflectiveQuadTo(186f, 604f)
                close()
                moveToRelative(134f, 152f)
                lineToRelative(280f, -160f)
                lineToRelative(-120f, -70f)
                lineToRelative(-254f, 148f)
                quadToRelative(20f, 25f, 43f, 46f)
                reflectiveQuadToRelative(51f, 36f)
                close()
                moveToRelative(160f, 44f)
                quadToRelative(75f, 0f, 142f, -34f)
                reflectiveQuadToRelative(112f, -94f)
                lineToRelative(-54f, -30f)
                lineToRelative(-264f, 152f)
                quadToRelative(16f, 3f, 32f, 4.5f)
                reflectiveQuadToRelative(32f, 1.5f)
                close()
                moveToRelative(294f, -196f)
                quadToRelative(13f, -29f, 19.5f, -60.5f)
                reflectiveQuadTo(800f, 480f)
                lineTo(520f, 318f)
                verticalLineToRelative(138f)
                lineToRelative(254f, 148f)
                close()
                moveTo(480f, 480f)
                close()
                moveToRelative(0f, 400f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Sports_volleyball!!
    }

private var _Sports_volleyball: ImageVector? = null

