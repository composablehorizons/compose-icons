package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Speech_to_text: ImageVector
    get() {
        if (_Speech_to_text != null) return _Speech_to_text!!
        
        _Speech_to_text = ImageVector.Builder(
            name = "speech_to_text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 400f)
                quadToRelative(-33f, 0f, -56.5f, -23f)
                reflectiveQuadTo(600f, 320f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -34f, 23.5f, -57f)
                reflectiveQuadToRelative(56.5f, -23f)
                quadToRelative(34f, 0f, 57f, 23f)
                reflectiveQuadToRelative(23f, 57f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 34f, -23f, 57f)
                reflectiveQuadToRelative(-57f, 23f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                close()
                moveToRelative(440f, 40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-104f)
                quadToRelative(-77f, -14f, -128.5f, -74.5f)
                reflectiveQuadTo(460f, 320f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                quadToRelative(59f, 0f, 99.5f, -41f)
                reflectiveQuadToRelative(40.5f, -99f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 81f, -51f, 141.5f)
                reflectiveQuadTo(720f, 536f)
                verticalLineToRelative(104f)
                close()
            }
        }.build()
        
        return _Speech_to_text!!
    }

private var _Speech_to_text: ImageVector? = null

