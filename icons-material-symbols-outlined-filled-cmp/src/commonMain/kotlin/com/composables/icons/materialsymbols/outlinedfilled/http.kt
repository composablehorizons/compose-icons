package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Http: ImageVector
    get() {
        if (_Http != null) return _Http!!
        
        _Http = ImageVector.Builder(
            name = "http",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(100f)
                horizontalLineTo(40f)
                close()
                moveToRelative(300f, 0f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(220f, 0f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(140f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 24f, -18f, 42f)
                reflectiveQuadToRelative(-42f, 18f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(60f, -140f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Http!!
    }

private var _Http: ImageVector? = null

