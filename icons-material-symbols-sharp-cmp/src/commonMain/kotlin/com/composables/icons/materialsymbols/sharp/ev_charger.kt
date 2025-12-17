package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Ev_charger: ImageVector
    get() {
        if (_Ev_charger != null) return _Ev_charger!!
        
        _Ev_charger = ImageVector.Builder(
            name = "ev_charger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 400f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(0f, 360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-280f)
                horizontalLineTo(240f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(300f)
                horizontalLineToRelative(90f)
                verticalLineToRelative(-420f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(480f)
                horizontalLineTo(620f)
                verticalLineToRelative(-300f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(300f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -80f)
                horizontalLineTo(240f)
                horizontalLineToRelative(240f)
                close()
                moveToRelative(-140f, 0f)
                lineToRelative(100f, -160f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-120f)
                lineTo(280f, 640f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Ev_charger!!
    }

private var _Ev_charger: ImageVector? = null

