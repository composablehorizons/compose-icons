package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.No_encryption: ImageVector
    get() {
        if (_No_encryption != null) return _No_encryption!!
        
        _No_encryption = ImageVector.Builder(
            name = "no_encryption",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 320f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -50f, -34.5f, -85f)
                reflectiveQuadTo(481f, 120f)
                quadToRelative(-35f, 0f, -63f, 16.5f)
                reflectiveQuadTo(379f, 181f)
                quadToRelative(-7f, 17f, -22.5f, 23.5f)
                reflectiveQuadToRelative(-31.5f, 0.5f)
                quadToRelative(-17f, -6f, -24f, -21.5f)
                reflectiveQuadToRelative(-1f, -31.5f)
                quadToRelative(20f, -51f, 69f, -81.5f)
                reflectiveQuadTo(481f, 40f)
                quadToRelative(83f, 0f, 141f, 58.5f)
                reflectiveQuadTo(680f, 240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(760f, 640f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(720f, 599f)
                verticalLineToRelative(-199f)
                horizontalLineTo(520f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(80f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -25f, 14.5f, -46f)
                reflectiveQuadToRelative(37.5f, -30f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-34f, -34f)
                quadToRelative(-11f, 5f, -20f, 7.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(446f, -80f)
                lineTo(539f, 651f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadToRelative(-31.5f, 6f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(402f, 594f)
                quadToRelative(0f, -17f, 6f, -31.5f)
                reflectiveQuadToRelative(17f, -25.5f)
                lineTo(286f, 400f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(446f)
                close()
                moveTo(486f, 600f)
                close()
                moveToRelative(131f, -97f)
                close()
            }
        }.build()
        
        return _No_encryption!!
    }

private var _No_encryption: ImageVector? = null

