package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Visibility_lock: ImageVector
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
                quadToRelative(-134f, 0f, -250.5f, -72f)
                reflectiveQuadTo(56f, 494f)
                quadToRelative(-4f, -8f, -6f, -16.5f)
                reflectiveQuadTo(48f, 460f)
                quadToRelative(0f, -9f, 2f, -17.5f)
                reflectiveQuadToRelative(6f, -16.5f)
                quadToRelative(57f, -122f, 173.5f, -194f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(119f, 0f, 221.5f, 54.5f)
                reflectiveQuadTo(870f, 365f)
                quadToRelative(10f, 14f, 5.5f, 30.5f)
                reflectiveQuadTo(856f, 420f)
                quadToRelative(-15f, 8f, -31f, 3.5f)
                reflectiveQuadTo(799f, 405f)
                quadToRelative(-55f, -78f, -138.5f, -121.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-113f, 0f, -207.5f, 59.5f)
                reflectiveQuadTo(128f, 460f)
                quadToRelative(50f, 101f, 144.5f, 160.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(10f, 0f, 20f, -0.5f)
                reflectiveQuadToRelative(20f, -1.5f)
                quadToRelative(16f, -2f, 28f, 8.5f)
                reflectiveQuadToRelative(12f, 26.5f)
                quadToRelative(0f, 17f, -11.5f, 30f)
                reflectiveQuadTo(520f, 758f)
                quadToRelative(-10f, 1f, -20f, 1.5f)
                reflectiveQuadToRelative(-20f, 0.5f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(22f, 0f, 42.5f, -5f)
                reflectiveQuadToRelative(38.5f, -14f)
                quadToRelative(5f, -50f, 31.5f, -90f)
                reflectiveQuadToRelative(67.5f, -64f)
                verticalLineToRelative(-7f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(300f, 460f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(-5f, -180f)
                close()
                moveToRelative(205f, 380f)
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

