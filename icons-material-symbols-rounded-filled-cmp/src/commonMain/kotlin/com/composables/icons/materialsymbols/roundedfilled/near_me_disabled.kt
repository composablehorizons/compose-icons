package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Near_me_disabled: ImageVector
    get() {
        if (_Near_me_disabled != null) return _Near_me_disabled!!
        
        _Near_me_disabled = ImageVector.Builder(
            name = "near_me_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(507f, 817f)
                lineTo(402f, 558f)
                lineTo(143f, 453f)
                quadToRelative(-13f, -5f, -19f, -15.5f)
                reflectiveQuadToRelative(-6f, -21.5f)
                quadToRelative(0f, -11f, 6.5f, -21.5f)
                reflectiveQuadTo(144f, 379f)
                lineToRelative(171f, -64f)
                lineToRelative(-175f, -175f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(820f, 819f)
                lineTo(645f, 645f)
                lineToRelative(-64f, 171f)
                quadToRelative(-5f, 13f, -15.5f, 19.5f)
                reflectiveQuadTo(544f, 842f)
                quadToRelative(-11f, 0f, -21.5f, -6f)
                reflectiveQuadTo(507f, 817f)
                close()
                moveToRelative(294f, -658f)
                quadToRelative(8f, 8f, 11f, 19.5f)
                reflectiveQuadToRelative(-2f, 23.5f)
                lineToRelative(-81f, 219f)
                quadToRelative(-8f, 20f, -29f, 25f)
                reflectiveQuadToRelative(-37f, -11f)
                lineTo(525f, 297f)
                quadToRelative(-16f, -16f, -11f, -37f)
                reflectiveQuadToRelative(25f, -29f)
                lineToRelative(219f, -81f)
                quadToRelative(12f, -5f, 23.5f, -2f)
                reflectiveQuadToRelative(19.5f, 11f)
                close()
            }
        }.build()
        
        return _Near_me_disabled!!
    }

private var _Near_me_disabled: ImageVector? = null

