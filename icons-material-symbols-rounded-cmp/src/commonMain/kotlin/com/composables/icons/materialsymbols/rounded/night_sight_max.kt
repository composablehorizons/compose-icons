package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Night_sight_max: ImageVector
    get() {
        if (_Night_sight_max != null) return _Night_sight_max!!
        
        _Night_sight_max = ImageVector.Builder(
            name = "night_sight_max",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 320f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 400f)
                verticalLineToRelative(-80f)
                close()
                moveTo(440f, 760f)
                quadToRelative(54f, 0f, 100.5f, -21.5f)
                reflectiveQuadTo(620f, 679f)
                quadToRelative(-126f, -8f, -213f, -99.5f)
                reflectiveQuadTo(320f, 360f)
                quadToRelative(0f, -13f, 1f, -25.5f)
                reflectiveQuadToRelative(3f, -24.5f)
                quadToRelative(-56f, 31f, -90f, 86.5f)
                reflectiveQuadTo(200f, 520f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
                moveToRelative(294f, -113f)
                quadToRelative(-38f, 88f, -117.5f, 140.5f)
                reflectiveQuadTo(440f, 840f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -115f, 73.5f, -203f)
                reflectiveQuadTo(380f, 206f)
                quadToRelative(12f, -2f, 21.5f, 2f)
                reflectiveQuadToRelative(14.5f, 13f)
                quadToRelative(5f, 9f, 6f, 21.5f)
                reflectiveQuadToRelative(-4f, 26.5f)
                quadToRelative(-9f, 22f, -13.5f, 45f)
                reflectiveQuadToRelative(-4.5f, 46f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                quadToRelative(11f, 0f, 21f, -0.5f)
                reflectiveQuadToRelative(20f, -2.5f)
                quadToRelative(18f, -3f, 29.5f, 1f)
                reflectiveQuadToRelative(18.5f, 12f)
                quadToRelative(7f, 8f, 8.5f, 17.5f)
                reflectiveQuadTo(734f, 647f)
                close()
                moveToRelative(-327f, -68f)
                close()
            }
        }.build()
        
        return _Night_sight_max!!
    }

private var _Night_sight_max: ImageVector? = null

