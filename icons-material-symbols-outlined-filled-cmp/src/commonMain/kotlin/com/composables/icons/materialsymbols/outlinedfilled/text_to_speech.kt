package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Text_to_speech: ImageVector
    get() {
        if (_Text_to_speech != null) return _Text_to_speech!!
        
        _Text_to_speech = ImageVector.Builder(
            name = "text_to_speech",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(326f)
                lineToRelative(-80f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(360f, 0f)
                lineTo(440f, 440f)
                horizontalLineTo(320f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(120f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(520f)
                close()
                moveToRelative(80f, -122f)
                verticalLineToRelative(-276f)
                quadToRelative(36f, 21f, 58f, 57f)
                reflectiveQuadToRelative(22f, 81f)
                quadToRelative(0f, 45f, -22f, 81f)
                reflectiveQuadToRelative(-58f, 57f)
                close()
                moveToRelative(0f, 172f)
                verticalLineToRelative(-84f)
                quadToRelative(70f, -25f, 115f, -86.5f)
                reflectiveQuadTo(840f, 340f)
                quadToRelative(0f, -78f, -45f, -139.5f)
                reflectiveQuadTo(680f, 114f)
                verticalLineToRelative(-84f)
                quadToRelative(104f, 27f, 172f, 112.5f)
                reflectiveQuadTo(920f, 340f)
                quadToRelative(0f, 112f, -68f, 197.5f)
                reflectiveQuadTo(680f, 650f)
                close()
            }
        }.build()
        
        return _Text_to_speech!!
    }

private var _Text_to_speech: ImageVector? = null

