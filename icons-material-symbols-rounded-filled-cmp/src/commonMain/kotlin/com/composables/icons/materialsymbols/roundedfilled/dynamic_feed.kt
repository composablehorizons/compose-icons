package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Dynamic_feed: ImageVector
    get() {
        if (_Dynamic_feed != null) return _Dynamic_feed!!
        
        _Dynamic_feed = ImageVector.Builder(
            name = "dynamic_feed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 520f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 600f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 360f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 680f)
                horizontalLineTo(320f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 440f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 120f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 520f)
                horizontalLineTo(480f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-160f)
                horizontalLineTo(480f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Dynamic_feed!!
    }

private var _Dynamic_feed: ImageVector? = null

