package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Whatshot: ImageVector
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
                quadToRelative(-66f, 0f, -127.5f, -20.5f)
                reflectiveQuadTo(240f, 800f)
                lineToRelative(58f, -58f)
                quadToRelative(42f, 29f, 88f, 43.5f)
                reflectiveQuadToRelative(94f, 14.5f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-133f, 0f, -226.5f, 93.5f)
                reflectiveQuadTo(160f, 480f)
                horizontalLineTo(80f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 155.5f, 31.5f)
                reflectiveQuadToRelative(127f, 86f)
                quadToRelative(54.5f, 54.5f, 86f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 82f, -31.5f, 155f)
                reflectiveQuadToRelative(-86f, 127.5f)
                quadToRelative(-54.5f, 54.5f, -127f, 86f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(159f, 717f)
                lineToRelative(163f, -163f)
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
                lineTo(117f, 647f)
                quadToRelative(11f, 23f, 19.5f, 37.5f)
                reflectiveQuadTo(159f, 717f)
                close()
                moveToRelative(321f, -237f)
                close()
            }
        }.build()
        
        return _Whatshot!!
    }

private var _Whatshot: ImageVector? = null

