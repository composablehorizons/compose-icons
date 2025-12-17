package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Pattern: ImageVector
    get() {
        if (_Pattern != null) return _Pattern!!
        
        _Pattern = ImageVector.Builder(
            name = "pattern",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 640f)
                horizontalLineToRelative(10f)
                quadToRelative(5f, 0f, 10f, 2f)
                lineToRelative(142f, -142f)
                quadToRelative(-5f, -21f, 0.5f, -41.5f)
                reflectiveQuadTo(423f, 423f)
                quadToRelative(15f, -15f, 35.5f, -20.5f)
                reflectiveQuadToRelative(41.5f, -0.5f)
                lineToRelative(142f, -142f)
                quadToRelative(-2f, -5f, -2f, -10f)
                verticalLineToRelative(-10f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(720f, 160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 320f)
                lineToRelative(-20f, -2f)
                lineToRelative(-142f, 141f)
                quadToRelative(5f, 21f, -0.5f, 42f)
                reflectiveQuadTo(537f, 537f)
                quadToRelative(-16f, 16f, -36.5f, 21.5f)
                reflectiveQuadTo(459f, 558f)
                lineTo(336f, 680f)
                horizontalLineToRelative(76f)
                quadToRelative(11f, -18f, 29f, -29f)
                reflectiveQuadToRelative(39f, -11f)
                quadToRelative(22f, 0f, 40.5f, 10.5f)
                reflectiveQuadTo(550f, 680f)
                horizontalLineToRelative(100f)
                quadToRelative(11f, -19f, 29.5f, -29.5f)
                reflectiveQuadTo(720f, 640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 800f)
                quadToRelative(-22f, 0f, -40.5f, -11f)
                reflectiveQuadTo(650f, 760f)
                horizontalLineTo(550f)
                quadToRelative(-11f, 19f, -29.5f, 29.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(-21f, 0f, -39f, -11f)
                reflectiveQuadToRelative(-29f, -29f)
                horizontalLineTo(308f)
                quadToRelative(-11f, 18f, -29f, 29f)
                reflectiveQuadToRelative(-39f, 11f)
                close()
                moveToRelative(0f, -240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(240f, 560f)
                close()
                moveToRelative(0f, -240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(320f, 240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(240f, 320f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 320f)
                close()
                moveToRelative(240f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(720f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 560f)
                close()
            }
        }.build()
        
        return _Pattern!!
    }

private var _Pattern: ImageVector? = null

