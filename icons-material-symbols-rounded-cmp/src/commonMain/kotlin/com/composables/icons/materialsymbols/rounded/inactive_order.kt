package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Inactive_order: ImageVector
    get() {
        if (_Inactive_order != null) return _Inactive_order!!
        
        _Inactive_order = ImageVector.Builder(
            name = "inactive_order",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(690f, 660f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-120f)
                close()
                moveToRelative(60f, 0f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                close()
                moveTo(280f, 360f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 280f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 360f)
                close()
                moveTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveTo(120f, 200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(215f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 455f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 415f)
                verticalLineToRelative(-215f)
                horizontalLineTo(200f)
                verticalLineToRelative(562f)
                horizontalLineToRelative(243f)
                quadToRelative(2f, 15f, 6f, 30f)
                reflectiveQuadToRelative(9f, 29f)
                quadToRelative(5f, 11f, -4f, 17.5f)
                reflectiveQuadToRelative(-17f, -1.5f)
                lineToRelative(-3f, -3f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-32f, 32f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                lineToRelative(-32f, -32f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-32f, 32f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                lineToRelative(-32f, -32f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-46f, 46f)
                verticalLineToRelative(-680f)
                close()
                moveToRelative(160f, 480f)
                horizontalLineToRelative(135f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(455f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(415f, 600f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 680f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(262f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(582f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(542f, 440f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 520f)
                close()
                moveToRelative(-80f, 242f)
                verticalLineToRelative(-562f)
                verticalLineToRelative(562f)
                close()
            }
        }.build()
        
        return _Inactive_order!!
    }

private var _Inactive_order: ImageVector? = null

