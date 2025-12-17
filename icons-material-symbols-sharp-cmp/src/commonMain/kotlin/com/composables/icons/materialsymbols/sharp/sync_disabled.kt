package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sync_disabled: ImageVector
    get() {
        if (_Sync_disabled != null) return _Sync_disabled!!
        
        _Sync_disabled = ImageVector.Builder(
            name = "sync_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(792f, 904f)
                lineTo(643f, 755f)
                quadToRelative(-19f, 11f, -39.5f, 20f)
                reflectiveQuadTo(560f, 790f)
                verticalLineToRelative(-84f)
                quadToRelative(6f, -2f, 12f, -4.5f)
                reflectiveQuadToRelative(12f, -5.5f)
                lineTo(264f, 376f)
                quadToRelative(-11f, 25f, -17.5f, 51.5f)
                reflectiveQuadTo(240f, 482f)
                quadToRelative(0f, 45f, 17f, 87.5f)
                reflectiveQuadToRelative(53f, 78.5f)
                lineToRelative(10f, 10f)
                verticalLineToRelative(-98f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(110f)
                lineToRelative(-16f, -14f)
                quadToRelative(-49f, -49f, -71.5f, -106.5f)
                reflectiveQuadTo(160f, 482f)
                quadToRelative(0f, -45f, 11.5f, -86.5f)
                reflectiveQuadTo(205f, 317f)
                lineTo(56f, 168f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-35f, -263f)
                lineToRelative(-60f, -60f)
                quadToRelative(11f, -24f, 17f, -50f)
                reflectiveQuadToRelative(6f, -53f)
                quadToRelative(0f, -45f, -17f, -87.5f)
                reflectiveQuadTo(650f, 312f)
                lineToRelative(-10f, -10f)
                verticalLineToRelative(98f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(690f)
                lineToRelative(16f, 14f)
                quadToRelative(49f, 49f, 71.5f, 106.5f)
                reflectiveQuadTo(800f, 478f)
                quadToRelative(0f, 45f, -11.5f, 85.5f)
                reflectiveQuadTo(757f, 641f)
                close()
                moveTo(379f, 263f)
                lineToRelative(-60f, -60f)
                quadToRelative(19f, -11f, 39f, -19f)
                reflectiveQuadToRelative(42f, -14f)
                verticalLineToRelative(84f)
                quadToRelative(-5f, 2f, -10.5f, 4f)
                reflectiveQuadToRelative(-10.5f, 5f)
                close()
            }
        }.build()
        
        return _Sync_disabled!!
    }

private var _Sync_disabled: ImageVector? = null

