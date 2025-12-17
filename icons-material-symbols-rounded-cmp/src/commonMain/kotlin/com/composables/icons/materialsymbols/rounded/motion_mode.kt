package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Motion_mode: ImageVector
    get() {
        if (_Motion_mode != null) return _Motion_mode!!
        
        _Motion_mode = ImageVector.Builder(
            name = "motion_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 194f)
                verticalLineToRelative(572f)
                quadToRelative(-17f, -17f, -32f, -36f)
                reflectiveQuadToRelative(-28f, -39f)
                verticalLineToRelative(-422f)
                quadToRelative(13f, -20f, 28f, -39f)
                reflectiveQuadToRelative(32f, -36f)
                close()
                moveToRelative(160f, -96f)
                verticalLineToRelative(764f)
                quadToRelative(-21f, -7f, -41f, -15.5f)
                reflectiveQuadTo(280f, 827f)
                verticalLineToRelative(-694f)
                quadToRelative(19f, -11f, 39f, -19.5f)
                reflectiveQuadToRelative(41f, -15.5f)
                close()
                moveToRelative(280f, 749f)
                verticalLineToRelative(-734f)
                quadToRelative(106f, 47f, 173f, 145f)
                reflectiveQuadToRelative(67f, 222f)
                quadToRelative(0f, 124f, -67f, 222f)
                reflectiveQuadTo(640f, 847f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-10f, 0f, -20f, -0.5f)
                reflectiveQuadTo(440f, 878f)
                verticalLineToRelative(-796f)
                quadToRelative(10f, -1f, 20f, -1.5f)
                reflectiveQuadToRelative(20f, -0.5f)
                quadToRelative(20f, 0f, 40f, 2f)
                reflectiveQuadToRelative(40f, 6f)
                verticalLineToRelative(784f)
                quadToRelative(-20f, 4f, -40f, 6f)
                reflectiveQuadToRelative(-40f, 2f)
                close()
            }
        }.build()
        
        return _Motion_mode!!
    }

private var _Motion_mode: ImageVector? = null

