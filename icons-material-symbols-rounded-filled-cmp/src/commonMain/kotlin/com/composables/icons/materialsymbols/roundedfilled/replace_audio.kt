package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Replace_audio: ImageVector
    get() {
        if (_Replace_audio != null) return _Replace_audio!!
        
        _Replace_audio = ImageVector.Builder(
            name = "replace_audio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 320f)
                horizontalLineTo(640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 240f)
                horizontalLineToRelative(36f)
                quadToRelative(-39f, -39f, -90f, -59.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-71f, 0f, -133f, 33.5f)
                reflectiveQuadTo(247f, 285f)
                quadToRelative(-14f, 20f, -30f, 23f)
                reflectiveQuadToRelative(-30f, -4f)
                quadToRelative(-14f, -7f, -19.5f, -21f)
                reflectiveQuadToRelative(2.5f, -27f)
                quadToRelative(48f, -81f, 130.5f, -128.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(82f, 0f, 155.5f, 35f)
                reflectiveQuadTo(760f, 214f)
                verticalLineToRelative(-94f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 120f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 320f)
                close()
                moveTo(420f, 880f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(16f, 0f, 31f, 3f)
                reflectiveQuadToRelative(29f, 10f)
                verticalLineToRelative(-213f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                verticalLineToRelative(260f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
            }
        }.build()
        
        return _Replace_audio!!
    }

private var _Replace_audio: ImageVector? = null

