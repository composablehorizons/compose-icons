package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Gavel: ImageVector
    get() {
        if (_Gavel != null) return _Gavel!!
        
        _Gavel = ImageVector.Builder(
            name = "gavel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(226f, -194f)
                lineTo(160f, 420f)
                lineToRelative(84f, -86f)
                lineToRelative(228f, 226f)
                lineToRelative(-86f, 86f)
                close()
                moveToRelative(254f, -254f)
                lineTo(414f, 164f)
                lineToRelative(86f, -84f)
                lineToRelative(226f, 226f)
                lineToRelative(-86f, 86f)
                close()
                moveToRelative(184f, 408f)
                lineTo(302f, 278f)
                lineToRelative(56f, -56f)
                lineToRelative(522f, 522f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Gavel!!
    }

private var _Gavel: ImageVector? = null

