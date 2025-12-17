package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Borg: ImageVector
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
                moveTo(120f, 685f)
                verticalLineToRelative(-410f)
                lineToRelative(360f, -207f)
                lineToRelative(360f, 207f)
                verticalLineToRelative(410f)
                lineTo(480f, 892f)
                lineTo(120f, 685f)
                close()
                moveToRelative(200f, -45f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                verticalLineToRelative(118f)
                lineToRelative(240f, 139f)
                verticalLineToRelative(-137f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-137f)
                lineTo(200f, 322f)
                verticalLineToRelative(118f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                close()
                moveToRelative(80f, 240f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(400f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(240f, 80f)
                horizontalLineTo(520f)
                verticalLineToRelative(137f)
                lineToRelative(240f, -139f)
                verticalLineToRelative(-118f)
                horizontalLineTo(640f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, -320f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-118f)
                lineTo(520f, 183f)
                verticalLineToRelative(137f)
                horizontalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Borg!!
    }

private var _Borg: ImageVector? = null

