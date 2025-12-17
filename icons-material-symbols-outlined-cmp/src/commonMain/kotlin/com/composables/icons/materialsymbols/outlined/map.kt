package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 840f)
                lineToRelative(-240f, -84f)
                lineToRelative(-186f, 72f)
                quadToRelative(-20f, 8f, -37f, -4.5f)
                reflectiveQuadTo(120f, 790f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -13f, 7.5f, -23f)
                reflectiveQuadToRelative(20.5f, -15f)
                lineToRelative(212f, -72f)
                lineToRelative(240f, 84f)
                lineToRelative(186f, -72f)
                quadToRelative(20f, -8f, 37f, 4.5f)
                reflectiveQuadToRelative(17f, 33.5f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 13f, -7.5f, 23f)
                reflectiveQuadTo(812f, 768f)
                lineToRelative(-212f, 72f)
                close()
                moveToRelative(-40f, -98f)
                verticalLineToRelative(-468f)
                lineToRelative(-160f, -56f)
                verticalLineToRelative(468f)
                lineToRelative(160f, 56f)
                close()
                moveToRelative(80f, 0f)
                lineToRelative(120f, -40f)
                verticalLineToRelative(-474f)
                lineToRelative(-120f, 46f)
                verticalLineToRelative(468f)
                close()
                moveToRelative(-440f, -10f)
                lineToRelative(120f, -46f)
                verticalLineToRelative(-468f)
                lineToRelative(-120f, 40f)
                verticalLineToRelative(474f)
                close()
                moveToRelative(440f, -458f)
                verticalLineToRelative(468f)
                verticalLineToRelative(-468f)
                close()
                moveToRelative(-320f, -56f)
                verticalLineToRelative(468f)
                verticalLineToRelative(-468f)
                close()
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null

