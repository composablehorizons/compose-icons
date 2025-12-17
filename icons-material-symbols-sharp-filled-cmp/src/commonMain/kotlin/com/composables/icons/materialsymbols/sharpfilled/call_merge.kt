package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Call_merge: ImageVector
    get() {
        if (_Call_merge != null) return _Call_merge!!
        
        _Call_merge = ImageVector.Builder(
            name = "call_merge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(296f, 800f)
                lineToRelative(-56f, -56f)
                lineToRelative(200f, -200f)
                verticalLineToRelative(-269f)
                lineTo(337f, 378f)
                lineToRelative(-57f, -57f)
                lineToRelative(200f, -200f)
                lineToRelative(201f, 201f)
                lineToRelative(-57f, 57f)
                lineToRelative(-104f, -104f)
                verticalLineToRelative(301f)
                lineTo(296f, 800f)
                close()
                moveToRelative(368f, 1f)
                lineTo(536f, 674f)
                lineToRelative(57f, -57f)
                lineToRelative(127f, 128f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Call_merge!!
    }

private var _Call_merge: ImageVector? = null

