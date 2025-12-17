package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Network_check: ImageVector
    get() {
        if (_Network_check != null) return _Network_check!!
        
        _Network_check = ImageVector.Builder(
            name = "network_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(84f, 444f)
                lineTo(0f, 360f)
                quadToRelative(95f, -97f, 219.5f, -148.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(24f, 0f, 48f, 1.5f)
                reflectiveQuadToRelative(48f, 4.5f)
                lineToRelative(-60f, 116f)
                quadToRelative(-9f, -1f, -18f, -1.5f)
                reflectiveQuadToRelative(-18f, -0.5f)
                quadToRelative(-112f, 0f, -214.5f, 42.5f)
                reflectiveQuadTo(84f, 444f)
                close()
                moveToRelative(170f, 170f)
                lineToRelative(-84f, -86f)
                quadToRelative(57f, -57f, 131f, -89f)
                reflectiveQuadToRelative(155f, -37f)
                lineToRelative(-64f, 131f)
                quadToRelative(-39f, 11f, -74f, 31.5f)
                reflectiveQuadTo(254f, 614f)
                close()
                moveToRelative(198f, 180f)
                quadToRelative(-33f, -11f, -48f, -41.5f)
                reflectiveQuadToRelative(0f, -60.5f)
                lineToRelative(240f, -488f)
                quadToRelative(4f, -8f, 12f, -10.5f)
                reflectiveQuadToRelative(16f, 0.5f)
                quadToRelative(8f, 3f, 12f, 10.5f)
                reflectiveQuadToRelative(2f, 15.5f)
                lineTo(556f, 746f)
                quadToRelative(-8f, 33f, -39.5f, 47f)
                reflectiveQuadToRelative(-64.5f, 1f)
                close()
                moveToRelative(254f, -180f)
                quadToRelative(-7f, -7f, -13.5f, -12.5f)
                reflectiveQuadTo(678f, 590f)
                lineToRelative(32f, -125f)
                quadToRelative(21f, 14f, 41.5f, 29.5f)
                reflectiveQuadTo(790f, 528f)
                lineToRelative(-84f, 86f)
                close()
                moveToRelative(169f, -169f)
                quadToRelative(-32f, -29f, -65.5f, -55f)
                reflectiveQuadTo(738f, 344f)
                lineToRelative(28f, -120f)
                quadToRelative(54f, 26f, 103f, 60f)
                reflectiveQuadToRelative(91f, 76f)
                lineToRelative(-85f, 85f)
                close()
            }
        }.build()
        
        return _Network_check!!
    }

private var _Network_check: ImageVector? = null

