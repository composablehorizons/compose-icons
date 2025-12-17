package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Text_fields: ImageVector
    get() {
        if (_Text_fields != null) return _Text_fields!!
        
        _Text_fields = ImageVector.Builder(
            name = "text_fields",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(280f, 740f)
                verticalLineToRelative(-460f)
                horizontalLineTo(140f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 220f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(140f, 160f)
                horizontalLineToRelative(400f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(600f, 220f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(540f, 280f)
                horizontalLineTo(400f)
                verticalLineToRelative(460f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(340f, 800f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(640f, 740f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(-60f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(520f, 420f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(580f, 360f)
                horizontalLineToRelative(240f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 420f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 480f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(260f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(700f, 800f)
                close()
            }
        }.build()
        
        return _Text_fields!!
    }

private var _Text_fields: ImageVector? = null

