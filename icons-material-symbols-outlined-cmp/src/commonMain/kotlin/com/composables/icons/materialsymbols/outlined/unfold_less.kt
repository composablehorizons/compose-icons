package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Unfold_less: ImageVector
    get() {
        if (_Unfold_less != null) return _Unfold_less!!
        
        _Unfold_less = ImageVector.Builder(
            name = "unfold_less",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(356f, 800f)
                lineToRelative(-56f, -56f)
                lineToRelative(180f, -180f)
                lineToRelative(180f, 180f)
                lineToRelative(-56f, 56f)
                lineToRelative(-124f, -124f)
                lineToRelative(-124f, 124f)
                close()
                moveToRelative(124f, -404f)
                lineTo(300f, 216f)
                lineToRelative(56f, -56f)
                lineToRelative(124f, 124f)
                lineToRelative(124f, -124f)
                lineToRelative(56f, 56f)
                lineToRelative(-180f, 180f)
                close()
            }
        }.build()
        
        return _Unfold_less!!
    }

private var _Unfold_less: ImageVector? = null

