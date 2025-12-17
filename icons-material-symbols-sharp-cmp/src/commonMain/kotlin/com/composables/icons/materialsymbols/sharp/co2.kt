package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Co2: ImageVector
    get() {
        if (_Co2 != null) return _Co2!!
        
        _Co2 = ImageVector.Builder(
            name = "co2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(240f)
                horizontalLineTo(400f)
                close()
                moveToRelative(60f, -60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-340f, 60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(560f, 120f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-40f)
                horizontalLineTo(680f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(140f)
                horizontalLineTo(740f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(60f)
                horizontalLineTo(680f)
                close()
            }
        }.build()
        
        return _Co2!!
    }

private var _Co2: ImageVector? = null

