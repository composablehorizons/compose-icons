package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Visibility_lock: ImageVector
    get() {
        if (_Visibility_lock != null) return _Visibility_lock!!
        
        _Visibility_lock = ImageVector.Builder(
            name = "visibility_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 568f)
                quadToRelative(-45f, 0f, -76.5f, -31.5f)
                reflectiveQuadTo(372f, 460f)
                quadToRelative(0f, -45f, 31.5f, -76.5f)
                reflectiveQuadTo(480f, 352f)
                quadToRelative(45f, 0f, 76.5f, 31.5f)
                reflectiveQuadTo(588f, 460f)
                quadToRelative(0f, 45f, -31.5f, 76.5f)
                reflectiveQuadTo(480f, 568f)
                close()
                moveToRelative(0f, 192f)
                quadToRelative(-146f, 0f, -266f, -81.5f)
                reflectiveQuadTo(40f, 460f)
                quadToRelative(54f, -137f, 174f, -218.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(141f, 0f, 257.5f, 76f)
                reflectiveQuadTo(912f, 440f)
                horizontalLineTo(760f)
                quadToRelative(-28f, 0f, -53f, 7f)
                reflectiveQuadToRelative(-47f, 20f)
                verticalLineToRelative(-7f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(300f, 460f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(22f, 0f, 42.5f, -5f)
                reflectiveQuadToRelative(38.5f, -14f)
                quadToRelative(-1f, 5f, -1f, 9.5f)
                verticalLineTo(753f)
                quadToRelative(-20f, 3f, -40f, 5f)
                reflectiveQuadToRelative(-40f, 2f)
                close()
                moveToRelative(200f, 80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 800f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 640f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 600f)
                verticalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 680f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(680f)
                close()
                moveToRelative(40f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 600f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Visibility_lock!!
    }

private var _Visibility_lock: ImageVector? = null

