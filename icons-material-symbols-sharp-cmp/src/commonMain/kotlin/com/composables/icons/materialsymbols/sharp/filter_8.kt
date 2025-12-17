package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Filter_8: ImageVector
    get() {
        if (_Filter_8 != null) return _Filter_8!!
        
        _Filter_8 = ImageVector.Builder(
            name = "filter_8",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 400f)
                lineToRelative(-40f, 40f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                lineToRelative(-40f, -40f)
                lineToRelative(40f, -40f)
                verticalLineToRelative(-160f)
                horizontalLineTo(440f)
                verticalLineToRelative(160f)
                lineToRelative(40f, 40f)
                close()
                moveToRelative(120f, -120f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                close()
                moveTo(240f, 720f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(320f)
                verticalLineToRelative(480f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -240f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Filter_8!!
    }

private var _Filter_8: ImageVector? = null

