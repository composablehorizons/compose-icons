package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Backlight_low: ImageVector
    get() {
        if (_Backlight_low != null) return _Backlight_low!!
        
        _Backlight_low = ImageVector.Builder(
            name = "backlight_low",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(174f, -210f)
                lineToRelative(-85f, -85f)
                lineToRelative(56f, -56f)
                lineToRelative(85f, 85f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(26f, 330f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(120f)
                horizontalLineTo(280f)
                close()
                moveToRelative(160f, -440f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(266f, 111f)
                lineToRelative(-56f, -57f)
                lineToRelative(85f, -85f)
                lineToRelative(56f, 57f)
                lineToRelative(-85f, 85f)
                close()
                moveToRelative(54f, 209f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                close()
            }
        }.build()
        
        return _Backlight_low!!
    }

private var _Backlight_low: ImageVector? = null

