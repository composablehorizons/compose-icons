package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Shutter_speed: ImageVector
    get() {
        if (_Shutter_speed != null) return _Shutter_speed!!
        
        _Shutter_speed = ImageVector.Builder(
            name = "shutter_speed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadTo(225f, 774f)
                quadToRelative(-49f, -49f, -77f, -114.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -74f, 28.5f, -139.5f)
                reflectiveQuadTo(226f, 266f)
                quadToRelative(49f, -49f, 114.5f, -77.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(63f, 0f, 120f, 21f)
                reflectiveQuadToRelative(104f, 59f)
                lineToRelative(58f, -58f)
                lineToRelative(56f, 56f)
                lineToRelative(-56f, 58f)
                quadToRelative(36f, 47f, 57f, 104f)
                reflectiveQuadToRelative(21f, 120f)
                quadToRelative(0f, 74f, -28f, 139.5f)
                reflectiveQuadTo(735f, 774f)
                quadToRelative(-49f, 49f, -114.5f, 77.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -360f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(268f)
                quadToRelative(-18f, -62f, -61.5f, -109f)
                reflectiveQuadTo(584f, 260f)
                lineTo(480f, 440f)
                close()
                moveToRelative(-70f, 40f)
                lineToRelative(134f, -232f)
                quadToRelative(-59f, -15f, -121.5f, -2.5f)
                reflectiveQuadTo(306f, 300f)
                lineToRelative(104f, 180f)
                close()
                moveToRelative(-206f, 80f)
                horizontalLineToRelative(206f)
                lineTo(276f, 328f)
                quadToRelative(-42f, 47f, -62.5f, 106.5f)
                reflectiveQuadTo(204f, 560f)
                close()
                moveToRelative(172f, 220f)
                lineToRelative(104f, -180f)
                horizontalLineTo(212f)
                quadToRelative(18f, 62f, 61.5f, 109f)
                reflectiveQuadTo(376f, 780f)
                close()
                moveToRelative(40f, 12f)
                quadToRelative(66f, 17f, 128f, 1.5f)
                reflectiveQuadTo(654f, 740f)
                lineTo(550f, 560f)
                lineTo(416f, 792f)
                close()
                moveToRelative(268f, -80f)
                quadToRelative(44f, -48f, 63.5f, -107.5f)
                reflectiveQuadTo(756f, 480f)
                horizontalLineTo(550f)
                lineToRelative(134f, 232f)
                close()
            }
        }.build()
        
        return _Shutter_speed!!
    }

private var _Shutter_speed: ImageVector? = null

