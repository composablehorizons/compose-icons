package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Chat_paste_go_2: ImageVector
    get() {
        if (_Chat_paste_go_2 != null) return _Chat_paste_go_2!!
        
        _Chat_paste_go_2 = ImageVector.Builder(
            name = "chat_paste_go_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(727f, 720f)
                horizontalLineTo(600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 640f)
                horizontalLineToRelative(127f)
                lineToRelative(-35f, -35f)
                quadToRelative(-11f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(692f, 548f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(748f, 812f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(692f, 755f)
                lineToRelative(35f, -35f)
                close()
                moveToRelative(-487f, 0f)
                lineToRelative(-86f, 86f)
                quadToRelative(-10f, 10f, -22f, 5f)
                reflectiveQuadToRelative(-12f, -19f)
                verticalLineToRelative(-552f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 240f)
                verticalLineToRelative(174f)
                quadToRelative(0f, 12f, -8.5f, 19.5f)
                reflectiveQuadTo(731f, 440f)
                quadToRelative(-51f, -2f, -97.5f, 15.5f)
                reflectiveQuadTo(550f, 510f)
                quadToRelative(-36f, 37f, -54f, 83.5f)
                reflectiveQuadTo(480f, 691f)
                quadToRelative(1f, 12f, -7f, 20.5f)
                reflectiveQuadToRelative(-19f, 8.5f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Chat_paste_go_2!!
    }

private var _Chat_paste_go_2: ImageVector? = null

