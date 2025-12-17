package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Hide: ImageVector
    get() {
        if (_Hide != null) return _Hide!!
        
        _Hide = ImageVector.Builder(
            name = "hide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(177f, 840f)
                lineToRelative(-57f, -57f)
                lineToRelative(184f, -183f)
                horizontalLineTo(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-104f)
                lineTo(177f, 840f)
                close()
                moveToRelative(343f, -400f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(104f)
                lineToRelative(183f, -184f)
                lineToRelative(57f, 57f)
                lineToRelative(-184f, 183f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                close()
            }
        }.build()
        
        return _Hide!!
    }

private var _Hide: ImageVector? = null

