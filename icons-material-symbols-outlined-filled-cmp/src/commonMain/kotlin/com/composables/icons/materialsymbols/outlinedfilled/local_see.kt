package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Local_see: ImageVector
    get() {
        if (_Local_see != null) return _Local_see!!
        
        _Local_see = ImageVector.Builder(
            name = "local_see",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 660f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                horizontalLineToRelative(2f)
                quadToRelative(22f, 31f, 46.5f, 60f)
                reflectiveQuadToRelative(50.5f, 56f)
                quadToRelative(-5f, 36f, -33f, 60f)
                reflectiveQuadToRelative(-66f, 24f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 240f)
                horizontalLineToRelative(126f)
                lineToRelative(74f, -80f)
                horizontalLineToRelative(50f)
                quadToRelative(-5f, 19f, -7.5f, 39f)
                reflectiveQuadToRelative(-2.5f, 41f)
                quadToRelative(0f, 38f, 10f, 74f)
                reflectiveQuadToRelative(27f, 71f)
                quadToRelative(-60f, 14f, -98.5f, 62.5f)
                reflectiveQuadTo(300f, 560f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 740f)
                quadToRelative(54f, 0f, 97.5f, -28.5f)
                reflectiveQuadTo(643f, 637f)
                quadToRelative(20f, 19f, 39.5f, 36f)
                reflectiveQuadToRelative(37.5f, 32f)
                quadToRelative(42f, -35f, 82f, -71.5f)
                reflectiveQuadToRelative(78f, -75.5f)
                verticalLineToRelative(242f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(560f, -280f)
                quadToRelative(121f, -103f, 180.5f, -191f)
                reflectiveQuadTo(960f, 246f)
                quadToRelative(0f, -113f, -72.5f, -179.5f)
                reflectiveQuadTo(720f, 0f)
                quadToRelative(-95f, 0f, -167.5f, 66.5f)
                reflectiveQuadTo(480f, 246f)
                quadToRelative(0f, 75f, 59.5f, 163f)
                reflectiveQuadTo(720f, 600f)
                close()
                moveToRelative(-74f, -240f)
                lineToRelative(28f, -91f)
                lineToRelative(-74f, -59f)
                horizontalLineToRelative(91f)
                lineToRelative(29f, -90f)
                lineToRelative(29f, 90f)
                horizontalLineToRelative(91f)
                lineToRelative(-74f, 59f)
                lineToRelative(28f, 91f)
                lineToRelative(-74f, -56f)
                lineToRelative(-74f, 56f)
                close()
            }
        }.build()
        
        return _Local_see!!
    }

private var _Local_see: ImageVector? = null

