package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Hourglass_arrow_up: ImageVector
    get() {
        if (_Hourglass_arrow_up != null) return _Hourglass_arrow_up!!
        
        _Hourglass_arrow_up = ImageVector.Builder(
            name = "hourglass_arrow_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 440f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                verticalLineToRelative(-100f)
                horizontalLineTo(240f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveTo(240f, 720f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(-140f, 80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -42f, 18f, -78f)
                reflectiveQuadToRelative(50f, -62f)
                quadToRelative(-32f, -26f, -50f, -62f)
                reflectiveQuadToRelative(-18f, -78f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 42f, -18f, 78f)
                reflectiveQuadToRelative(-50f, 62f)
                quadToRelative(32f, 26f, 50f, 62f)
                reflectiveQuadToRelative(18f, 78f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineTo(100f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-488f)
                lineToRelative(-44f, 44f)
                lineToRelative(-56f, -56f)
                lineToRelative(140f, -140f)
                lineToRelative(140f, 140f)
                lineToRelative(-57f, 56f)
                lineToRelative(-43f, -43f)
                verticalLineToRelative(487f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(340f, 240f)
                close()
                moveToRelative(0f, 480f)
                close()
            }
        }.build()
        
        return _Hourglass_arrow_up!!
    }

private var _Hourglass_arrow_up: ImageVector? = null

