package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Upi_pay: ImageVector
    get() {
        if (_Upi_pay != null) return _Upi_pay!!
        
        _Upi_pay = ImageVector.Builder(
            name = "upi_pay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 600f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-160f)
                horizontalLineTo(440f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                close()
                moveTo(500f, 460f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(200f, 600f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Upi_pay!!
    }

private var _Upi_pay: ImageVector? = null

