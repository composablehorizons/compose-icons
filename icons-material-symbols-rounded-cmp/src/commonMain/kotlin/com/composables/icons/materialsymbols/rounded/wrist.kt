package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Wrist: ImageVector
    get() {
        if (_Wrist != null) return _Wrist!!
        
        _Wrist = ImageVector.Builder(
            name = "wrist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(244f, 680f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 600f)
                horizontalLineToRelative(163f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(115f, 114f)
                lineToRelative(-30f, -59f)
                quadToRelative(-10f, -20f, 1.5f, -39f)
                reflectiveQuadToRelative(34.5f, -19f)
                horizontalLineToRelative(380f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 700f)
                horizontalLineTo(485f)
                lineToRelative(6f, 12f)
                quadToRelative(17f, 35f, 10.5f, 72.5f)
                reflectiveQuadTo(468f, 849f)
                quadToRelative(-12f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-27f, -11f)
                lineTo(244f, 680f)
                close()
                moveTo(40f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 280f)
                horizontalLineToRelative(144f)
                lineToRelative(44f, -45f)
                quadToRelative(17f, -17f, 39f, -26f)
                reflectiveQuadToRelative(46f, -9f)
                horizontalLineToRelative(407f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 280f)
                horizontalLineTo(353f)
                quadToRelative(-8f, 0f, -15f, 3.5f)
                reflectiveQuadToRelative(-13f, 8.5f)
                lineToRelative(-46f, 45f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadToRelative(-30.5f, 6f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 320f)
                close()
                moveToRelative(0f, 188f)
                close()
                moveToRelative(840f, 52f)
                horizontalLineTo(600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 480f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 560f)
                close()
                moveToRelative(-40f, -140f)
                horizontalLineTo(600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 380f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 340f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 380f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 420f)
                close()
            }
        }.build()
        
        return _Wrist!!
    }

private var _Wrist: ImageVector? = null

