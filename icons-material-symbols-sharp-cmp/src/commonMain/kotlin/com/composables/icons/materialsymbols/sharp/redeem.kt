package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Redeem: ImageVector
    get() {
        if (_Redeem != null) return _Redeem!!
        
        _Redeem = ImageVector.Builder(
            name = "redeem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 680f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                close()
                moveTo(80f, 240f)
                horizontalLineToRelative(168f)
                quadToRelative(-5f, -9f, -6.5f, -19f)
                reflectiveQuadToRelative(-1.5f, -21f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(30f, 0f, 55.5f, 15.5f)
                reflectiveQuadTo(460f, 134f)
                lineToRelative(20f, 26f)
                lineToRelative(20f, -26f)
                quadToRelative(18f, -24f, 44f, -39f)
                reflectiveQuadToRelative(56f, -15f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 11f, -1.5f, 21f)
                reflectiveQuadToRelative(-6.5f, 19f)
                horizontalLineToRelative(168f)
                verticalLineToRelative(600f)
                horizontalLineTo(80f)
                verticalLineToRelative(-600f)
                close()
                moveToRelative(80f, 320f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-240f)
                horizontalLineTo(596f)
                lineToRelative(84f, 114f)
                lineToRelative(-64f, 46f)
                lineToRelative(-136f, -184f)
                lineToRelative(-136f, 184f)
                lineToRelative(-64f, -46f)
                lineToRelative(82f, -114f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(200f, -320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 240f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 240f)
                close()
            }
        }.build()
        
        return _Redeem!!
    }

private var _Redeem: ImageVector? = null

