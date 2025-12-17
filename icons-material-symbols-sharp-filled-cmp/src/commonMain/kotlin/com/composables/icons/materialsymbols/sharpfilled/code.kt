package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Code: ImageVector
    get() {
        if (_Code != null) return _Code!!
        
        _Code = ImageVector.Builder(
            name = "code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 720f)
                lineTo(80f, 480f)
                lineToRelative(240f, -240f)
                lineToRelative(57f, 57f)
                lineToRelative(-184f, 184f)
                lineToRelative(183f, 183f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(320f, 0f)
                lineToRelative(-57f, -57f)
                lineToRelative(184f, -184f)
                lineToRelative(-183f, -183f)
                lineToRelative(56f, -56f)
                lineToRelative(240f, 240f)
                lineToRelative(-240f, 240f)
                close()
            }
        }.build()
        
        return _Code!!
    }

private var _Code: ImageVector? = null

