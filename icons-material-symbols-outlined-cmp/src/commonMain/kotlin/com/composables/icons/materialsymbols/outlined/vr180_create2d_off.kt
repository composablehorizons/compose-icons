package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Vr180_create2d_off: ImageVector
    get() {
        if (_Vr180_create2d_off != null) return _Vr180_create2d_off!!
        
        _Vr180_create2d_off = ImageVector.Builder(
            name = "vr180_create2d_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 767f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-207f)
                horizontalLineTo(593f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(287f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 480f)
                verticalLineToRelative(287f)
                close()
                moveTo(626f, 320f)
                quadToRelative(-26f, -72f, -87.5f, -116f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(-27f, 0f, -53f, 6f)
                reflectiveQuadToRelative(-50f, 17f)
                lineToRelative(-59f, -59f)
                quadToRelative(37f, -22f, 78f, -33f)
                reflectiveQuadToRelative(84f, -11f)
                quadToRelative(110f, 0f, 196.5f, 66.5f)
                reflectiveQuadTo(710f, 320f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(-42f, 376f)
                close()
                moveTo(819f, 932f)
                lineToRelative(-51f, -52f)
                horizontalLineTo(480f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                verticalLineToRelative(-288f)
                lineTo(184f, 296f)
                quadToRelative(-11f, 24f, -17.5f, 50f)
                reflectiveQuadToRelative(-6.5f, 54f)
                quadToRelative(0f, 77f, 44f, 138.5f)
                reflectiveQuadTo(320f, 626f)
                verticalLineToRelative(84f)
                quadToRelative(-107f, -27f, -173.5f, -113.5f)
                reflectiveQuadTo(80f, 400f)
                quadToRelative(0f, -45f, 12f, -86f)
                reflectiveQuadToRelative(33f, -77f)
                lineTo(25f, 137f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-57f, 56f)
                close()
                moveTo(439f, 325f)
                close()
                moveToRelative(-72f, 42f)
                close()
                moveToRelative(133f, 393f)
                lineToRelative(72f, -96f)
                lineToRelative(48f, 66f)
                lineToRelative(47f, -63f)
                lineToRelative(93f, 93f)
                horizontalLineTo(500f)
                close()
                moveToRelative(-20f, 40f)
                horizontalLineToRelative(208f)
                lineTo(480f, 592f)
                verticalLineToRelative(208f)
                close()
                moveToRelative(217f, -217f)
                close()
            }
        }.build()
        
        return _Vr180_create2d_off!!
    }

private var _Vr180_create2d_off: ImageVector? = null

