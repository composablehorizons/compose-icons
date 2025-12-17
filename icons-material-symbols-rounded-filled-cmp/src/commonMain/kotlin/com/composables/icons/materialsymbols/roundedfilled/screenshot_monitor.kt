package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Screenshot_monitor: ImageVector
    get() {
        if (_Screenshot_monitor != null) return _Screenshot_monitor!!
        
        _Screenshot_monitor = ImageVector.Builder(
            name = "screenshot_monitor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 580f)
                horizontalLineToRelative(-70f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(600f, 610f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(630f, 640f)
                horizontalLineToRelative(90f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 600f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(730f, 480f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(700f, 510f)
                verticalLineToRelative(70f)
                close()
                moveTo(260f, 300f)
                horizontalLineToRelative(70f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(360f, 270f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(330f, 240f)
                horizontalLineToRelative(-90f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 280f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(230f, 400f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(260f, 370f)
                verticalLineToRelative(-70f)
                close()
                moveTo(160f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 760f)
                horizontalLineTo(640f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Screenshot_monitor!!
    }

private var _Screenshot_monitor: ImageVector? = null

