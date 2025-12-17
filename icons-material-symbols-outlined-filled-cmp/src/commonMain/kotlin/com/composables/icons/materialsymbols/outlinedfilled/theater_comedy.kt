package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Theater_comedy: ImageVector
    get() {
        if (_Theater_comedy != null) return _Theater_comedy!!
        
        _Theater_comedy = ImageVector.Builder(
            name = "theater_comedy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadTo(40f, 640f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadTo(280f, 880f)
                close()
                moveToRelative(-80f, -300f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(240f, 540f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(200f, 500f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(160f, 540f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(200f, 580f)
                close()
                moveToRelative(80f, 136f)
                quadToRelative(39f, 0f, 69.5f, -20.5f)
                reflectiveQuadTo(380f, 640f)
                horizontalLineTo(180f)
                quadToRelative(0f, 35f, 30.5f, 55.5f)
                reflectiveQuadTo(280f, 716f)
                close()
                moveToRelative(80f, -136f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 540f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 500f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 540f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 580f)
                close()
                moveToRelative(320f, 20f)
                quadToRelative(-26f, 0f, -51.5f, -5.5f)
                reflectiveQuadTo(580f, 578f)
                verticalLineToRelative(-278f)
                horizontalLineTo(440f)
                verticalLineToRelative(-220f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                close()
                moveToRelative(-80f, -300f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 260f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 220f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 260f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 300f)
                close()
                moveToRelative(-20f, 136f)
                horizontalLineToRelative(200f)
                quadToRelative(0f, -35f, -30.5f, -55.5f)
                reflectiveQuadTo(680f, 360f)
                quadToRelative(-34f, 0f, -67f, 18f)
                reflectiveQuadToRelative(-33f, 58f)
                close()
                moveToRelative(180f, -136f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 260f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 220f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 260f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(760f, 300f)
                close()
            }
        }.build()
        
        return _Theater_comedy!!
    }

private var _Theater_comedy: ImageVector? = null

