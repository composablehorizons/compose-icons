package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.For_you: ImageVector
    get() {
        if (_For_you != null) return _For_you!!
        
        _For_you = ImageVector.Builder(
            name = "for_you",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                quadToRelative(65f, 0f, 135f, -10.5f)
                reflectiveQuadTo(745f, 440f)
                quadToRelative(20f, -8f, 37.5f, 5f)
                reflectiveQuadToRelative(17.5f, 34f)
                verticalLineToRelative(286f)
                quadToRelative(0f, 25f, -14.5f, 45.5f)
                reflectiveQuadTo(748f, 840f)
                quadToRelative(-57f, 19f, -127.5f, 29.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-70f, 0f, -140.5f, -10.5f)
                reflectiveQuadTo(212f, 840f)
                quadToRelative(-23f, -9f, -37.5f, -29.5f)
                reflectiveQuadTo(160f, 765f)
                verticalLineToRelative(-286f)
                quadToRelative(0f, -21f, 17.5f, -34f)
                reflectiveQuadToRelative(37.5f, -5f)
                quadToRelative(60f, 19f, 130f, 29.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveToRelative(0f, -400f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                close()
            }
        }.build()
        
        return _For_you!!
    }

private var _For_you: ImageVector? = null

