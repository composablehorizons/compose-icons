package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Vr180_create2d: ImageVector
    get() {
        if (_Vr180_create2d != null) return _Vr180_create2d!!
        
        _Vr180_create2d = ImageVector.Builder(
            name = "vr180_create2d",
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
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(110f, 0f, 196.5f, 66.5f)
                reflectiveQuadTo(710f, 320f)
                horizontalLineToRelative(-84f)
                quadToRelative(-26f, -72f, -87.5f, -116f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 77f, 44f, 138.5f)
                reflectiveQuadTo(320f, 626f)
                verticalLineToRelative(84f)
                close()
                moveToRelative(80f, 170f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(480f)
                horizontalLineTo(400f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-320f)
                horizontalLineTo(480f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(20f, -40f)
                horizontalLineToRelative(280f)
                lineToRelative(-92f, -120f)
                lineToRelative(-68f, 90f)
                lineToRelative(-48f, -66f)
                lineToRelative(-72f, 96f)
                close()
                moveToRelative(140f, -120f)
                close()
                moveTo(393f, 393f)
                close()
            }
        }.build()
        
        return _Vr180_create2d!!
    }

private var _Vr180_create2d: ImageVector? = null

