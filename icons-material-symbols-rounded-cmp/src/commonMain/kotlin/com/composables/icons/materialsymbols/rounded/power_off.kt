package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Power_off: ImageVector
    get() {
        if (_Power_off != null) return _Power_off!!
        
        _Power_off = ImageVector.Builder(
            name = "power_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(380f, 800f)
                verticalLineToRelative(-80f)
                lineTo(263f, 603f)
                quadToRelative(-11f, -11f, -17f, -25.5f)
                reflectiveQuadToRelative(-6f, -30.5f)
                verticalLineToRelative(-187f)
                quadToRelative(0f, -24f, 11f, -45f)
                reflectiveQuadToRelative(32f, -32f)
                lineToRelative(77f, 77f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(186f)
                lineToRelative(140f, 140f)
                verticalLineToRelative(74f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-74f)
                lineToRelative(37f, -37f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(594f, 706f)
                lineToRelative(-14f, 14f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(540f, 840f)
                horizontalLineTo(420f)
                close()
                moveToRelative(266f, -268f)
                lineToRelative(-46f, -46f)
                verticalLineToRelative(-166f)
                horizontalLineTo(474f)
                lineTo(320f, 206f)
                verticalLineToRelative(-46f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 160f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 160f)
                verticalLineToRelative(160f)
                lineToRelative(-40f, -40f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 360f)
                verticalLineToRelative(145f)
                quadToRelative(0f, 16f, -6f, 30.5f)
                reflectiveQuadTo(697f, 561f)
                lineToRelative(-11f, 11f)
                close()
                moveTo(558f, 444f)
                close()
                moveToRelative(-130f, 97f)
                close()
            }
        }.build()
        
        return _Power_off!!
    }

private var _Power_off: ImageVector? = null

