package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Settings_input_component: ImageVector
    get() {
        if (_Settings_input_component != null) return _Settings_input_component!!
        
        _Settings_input_component = ImageVector.Builder(
            name = "settings_input_component",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 920f)
                verticalLineToRelative(-168f)
                quadToRelative(-35f, -12f, -57.5f, -42.5f)
                reflectiveQuadTo(40f, 640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 39f, -22.5f, 69.5f)
                reflectiveQuadTo(200f, 752f)
                verticalLineToRelative(168f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-168f)
                quadToRelative(-35f, -12f, -57.5f, -42.5f)
                reflectiveQuadTo(360f, 640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 39f, -22.5f, 69.5f)
                reflectiveQuadTo(520f, 752f)
                verticalLineToRelative(168f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-168f)
                quadToRelative(-35f, -12f, -57.5f, -42.5f)
                reflectiveQuadTo(680f, 640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 39f, -22.5f, 69.5f)
                reflectiveQuadTo(840f, 752f)
                verticalLineToRelative(168f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(40f, 480f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 280f)
                verticalLineToRelative(200f)
                horizontalLineTo(40f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 280f)
                verticalLineToRelative(200f)
                horizontalLineTo(360f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 280f)
                verticalLineToRelative(200f)
                horizontalLineTo(680f)
                close()
            }
        }.build()
        
        return _Settings_input_component!!
    }

private var _Settings_input_component: ImageVector? = null

