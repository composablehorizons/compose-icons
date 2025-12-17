package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Borg: ImageVector
    get() {
        if (_Borg != null) return _Borg!!
        
        _Borg = ImageVector.Builder(
            name = "borg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 869f)
                lineTo(120f, 685f)
                verticalLineToRelative(-165f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(229f)
                close()
                moveTo(120f, 440f)
                verticalLineToRelative(-165f)
                lineToRelative(320f, -184f)
                verticalLineToRelative(229f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                horizontalLineTo(120f)
                close()
                moveToRelative(280f, 120f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(400f)
                close()
                moveTo(520f, 869f)
                verticalLineToRelative(-229f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(165f)
                lineTo(520f, 869f)
                close()
                moveToRelative(120f, -429f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(-229f)
                lineToRelative(320f, 184f)
                verticalLineToRelative(165f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Borg!!
    }

private var _Borg: ImageVector? = null

