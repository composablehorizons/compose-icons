package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.For_you: ImageVector
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
                quadToRelative(81f, 0f, 169f, -16.5f)
                reflectiveQuadTo(800f, 420f)
                verticalLineToRelative(400f)
                quadToRelative(-60f, 27f, -146f, 43.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-88f, 0f, -174f, -16.5f)
                reflectiveQuadTo(160f, 820f)
                verticalLineToRelative(-400f)
                quadToRelative(63f, 27f, 151f, 43.5f)
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

