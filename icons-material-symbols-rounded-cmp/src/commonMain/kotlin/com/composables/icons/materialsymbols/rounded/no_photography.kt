package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.No_photography: ImageVector
    get() {
        if (_No_photography != null) return _No_photography!!
        
        _No_photography = ImageVector.Builder(
            name = "no_photography",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(840f, 720f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(800f, 679f)
                verticalLineToRelative(-399f)
                horizontalLineTo(673f)
                quadToRelative(-17f, 0f, -32.5f, -6.5f)
                reflectiveQuadTo(614f, 254f)
                lineToRelative(-49f, -54f)
                horizontalLineTo(395f)
                lineToRelative(-10f, 11f)
                quadToRelative(-11f, 13f, -28.5f, 13f)
                reflectiveQuadTo(327f, 212f)
                quadToRelative(-11f, -11f, -11.5f, -27f)
                reflectiveQuadToRelative(10.5f, -28f)
                lineToRelative(10f, -11f)
                quadToRelative(11f, -12f, 26.5f, -19f)
                reflectiveQuadToRelative(32.5f, -7f)
                horizontalLineToRelative(170f)
                quadToRelative(17f, 0f, 32.5f, 7f)
                reflectiveQuadToRelative(26.5f, 19f)
                lineToRelative(50f, 54f)
                horizontalLineToRelative(126f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                close()
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(41f)
                lineToRelative(80f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(601f)
                lineToRelative(80f, 80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(466f, -215f)
                quadToRelative(-25f, 34f, -62.5f, 54.5f)
                reflectiveQuadTo(480f, 700f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(300f, 520f)
                quadToRelative(0f, -46f, 20.5f, -83.5f)
                reflectiveQuadTo(375f, 374f)
                lineToRelative(58f, 58f)
                quadToRelative(-24f, 13f, -38.5f, 36f)
                reflectiveQuadTo(380f, 520f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                quadToRelative(29f, 0f, 52f, -14.5f)
                reflectiveQuadToRelative(36f, -38.5f)
                lineToRelative(58f, 58f)
                close()
                moveToRelative(-18f, -233f)
                quadToRelative(25f, 24f, 38.5f, 57f)
                reflectiveQuadToRelative(13.5f, 71f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 6f, -1f, 12f)
                lineTo(456f, 341f)
                quadToRelative(6f, -1f, 12f, -1f)
                horizontalLineToRelative(12f)
                quadToRelative(38f, 0f, 71f, 13.5f)
                reflectiveQuadToRelative(57f, 38.5f)
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
                moveTo(407f, 520f)
                close()
                moveToRelative(171f, -57f)
                close()
            }
        }.build()
        
        return _No_photography!!
    }

private var _No_photography: ImageVector? = null

