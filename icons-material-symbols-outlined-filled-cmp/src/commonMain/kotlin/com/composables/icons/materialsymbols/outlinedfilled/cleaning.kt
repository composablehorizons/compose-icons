package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Cleaning: ImageVector
    get() {
        if (_Cleaning != null) return _Cleaning!!
        
        _Cleaning = ImageVector.Builder(
            name = "cleaning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 280f)
                lineToRelative(40f, -80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 120f)
                verticalLineToRelative(40f)
                lineToRelative(-40f, 80f)
                horizontalLineTo(480f)
                verticalLineToRelative(-40f)
                lineToRelative(-80f, 80f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(320f, 880f)
                verticalLineToRelative(-274f)
                quadToRelative(0f, -11f, 3.5f, -23.5f)
                reflectiveQuadTo(332f, 560f)
                lineToRelative(148f, -280f)
                horizontalLineToRelative(120f)
                quadToRelative(14f, 14f, 27f, 37.5f)
                reflectiveQuadToRelative(13f, 42.5f)
                verticalLineToRelative(520f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Cleaning!!
    }

private var _Cleaning: ImageVector? = null

