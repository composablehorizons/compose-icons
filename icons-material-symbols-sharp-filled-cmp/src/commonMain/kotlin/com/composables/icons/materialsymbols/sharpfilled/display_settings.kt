package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Display_settings: ImageVector
    get() {
        if (_Display_settings != null) return _Display_settings!!
        
        _Display_settings = ImageVector.Builder(
            name = "display_settings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 600f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(50f)
                close()
                moveToRelative(100f, -50f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-60f)
                horizontalLineTo(400f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(200f, -110f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-360f, -50f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-60f)
                horizontalLineTo(240f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(80f, 450f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Display_settings!!
    }

private var _Display_settings: ImageVector? = null

