package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Phone_missed: ImageVector
    get() {
        if (_Phone_missed != null) return _Phone_missed!!
        
        _Phone_missed = ImageVector.Builder(
            name = "phone_missed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(136f, 816f)
                lineToRelative(-92f, -90f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                quadToRelative(88f, -95f, 203f, -142.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(118f, 0f, 232.5f, 47.5f)
                reflectiveQuadTo(916f, 670f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-92f, 90f)
                quadToRelative(-11f, 11f, -25.5f, 12f)
                reflectiveQuadToRelative(-26.5f, -8f)
                lineToRelative(-116f, -88f)
                quadToRelative(-8f, -6f, -12f, -14f)
                reflectiveQuadToRelative(-4f, -18f)
                verticalLineToRelative(-114f)
                quadToRelative(-38f, -12f, -78f, -19f)
                reflectiveQuadToRelative(-82f, -7f)
                quadToRelative(-42f, 0f, -82f, 7f)
                reflectiveQuadToRelative(-78f, 19f)
                verticalLineToRelative(114f)
                quadToRelative(0f, 10f, -4f, 18f)
                reflectiveQuadToRelative(-12f, 14f)
                lineToRelative(-116f, 88f)
                quadToRelative(-12f, 9f, -26.5f, 8f)
                reflectiveQuadTo(136f, 816f)
                close()
                moveToRelative(104f, -456f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 320f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 120f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 200f)
                horizontalLineToRelative(-64f)
                lineToRelative(141f, 141f)
                lineToRelative(198f, -198f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(732f, 200f)
                lineTo(535f, 397f)
                quadToRelative(-23f, 23f, -57f, 23f)
                reflectiveQuadToRelative(-57f, -23f)
                lineTo(280f, 256f)
                verticalLineToRelative(64f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 360f)
                close()
            }
        }.build()
        
        return _Phone_missed!!
    }

private var _Phone_missed: ImageVector? = null

