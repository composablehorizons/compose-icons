package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Countertops: ImageVector
    get() {
        if (_Countertops != null) return _Countertops!!
        
        _Countertops = ImageVector.Builder(
            name = "countertops",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 400f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(280f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-240f)
                horizontalLineTo(520f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-280f, 0f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(280f, -400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 480f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 800f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 400f)
                horizontalLineToRelative(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 320f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 200f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(320f, 400f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 280f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                quadTo(537f, 320f, 520f, 320f)
                close()
                moveToRelative(-280f, 0f)
                horizontalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Countertops!!
    }

private var _Countertops: ImageVector? = null

