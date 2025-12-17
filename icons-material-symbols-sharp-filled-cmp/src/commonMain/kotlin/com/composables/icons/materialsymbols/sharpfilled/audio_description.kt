package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Audio_description: ImageVector
    get() {
        if (_Audio_description != null) return _Audio_description!!
        
        _Audio_description = ImageVector.Builder(
            name = "audio_description",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 640f)
                verticalLineToRelative(-280f)
                lineToRelative(40f, -40f)
                horizontalLineToRelative(160f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(240f, 160f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(200f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(240f)
                lineToRelative(-40f, 40f)
                horizontalLineTo(360f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(274f, 32f)
                lineToRelative(-56f, -57f)
                quadToRelative(11f, -11f, 16.5f, -25f)
                reflectiveQuadToRelative(5.5f, -30f)
                quadToRelative(0f, -17f, -5.5f, -30.5f)
                reflectiveQuadTo(658f, 425f)
                lineToRelative(56f, -58f)
                quadToRelative(22f, 22f, 34f, 51f)
                reflectiveQuadToRelative(12f, 62f)
                quadToRelative(0f, 33f, -12f, 61.5f)
                reflectiveQuadTo(714f, 592f)
                close()
                moveToRelative(113f, 113f)
                lineToRelative(-58f, -55f)
                quadToRelative(33f, -33f, 52f, -76.5f)
                reflectiveQuadToRelative(19f, -93.5f)
                quadToRelative(0f, -51f, -19f, -94f)
                reflectiveQuadToRelative(-52f, -76f)
                lineToRelative(58f, -56f)
                quadToRelative(44f, 44f, 68.5f, 102f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 66f, -24.5f, 123.5f)
                reflectiveQuadTo(827f, 705f)
                close()
            }
        }.build()
        
        return _Audio_description!!
    }

private var _Audio_description: ImageVector? = null

