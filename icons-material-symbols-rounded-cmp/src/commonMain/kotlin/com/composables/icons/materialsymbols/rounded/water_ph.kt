package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Water_ph: ImageVector
    get() {
        if (_Water_ph != null) return _Water_ph!!
        
        _Water_ph = ImageVector.Builder(
            name = "water_ph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 94f)
                quadToRelative(8f, 0f, 14.5f, 2.5f)
                reflectiveQuadTo(427f, 104f)
                quadToRelative(44f, 39f, 92f, 86f)
                reflectiveQuadToRelative(89.5f, 100f)
                quadToRelative(41.5f, 53f, 72f, 111f)
                reflectiveQuadTo(718f, 520f)
                quadToRelative(2f, 17f, -9.5f, 28.5f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(637f, 520f)
                quadToRelative(-6f, -36f, -21.5f, -68.5f)
                reflectiveQuadTo(579f, 387f)
                quadToRelative(-30f, -46f, -74.5f, -96.5f)
                reflectiveQuadTo(400f, 186f)
                quadTo(281f, 295f, 220.5f, 387f)
                reflectiveQuadTo(160f, 552f)
                quadToRelative(0f, 82f, 42.5f, 146f)
                reflectiveQuadTo(324f, 788f)
                quadToRelative(23f, 8f, 30f, 22.5f)
                reflectiveQuadToRelative(4f, 28.5f)
                quadToRelative(-3f, 14f, -14f, 24f)
                reflectiveQuadToRelative(-26f, 6f)
                quadToRelative(-112f, -27f, -175f, -115.5f)
                reflectiveQuadTo(80f, 552f)
                quadToRelative(0f, -64f, 29f, -127.5f)
                reflectiveQuadTo(182f, 303f)
                quadToRelative(44f, -58f, 95.5f, -109f)
                reflectiveQuadToRelative(95.5f, -90f)
                quadToRelative(6f, -5f, 12.5f, -7.5f)
                reflectiveQuadTo(400f, 94f)
                close()
                moveToRelative(0f, 397f)
                close()
                moveToRelative(180f, 309f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(470f, 880f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(440f, 850f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(470f, 640f)
                horizontalLineToRelative(110f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 24f, -18f, 42f)
                reflectiveQuadToRelative(-42f, 18f)
                close()
                moveToRelative(160f, -20f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(710f, 880f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(680f, 850f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(710f, 640f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(740f, 670f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(850f, 640f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(880f, 670f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(850f, 880f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(820f, 850f)
                verticalLineToRelative(-70f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-240f, -40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Water_ph!!
    }

private var _Water_ph: ImageVector? = null

