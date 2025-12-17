package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Filter_vintage: ImageVector
    get() {
        if (_Filter_vintage != null) return _Filter_vintage!!
        
        _Filter_vintage = ImageVector.Builder(
            name = "filter_vintage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(482f, 880f)
                quadToRelative(-57f, 0f, -101f, -36f)
                reflectiveQuadToRelative(-55f, -92f)
                quadToRelative(-53f, 17f, -107f, -2f)
                reflectiveQuadToRelative(-83f, -66f)
                quadToRelative(-30f, -48f, -22f, -106.5f)
                reflectiveQuadToRelative(52f, -97.5f)
                quadToRelative(-42f, -38f, -50.5f, -94f)
                reflectiveQuadTo(134f, 282f)
                quadToRelative(27f, -48f, 81.5f, -69.5f)
                reflectiveQuadTo(324f, 208f)
                quadToRelative(11f, -56f, 55f, -92f)
                reflectiveQuadToRelative(101f, -36f)
                quadToRelative(57f, 0f, 101f, 36f)
                reflectiveQuadToRelative(55f, 92f)
                quadToRelative(56f, -17f, 108.5f, 3f)
                reflectiveQuadToRelative(81.5f, 71f)
                quadToRelative(27f, 50f, 19.5f, 104.5f)
                reflectiveQuadTo(794f, 480f)
                quadToRelative(44f, 39f, 52.5f, 96.5f)
                reflectiveQuadTo(828f, 684f)
                quadToRelative(-29f, 51f, -81.5f, 68f)
                reflectiveQuadTo(638f, 752f)
                quadToRelative(-11f, 56f, -55f, 92f)
                reflectiveQuadTo(482f, 880f)
                close()
                moveToRelative(-2f, -240f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
            }
        }.build()
        
        return _Filter_vintage!!
    }

private var _Filter_vintage: ImageVector? = null

