package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Atm: ImageVector
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
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(240f)
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
                verticalLineToRelative(-240f)
                horizontalLineToRelative(260f)
                verticalLineToRelative(240f)
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

