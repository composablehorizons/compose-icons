package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.New_label: ImageVector
    get() {
        if (_New_label != null) return _New_label!!
        
        _New_label = ImageVector.Builder(
            name = "new_label",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                lineToRelative(142f, -200f)
                lineToRelative(-142f, -200f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(522f)
                lineToRelative(198f, 280f)
                lineToRelative(-198f, 280f)
                horizontalLineTo(480f)
                close()
                moveToRelative(-9f, -280f)
                close()
                moveTo(200f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _New_label!!
    }

private var _New_label: ImageVector? = null

