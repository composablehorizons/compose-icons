package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Important_devices: ImageVector
    get() {
        if (_Important_devices != null) return _Important_devices!!
        
        _Important_devices = ImageVector.Builder(
            name = "important_devices",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 800f)
                verticalLineToRelative(-318f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 442f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 482f)
                verticalLineToRelative(318f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(680f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-238f)
                horizontalLineTo(680f)
                verticalLineToRelative(238f)
                close()
                moveTo(372f, 531f)
                lineToRelative(68f, -51f)
                lineToRelative(68f, 51f)
                quadToRelative(6f, 5f, 11.5f, 1f)
                reflectiveQuadToRelative(3.5f, -11f)
                lineToRelative(-25f, -85f)
                lineToRelative(70f, -56f)
                quadToRelative(5f, -5f, 3f, -11.5f)
                reflectiveQuadToRelative(-9f, -6.5f)
                horizontalLineToRelative(-86f)
                lineToRelative(-26f, -82f)
                quadToRelative(-2f, -7f, -10f, -7f)
                reflectiveQuadToRelative(-10f, 7f)
                lineToRelative(-26f, 82f)
                horizontalLineToRelative(-86f)
                quadToRelative(-7f, 0f, -9f, 6.5f)
                reflectiveQuadToRelative(3f, 11.5f)
                lineToRelative(70f, 56f)
                lineToRelative(-25f, 85f)
                quadToRelative(-2f, 7f, 3.5f, 11f)
                reflectiveQuadToRelative(11.5f, -1f)
                close()
                moveToRelative(-12f, 309f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 760f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 200f)
                verticalLineToRelative(122f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 362f)
                horizontalLineToRelative(-80f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(158f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 680f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 840f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Important_devices!!
    }

private var _Important_devices: ImageVector? = null

