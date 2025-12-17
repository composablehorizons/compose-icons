package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Trip: ImageVector
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
                moveTo(720f, 840f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(600f)
                horizontalLineTo(720f)
                close()
                moveTo(400f, 240f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-80f, 600f)
                verticalLineToRelative(-760f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(760f)
                horizontalLineTo(320f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(600f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Trip!!
    }

private var _Trip: ImageVector? = null

