package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Airplane_ticket: ImageVector
    get() {
        if (_Airplane_ticket != null) return _Airplane_ticket!!
        
        _Airplane_ticket = ImageVector.Builder(
            name = "airplane_ticket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(472f, 516f)
                lineToRelative(-96f, 24f)
                lineToRelative(-43f, -32f)
                quadToRelative(-3f, -2f, -16f, -4f)
                lineToRelative(-5f, 2f)
                quadToRelative(-9f, 2f, -13f, 10.5f)
                reflectiveQuadToRelative(1f, 16.5f)
                lineToRelative(46f, 80f)
                quadToRelative(4f, 6f, 10f, 8.5f)
                reflectiveQuadToRelative(13f, 0.5f)
                lineToRelative(341f, -90f)
                quadToRelative(15f, -4f, 22.5f, -18.5f)
                reflectiveQuadTo(736f, 484f)
                quadToRelative(-4f, -15f, -17.5f, -22.5f)
                reflectiveQuadTo(690f, 458f)
                lineToRelative(-98f, 26f)
                lineToRelative(-149f, -140f)
                quadToRelative(-5f, -5f, -12f, -6.5f)
                reflectiveQuadToRelative(-14f, 0.5f)
                lineToRelative(-5f, 1f)
                quadToRelative(-14f, 3f, -19.5f, 16f)
                reflectiveQuadToRelative(1.5f, 25f)
                lineToRelative(78f, 136f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-135f)
                quadToRelative(0f, -11f, 7f, -19f)
                reflectiveQuadToRelative(18f, -10f)
                quadToRelative(24f, -8f, 39.5f, -29f)
                reflectiveQuadToRelative(15.5f, -47f)
                quadToRelative(0f, -26f, -15.5f, -47f)
                reflectiveQuadTo(105f, 404f)
                quadToRelative(-11f, -2f, -18f, -10f)
                reflectiveQuadToRelative(-7f, -19f)
                verticalLineToRelative(-135f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(102f)
                quadToRelative(37f, 22f, 58.5f, 58.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, 43f, -21.5f, 79.5f)
                reflectiveQuadTo(160f, 618f)
                verticalLineToRelative(102f)
                close()
                moveToRelative(320f, -240f)
                close()
            }
        }.build()
        
        return _Airplane_ticket!!
    }

private var _Airplane_ticket: ImageVector? = null

