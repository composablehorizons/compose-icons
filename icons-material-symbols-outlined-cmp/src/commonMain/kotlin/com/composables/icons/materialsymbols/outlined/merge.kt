package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Merge: ImageVector
    get() {
        if (_Merge != null) return _Merge!!
        
        _Merge = ImageVector.Builder(
            name = "merge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 840f)
                lineToRelative(-56f, -56f)
                lineToRelative(193f, -194f)
                quadToRelative(23f, -23f, 35f, -52f)
                reflectiveQuadToRelative(12f, -61f)
                verticalLineToRelative(-204f)
                lineToRelative(-64f, 63f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -63f)
                verticalLineToRelative(204f)
                quadToRelative(0f, 32f, 12f, 61f)
                reflectiveQuadToRelative(35f, 52f)
                lineToRelative(193f, 194f)
                lineToRelative(-56f, 56f)
                lineToRelative(-224f, -224f)
                lineToRelative(-224f, 224f)
                close()
            }
        }.build()
        
        return _Merge!!
    }

private var _Merge: ImageVector? = null

