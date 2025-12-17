package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Merge_type: ImageVector
    get() {
        if (_Merge_type != null) return _Merge_type!!
        
        _Merge_type = ImageVector.Builder(
            name = "merge_type",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(664f, 800f)
                lineTo(440f, 576f)
                verticalLineToRelative(-301f)
                lineTo(336f, 379f)
                lineToRelative(-57f, -57f)
                lineToRelative(201f, -201f)
                lineToRelative(200f, 200f)
                lineToRelative(-57f, 57f)
                lineToRelative(-103f, -103f)
                verticalLineToRelative(269f)
                lineToRelative(200f, 200f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-368f, 1f)
                lineToRelative(-56f, -56f)
                lineToRelative(127f, -128f)
                lineToRelative(57f, 57f)
                lineToRelative(-128f, 127f)
                close()
            }
        }.build()
        
        return _Merge_type!!
    }

private var _Merge_type: ImageVector? = null

