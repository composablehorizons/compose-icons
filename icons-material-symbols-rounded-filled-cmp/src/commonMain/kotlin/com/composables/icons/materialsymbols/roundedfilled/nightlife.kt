package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Nightlife: ImageVector
    get() {
        if (_Nightlife != null) return _Nightlife!!
        
        _Nightlife = ImageVector.Builder(
            name = "nightlife",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 720f)
                verticalLineToRelative(-160f)
                lineTo(81f, 262f)
                quadToRelative(-14f, -20f, -2f, -41f)
                reflectiveQuadToRelative(36f, -21f)
                horizontalLineToRelative(410f)
                quadToRelative(24f, 0f, 36f, 21f)
                reflectiveQuadToRelative(-2f, 41f)
                lineTo(360f, 560f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 720f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(-44f, -360f)
                horizontalLineToRelative(168f)
                lineToRelative(56f, -80f)
                horizontalLineTo(180f)
                lineToRelative(56f, 80f)
                close()
                moveToRelative(404f, 440f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(11f, 0f, 21f, 1.5f)
                reflectiveQuadToRelative(19f, 6.5f)
                verticalLineToRelative(-328f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 200f)
                horizontalLineToRelative(100f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 260f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 320f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Nightlife!!
    }

private var _Nightlife: ImageVector? = null

