package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Pickleball: ImageVector
    get() {
        if (_Pickleball != null) return _Pickleball!!
        
        _Pickleball = ImageVector.Builder(
            name = "pickleball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(283f, 579f)
                quadToRelative(19f, 19f, 42f, 28f)
                reflectiveQuadToRelative(48f, 9f)
                quadToRelative(25f, 0f, 48f, -9f)
                reflectiveQuadToRelative(42f, -28f)
                lineToRelative(36f, -36f)
                quadToRelative(19f, -19f, 28f, -42f)
                reflectiveQuadToRelative(9f, -48f)
                quadToRelative(0f, -25f, -9f, -47.5f)
                reflectiveQuadTo(499f, 364f)
                lineTo(347f, 212f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(290f, 212f)
                lineTo(132f, 371f)
                quadToRelative(-12f, 12f, -12f, 28f)
                reflectiveQuadToRelative(12f, 28f)
                lineToRelative(151f, 152f)
                close()
                moveToRelative(89f, 116f)
                quadToRelative(-40f, 0f, -77.5f, -15f)
                reflectiveQuadTo(227f, 635f)
                lineTo(75f, 484f)
                quadToRelative(-17f, -17f, -26f, -39.5f)
                reflectiveQuadTo(40f, 399f)
                quadToRelative(0f, -23f, 9f, -45.5f)
                reflectiveQuadTo(75f, 314f)
                lineToRelative(159f, -159f)
                quadToRelative(17f, -17f, 39.5f, -26f)
                reflectiveQuadToRelative(45.5f, -9f)
                quadToRelative(23f, 0f, 45.5f, 9f)
                reflectiveQuadToRelative(39.5f, 26f)
                lineToRelative(151f, 152f)
                quadToRelative(30f, 30f, 45f, 67.5f)
                reflectiveQuadToRelative(15f, 77.5f)
                quadToRelative(0f, 36f, -12.5f, 71.5f)
                reflectiveQuadTo(564f, 588f)
                lineToRelative(207f, 207f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(771f, 852f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(508f, 645f)
                quadToRelative(-29f, 26f, -64.5f, 38f)
                reflectiveQuadTo(372f, 695f)
                close()
                moveToRelative(408f, -335f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(840f, 220f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(780f, 160f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(720f, 220f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(780f, 280f)
                close()
                moveToRelative(0f, -60f)
                close()
                moveTo(326f, 406f)
                close()
            }
        }.build()
        
        return _Pickleball!!
    }

private var _Pickleball: ImageVector? = null

