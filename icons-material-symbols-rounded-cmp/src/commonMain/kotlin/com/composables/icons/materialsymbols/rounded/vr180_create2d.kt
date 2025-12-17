package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Vr180_create2d: ImageVector
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
                moveTo(80f, 400f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(91f, 0f, 167f, 46.5f)
                reflectiveQuadTo(684f, 251f)
                quadToRelative(8f, 14f, 1.5f, 30f)
                reflectiveQuadTo(663f, 304f)
                quadToRelative(-15f, 7f, -30f, 0.5f)
                reflectiveQuadTo(610f, 284f)
                quadToRelative(-32f, -57f, -87.5f, -90.5f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 68f, 34.5f, 124f)
                reflectiveQuadToRelative(92.5f, 87f)
                quadToRelative(14f, 8f, 19f, 23f)
                reflectiveQuadToRelative(0f, 30f)
                quadToRelative(-6f, 16f, -21f, 23f)
                reflectiveQuadToRelative(-29f, -1f)
                quadToRelative(-80f, -40f, -128f, -116.5f)
                reflectiveQuadTo(80f, 400f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 480f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(480f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-320f)
                horizontalLineTo(480f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(140f, -70f)
                lineToRelative(-32f, -44f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineToRelative(-32f, 42f)
                quadToRelative(-8f, 10f, -2f, 21f)
                reflectiveQuadToRelative(18f, 11f)
                horizontalLineToRelative(199f)
                quadToRelative(13f, 0f, 18.5f, -11f)
                reflectiveQuadToRelative(-2.5f, -21f)
                lineToRelative(-51f, -67f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineToRelative(-52f, 69f)
                close()
                moveToRelative(20f, -90f)
                close()
                moveTo(393f, 393f)
                close()
            }
        }.build()
        
        return _Vr180_create2d!!
    }

private var _Vr180_create2d: ImageVector? = null

