package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Moved_location: ImageVector
    get() {
        if (_Moved_location != null) return _Moved_location!!
        
        _Moved_location = ImageVector.Builder(
            name = "moved_location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 520f)
                lineToRelative(-56f, -56f)
                lineToRelative(86f, -86f)
                quadToRelative(-43f, -8f, -137.5f, 9f)
                reflectiveQuadTo(400f, 519f)
                quadToRelative(32f, -117f, 129f, -188f)
                reflectiveQuadToRelative(219f, -71f)
                lineToRelative(-84f, -84f)
                lineToRelative(56f, -56f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                close()
                moveTo(480f, 880f)
                quadTo(319f, 743f, 239.5f, 625.5f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -136f, 93f, -232f)
                reflectiveQuadToRelative(227f, -96f)
                quadToRelative(35f, 0f, 70f, 7.5f)
                reflectiveQuadToRelative(67f, 22.5f)
                lineToRelative(-62f, 62f)
                quadToRelative(-18f, -6f, -37f, -9f)
                reflectiveQuadToRelative(-38f, -3f)
                quadToRelative(-101f, 0f, -170.5f, 72.5f)
                reflectiveQuadTo(240f, 408f)
                quadToRelative(0f, 71f, 59f, 162f)
                reflectiveQuadToRelative(181f, 203f)
                quadToRelative(60f, -55f, 105f, -105f)
                reflectiveQuadToRelative(74f, -96f)
                lineToRelative(58f, 58f)
                quadToRelative(-40f, 59f, -99f, 121f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Moved_location!!
    }

private var _Moved_location: ImageVector? = null

