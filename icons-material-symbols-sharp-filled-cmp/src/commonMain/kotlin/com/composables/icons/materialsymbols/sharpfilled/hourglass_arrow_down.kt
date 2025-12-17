package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Hourglass_arrow_down: ImageVector
    get() {
        if (_Hourglass_arrow_down != null) return _Hourglass_arrow_down!!
        
        _Hourglass_arrow_down = ImageVector.Builder(
            name = "hourglass_arrow_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(100f, 800f)
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
                moveToRelative(680f, 0f)
                lineTo(640f, 660f)
                lineToRelative(57f, -56f)
                lineToRelative(43f, 43f)
                verticalLineToRelative(-487f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(488f)
                lineToRelative(44f, -44f)
                lineToRelative(56f, 56f)
                lineToRelative(-140f, 140f)
                close()
            }
        }.build()
        
        return _Hourglass_arrow_down!!
    }

private var _Hourglass_arrow_down: ImageVector? = null

