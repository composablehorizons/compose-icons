package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Heat_pump_balance: ImageVector
    get() {
        if (_Heat_pump_balance != null) return _Heat_pump_balance!!
        
        _Heat_pump_balance = ImageVector.Builder(
            name = "heat_pump_balance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 264f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(167f)
                lineToRelative(-47f, -47f)
                lineToRelative(56f, -57f)
                lineToRelative(144f, 144f)
                lineToRelative(-144f, 143f)
                lineToRelative(-56f, -57f)
                lineToRelative(47f, -46f)
                horizontalLineToRelative(-87f)
                verticalLineToRelative(440f)
                horizontalLineTo(480f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(400f)
                horizontalLineTo(160f)
                verticalLineToRelative(-480f)
                close()
                moveTo(40f, 864f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(400f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-240f)
                horizontalLineTo(120f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(720f, -240f)
                horizontalLineTo(120f)
                horizontalLineToRelative(720f)
                close()
            }
        }.build()
        
        return _Heat_pump_balance!!
    }

private var _Heat_pump_balance: ImageVector? = null

