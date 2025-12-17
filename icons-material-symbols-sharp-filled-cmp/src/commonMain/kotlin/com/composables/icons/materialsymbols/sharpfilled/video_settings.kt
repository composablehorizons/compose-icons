package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Video_settings: ImageVector
    get() {
        if (_Video_settings != null) return _Video_settings!!
        
        _Video_settings = ImageVector.Builder(
            name = "video_settings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(300f, -140f)
                verticalLineToRelative(-360f)
                lineToRelative(280f, 180f)
                lineToRelative(-280f, 180f)
                close()
                moveTo(714f, 920f)
                lineToRelative(-12f, -60f)
                quadToRelative(-12f, -5f, -22.5f, -10.5f)
                reflectiveQuadTo(658f, 836f)
                lineToRelative(-58f, 18f)
                lineToRelative(-40f, -68f)
                lineToRelative(46f, -40f)
                quadToRelative(-2f, -14f, -2f, -26f)
                reflectiveQuadToRelative(2f, -26f)
                lineToRelative(-46f, -40f)
                lineToRelative(40f, -68f)
                lineToRelative(58f, 18f)
                quadToRelative(11f, -8f, 21.5f, -13.5f)
                reflectiveQuadTo(702f, 580f)
                lineToRelative(12f, -60f)
                horizontalLineToRelative(80f)
                lineToRelative(12f, 60f)
                quadToRelative(12f, 5f, 22.5f, 11f)
                reflectiveQuadToRelative(21.5f, 15f)
                lineToRelative(58f, -20f)
                lineToRelative(40f, 70f)
                lineToRelative(-46f, 40f)
                quadToRelative(2f, 12f, 2f, 25f)
                reflectiveQuadToRelative(-2f, 25f)
                lineToRelative(46f, 40f)
                lineToRelative(-40f, 68f)
                lineToRelative(-58f, -18f)
                quadToRelative(-11f, 8f, -21.5f, 13.5f)
                reflectiveQuadTo(806f, 860f)
                lineToRelative(-12f, 60f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(834f, 720f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(754f, 640f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(674f, 720f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(754f, 800f)
                close()
            }
        }.build()
        
        return _Video_settings!!
    }

private var _Video_settings: ImageVector? = null

