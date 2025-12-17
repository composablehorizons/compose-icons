package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Azm: ImageVector
    get() {
        if (_Azm != null) return _Azm!!
        
        _Azm = ImageVector.Builder(
            name = "azm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(468f, 852f)
                quadToRelative(-19f, 19f, -43.5f, 8.5f)
                reflectiveQuadTo(400f, 823f)
                verticalLineToRelative(-263f)
                horizontalLineTo(137f)
                quadToRelative(-27f, 0f, -37.5f, -24.5f)
                reflectiveQuadTo(108f, 492f)
                lineToRelative(309f, -309f)
                quadToRelative(11f, -11f, 25.5f, -17f)
                reflectiveQuadToRelative(30.5f, -6f)
                horizontalLineToRelative(247f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 240f)
                verticalLineToRelative(247f)
                quadToRelative(0f, 16f, -6f, 30.5f)
                reflectiveQuadTo(777f, 543f)
                lineTo(468f, 852f)
                close()
                moveToRelative(172f, -492f)
                verticalLineToRelative(207f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(-247f)
                horizontalLineTo(473f)
                lineToRelative(-80f, 80f)
                horizontalLineToRelative(207f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 360f)
                close()
                moveTo(480f, 520f)
                verticalLineToRelative(207f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(-247f)
                horizontalLineTo(313f)
                lineToRelative(-80f, 80f)
                horizontalLineToRelative(207f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 520f)
                close()
            }
        }.build()
        
        return _Azm!!
    }

private var _Azm: ImageVector? = null

