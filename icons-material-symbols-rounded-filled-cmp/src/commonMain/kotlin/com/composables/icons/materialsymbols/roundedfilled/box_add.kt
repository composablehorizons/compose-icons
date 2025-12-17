package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Box_add: ImageVector
    get() {
        if (_Box_add != null) return _Box_add!!
        
        _Box_add = ImageVector.Builder(
            name = "box_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-499f)
                quadToRelative(0f, -14f, 4.5f, -27f)
                reflectiveQuadToRelative(13.5f, -24f)
                lineToRelative(50f, -61f)
                quadToRelative(11f, -14f, 27.5f, -21.5f)
                reflectiveQuadTo(250f, 120f)
                horizontalLineToRelative(460f)
                quadToRelative(18f, 0f, 34.5f, 7.5f)
                reflectiveQuadTo(772f, 149f)
                lineToRelative(50f, 61f)
                quadToRelative(9f, 11f, 13.5f, 24f)
                reflectiveQuadToRelative(4.5f, 27f)
                verticalLineToRelative(147f)
                quadToRelative(0f, 18f, -14.5f, 29f)
                reflectiveQuadToRelative(-32.5f, 7f)
                quadToRelative(-26f, -5f, -53.5f, -3f)
                reflectiveQuadTo(687f, 451f)
                quadToRelative(-17f, 5f, -32f, -4.5f)
                reflectiveQuadTo(640f, 420f)
                verticalLineToRelative(-100f)
                horizontalLineTo(320f)
                verticalLineToRelative(255f)
                quadToRelative(0f, 23f, 19f, 34.5f)
                reflectiveQuadToRelative(39f, 1.5f)
                lineToRelative(102f, -51f)
                lineToRelative(31f, 15f)
                quadToRelative(12f, 6f, 16.5f, 18f)
                reflectiveQuadToRelative(0.5f, 25f)
                quadToRelative(-5f, 14f, -6.5f, 29.5f)
                reflectiveQuadTo(520f, 679f)
                quadToRelative(0f, 29f, 7f, 58f)
                reflectiveQuadToRelative(21f, 55f)
                quadToRelative(9f, 17f, 1f, 32.5f)
                reflectiveQuadTo(524f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(520f, -120f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 560f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 720f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 800f)
                verticalLineToRelative(-80f)
                close()
                moveTo(216f, 240f)
                horizontalLineToRelative(528f)
                lineToRelative(-34f, -40f)
                horizontalLineTo(250f)
                lineToRelative(-34f, 40f)
                close()
            }
        }.build()
        
        return _Box_add!!
    }

private var _Box_add: ImageVector? = null

