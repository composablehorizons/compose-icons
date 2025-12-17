package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Whatshot: ImageVector
    get() {
        if (_Whatshot != null) return _Whatshot!!
        
        _Whatshot = ImageVector.Builder(
            name = "whatshot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-100f, 0f, -183.5f, -44f)
                reflectiveQuadTo(158f, 718f)
                lineToRelative(164f, -164f)
                lineToRelative(120f, 100f)
                lineToRelative(198f, -198f)
                verticalLineToRelative(104f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineTo(480f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(104f)
                lineTo(438f, 546f)
                lineTo(318f, 446f)
                lineTo(116f, 648f)
                quadToRelative(-17f, -38f, -26.5f, -80.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Whatshot!!
    }

private var _Whatshot: ImageVector? = null

