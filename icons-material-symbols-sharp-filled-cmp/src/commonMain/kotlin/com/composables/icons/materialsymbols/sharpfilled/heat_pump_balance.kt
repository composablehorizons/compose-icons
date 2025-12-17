package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Heat_pump_balance: ImageVector
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
                verticalLineToRelative(480f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(87f)
                lineToRelative(-47f, 46f)
                lineToRelative(56f, 57f)
                lineToRelative(144f, -143f)
                lineToRelative(-144f, -144f)
                lineToRelative(-56f, 57f)
                lineToRelative(47f, 47f)
                horizontalLineTo(640f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-400f)
                horizontalLineTo(320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(40f, 864f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(400f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Heat_pump_balance!!
    }

private var _Heat_pump_balance: ImageVector? = null

