package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Cadence: ImageVector
    get() {
        if (_Cadence != null) return _Cadence!!
        
        _Cadence = ImageVector.Builder(
            name = "cadence",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(280f, 720f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(120f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(47f)
                quadToRelative(42f, 0f, 78.5f, -21f)
                reflectiveQuadToRelative(58.5f, -57f)
                quadToRelative(34f, -57f, 91.5f, -89.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(67f, 0f, 124.5f, 32.5f)
                reflectiveQuadTo(696f, 242f)
                quadToRelative(22f, 36f, 58.5f, 57f)
                reflectiveQuadToRelative(78.5f, 21f)
                horizontalLineToRelative(47f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-46f)
                quadToRelative(-63f, 0f, -118.5f, -31f)
                reflectiveQuadTo(628f, 284f)
                quadToRelative(-23f, -39f, -62.5f, -61.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-45f, 0f, -84.5f, 22.5f)
                reflectiveQuadTo(333f, 284f)
                quadToRelative(-32f, 54f, -87.5f, 85f)
                reflectiveQuadTo(127f, 400f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Cadence!!
    }

private var _Cadence: ImageVector? = null

