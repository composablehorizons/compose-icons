package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Local_post_office: ImageVector
    get() {
        if (_Local_post_office != null) return _Local_post_office!!
        
        _Local_post_office = ImageVector.Builder(
            name = "local_post_office",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 840f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 480f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                horizontalLineToRelative(160f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                verticalLineToRelative(520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(120f)
                close()
                moveToRelative(520f, -200f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                horizontalLineTo(480f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 520f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-280f, -6f)
                lineToRelative(200f, -114f)
                horizontalLineTo(160f)
                lineToRelative(200f, 114f)
                close()
                moveTo(160f, 800f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-170f)
                lineToRelative(-160f, 91f)
                quadToRelative(-9f, 5f, -19f, 8f)
                reflectiveQuadToRelative(-21f, 3f)
                quadToRelative(-11f, 0f, -21f, -3f)
                reflectiveQuadToRelative(-19f, -8f)
                lineToRelative(-160f, -91f)
                verticalLineToRelative(170f)
                close()
                moveToRelative(0f, -240f)
                verticalLineToRelative(26f)
                verticalLineToRelative(-1f)
                verticalLineToRelative(54f)
                verticalLineToRelative(-9f)
                verticalLineToRelative(170f)
                verticalLineToRelative(-170f)
                verticalLineToRelative(9f)
                verticalLineToRelative(-54f)
                verticalLineToRelative(1f)
                verticalLineToRelative(-26f)
                close()
                moveToRelative(280f, -160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 320f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 400f)
                horizontalLineTo(440f)
                close()
            }
        }.build()
        
        return _Local_post_office!!
    }

private var _Local_post_office: ImageVector? = null

