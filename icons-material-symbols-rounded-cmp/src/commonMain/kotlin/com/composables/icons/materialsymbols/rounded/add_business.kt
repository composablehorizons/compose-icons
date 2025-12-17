package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Add_business: ImageVector
    get() {
        if (_Add_business != null) return _Add_business!!
        
        _Add_business = ImageVector.Builder(
            name = "add_business",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 800f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 720f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 640f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 800f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 880f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(-600f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-7f)
                quadToRelative(-19f, 0f, -31f, -14.5f)
                reflectiveQuadTo(34f, 512f)
                lineToRelative(40f, -200f)
                quadToRelative(3f, -14f, 14f, -23f)
                reflectiveQuadToRelative(25f, -9f)
                horizontalLineToRelative(534f)
                quadToRelative(14f, 0f, 25f, 9f)
                reflectiveQuadToRelative(14f, 23f)
                lineToRelative(40f, 200f)
                quadToRelative(4f, 19f, -8f, 33.5f)
                reflectiveQuadTo(687f, 560f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 640f)
                verticalLineToRelative(-80f)
                horizontalLineTo(440f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineTo(120f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-38f, -240f)
                horizontalLineToRelative(516f)
                horizontalLineToRelative(-516f)
                close()
                moveToRelative(-2f, -240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 160f)
                horizontalLineToRelative(520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 240f)
                horizontalLineTo(120f)
                close()
                moveToRelative(2f, 240f)
                horizontalLineToRelative(516f)
                lineToRelative(-24f, -120f)
                horizontalLineTo(146f)
                lineToRelative(-24f, 120f)
                close()
            }
        }.build()
        
        return _Add_business!!
    }

private var _Add_business: ImageVector? = null

