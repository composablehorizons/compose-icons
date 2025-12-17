package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Vr180_create2d: ImageVector
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
                moveToRelative(60f, -120f)
                horizontalLineToRelative(199f)
                quadToRelative(13f, 0f, 18.5f, -11f)
                reflectiveQuadToRelative(-2.5f, -21f)
                lineToRelative(-51f, -67f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineToRelative(-52f, 69f)
                lineToRelative(-32f, -44f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineToRelative(-32f, 42f)
                quadToRelative(-8f, 10f, -2f, 21f)
                reflectiveQuadToRelative(18f, 11f)
                close()
                moveToRelative(-220f, -50f)
                quadToRelative(-107f, -27f, -173.5f, -113.5f)
                reflectiveQuadTo(80f, 400f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(110f, 0f, 196.5f, 66.5f)
                reflectiveQuadTo(710f, 320f)
                horizontalLineTo(480f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(230f)
                close()
            }
        }.build()
        
        return _Vr180_create2d!!
    }

private var _Vr180_create2d: ImageVector? = null

