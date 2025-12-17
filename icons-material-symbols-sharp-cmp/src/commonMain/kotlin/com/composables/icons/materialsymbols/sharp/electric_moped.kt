package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Electric_moped: ImageVector
    get() {
        if (_Electric_moped != null) return _Electric_moped!!
        
        _Electric_moped = ImageVector.Builder(
            name = "electric_moped",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 920f)
                lineTo(280f, 800f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                lineToRelative(240f, 120f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                close()
                moveTo(280f, 680f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(140f)
                lineToRelative(140f, -174f)
                verticalLineToRelative(-106f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(214f)
                lineTo(580f, 560f)
                horizontalLineTo(400f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(40f, -200f)
                close()
                moveToRelative(-40f, 120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 560f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 600f)
                close()
                moveToRelative(-80f, -360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(560f, 440f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 560f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 560f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(760f, 600f)
                close()
                moveTo(160f, 480f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Electric_moped!!
    }

private var _Electric_moped: ImageVector? = null

