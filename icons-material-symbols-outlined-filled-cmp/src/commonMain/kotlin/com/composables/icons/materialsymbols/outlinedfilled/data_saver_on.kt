package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Data_saver_on: ImageVector
    get() {
        if (_Data_saver_on != null) return _Data_saver_on!!
        
        _Data_saver_on = ImageVector.Builder(
            name = "data_saver_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadToRelative(-127f, -86f)
                quadTo(143f, 708f, 111.5f, 635f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -157f, 104f, -270f)
                reflectiveQuadToRelative(256f, -128f)
                verticalLineToRelative(120f)
                quadToRelative(-103f, 14f, -171.5f, 92.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 116f, 82f, 198f)
                reflectiveQuadToRelative(198f, 82f)
                quadToRelative(66f, 0f, 123.5f, -28f)
                reflectiveQuadToRelative(96.5f, -76f)
                lineToRelative(104f, 60f)
                quadToRelative(-54f, 75f, -139f, 119.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-40f, -240f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(406f, 2f)
                lineToRelative(-104f, -60f)
                quadToRelative(9f, -24f, 13.5f, -49.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, -107f, -68.5f, -185.5f)
                reflectiveQuadTo(520f, 202f)
                verticalLineToRelative(-120f)
                quadToRelative(152f, 15f, 256f, 128f)
                reflectiveQuadToRelative(104f, 270f)
                quadToRelative(0f, 44f, -8f, 85f)
                reflectiveQuadToRelative(-26f, 77f)
                close()
            }
        }.build()
        
        return _Data_saver_on!!
    }

private var _Data_saver_on: ImageVector? = null

