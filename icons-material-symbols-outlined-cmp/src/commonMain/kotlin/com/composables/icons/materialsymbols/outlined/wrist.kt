package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Wrist: ImageVector
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
                moveTo(440f, 876f)
                lineTo(244f, 680f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(236f)
                lineToRelative(138f, 137f)
                lineToRelative(-59f, -117f)
                horizontalLineToRelative(445f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 700f)
                horizontalLineTo(485f)
                lineToRelative(6f, 12f)
                quadToRelative(17f, 35f, 10.5f, 72.5f)
                reflectiveQuadTo(468f, 849f)
                lineToRelative(-28f, 27f)
                close()
                moveTo(40f, 360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(184f)
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
                lineToRelative(-69f, 68f)
                horizontalLineTo(40f)
                close()
                moveToRelative(0f, 120f)
                close()
                moveToRelative(520f, 80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 560f)
                horizontalLineTo(560f)
                close()
                moveToRelative(0f, -140f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 380f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 420f)
                horizontalLineTo(560f)
                close()
            }
        }.build()
        
        return _Wrist!!
    }

private var _Wrist: ImageVector? = null

