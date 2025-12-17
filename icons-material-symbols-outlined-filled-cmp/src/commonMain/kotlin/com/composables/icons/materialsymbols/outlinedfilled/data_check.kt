package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Data_check: ImageVector
    get() {
        if (_Data_check != null) return _Data_check!!
        
        _Data_check = ImageVector.Builder(
            name = "data_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(612f, 410f)
                lineToRelative(141f, -142f)
                lineToRelative(-28f, -28f)
                lineToRelative(-113f, 113f)
                lineToRelative(-57f, -57f)
                lineToRelative(-28f, 29f)
                lineToRelative(85f, 85f)
                close()
                moveTo(120f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(520f, -280f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(440f, 320f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(640f, 120f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(840f, 320f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(640f, 520f)
                close()
                moveToRelative(-520f, -40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(252f)
                quadToRelative(7f, 22f, 16f, 42f)
                reflectiveQuadToRelative(22f, 38f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(376f)
                quadToRelative(23f, 14f, 49f, 23.5f)
                reflectiveQuadToRelative(55f, 13.5f)
                verticalLineToRelative(43f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Data_check!!
    }

private var _Data_check: ImageVector? = null

