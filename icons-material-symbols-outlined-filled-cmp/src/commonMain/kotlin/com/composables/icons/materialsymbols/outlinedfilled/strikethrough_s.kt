package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Strikethrough_s: ImageVector
    get() {
        if (_Strikethrough_s != null) return _Strikethrough_s!!
        
        _Strikethrough_s = ImageVector.Builder(
            name = "strikethrough_s",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(486f, 800f)
                quadToRelative(-76f, 0f, -135f, -45f)
                reflectiveQuadToRelative(-85f, -123f)
                lineToRelative(88f, -38f)
                quadToRelative(14f, 48f, 48.5f, 79f)
                reflectiveQuadToRelative(85.5f, 31f)
                quadToRelative(42f, 0f, 76f, -20f)
                reflectiveQuadToRelative(34f, -64f)
                quadToRelative(0f, -18f, -7f, -33f)
                reflectiveQuadToRelative(-19f, -27f)
                horizontalLineToRelative(112f)
                quadToRelative(5f, 14f, 7.5f, 28.5f)
                reflectiveQuadTo(694f, 620f)
                quadToRelative(0f, 86f, -61.5f, 133f)
                reflectiveQuadTo(486f, 800f)
                close()
                moveTo(80f, 480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(402f, -326f)
                quadToRelative(66f, 0f, 115.5f, 32.5f)
                reflectiveQuadTo(674f, 286f)
                lineToRelative(-88f, 39f)
                quadToRelative(-9f, -29f, -33.5f, -52f)
                reflectiveQuadTo(484f, 250f)
                quadToRelative(-41f, 0f, -68f, 18.5f)
                reflectiveQuadTo(386f, 320f)
                horizontalLineToRelative(-96f)
                quadToRelative(2f, -69f, 54.5f, -117.5f)
                reflectiveQuadTo(482f, 154f)
                close()
            }
        }.build()
        
        return _Strikethrough_s!!
    }

private var _Strikethrough_s: ImageVector? = null

