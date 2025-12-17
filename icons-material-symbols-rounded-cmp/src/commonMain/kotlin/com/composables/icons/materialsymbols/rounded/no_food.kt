package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.No_food: ImageVector
    get() {
        if (_No_food != null) return _No_food!!
        
        _No_food = ImageVector.Builder(
            name = "no_food",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(916f, 244f)
                lineToRelative(-43f, 422f)
                quadToRelative(-2f, 25f, -26f, 33.5f)
                reflectiveQuadToRelative(-42f, -9.5f)
                quadToRelative(-6f, -6f, -9f, -14.5f)
                reflectiveQuadToRelative(-2f, -17.5f)
                lineToRelative(38f, -378f)
                horizontalLineTo(488f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(448f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(488f, 200f)
                horizontalLineToRelative(152f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(156f)
                quadToRelative(18f, 0f, 30f, 13f)
                reflectiveQuadToRelative(10f, 31f)
                close()
                moveTo(625f, 511f)
                close()
                moveTo(791f, 903f)
                lineTo(55f, 168f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                close()
                moveTo(80f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 680f)
                horizontalLineToRelative(520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 760f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 880f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 840f)
                horizontalLineToRelative(520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 920f)
                horizontalLineTo(80f)
                close()
                moveToRelative(282f, -559f)
                verticalLineToRelative(80f)
                quadToRelative(-5f, 0f, -11f, -0.5f)
                reflectiveQuadToRelative(-11f, -0.5f)
                quadToRelative(-59f, 0f, -111.5f, 20f)
                reflectiveQuadTo(147f, 520f)
                horizontalLineToRelative(374f)
                lineToRelative(80f, 80f)
                horizontalLineTo(89f)
                quadToRelative(-19f, 0f, -31.5f, -14.5f)
                reflectiveQuadTo(49f, 552f)
                quadToRelative(10f, -51f, 39f, -87.5f)
                reflectiveQuadToRelative(69f, -60f)
                quadToRelative(40f, -23.5f, 87.5f, -34f)
                reflectiveQuadTo(340f, 360f)
                quadToRelative(5f, 0f, 11f, 0.5f)
                reflectiveQuadToRelative(11f, 0.5f)
                close()
                moveToRelative(-22f, 159f)
                close()
            }
        }.build()
        
        return _No_food!!
    }

private var _No_food: ImageVector? = null

