package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Celebration: ImageVector
    get() {
        if (_Celebration != null) return _Celebration!!
        
        _Celebration = ImageVector.Builder(
            name = "celebration",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                lineToRelative(200f, -560f)
                lineToRelative(360f, 360f)
                lineTo(80f, 880f)
                close()
                moveToRelative(132f, -132f)
                lineToRelative(282f, -100f)
                lineToRelative(-182f, -182f)
                lineToRelative(-100f, 282f)
                close()
                moveToRelative(370f, -246f)
                lineToRelative(-42f, -42f)
                lineToRelative(224f, -224f)
                quadToRelative(32f, -32f, 77f, -32f)
                reflectiveQuadToRelative(77f, 32f)
                lineToRelative(24f, 24f)
                lineToRelative(-42f, 42f)
                lineToRelative(-24f, -24f)
                quadToRelative(-14f, -14f, -35f, -14f)
                reflectiveQuadToRelative(-35f, 14f)
                lineTo(582f, 502f)
                close()
                moveTo(422f, 342f)
                lineToRelative(-42f, -42f)
                lineToRelative(24f, -24f)
                quadToRelative(14f, -14f, 14f, -34f)
                reflectiveQuadToRelative(-14f, -34f)
                lineToRelative(-26f, -26f)
                lineToRelative(42f, -42f)
                lineToRelative(26f, 26f)
                quadToRelative(32f, 32f, 32f, 76f)
                reflectiveQuadToRelative(-32f, 76f)
                lineToRelative(-24f, 24f)
                close()
                moveToRelative(80f, 80f)
                lineToRelative(-42f, -42f)
                lineToRelative(144f, -144f)
                quadToRelative(14f, -14f, 14f, -35f)
                reflectiveQuadToRelative(-14f, -35f)
                lineToRelative(-64f, -64f)
                lineToRelative(42f, -42f)
                lineToRelative(64f, 64f)
                quadToRelative(32f, 32f, 32f, 77f)
                reflectiveQuadToRelative(-32f, 77f)
                lineTo(502f, 422f)
                close()
                moveToRelative(160f, 160f)
                lineToRelative(-42f, -42f)
                lineToRelative(64f, -64f)
                quadToRelative(32f, -32f, 77f, -32f)
                reflectiveQuadToRelative(77f, 32f)
                lineToRelative(64f, 64f)
                lineToRelative(-42f, 42f)
                lineToRelative(-64f, -64f)
                quadToRelative(-14f, -14f, -35f, -14f)
                reflectiveQuadToRelative(-35f, 14f)
                lineToRelative(-64f, 64f)
                close()
                moveTo(212f, 748f)
                close()
            }
        }.build()
        
        return _Celebration!!
    }

private var _Celebration: ImageVector? = null

