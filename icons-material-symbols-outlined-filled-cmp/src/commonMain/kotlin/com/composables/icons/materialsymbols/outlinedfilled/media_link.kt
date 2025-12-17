package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Media_link: ImageVector
    get() {
        if (_Media_link != null) return _Media_link!!
        
        _Media_link = ImageVector.Builder(
            name = "media_link",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 780f)
                lineToRelative(160f, -100f)
                lineToRelative(-160f, -100f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(220f, -470f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineTo(520f)
                verticalLineToRelative(60f)
                close()
                moveTo(120f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 840f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 440f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 520f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 920f)
                horizontalLineTo(120f)
                close()
                moveToRelative(620f, -360f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -38f, -18.5f, -70f)
                reflectiveQuadTo(672f, 400f)
                horizontalLineToRelative(8f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(50f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(740f, 280f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(680f, 340f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(60f)
                quadToRelative(-8f, 0f, -15f, -10f)
                reflectiveQuadToRelative(-15f, -10f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-50f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(460f, 280f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(520f, 220f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-50f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 32f, 15f, 57.5f)
                reflectiveQuadToRelative(39f, 42.5f)
                horizontalLineTo(280f)
                verticalLineToRelative(-260f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 40f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 120f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 560f)
                horizontalLineTo(740f)
                close()
            }
        }.build()
        
        return _Media_link!!
    }

private var _Media_link: ImageVector? = null

