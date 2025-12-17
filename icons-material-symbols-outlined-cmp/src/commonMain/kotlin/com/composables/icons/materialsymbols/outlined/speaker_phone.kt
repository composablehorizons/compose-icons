package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Speaker_phone: ImageVector
    get() {
        if (_Speaker_phone != null) return _Speaker_phone!!
        
        _Speaker_phone = ImageVector.Builder(
            name = "speaker_phone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(338f, 340f)
                lineToRelative(-58f, -58f)
                quadToRelative(41f, -39f, 92.5f, -60.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(56f, 0f, 107.5f, 21.5f)
                reflectiveQuadTo(680f, 282f)
                lineToRelative(-58f, 58f)
                quadToRelative(-29f, -29f, -65f, -44.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-41f, 0f, -77f, 15.5f)
                reflectiveQuadTo(338f, 340f)
                close()
                moveTo(226f, 224f)
                lineToRelative(-56f, -56f)
                quadToRelative(63f, -62f, 142.5f, -95f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(88f, 0f, 167.5f, 33f)
                reflectiveQuadTo(790f, 168f)
                lineToRelative(-56f, 56f)
                quadToRelative(-51f, -50f, -117f, -77f)
                reflectiveQuadToRelative(-137f, -27f)
                quadToRelative(-71f, 0f, -137f, 27f)
                reflectiveQuadToRelative(-117f, 77f)
                close()
                moveTo(400f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 400f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 480f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 880f)
                horizontalLineTo(400f)
                close()
                moveToRelative(160f, -80f)
                verticalLineToRelative(-320f)
                horizontalLineTo(400f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(160f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineTo(400f)
                horizontalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Speaker_phone!!
    }

private var _Speaker_phone: ImageVector? = null

