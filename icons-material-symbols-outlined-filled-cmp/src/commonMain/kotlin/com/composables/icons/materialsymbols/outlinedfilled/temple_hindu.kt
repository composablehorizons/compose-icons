package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Temple_hindu: ImageVector
    get() {
        if (_Temple_hindu != null) return _Temple_hindu!!
        
        _Temple_hindu = ImageVector.Builder(
            name = "temple_hindu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(312f, 280f)
                lineToRelative(47f, -155f)
                verticalLineToRelative(-85f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(81f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                lineToRelative(48f, 160f)
                horizontalLineTo(312f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineTo(520f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineTo(80f)
                close()
                moveToRelative(184f, -440f)
                lineToRelative(24f, -80f)
                horizontalLineToRelative(384f)
                lineToRelative(24f, 80f)
                horizontalLineTo(264f)
                close()
            }
        }.build()
        
        return _Temple_hindu!!
    }

private var _Temple_hindu: ImageVector? = null

