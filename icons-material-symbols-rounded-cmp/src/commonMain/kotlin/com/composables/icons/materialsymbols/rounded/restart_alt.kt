package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Restart_alt: ImageVector
    get() {
        if (_Restart_alt != null) return _Restart_alt!!
        
        _Restart_alt = ImageVector.Builder(
            name = "restart_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(393f, 828f)
                quadToRelative(-103f, -29f, -168f, -113.5f)
                reflectiveQuadTo(160f, 520f)
                quadToRelative(0f, -57f, 19f, -108.5f)
                reflectiveQuadToRelative(54f, -94.5f)
                quadToRelative(11f, -12f, 27f, -12.5f)
                reflectiveQuadToRelative(29f, 12.5f)
                quadToRelative(11f, 11f, 11.5f, 27f)
                reflectiveQuadTo(290f, 374f)
                quadToRelative(-24f, 31f, -37f, 68f)
                reflectiveQuadToRelative(-13f, 78f)
                quadToRelative(0f, 81f, 47.5f, 144.5f)
                reflectiveQuadTo(410f, 751f)
                quadToRelative(13f, 4f, 21.5f, 15f)
                reflectiveQuadToRelative(8.5f, 24f)
                quadToRelative(0f, 20f, -14f, 31.5f)
                reflectiveQuadToRelative(-33f, 6.5f)
                close()
                moveToRelative(174f, 0f)
                quadToRelative(-19f, 5f, -33f, -7f)
                reflectiveQuadToRelative(-14f, -32f)
                quadToRelative(0f, -12f, 8.5f, -23f)
                reflectiveQuadToRelative(21.5f, -15f)
                quadToRelative(75f, -24f, 122.5f, -87f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(0f, -100f, -70f, -170f)
                reflectiveQuadToRelative(-170f, -70f)
                horizontalLineToRelative(-3f)
                lineToRelative(16f, 16f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-84f, -84f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(84f, -84f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-16f, 16f)
                horizontalLineToRelative(3f)
                quadToRelative(134f, 0f, 227f, 93f)
                reflectiveQuadToRelative(93f, 227f)
                quadToRelative(0f, 109f, -65f, 194f)
                reflectiveQuadTo(567f, 828f)
                close()
            }
        }.build()
        
        return _Restart_alt!!
    }

private var _Restart_alt: ImageVector? = null

