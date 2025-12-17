package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Action_key: ImageVector
    get() {
        if (_Action_key != null) return _Action_key!!
        
        _Action_key = ImageVector.Builder(
            name = "action_key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 820f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 23f, -6f, 43.5f)
                reflectiveQuadTo(797f, 742f)
                lineToRelative(95f, 94f)
                quadToRelative(6f, 5f, 9f, 12.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                quadToRelative(0f, 8f, -3f, 15f)
                reflectiveQuadToRelative(-9f, 13f)
                quadToRelative(-5f, 5f, -12.5f, 8f)
                reflectiveQuadTo(864f, 903f)
                quadToRelative(-8f, 0f, -15f, -3f)
                reflectiveQuadToRelative(-13f, -8f)
                lineToRelative(-95f, -94f)
                quadToRelative(-18f, 11f, -38.5f, 16.5f)
                reflectiveQuadTo(660f, 820f)
                close()
                moveToRelative(-440f, 0f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(60f, 660f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(440f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(740f, 660f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(660f, 580f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(580f, 660f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(660f, 740f)
                close()
                moveTo(220f, 380f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(60f, 220f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(440f, 0f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
            }
        }.build()
        
        return _Action_key!!
    }

private var _Action_key: ImageVector? = null

