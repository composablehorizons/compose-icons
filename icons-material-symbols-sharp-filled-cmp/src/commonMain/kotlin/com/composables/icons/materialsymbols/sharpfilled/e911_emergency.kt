package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.E911_emergency: ImageVector
    get() {
        if (_E911_emergency != null) return _E911_emergency!!
        
        _E911_emergency = ImageVector.Builder(
            name = "e911_emergency",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(64f)
                lineToRelative(96f, -320f)
                horizontalLineToRelative(240f)
                lineToRelative(96f, 320f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(240f, -480f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(238f, 99f)
                lineToRelative(-57f, -57f)
                lineToRelative(142f, -141f)
                lineToRelative(56f, 56f)
                lineToRelative(-141f, 142f)
                close()
                moveToRelative(42f, 181f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(720f)
                close()
                moveTo(282f, 419f)
                lineTo(141f, 277f)
                lineToRelative(56f, -56f)
                lineToRelative(142f, 141f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(40f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _E911_emergency!!
    }

private var _E911_emergency: ImageVector? = null

