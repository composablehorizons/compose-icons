package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Bedroom_parent: ImageVector
    get() {
        if (_Bedroom_parent != null) return _Bedroom_parent!!
        
        _Bedroom_parent = ImageVector.Builder(
            name = "bedroom_parent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 620f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(30f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(730f, 680f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(760f, 650f)
                verticalLineToRelative(-124f)
                quadToRelative(0f, -21f, -8f, -39.5f)
                reflectiveQuadTo(730f, 454f)
                verticalLineToRelative(-94f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(650f, 280f)
                horizontalLineTo(520f)
                quadToRelative(-11f, 0f, -21f, 3f)
                reflectiveQuadToRelative(-19f, 9f)
                quadToRelative(-9f, -6f, -19f, -9f)
                reflectiveQuadToRelative(-21f, -3f)
                horizontalLineTo(310f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(230f, 360f)
                verticalLineToRelative(94f)
                quadToRelative(-14f, 14f, -22f, 32.5f)
                reflectiveQuadToRelative(-8f, 39.5f)
                verticalLineToRelative(124f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(230f, 680f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(260f, 650f)
                verticalLineToRelative(-30f)
                close()
                moveToRelative(0f, -60f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(300f, 480f)
                horizontalLineToRelative(360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(700f, 520f)
                verticalLineToRelative(40f)
                horizontalLineTo(260f)
                close()
                moveToRelative(30f, -140f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(290f)
                close()
                moveToRelative(220f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(510f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Bedroom_parent!!
    }

private var _Bedroom_parent: ImageVector? = null

