package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.No_transfer: ImageVector
    get() {
        if (_No_transfer != null) return _No_transfer!!
        
        _No_transfer = ImageVector.Builder(
            name = "no_transfer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(260f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(200f, 780f)
                verticalLineToRelative(-62f)
                quadToRelative(-18f, -20f, -29f, -44.5f)
                reflectiveQuadTo(160f, 620f)
                verticalLineToRelative(-347f)
                lineToRelative(-76f, -76f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(84f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(764f, 876f)
                lineTo(652f, 765f)
                horizontalLineToRelative(114f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 26f, -18.5f, 44.5f)
                reflectiveQuadTo(703f, 840f)
                quadToRelative(-26f, 0f, -44.5f, -18.5f)
                reflectiveQuadTo(640f, 777f)
                verticalLineToRelative(-17f)
                horizontalLineTo(320f)
                close()
                moveToRelative(429f, -126f)
                lineTo(566f, 451f)
                quadToRelative(-14f, -14f, -6.5f, -32.5f)
                reflectiveQuadTo(587f, 400f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-120f)
                horizontalLineTo(428f)
                quadToRelative(-16f, 0f, -30.5f, -6f)
                reflectiveQuadTo(372f, 257f)
                lineToRelative(-96f, -96f)
                quadToRelative(-15f, -15f, -10.5f, -35.5f)
                reflectiveQuadTo(290f, 99f)
                quadToRelative(36f, -11f, 83.5f, -15f)
                reflectiveQuadToRelative(106.5f, -4f)
                quadToRelative(172f, 0f, 246f, 37f)
                reflectiveQuadToRelative(74f, 123f)
                verticalLineToRelative(373f)
                quadToRelative(0f, 20f, -18.5f, 27.5f)
                reflectiveQuadTo(749f, 634f)
                close()
                moveToRelative(-409f, 6f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(340f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 640f)
                close()
                moveTo(240f, 400f)
                horizontalLineToRelative(47f)
                lineToRelative(-47f, -47f)
                verticalLineToRelative(47f)
                close()
            }
        }.build()
        
        return _No_transfer!!
    }

private var _No_transfer: ImageVector? = null

