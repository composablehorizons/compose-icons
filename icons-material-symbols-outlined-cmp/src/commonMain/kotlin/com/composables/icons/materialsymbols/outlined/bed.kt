package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Bed: ImageVector
    get() {
        if (_Bed != null) return _Bed!!
        
        _Bed = ImageVector.Builder(
            name = "bed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 760f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -27f, 11f, -49f)
                reflectiveQuadToRelative(29f, -39f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(160f)
                quadToRelative(23f, 0f, 43f, 8.5f)
                reflectiveQuadToRelative(37f, 23.5f)
                quadToRelative(17f, -15f, 37f, -23.5f)
                reflectiveQuadToRelative(43f, -8.5f)
                horizontalLineToRelative(160f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(112f)
                quadToRelative(18f, 17f, 29f, 39f)
                reflectiveQuadToRelative(11f, 49f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(440f, -360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 280f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 320f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-320f, 0f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 280f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 320f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-40f, 200f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 480f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(160f, 520f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(640f, 0f)
                horizontalLineTo(160f)
                horizontalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _Bed!!
    }

private var _Bed: ImageVector? = null

