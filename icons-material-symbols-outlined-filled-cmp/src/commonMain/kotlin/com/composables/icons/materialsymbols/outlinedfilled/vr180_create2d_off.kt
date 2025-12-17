package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Vr180_create2d_off: ImageVector
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
                moveTo(320f, 710f)
                quadToRelative(-107f, -27f, -173.5f, -113.5f)
                reflectiveQuadTo(80f, 400f)
                quadToRelative(0f, -45f, 12f, -86f)
                reflectiveQuadToRelative(33f, -77f)
                lineTo(25f, 137f)
                lineToRelative(56f, -56f)
                lineToRelative(767f, 767f)
                lineToRelative(-56f, 56f)
                lineToRelative(-24f, -24f)
                horizontalLineTo(480f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                verticalLineToRelative(-288f)
                lineToRelative(-75f, -74f)
                quadToRelative(-3f, 11f, -4f, 21f)
                reflectiveQuadToRelative(-1f, 21f)
                verticalLineToRelative(230f)
                close()
                moveToRelative(80f, -630f)
                quadToRelative(110f, 0f, 196.5f, 66.5f)
                reflectiveQuadTo(710f, 320f)
                horizontalLineTo(480f)
                quadToRelative(-11f, 0f, -21f, 1f)
                reflectiveQuadToRelative(-21f, 4f)
                lineTo(238f, 124f)
                quadToRelative(37f, -22f, 78f, -33f)
                reflectiveQuadToRelative(84f, -11f)
                close()
                moveToRelative(113f, 320f)
                horizontalLineToRelative(287f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 480f)
                verticalLineToRelative(287f)
                lineTo(513f, 400f)
                close()
                moveToRelative(135f, 360f)
                lineToRelative(-28f, -29f)
                lineToRelative(-57f, -56f)
                lineToRelative(-63f, 85f)
                horizontalLineToRelative(148f)
                close()
            }
        }.build()
        
        return _Vr180_create2d_off!!
    }

private var _Vr180_create2d_off: ImageVector? = null

