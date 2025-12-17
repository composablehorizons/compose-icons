package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Masks: ImageVector
    get() {
        if (_Masks != null) return _Masks!!
        
        _Masks = ImageVector.Builder(
            name = "masks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(-38f, 0f, -73.5f, -10.5f)
                reflectiveQuadTo(341f, 679f)
                quadToRelative(-44f, -3f, -90f, -19f)
                reflectiveQuadToRelative(-84f, -53f)
                quadToRelative(-38f, -37f, -62.5f, -97f)
                reflectiveQuadTo(80f, 360f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(39f, 0f, 67.5f, 27f)
                reflectiveQuadToRelative(31.5f, 65f)
                quadToRelative(28f, -8f, 50f, -20f)
                reflectiveQuadToRelative(45f, -23f)
                quadToRelative(23f, -12f, 48f, -20.5f)
                reflectiveQuadToRelative(58f, -8.5f)
                quadToRelative(34f, 0f, 58.5f, 8.5f)
                reflectiveQuadTo(586f, 289f)
                quadToRelative(22f, 11f, 44.5f, 23f)
                reflectiveQuadToRelative(50.5f, 20f)
                quadToRelative(3f, -39f, 31.5f, -65.5f)
                reflectiveQuadTo(780f, 240f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 90f, -24.5f, 150f)
                reflectiveQuadTo(793f, 607f)
                quadToRelative(-38f, 37f, -84f, 53f)
                reflectiveQuadToRelative(-90f, 19f)
                quadToRelative(-30f, 20f, -65.5f, 30.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveTo(260f, 599f)
                quadToRelative(-19f, -30f, -29.5f, -65.5f)
                reflectiveQuadTo(220f, 460f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(180f, 300f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(140f, 340f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 110f, 37f, 164f)
                reflectiveQuadToRelative(83f, 75f)
                close()
                moveToRelative(220f, 61f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 460f)
                verticalLineToRelative(-66f)
                quadToRelative(-34f, -8f, -59.5f, -19f)
                reflectiveQuadTo(574f, 351f)
                quadToRelative(-28f, -17f, -49.5f, -24f)
                reflectiveQuadToRelative(-44.5f, -7f)
                quadToRelative(-23f, 0f, -44.5f, 7f)
                reflectiveQuadTo(386f, 351f)
                quadToRelative(-21f, 12f, -46.5f, 24f)
                reflectiveQuadTo(280f, 394f)
                verticalLineToRelative(66f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 660f)
                close()
                moveToRelative(0f, -260f)
                quadToRelative(15f, 0f, 26.5f, 5.5f)
                reflectiveQuadTo(532f, 419f)
                quadToRelative(8f, 5f, 15.5f, 9f)
                reflectiveQuadToRelative(16.5f, 9f)
                quadToRelative(8f, 4f, 16f, 0.5f)
                reflectiveQuadToRelative(12f, -11.5f)
                quadToRelative(4f, -8f, 0f, -15f)
                reflectiveQuadToRelative(-12f, -11f)
                quadToRelative(-8f, -4f, -14.5f, -7.5f)
                reflectiveQuadTo(552f, 385f)
                quadToRelative(-16f, -10f, -32.5f, -17.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-23f, 0f, -39.5f, 7.5f)
                reflectiveQuadTo(407f, 385f)
                quadToRelative(-7f, 4f, -13.5f, 7.5f)
                reflectiveQuadTo(379f, 400f)
                quadToRelative(-8f, 4f, -11.5f, 11f)
                reflectiveQuadToRelative(0.5f, 15f)
                quadToRelative(4f, 8f, 12f, 11f)
                reflectiveQuadToRelative(16f, -1f)
                quadToRelative(9f, -5f, 16.5f, -9f)
                reflectiveQuadToRelative(15.5f, -8f)
                quadToRelative(14f, -8f, 25.5f, -13.5f)
                reflectiveQuadTo(480f, 400f)
                close()
                moveToRelative(220f, 199f)
                quadToRelative(46f, -21f, 83f, -75f)
                reflectiveQuadToRelative(37f, -164f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(780f, 300f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(740f, 340f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 38f, -10f, 73.5f)
                reflectiveQuadTo(700f, 599f)
                close()
                moveTo(480f, 490f)
                close()
            }
        }.build()
        
        return _Masks!!
    }

private var _Masks: ImageVector? = null

