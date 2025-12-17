package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Medical_information: ImageVector
    get() {
        if (_Medical_information != null) return _Medical_information!!
        
        _Medical_information = ImageVector.Builder(
            name = "medical_information",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 640f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(360f, 680f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 600f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 560f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 520f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 640f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(270f, -60f)
                horizontalLineToRelative(180f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(760f, 550f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(730f, 520f)
                horizontalLineTo(550f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(520f, 550f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(550f, 580f)
                close()
                moveToRelative(0f, 120f)
                horizontalLineToRelative(100f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(680f, 670f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(650f, 640f)
                horizontalLineTo(550f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(520f, 670f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(550f, 700f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 280f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(440f, 80f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 360f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(280f, -520f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Medical_information!!
    }

private var _Medical_information: ImageVector? = null

