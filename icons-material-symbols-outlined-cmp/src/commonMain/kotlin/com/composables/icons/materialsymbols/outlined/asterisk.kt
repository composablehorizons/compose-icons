package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Asterisk: ImageVector
    get() {
        if (_Asterisk != null) return _Asterisk!!
        
        _Asterisk = ImageVector.Builder(
            name = "asterisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                verticalLineToRelative(-264f)
                lineTo(254f, 763f)
                lineToRelative(-57f, -57f)
                lineToRelative(187f, -186f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(264f)
                lineTo(197f, 254f)
                lineToRelative(57f, -57f)
                lineToRelative(186f, 187f)
                verticalLineToRelative(-264f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(264f)
                lineToRelative(186f, -187f)
                lineToRelative(57f, 57f)
                lineToRelative(-187f, 186f)
                horizontalLineToRelative(264f)
                verticalLineToRelative(80f)
                horizontalLineTo(576f)
                lineToRelative(187f, 186f)
                lineToRelative(-57f, 57f)
                lineToRelative(-186f, -187f)
                verticalLineToRelative(264f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Asterisk!!
    }

private var _Asterisk: ImageVector? = null

