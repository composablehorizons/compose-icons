package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.No_sim: ImageVector
    get() {
        if (_No_sim != null) return _No_sim!!
        
        _No_sim = ImageVector.Builder(
            name = "no_sim",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(433f, 80f)
                horizontalLineToRelative(287f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(447f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 647f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 607f)
                verticalLineToRelative(-447f)
                horizontalLineTo(434f)
                lineToRelative(-52f, 52f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(326f, 212f)
                quadToRelative(-12f, -12f, -12.5f, -28.5f)
                reflectiveQuadTo(325f, 155f)
                lineToRelative(52f, -52f)
                quadToRelative(11f, -11f, 25.5f, -17f)
                reflectiveQuadToRelative(30.5f, -6f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-447f)
                quadToRelative(0f, -16f, 6f, -30.5f)
                reflectiveQuadToRelative(17f, -25.5f)
                lineToRelative(1f, -1f)
                lineTo(56f, 168f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadTo(57f, 112f)
                quadToRelative(12f, -11f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineToRelative(735f, 735f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(848f, 903f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                lineTo(240f, 352f)
                verticalLineToRelative(448f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-81f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(1f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(301f, -453f)
                close()
                moveToRelative(-75f, 152f)
                close()
            }
        }.build()
        
        return _No_sim!!
    }

private var _No_sim: ImageVector? = null

