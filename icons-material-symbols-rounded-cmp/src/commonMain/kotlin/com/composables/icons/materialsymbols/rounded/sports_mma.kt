package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sports_mma: ImageVector
    get() {
        if (_Sports_mma != null) return _Sports_mma!!
        
        _Sports_mma = ImageVector.Builder(
            name = "sports_mma",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 840f)
                horizontalLineTo(320f)
                close()
                moveToRelative(440f, -520f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 3f, -2f, 8f)
                lineToRelative(-30f, 152f)
                quadToRelative(-3f, 18f, -16.5f, 29f)
                reflectiveQuadTo(680f, 640f)
                horizontalLineTo(280f)
                quadToRelative(-18f, 0f, -31.5f, -11f)
                reflectiveQuadTo(232f, 600f)
                lineToRelative(-30f, -152f)
                quadToRelative(-2f, -5f, -2f, -8f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 200f)
                verticalLineToRelative(120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 320f)
                close()
                moveTo(306f, 560f)
                horizontalLineToRelative(348f)
                lineToRelative(26f, -136f)
                verticalLineToRelative(-24f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineTo(280f)
                verticalLineToRelative(224f)
                lineToRelative(26f, 136f)
                close()
                moveToRelative(174f, -180f)
                close()
                moveToRelative(-100f, 20f)
                horizontalLineToRelative(120f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(560f, 340f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(500f, 280f)
                horizontalLineTo(380f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(320f, 340f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(380f, 400f)
                close()
            }
        }.build()
        
        return _Sports_mma!!
    }

private var _Sports_mma: ImageVector? = null

