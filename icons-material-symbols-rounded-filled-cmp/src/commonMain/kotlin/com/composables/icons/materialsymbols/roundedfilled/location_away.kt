package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Location_away: ImageVector
    get() {
        if (_Location_away != null) return _Location_away!!
        
        _Location_away = ImageVector.Builder(
            name = "location_away",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -19f, 8.5f, -36f)
                reflectiveQuadToRelative(23.5f, -28f)
                lineToRelative(240f, -180f)
                quadToRelative(11f, -8f, 23f, -12f)
                reflectiveQuadToRelative(25f, -4f)
                quadToRelative(13f, 0f, 25f, 4f)
                reflectiveQuadToRelative(23f, 12f)
                lineToRelative(132f, 100f)
                quadToRelative(10f, 8f, 7.5f, 20f)
                reflectiveQuadTo(572f, 292f)
                quadToRelative(-39f, 14f, -69f, 42.5f)
                reflectiveQuadTo(456f, 401f)
                quadToRelative(-17f, 38f, -16.5f, 79.5f)
                reflectiveQuadTo(457f, 560f)
                quadToRelative(5f, 13f, 0.5f, 25.5f)
                reflectiveQuadTo(441f, 603f)
                quadToRelative(-42f, 19f, -64f, 37f)
                reflectiveQuadToRelative(-36f, 44f)
                quadToRelative(-11f, 18f, -16f, 38.5f)
                reflectiveQuadToRelative(-5f, 41.5f)
                verticalLineToRelative(36f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 840f)
                close()
                moveToRelative(360f, -200f)
                quadToRelative(54f, 0f, 104.5f, 14f)
                reflectiveQuadToRelative(96.5f, 41f)
                quadToRelative(18f, 11f, 28.5f, 29.5f)
                reflectiveQuadTo(880f, 764f)
                quadToRelative(0f, 32f, -22f, 54f)
                reflectiveQuadToRelative(-54f, 22f)
                horizontalLineTo(476f)
                quadToRelative(-32f, 0f, -54f, -22f)
                reflectiveQuadToRelative(-22f, -54f)
                quadToRelative(0f, -21f, 10.5f, -39.5f)
                reflectiveQuadTo(439f, 695f)
                quadToRelative(46f, -27f, 96.5f, -41f)
                reflectiveQuadTo(640f, 640f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Location_away!!
    }

private var _Location_away: ImageVector? = null

