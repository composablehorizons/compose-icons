package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bid_landscape_disabled: ImageVector
    get() {
        if (_Bid_landscape_disabled != null) return _Bid_landscape_disabled!!
        
        _Bid_landscape_disabled = ImageVector.Builder(
            name = "bid_landscape_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(728f, 840f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-528f)
                lineToRelative(-76f, -76f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(44f, 99f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(760f, 760f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(804f, 915f)
                lineToRelative(-76f, -75f)
                close()
                moveTo(360f, 518f)
                lineTo(200f, 678f)
                verticalLineToRelative(82f)
                horizontalLineToRelative(448f)
                lineTo(543f, 655f)
                quadToRelative(-12f, 8f, -26f, 7f)
                reflectiveQuadToRelative(-25f, -12f)
                lineTo(360f, 518f)
                close()
                moveTo(200f, 312f)
                verticalLineToRelative(252f)
                lineToRelative(126f, -126f)
                lineToRelative(-126f, -126f)
                close()
                moveToRelative(640f, -112f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(800f, 680f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(760f, 639f)
                verticalLineToRelative(-229f)
                lineToRelative(-82f, 92f)
                quadToRelative(-11f, 13f, -28.5f, 13.5f)
                reflectiveQuadTo(620f, 504f)
                quadToRelative(-11f, -11f, -12f, -27f)
                reflectiveQuadToRelative(10f, -28f)
                lineToRelative(142f, -159f)
                verticalLineToRelative(-90f)
                horizontalLineTo(320f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(280f, 160f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                close()
                moveTo(435f, 547f)
                close()
                moveTo(326f, 438f)
                close()
                moveToRelative(34f, 80f)
                close()
                moveToRelative(178f, -96f)
                close()
            }
        }.build()
        
        return _Bid_landscape_disabled!!
    }

private var _Bid_landscape_disabled: ImageVector? = null

