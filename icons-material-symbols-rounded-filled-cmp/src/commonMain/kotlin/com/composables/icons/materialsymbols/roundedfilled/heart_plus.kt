package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Heart_plus: ImageVector
    get() {
        if (_Heart_plus != null) return _Heart_plus!!
        
        _Heart_plus = ImageVector.Builder(
            name = "heart_plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 560f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 680f)
                close()
                moveTo(70f, 945f)
                verticalLineToRelative(-152f)
                verticalLineToRelative(152f)
                close()
                moveToRelative(370f, -132f)
                quadToRelative(-14f, 0f, -28f, -5f)
                reflectiveQuadToRelative(-25f, -16f)
                quadToRelative(-44f, -40f, -104f, -91f)
                reflectiveQuadTo(169f, 591.5f)
                quadTo(115f, 533f, 77.5f, 469f)
                reflectiveQuadTo(40f, 339f)
                quadToRelative(0f, -94f, 63f, -156.5f)
                reflectiveQuadTo(260f, 120f)
                quadToRelative(52f, 0f, 99f, 21.5f)
                reflectiveQuadToRelative(81f, 61.5f)
                quadToRelative(34f, -40f, 81f, -61.5f)
                reflectiveQuadToRelative(99f, -21.5f)
                quadToRelative(63f, 0f, 111.5f, 29.5f)
                reflectiveQuadTo(808f, 224f)
                quadToRelative(11f, 19f, -3.5f, 38.5f)
                reflectiveQuadTo(763f, 280f)
                horizontalLineToRelative(-16f)
                quadToRelative(-85f, 0f, -156f, 68.5f)
                reflectiveQuadTo(520f, 520f)
                quadToRelative(0f, 42f, 13.5f, 79.5f)
                reflectiveQuadTo(576f, 668f)
                quadToRelative(11f, 12f, 9.5f, 28f)
                reflectiveQuadTo(572f, 723f)
                lineToRelative(-79f, 70f)
                quadToRelative(-11f, 11f, -25f, 15.5f)
                reflectiveQuadToRelative(-28f, 4.5f)
                close()
            }
        }.build()
        
        return _Heart_plus!!
    }

private var _Heart_plus: ImageVector? = null

