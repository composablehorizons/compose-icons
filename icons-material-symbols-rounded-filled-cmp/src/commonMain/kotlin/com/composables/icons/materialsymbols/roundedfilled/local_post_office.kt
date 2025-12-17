package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Local_post_office: ImageVector
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
                moveToRelative(240f, -206f)
                lineToRelative(-155f, -88f)
                quadToRelative(-15f, -9f, -30f, 0f)
                reflectiveQuadToRelative(-15f, 26f)
                quadToRelative(0f, 8f, 4f, 15.5f)
                reflectiveQuadToRelative(11f, 11.5f)
                lineToRelative(165f, 94f)
                quadToRelative(9f, 5f, 20f, 5f)
                reflectiveQuadToRelative(20f, -5f)
                lineToRelative(165f, -94f)
                quadToRelative(7f, -4f, 11f, -11.5f)
                reflectiveQuadToRelative(4f, -15.5f)
                quadToRelative(0f, -17f, -15f, -26f)
                reflectiveQuadToRelative(-30f, 0f)
                lineToRelative(-155f, 88f)
                close()
                moveToRelative(280f, 6f)
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
                moveTo(440f, 400f)
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

