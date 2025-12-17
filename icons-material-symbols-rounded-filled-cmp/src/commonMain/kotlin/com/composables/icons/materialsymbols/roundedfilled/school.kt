package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.School: ImageVector
    get() {
        if (_School != null) return _School!!
        
        _School = ImageVector.Builder(
            name = "school",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 640f)
                verticalLineToRelative(-236f)
                lineTo(518f, 579f)
                quadToRelative(-18f, 10f, -38f, 10f)
                reflectiveQuadToRelative(-38f, -10f)
                lineTo(104f, 395f)
                quadToRelative(-11f, -6f, -15.5f, -15f)
                reflectiveQuadTo(84f, 360f)
                quadToRelative(0f, -11f, 4.5f, -20f)
                reflectiveQuadToRelative(15.5f, -15f)
                lineToRelative(338f, -184f)
                quadToRelative(9f, -5f, 18.5f, -7.5f)
                reflectiveQuadTo(480f, 131f)
                quadToRelative(10f, 0f, 19.5f, 2.5f)
                reflectiveQuadTo(518f, 141f)
                lineToRelative(381f, 208f)
                quadToRelative(10f, 5f, 15.5f, 14.5f)
                reflectiveQuadTo(920f, 384f)
                verticalLineToRelative(256f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(840f, 640f)
                close()
                moveTo(442f, 819f)
                lineTo(242f, 711f)
                quadToRelative(-20f, -11f, -31f, -30f)
                reflectiveQuadToRelative(-11f, -41f)
                verticalLineToRelative(-152f)
                lineToRelative(242f, 131f)
                quadToRelative(18f, 10f, 38f, 10f)
                reflectiveQuadToRelative(38f, -10f)
                lineToRelative(242f, -131f)
                verticalLineToRelative(152f)
                quadToRelative(0f, 22f, -11f, 41f)
                reflectiveQuadToRelative(-31f, 30f)
                lineTo(518f, 819f)
                quadToRelative(-9f, 5f, -18.5f, 7.5f)
                reflectiveQuadTo(480f, 829f)
                quadToRelative(-10f, 0f, -19.5f, -2.5f)
                reflectiveQuadTo(442f, 819f)
                close()
            }
        }.build()
        
        return _School!!
    }

private var _School: ImageVector? = null

