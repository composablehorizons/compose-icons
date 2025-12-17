package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.New_releases: ImageVector
    get() {
        if (_New_releases != null) return _New_releases!!
        
        _New_releases = ImageVector.Builder(
            name = "new_releases",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(344f, 900f)
                lineToRelative(-76f, -128f)
                lineToRelative(-144f, -32f)
                lineToRelative(14f, -148f)
                lineToRelative(-98f, -112f)
                lineToRelative(98f, -112f)
                lineToRelative(-14f, -148f)
                lineToRelative(144f, -32f)
                lineToRelative(76f, -128f)
                lineToRelative(136f, 58f)
                lineToRelative(136f, -58f)
                lineToRelative(76f, 128f)
                lineToRelative(144f, 32f)
                lineToRelative(-14f, 148f)
                lineToRelative(98f, 112f)
                lineToRelative(-98f, 112f)
                lineToRelative(14f, 148f)
                lineToRelative(-144f, 32f)
                lineToRelative(-76f, 128f)
                lineToRelative(-136f, -58f)
                lineToRelative(-136f, 58f)
                close()
                moveToRelative(94f, -278f)
                lineToRelative(226f, -226f)
                lineToRelative(-56f, -58f)
                lineToRelative(-170f, 170f)
                lineToRelative(-86f, -84f)
                lineToRelative(-56f, 56f)
                lineToRelative(142f, 142f)
                close()
            }
        }.build()
        
        return _New_releases!!
    }

private var _New_releases: ImageVector? = null

