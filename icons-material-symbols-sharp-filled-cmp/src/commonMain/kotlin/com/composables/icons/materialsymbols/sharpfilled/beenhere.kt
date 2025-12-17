package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Beenhere: ImageVector
    get() {
        if (_Beenhere != null) return _Beenhere!!
        
        _Beenhere = ImageVector.Builder(
            name = "beenhere",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 920f)
                lineTo(160f, 680f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(600f)
                lineTo(480f, 920f)
                close()
                moveToRelative(-42f, -320f)
                lineToRelative(226f, -226f)
                lineToRelative(-56f, -58f)
                lineToRelative(-170f, 170f)
                lineToRelative(-84f, -84f)
                lineToRelative(-58f, 56f)
                lineToRelative(142f, 142f)
                close()
            }
        }.build()
        
        return _Beenhere!!
    }

private var _Beenhere: ImageVector? = null

