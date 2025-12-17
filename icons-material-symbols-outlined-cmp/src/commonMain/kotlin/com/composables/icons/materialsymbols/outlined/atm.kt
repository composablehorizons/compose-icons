package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Atm: ImageVector
    get() {
        if (_Atm != null) return _Atm!!
        
        _Atm = ImageVector.Builder(
            name = "atm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(415f, 600f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-335f, 0f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 360f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 400f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(60f)
                horizontalLineTo(80f)
                close()
                moveToRelative(60f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(480f, 120f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(660f, 360f)
                horizontalLineToRelative(180f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 400f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Atm!!
    }

private var _Atm: ImageVector? = null

