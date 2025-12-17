package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Bid_landscape_disabled: ImageVector
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
                moveToRelative(112f, -640f)
                verticalLineToRelative(427f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(772f, 656f)
                lineTo(650f, 534f)
                lineToRelative(100f, -113f)
                quadToRelative(13f, -14f, 10f, -29.5f)
                reflectiveQuadTo(746f, 365f)
                quadToRelative(-11f, -11f, -26.5f, -11.5f)
                reflectiveQuadTo(690f, 368f)
                lineToRelative(-97f, 109f)
                lineToRelative(-289f, -289f)
                quadToRelative(-19f, -19f, -8.5f, -43.5f)
                reflectiveQuadTo(333f, 120f)
                horizontalLineToRelative(427f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                close()
                moveTo(360f, 518f)
                lineToRelative(139f, 139f)
                quadToRelative(10f, 10f, 23f, 9.5f)
                reflectiveQuadToRelative(22f, -10.5f)
                lineTo(326f, 438f)
                lineTo(212f, 552f)
                quadToRelative(-14f, 14f, -12.5f, 30f)
                reflectiveQuadToRelative(12.5f, 27f)
                quadToRelative(11f, 11f, 27f, 12.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                lineToRelative(91f, -91f)
                close()
            }
        }.build()
        
        return _Bid_landscape_disabled!!
    }

private var _Bid_landscape_disabled: ImageVector? = null

