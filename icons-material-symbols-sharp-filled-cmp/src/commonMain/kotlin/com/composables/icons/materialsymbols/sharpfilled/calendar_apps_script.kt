package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Calendar_apps_script: ImageVector
    get() {
        if (_Calendar_apps_script != null) return _Calendar_apps_script!!
        
        _Calendar_apps_script = ImageVector.Builder(
            name = "calendar_apps_script",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(578f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(538f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(578f, 800f)
                horizontalLineToRelative(113f)
                lineToRelative(-92f, -65f)
                quadToRelative(-14f, -10f, -16.5f, -25.5f)
                reflectiveQuadTo(589f, 680f)
                quadToRelative(9f, -14f, 25f, -16.5f)
                reflectiveQuadToRelative(30f, 6.5f)
                lineToRelative(93f, 64f)
                lineToRelative(-39f, -106f)
                quadToRelative(-6f, -15f, 1f, -30f)
                reflectiveQuadToRelative(23f, -21f)
                quadToRelative(16f, -6f, 31f, 1f)
                reflectiveQuadToRelative(21f, 23f)
                lineToRelative(38f, 106f)
                lineToRelative(30f, -109f)
                quadToRelative(5f, -16f, 18.5f, -24.5f)
                reflectiveQuadTo(890f, 570f)
                quadToRelative(16f, 5f, 25f, 18.5f)
                reflectiveQuadToRelative(4f, 29.5f)
                lineTo(849f, 880f)
                horizontalLineTo(578f)
                close()
                moveToRelative(-458f, -80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(324f)
                quadToRelative(-20f, -3f, -40f, -3f)
                reflectiveQuadToRelative(-40f, 3f)
                verticalLineToRelative(-84f)
                horizontalLineTo(200f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(280f)
                quadToRelative(0f, 20f, 3f, 40f)
                reflectiveQuadToRelative(11f, 40f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Calendar_apps_script!!
    }

private var _Calendar_apps_script: ImageVector? = null

