package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Code_blocks: ImageVector
    get() {
        if (_Code_blocks != null) return _Code_blocks!!
        
        _Code_blocks = ImageVector.Builder(
            name = "code_blocks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 624f)
                lineToRelative(56f, -57f)
                lineToRelative(-87f, -87f)
                lineToRelative(87f, -87f)
                lineToRelative(-56f, -57f)
                lineToRelative(-144f, 144f)
                lineToRelative(144f, 144f)
                close()
                moveToRelative(192f, 0f)
                lineToRelative(144f, -144f)
                lineToRelative(-144f, -144f)
                lineToRelative(-56f, 57f)
                lineToRelative(87f, 87f)
                lineToRelative(-87f, 87f)
                lineToRelative(56f, 57f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Code_blocks!!
    }

private var _Code_blocks: ImageVector? = null

