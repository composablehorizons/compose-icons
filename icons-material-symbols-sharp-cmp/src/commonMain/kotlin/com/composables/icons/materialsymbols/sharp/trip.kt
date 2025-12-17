package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Trip: ImageVector
    get() {
        if (_Trip != null) return _Trip!!
        
        _Trip = ImageVector.Builder(
            name = "trip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(600f)
                horizontalLineTo(80f)
                close()
                moveToRelative(320f, -600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-160f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-440f)
                close()
                moveToRelative(400f, 440f)
                verticalLineToRelative(-440f)
                horizontalLineTo(320f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(320f)
                close()
                moveToRelative(80f, -440f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(480f, 540f)
                close()
            }
        }.build()
        
        return _Trip!!
    }

private var _Trip: ImageVector? = null

