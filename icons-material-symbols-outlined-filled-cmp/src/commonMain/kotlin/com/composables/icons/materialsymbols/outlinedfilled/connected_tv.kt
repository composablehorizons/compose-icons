package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Connected_tv: ImageVector
    get() {
        if (_Connected_tv != null) return _Connected_tv!!
        
        _Connected_tv = ImageVector.Builder(
            name = "connected_tv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 640f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(200f, 560f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(142f, 0f)
                horizontalLineToRelative(58f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(200f, 440f)
                verticalLineToRelative(58f)
                quadToRelative(59f, 0f, 100.5f, 41.5f)
                reflectiveQuadTo(342f, 640f)
                close()
                moveToRelative(120f, 0f)
                horizontalLineToRelative(58f)
                quadToRelative(0f, -66f, -25f, -124.5f)
                reflectiveQuadToRelative(-68.5f, -102f)
                quadTo(383f, 370f, 324.5f, 345f)
                reflectiveQuadTo(200f, 320f)
                verticalLineToRelative(58f)
                quadToRelative(109f, 0f, 185.5f, 76.5f)
                reflectiveQuadTo(462f, 640f)
                close()
                moveTo(320f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
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
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Connected_tv!!
    }

private var _Connected_tv: ImageVector? = null

